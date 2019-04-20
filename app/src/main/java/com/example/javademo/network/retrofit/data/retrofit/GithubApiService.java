package com.example.javademo.network.retrofit.data.retrofit;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubApiService {
    //eg:https://api.github.com/users/halong/repos
    @GET("users/{user}/repos")
    Call<ResponseBody> getResponseBody(@Path("user") String user);

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
