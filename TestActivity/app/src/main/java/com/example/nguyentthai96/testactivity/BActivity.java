package com.example.nguyentthai96.testactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    public void newActivityA(View view) {
        Intent intent = new Intent(this, AActivity.class);
        startActivity(intent);
    }

    public void newActivityB(View view) {
        Intent intent = new Intent(this, BActivity.class);
        startActivity(intent);
    }

    public void newActivityC(View view) {
        Intent intent = new Intent(this, CActivity.class);
        startActivity(intent);
    }

    public void newActivityD(View view) {
        Intent intent = new Intent(this, DActivity.class);
        startActivity(intent);
    }

    public void newActivityE(View view) {
        Intent intent = new Intent(this, EActivity.class);
        startActivity(intent);
    }

    public void clickTest(View view) {
        if (((Button) view).getText().equals("clickTest")) {
            ((Button) view).setText("Click Roi do");
        } else {
            ((Button) view).setText("clickTest");
        }
    }
}
