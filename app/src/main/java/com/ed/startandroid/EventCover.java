package com.ed.startandroid;

import android.app.Activity;
import android.view.View;

public class EventCover implements View.OnClickListener {
    private LoginActivity loginActivity;

     EventCover(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_ok:
                loginActivity.onClickOk();
                break;
            case R.id.button_cancel:
                loginActivity.onClickCancel();
                break;
        }
    }
}