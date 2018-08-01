package me.study.andbar.network;

import me.study.andbar.model.GitUser;

public interface UserCallBack {

    void onSuccess(GitUser gitUser);

    void onFailure(String errCode, String errMsg);

}
