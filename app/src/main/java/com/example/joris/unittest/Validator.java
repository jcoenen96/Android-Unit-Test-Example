package com.example.joris.unittest;

import android.util.Log;

public class Validator {

    private static final String TAG = Validator.class.getSimpleName();

    //just a quick demo method, no strong validation
    public static boolean email(String str){
        if(str.contains("@")){
            return true;
        }
        return false;
    }
}
