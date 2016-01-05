package com.chernenko.devcolibrilesson7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Dmytro on 05.01.16.
 */
public class MainActivity extends Activity {

    private EditText login;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
    }

    public void sendData(View v) {
        Intent intent = new Intent(this, LastActivity.class);
        intent.putExtra("login", login.getText().toString());
        intent.putExtra("password", password.getText().toString());
        startActivity(intent);
    }
}
