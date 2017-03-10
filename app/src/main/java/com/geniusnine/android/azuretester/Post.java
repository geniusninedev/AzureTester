package com.geniusnine.android.azuretester;

/**
 * Created by AndriodDev8 on 10-03-2017.
 */

public class Post {
    private String firebaseid;
    private String title;
    private String postcontent;

    public Post() {
    }

    public String getFirebaseid() {
        return firebaseid;
    }

    public void setFirebaseid(String firebaseid) {
        this.firebaseid = firebaseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostcontent() {
        return postcontent;
    }

    public void setPostcontent(String postcontent) {
        this.postcontent = postcontent;
    }
}
