package com.glumes.materialdesignlearn.util;

import java.util.ArrayList;

/**
 * Created by zhaoying on 2016/12/27.
 */

public class CommonUtil {
    public static ArrayList<String> getData(String prefix){
        ArrayList<String> data = new ArrayList<>();

        for (int i = 0 ; i < 10 ; i ++){
            data.add(prefix + "  " + i);
        }
        return data ;
    }
}
