package com.infinitylabs.infinitymiles;

import android.media.Image;

/**
 * Created by Aaron on 3/9/2018.
 */

public class State {
    public String name = "";
    public int licensePlateImage;
    public Boolean isFound = false;

    public State(String name, int licensePlateImage, Boolean isFound) {
        this.name = name;
        this.licensePlateImage = licensePlateImage;
        this.isFound = isFound;
    }
}
