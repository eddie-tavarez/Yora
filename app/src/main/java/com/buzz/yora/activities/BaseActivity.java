package com.buzz.yora.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.buzz.yora.infrastructure.YoraApplication;

public abstract class BaseActivity extends ActionBarActivity {

    protected YoraApplication application;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        application = (YoraApplication) getApplication();

    }
}
