package com.practice.customapplicationclass;

import android.os.AsyncTask;
import android.util.Log;

public class LicenseLoadTask extends AsyncTask<Void,Void,Void> {
    @Override
    protected Void doInBackground(Void... voids) {
        loadLicense();
        return null;
    }

    public void loadLicense(){

        Log.i(getClass().getName().toString(),"************License Loaded Successfully******************");
    }
}
