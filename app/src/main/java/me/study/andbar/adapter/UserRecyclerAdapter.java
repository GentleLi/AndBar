package me.study.andbar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;
import me.study.andbar.R;
import me.study.andbar.extra.Cheeses;
import me.study.andbar.model.User;

/**
 * Created by admin on 2018/7/18.
 */

public class UserRecyclerAdapter extends BaseRecyclerAdapter<User, UserRecyclerAdapter.UserViewHolder> {


    public UserRecyclerAdapter(LayoutInflater mInflater) {
        super(mInflater);
    }

    public UserRecyclerAdapter(Context context, LayoutInflater inflater) {
        super(context, inflater);
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UserViewHolder(mInflater.inflate(R.layout.view_user_item, null));
    }


    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        User user = datas.get(position);
        if (null == user) return;
        holder.userName.setText(user.getName());
        holder.profile.setText(user.getProfile());
        Glide.with(mContext).load(Cheeses.getRandomCheeseDrawable()).into(holder.avatar);

    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {

        private final CircleImageView avatar;
        private final TextView userName, profile;

        public UserViewHolder(View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
            userName = itemView.findViewById(R.id.tv_username);
            profile = itemView.findViewById(R.id.tv_profile);

        }
    }

}
