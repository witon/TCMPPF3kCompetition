package com.example.tcmppf3kcompetition;

import android.app.Application;
import android.util.Log;

public class F3KCompetitionApp extends Application {
    private static Application app = null;
    public void onCreate(){
        super.onCreate();
        app = this;
    }
    public static Application getApp(){
        return app;
    }
}
