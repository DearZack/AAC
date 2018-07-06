package io.github.dearzack.aac.lifecycle;

public interface BaseActivityPresenter {
    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();
}
