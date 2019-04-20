package com.example.javademo.network.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.javademo.R;
import com.example.javademo.network.retrofit.ui.retrofit.RetrofitFragment;

public class RetrofitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retrofit_activity);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, RetrofitFragment.newInstance())
                    .commitNow();
        }
    }
}
