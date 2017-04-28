package com.example.sunmz.myapplication;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by USER on 29/4/2560.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFirebaseInstanceIDService";

    @Override
    public void onTokenRefresh() {
       String refreshedToken = FirebaseInstanceId.getInstance().getToken();
       Log.d(TAG, "New Token: " + refreshedToken);


    }
}
