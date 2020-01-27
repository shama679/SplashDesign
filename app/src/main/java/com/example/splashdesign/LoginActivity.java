package com.example.splashdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView = findViewById(R.id.sign_inLaterTV);
        textView.setPaintFlags(textView.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }
}
