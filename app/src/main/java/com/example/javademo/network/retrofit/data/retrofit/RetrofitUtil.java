package com.example.javademo.network.retrofit.data.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {
    private static Retrofit mRetrofit;
    private static GithubApiService mGithubApiService;

    private RetrofitUtil() {

    }

    private static Retrofit getRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl("https://api.github.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mRetrofit;
    }

    public static GithubApiService getGithubApiService() {
        if (mGithubApiService == null) {
            mGithubApiService = getRetrofit().create(GithubApiService.class);
        }
        return mGithubApiService;
    }
}




