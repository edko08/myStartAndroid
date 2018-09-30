package com.ed.startandroid;

import android.app.LoaderManager;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView userName;
    TextView password;
    Button buttonOk;
    Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setElements();
        setPress();


    }

    private void setElements(){
        buttonOk = (Button) findViewById(R.id.button_ok);
        buttonCancel = (Button) findViewById(R.id.button_cancel);
        userName = (TextView) findViewById(R.id.editTextUserName);
        password = (TextView) findViewById(R.id.editTextPassword);
    }

    private void setPress(){
        buttonOk.setOnClickListener(new EventCover(this));
        buttonCancel.setOnClickListener(new EventCover(this));
    }

    public void onClickOk(){
        String st_userName = userName.getText().toString();
        if (TextUtils.isEmpty(st_userName)) {
            Toast.makeText(getApplicationContext(), "Не заполнено имя пользователя", Toast.LENGTH_LONG).show();
            return;
        }
        String st_password = password.getText().toString();
        if (TextUtils.isEmpty(st_password)) {
            Toast.makeText(getApplicationContext(), "Не заполнен пароль", Toast.LENGTH_LONG).show();
            return;
        }

    }

    public void onClickCancel() {
        Toast.makeText(getApplicationContext(), "Cancel", Toast.LENGTH_LONG).show();
    }
}
