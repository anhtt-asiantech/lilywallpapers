package com.anhttvn.lilylivewallpaper.util;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Huu Duan on 9/7/2017.
 * @author anhtt
 */
public class ChangeFont {
    private Context mContex;
    public Typeface fontBeyond_Wonderland(Context context){
        mContex = context;
        Typeface typeThuDay = Typeface.createFromAsset(mContex.getResources().getAssets(), "font/Beyond Wonderland.ttf");
        return typeThuDay;
    }


}
