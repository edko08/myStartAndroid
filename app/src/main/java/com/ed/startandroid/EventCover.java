package com.ed.startandroid;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.net.sip.SipSession;
import android.support.v4.os.CancellationSignal;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class EventCover extends Activity implements View.OnClickListener {

    private static final String Clicked = "ghghg";
    int idView;

    public EventCover() { }

    @Override
    public void onClick(View view) {
        String context =  "ghghgh";
        switch (view.getId()) {
            case R.id.button_ok:
              //  Toast.makeText(context, Clicked, Toast.LENGTH_LONG).show();
                break;
            case R.id.button_cancel:

              //  Toast.makeText(context, Clicked, Toast.LENGTH_LONG).show();
                break;

        }
    }
}