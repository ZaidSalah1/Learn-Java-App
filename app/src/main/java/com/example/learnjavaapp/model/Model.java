package com.example.learnjavaapp.model;

import android.widget.ImageView;

// Model class to represent data for each list item
public class Model {
    private String txtName, txtInfo;
    private int imageView;

    public Model(String txtName, String txtInfo, int imageView) {
        this.txtName = txtName;
        this.txtInfo = txtInfo;
        this.imageView = imageView;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getTxtInfo() {
        return txtInfo;
    }

    public void setTxtInfo(String txtInfo) {
        this.txtInfo = txtInfo;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}
