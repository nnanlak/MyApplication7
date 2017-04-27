package com.example.sunmz.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunmz on 26/4/2560.
 */

public class cloth {
    private String breed;
    private String drescription;
    private int resId;
    private List<cloth> clothList = new ArrayList<>();

    cloth() {

    }
    cloth(int resId,String breed,String drescription){
        this.resId = resId ;
        this.breed = breed ;
        this.drescription = drescription ;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDrescription() {
        return drescription;
    }

    public void setDrescription(String drescription) {
        this.drescription = drescription;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public List<cloth> getClothList() {
        return clothList;
    }

    public void setClothList(List<cloth> clothList) {
        this.clothList = clothList;
    }
}
