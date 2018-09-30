package com.ed.startandroid;

import android.view.View;

public class EventCover implements View.OnClickListener {
    private final MainActivity main;

     EventCover(MainActivity main) {
        this.main = main;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_ok:
                main.onClickOk();
                break;
            case R.id.button_cancel:
                main.onClickCancel();
                break;
        }
    }
}