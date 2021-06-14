package ru.geekbrains.mynotes.domain;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.StringRes;

public class Structure implements Parcelable {

    @StringRes
    private int name;
    private int description;

    public Structure(int name, int description) {
        this.name = name;
        this.description = description;
    }

    protected Structure(Parcel in) {
        name = in.readInt();
    }

    public static final Creator<Structure> CREATOR = new Creator<Structure>() {
        @Override
        public Structure createFromParcel(Parcel in) {
            return new Structure(in);
        }

        @Override
        public Structure[] newArray(int size) {
            return new Structure[size];
        }
    };

    public int getName() {
        return name;
    }
    public int getDescription() {
        return description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(name);
    }
}
