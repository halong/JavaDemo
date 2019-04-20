package com.example.javademo.database.room;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.javademo.R;
import com.example.javademo.database.room.ui.room.RoomFragment;

public class RoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, RoomFragment.newInstance())
                    .commitNow();
        }
    }
}
