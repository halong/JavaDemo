package com.example.javademo.network.okhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.javademo.R;
import com.example.javademo.network.okhttp.ui.okhttp.OkhttpFragment;

public class OkhttpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.okhttp_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, OkhttpFragment.newInstance())
                    .commitNow();
        }
    }
}
