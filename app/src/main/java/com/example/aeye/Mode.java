package com.example.aeye;

public class Mode {
    private int image;
    private String title;
    private Integer title_color;

    public Mode(int image, String title, Integer title_color) {
        this.image = image;
        this.title = title;
        this.title_color = title_color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTitle_color() {
        return title_color;
    }

    public void setTitle_color(Integer title_color) {
        this.title_color = title_color;
    }
}
