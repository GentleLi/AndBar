package me.study.andbar.model;

import android.os.Parcel;
import android.os.Parcelable;

public class WeatherModel implements Parcelable {

    private String aqi;
    private String date;
    private String fl;
    private String fx;
    private String high;
    private String low;
    private String notice;
    private String sunrise;
    private String sunset;
    private String type;

    protected WeatherModel(Parcel in) {
        aqi = in.readString();
        date = in.readString();
        fl = in.readString();
        fx = in.readString();
        high = in.readString();
        low = in.readString();
        notice = in.readString();
        sunrise = in.readString();
        sunset = in.readString();
        type = in.readString();
    }

    public static final Creator<WeatherModel> CREATOR = new Creator<WeatherModel>() {
        @Override
        public WeatherModel createFromParcel(Parcel in) {
            return new WeatherModel(in);
        }

        @Override
        public WeatherModel[] newArray(int size) {
            return new WeatherModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(aqi);
        dest.writeString(date);
        dest.writeString(fl);
        dest.writeString(fx);
        dest.writeString(high);
        dest.writeString(low);
        dest.writeString(notice);
        dest.writeString(sunrise);
        dest.writeString(sunset);
        dest.writeString(type);
    }
}
