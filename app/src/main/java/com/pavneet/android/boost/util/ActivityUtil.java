package com.pavneet.android.boost.util;

import android.content.Context;
import android.content.Intent;

import com.pavneet.android.boost.exceptions.InvalidObjectCreation;

/**
 * Created by Pavneet_Singh on 12/18/17.
 */
// this class cannot be inherited
final public class ActivityUtil {

    /*
      A helper function to start activity
      @param
     */
    public static void startActivity(Context context,Class<?> aClass){
        context.startActivity(new Intent(context,aClass));
    }
    private ActivityUtil(){
        // Use meaningful exceptions to throw
        throw new InvalidObjectCreation(ActivityUtil.this.getClass().getSimpleName());
    }

}