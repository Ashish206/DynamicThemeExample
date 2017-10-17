package droidtuts4you.com.dynamicthemeexample;

import android.app.Activity;
import android.content.Intent;

class Theme {

    private static int mTheme;
    public final static int theme1 = 1;
    public final static int theme2 = 2;
    public final static int theme3 = 3;
    public final static int theme4 = 4;
    public final static int theme5 = 5;
    public final static int theme6 = 6;
    public final static int theme7 = 7;
    public final static int theme8 = 8;


    public static void changeToTheme(Activity activity, int theme)
    {
        mTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));

    }
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (mTheme)
        {
            default:
            case theme1:
                activity.setTheme(R.style.Theme1);
                break;
            case theme2:
                activity.setTheme(R.style.Theme2);
                break;
            case theme3:
                activity.setTheme(R.style.Theme3);
                break;
            case theme4:
                activity.setTheme(R.style.Theme4);
                break;
            case theme5:
                activity.setTheme(R.style.Theme5);
                break;
            case theme6:
                activity.setTheme(R.style.Theme6);
                break;
            case theme7:
                activity.setTheme(R.style.Theme7);
                break;
            case theme8:
                activity.setTheme(R.style.Theme8);
                break;
        }
    }
}
