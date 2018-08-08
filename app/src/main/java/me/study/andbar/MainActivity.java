package me.study.andbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.gentler.downloaderlib.manager.DownloaderManager;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import me.study.andbar.adapter.UserRecyclerAdapter;
import me.study.andbar.model.GitUser;
import me.study.andbar.model.User;
import me.study.andbar.network.UserCallBack;
import me.study.andbar.proto.GitHubProto;
import me.study.andbar.ui.LoginActivity;
import me.study.andbar.utils.LogUtils;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private Toolbar mToolBar;
    private List<User> mUserList = new ArrayList<>();
    private UserRecyclerAdapter mAdapter;
    private LinearLayoutManager mLinearLayoutManager;
    private AppBarLayout mAppBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initData();

        initListener();

    }

    private void initListener() {
        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {


            }
        });

        GitHubProto.getUserProfile("GentleLi", new UserCallBack() {
            @Override
            public void onSuccess(GitUser gitUser) {

            }

            @Override
            public void onFailure(String errCode, String errMsg) {

            }
        });
    }

    private void initData() {
        User user;
        for (int i = 0; i < 20; i++) {
            user = new User();
            user.setName("name:" + "10000" + i);
            user.setAge("26");
            user.setAvatar("");
            user.setProfile("personal profile：10000" + i);
            mUserList.add(user);
        }
        mAdapter = new UserRecyclerAdapter(this, getLayoutInflater());
        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setData(mUserList);
        mAdapter.notifyDataSetChanged();

//        DownloaderManager.getInstance().download(null);


        mToolBar.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        }, 3000);

    }

    private void initView() {
        mToolBar = findViewById(R.id.toolbar);
        mAppBarLayout = findViewById(R.id.appbar);
        mRecyclerView = findViewById(R.id.recycler_view);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);

        mToolBar.setNavigationIcon(R.drawable.icon_back);


    }

}




