package com.self.recylerviewjsonexample;

public class ExampleItem {
    private String ImagUrl;
    private String mCreator;
    private  int mLikes;

    public ExampleItem(String imagUrl, String mCreator, int mLikes)
    {
        ImagUrl = imagUrl;
        this.mCreator = mCreator;
        this.mLikes = mLikes;
    }


    public String getImagUrl() {
        return ImagUrl;
    }

    public String getmCreator() {
        return mCreator;
    }

    public int getmLikes() {
        return mLikes;
    }

}
