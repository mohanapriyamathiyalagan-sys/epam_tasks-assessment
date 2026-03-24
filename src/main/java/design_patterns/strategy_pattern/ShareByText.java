package org.epam.design_patterns.strategy_pattern;

public class ShareByText implements ShareStrategy{
    @Override
    public void sharePhoto(String photo) {
        System.out.println("Share photo by text"+photo);
    }
}
