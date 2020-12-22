package com.fadil.film;

import android.content.Context;
import android.content.SharedPreferences;


public class AppPreference {
    private final String KEY_UPCOMING = "upcoming";
    private final String KEY_DAILY = "daily";
    private final String PREF_NAME = "UserPref";

    private final SharedPreferences preferences;
    private final SharedPreferences.Editor editor;

    public AppPreference(Context context) {
        preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    public void setUpcoming(boolean status){
        editor.putBoolean(KEY_UPCOMING, status);
        editor.apply();
    }

    public void setDaily(boolean status){
        editor.putBoolean(KEY_DAILY, status);
        editor.apply();
    }

    public boolean isUpcoming(){
        return preferences.getBoolean(KEY_UPCOMING,false);
    }

    public boolean isDaily(){
        return preferences.getBoolean(KEY_DAILY, false);
    }
}
