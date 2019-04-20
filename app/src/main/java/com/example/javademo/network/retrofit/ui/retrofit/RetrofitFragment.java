package com.example.javademo.network.retrofit.ui.retrofit;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.javademo.R;

public class RetrofitFragment extends Fragment {

    private RetrofitViewModel mViewModel;
    private TextView message;
    private View view;
    private Button btn1;

    public static RetrofitFragment newInstance() {
        return new RetrofitFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.retrofit_fragment, container, false);
        message=view.findViewById(R.id.message);
        btn1=view.findViewById(R.id.btn1);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RetrofitViewModel.class);

        mViewModel.getMessageData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                message.setText(s);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setText("loading...");
                mViewModel.getInternetMessage();
            }
        });
    }

}
