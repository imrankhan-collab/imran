package com.example.assingnment4443;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler_app;
    private MyAdapter AppAdapter;
    private List<Input> NameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_app = findViewById(R.id.recyclerapp);
        loadContacts();


    }

    private void loadContacts() {

        NameList = new ArrayList<>();

        //Adding Contacts in contactList
        NameList.add(new Input(R.drawable.android, "Apk Parser", "com.gmail.heagoo.apkeditor.parser"));
        NameList.add(new Input(R.drawable.android1, "Android app Development", "com.HussainLab.learnAndroidApp"));
        NameList.add(new Input(R.drawable.deveoper, "Android Development", "com.HussainLab.learnAndroidApp"));
        NameList.add(new Input(R.drawable.tutorial, "Android  Studio Tutorial", "com.HussainLab.learnAndroidApp"));
        NameList.add(new Input(R.drawable.developt, "Android Tutorial", "com.HussainLab.learnAndroidApp"));
        NameList.add(new Input(R.drawable.apk, "Apk Info", "com.HussainLab.learnAndroidApp"));
        NameList.add(new Input(R.drawable.assitant, "App Assistant", "com.HussainLab.learnAndroidApp"));
        NameList.add(new Input(R.drawable.appgaller, "App Gallery", "com.HussainLab.learnAndroidApp"));
        NameList.add(new Input(R.drawable.develop, "Awesome App developer", "com.HussainLab.learnAndroidApp"));
        NameList.add(new Input(R.drawable.development, "Group development", "com.HussainLab.learnAndroidApp"));
        NameList.add(new Input(R.drawable.thinking, "Thinking About", "com.HussainLab.learnAndroidApp"));
        AppAdapter = new MyAdapter(MainActivity.this, NameList);

        //Adding Layout To Recycler View
        recycler_app.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        //Setting Adapter
        recycler_app.setAdapter(AppAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.apk_info, menu);
        return super.onCreateOptionsMenu(menu);

    }

    }

