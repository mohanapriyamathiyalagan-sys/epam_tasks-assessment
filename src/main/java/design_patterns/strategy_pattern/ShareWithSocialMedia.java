package org.epam.design_patterns.strategy_pattern;

public class ShareWithSocialMedia implements ShareStrategy{
    @Override
    public void sharePhoto(String photo) {
        System.out.println("Share photo with social media"+photo);
    }
}
