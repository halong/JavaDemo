package com.example.javademo.network.retrofit.ui.retrofit;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.javademo.network.retrofit.data.retrofit.RetrofitUtil;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitViewModel extends ViewModel {
    private MutableLiveData<String> messageData=new MutableLiveData<>();

    public void getInternetMessage(){
        RetrofitUtil.getGithubApiService().getResponseBody("halong").enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    messageData.setValue(response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

    public LiveData<String> getMessageData(){
        return messageData;
    }
}
