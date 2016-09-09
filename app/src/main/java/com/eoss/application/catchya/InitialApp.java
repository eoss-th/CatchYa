package com.eoss.application.catchya;

import android.app.Application;
import com.facebook.FacebookSdk;
import com.firebase.client.Firebase;

public class InitialApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(this.getApplicationContext());
        Firebase.setAndroidContext(this);

    }
}
