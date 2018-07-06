package io.github.dearzack.aac;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.dearzack.aac.lifecycle.ActivityLifeObserver;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {

    private static String TAG = MainActivity.class.getSimpleName();
    private LifecycleRegistry mLifecycleRegistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLifecycleRegistry = new LifecycleRegistry(this);
        // 注册需要监听的 Observer
        mLifecycleRegistry.addObserver(new ActivityLifeObserver());
    }

    @Override
    public Lifecycle getLifecycle() {
        return mLifecycleRegistry;
    }
}
