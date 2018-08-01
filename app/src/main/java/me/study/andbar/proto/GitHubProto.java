package me.study.andbar.proto;

import android.util.Log;

import java.io.IOException;

import me.study.andbar.config.NetApi;
import me.study.andbar.network.GitHubApi;
import me.study.andbar.network.UserCallBack;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class GitHubProto {
    private static final String TAG = GitHubProto.class.getSimpleName();

    public static void getUserProfile(String userName, UserCallBack userCallBack) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(NetApi.BASE_URL)
                .build();
        GitHubApi gitHubApi = retrofit.create(GitHubApi.class);
        Call<ResponseBody> call = gitHubApi.getUser(userName);

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (null == response) {
                    return;
                }
                try {
                    Log.e(TAG, response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e(TAG, "onFailure");
            }
        });

    }

}
