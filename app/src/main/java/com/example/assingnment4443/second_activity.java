package com.example.assingnment4443;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
    ImageView imageView;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        imageView=findViewById(R.id.imgapp);
        t1=findViewById(R.id.txtName);
        t2=findViewById(R.id.txtdescription);
        imageView.setImageResource(getIntent().getIntExtra("Image App",0));
        t1.setText(getIntent().getStringExtra("App Name"));
        t2.setText(getIntent().getStringExtra("App Description"));
    }
}