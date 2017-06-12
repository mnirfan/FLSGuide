package com.nurulirfan.flsguide;
import java.io.Serializable;
/**
 * Created by indra on 12/06/17.
 */

public class Info implements Serializable{
    //deklarassi file yang akan dibuat
    private String mId;
    private String mInfo;
    private String mDeskripsi;
    private String mGambar;
    private String mTanggal;

    //bikin stter getter

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmInfo() {
        return mInfo;
    }

    public void setmInfo(String mInfo) {
        this.mInfo = mInfo;
    }

    public String getmDeskripsi() {
        return mDeskripsi;
    }

    public void setmDeskripsi(String mDeskripsi) {
        this.mDeskripsi = mDeskripsi;
    }

    public String getmGambar() {
        return mGambar;
    }

    public void setmGambar(String mGambar) {
        this.mGambar = mGambar;
    }

    public String getmTanggal() {
        return mTanggal;
    }

    public void setmTanggal(String mTanggal) {
        this.mTanggal = mTanggal;
    }
}
