package com.pavneet.android.boost.util;

import com.pavneet.android.boost.R;
import com.pavneet.android.boost.bean.TextAndImageBean;
import com.pavneet.android.boost.exceptions.InvalidObjectCreation;

import java.util.Collections;
import java.util.List;

/**
 * Created by Pavneet_Singh on 12/18/17.
 */
// this class cannot be inherited
final public class Util {

    public static final String DEMO_LIST_ITEMS[]= {
            "FloatingButton motion up with SnackBar",
            "Animation",
            "Material Design"
    };
    private Util(){
        // Use meaningful exceptions to throw
        throw new InvalidObjectCreation(Util.this.getClass().getSimpleName());
    }


    public static List<TextAndImageBean> getList(){
        return Collections.nCopies(20,getBean());
    }

    private static TextAndImageBean getBean(){
        return new TextAndImageBean("Demo", R.drawable.norml);
    }

}