package com.practice.customapplicationclass;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomApplication extends Application {
    String TAG=getClass().getName().toString();


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG,"Application-onCreate");

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks(){

            @Override
            public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
                Log.i(TAG,"onActivityCreated");

                LicenseLoadTask licenseLoadTask=new LicenseLoadTask();
                licenseLoadTask.execute();
            }

            @Override
            public void onActivityStarted(@NonNull Activity activity) {
                Log.i(TAG,"onActivityStarted");

            }

            @Override
            public void onActivityResumed(@NonNull Activity activity) {
                Log.i(TAG,"onActivityResumed");

            }

            @Override
            public void onActivityPaused(@NonNull Activity activity) {
                Log.i(TAG,"onActivityPaused");

            }

            @Override
            public void onActivityStopped(@NonNull Activity activity) {
                Log.i(TAG,"onActivityStopped");

            }

            @Override
            public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
                Log.i(TAG,"onActivitySaveInstanceState");

            }

            @Override
            public void onActivityDestroyed(@NonNull Activity activity) {
                Log.i(TAG,"onActivityDestroyed");

            }
        });
    }



    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
