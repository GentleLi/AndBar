package me.study.andbar.model;

import android.os.Parcel;
import android.os.Parcelable;

public class BaseModel<T> implements Parcelable {

    protected String message;
    protected String status;
    protected T data;


    protected BaseModel(Parcel in) {
        message = in.readString();
        status = in.readString();
    }

    public static final Creator<BaseModel> CREATOR = new Creator<BaseModel>() {
        @Override
        public BaseModel createFromParcel(Parcel in) {
            return new BaseModel(in);
        }

        @Override
        public BaseModel[] newArray(int size) {
            return new BaseModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(message);
        dest.writeString(status);
    }
}
