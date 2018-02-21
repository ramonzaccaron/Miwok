package com.example.android.miwok;

/**
 * Created by Ramon on 01/02/2018.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int mediaSound) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = mediaSound;
    }

    public Word(String defaultTranslation, String miwokTranslation, int mediaSoundId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = mediaSoundId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public Boolean hasVisible() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() { return mAudioResourceId;}
}
