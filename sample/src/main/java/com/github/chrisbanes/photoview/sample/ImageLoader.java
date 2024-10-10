package com.github.chrisbanes.photoview.sample;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

public class ImageLoader {
    private AssetManager assetManager;

    public ImageLoader(AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    public Bitmap loadBitmapFromAssets(String fileName) {
        try (InputStream inputStream = assetManager.open(fileName)) {
            return BitmapFactory.decodeStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
