package com.example.javademo.database.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.javademo.R;
import com.example.javademo.database.sqlite.ui.sqlite.SqliteFragment;

public class SqliteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sqlite_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, SqliteFragment.newInstance())
                    .commitNow();
        }
    }
}
