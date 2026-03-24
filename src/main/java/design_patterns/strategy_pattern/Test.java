package org.epam.design_patterns.strategy_pattern;

public class Test {
    public static void main(String[] args) {
        PhotoCameraApp app = new BasicCameraApp();
        app.takePhoto();
        app.savePhoto();

        app.setShareStrategy(new ShareByEmail());
        app.sharePhoto("myphoto.jpg");


    }
}
