package org.epam.design_patterns.strategy_pattern;

abstract class PhotoCameraApp {
    protected ShareStrategy shareStrategy;

    public void setShareStrategy(ShareStrategy shareStrategy){

        this.shareStrategy = shareStrategy;
    }
    public void takePhoto(){
        System.out.println("Taking photo ----");
    }
    public void savePhoto(){
        System.out.println("Saving photo -----");
    }

    public abstract void editPhoto();

    public void sharePhoto(String photo){
        shareStrategy.sharePhoto(photo);
    }
}
