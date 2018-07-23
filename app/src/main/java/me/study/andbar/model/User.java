package me.study.andbar.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by admin on 2018/7/18.
 */

public class User implements Parcelable {

    private String name;
    private String age;
    private String profile;
    private String avatar;

    public User() {
    }

    protected User(Parcel in) {
        name = in.readString();
        age = in.readString();
        profile = in.readString();
        avatar = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(age);
        dest.writeString(profile);
        dest.writeString(avatar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", profile='" + profile + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
