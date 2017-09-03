package com.example.nguyentthai96.notificationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class DoSomethingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        ImageView image = new ImageView(this);
        image.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher));
        setContentView(image);
        Toast.makeText(getApplicationContext(),
                "Do Something NOW",
                Toast.LENGTH_LONG).show();
    }

}
