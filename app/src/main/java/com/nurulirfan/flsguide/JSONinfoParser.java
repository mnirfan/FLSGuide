package com.nurulirfan.flsguide;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

/**
 * Created by indra on 12/06/17.
 */

public class JSONinfoParser {
    public static ArrayList<Info> mInfos = new ArrayList<>();

    public static Info parseFeed(JSONObject obj) {

        try {
            Info info = new Info();

            info.setmInfo(obj.getString("judul_info"));
            info.setmDeskripsi(obj.getString("deskripsi"));
            info.setmGambar(obj.getString("gambar"));
            info.setmTanggal(obj.getString("created_at"));
            info.setmId(obj.getString("info_id"));


            return info;
        } catch (JSONException e1) {
            e1.printStackTrace();
            return null;
        }

    }


    public static ArrayList<Info> parseArrayFeed(JSONArray arr) {

        JSONObject obj=null;
        Info info = null;
        mInfos.clear();
        try {


            for(int i = 0;i<arr.length();i++) {

                obj = arr.getJSONObject(i);
                info = new Info();
                info.setmInfo(obj.getString("judul_info"));
                info.setmDeskripsi(obj.getString("deskripsi"));
                info.setmGambar(obj.getString("gambar"));
                info.setmTanggal(obj.getString("created_at"));
                info.setmId(obj.getString("info_id"));


                mInfos.add(info);

            }
            return mInfos;
        } catch (JSONException e1) {
            e1.printStackTrace();
            return null;
        }


    }
}
