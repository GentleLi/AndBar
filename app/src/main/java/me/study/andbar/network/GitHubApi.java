package me.study.andbar.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubApi {

    @GET("users/{user}")
    Call<ResponseBody> getUser(@Path("user") String user);

}
