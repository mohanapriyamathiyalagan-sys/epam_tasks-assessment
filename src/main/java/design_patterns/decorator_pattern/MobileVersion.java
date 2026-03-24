package org.epam.design_patterns.decorator_pattern;

public class MobileVersion implements WebPage{
    @Override
    public int rank() {
        return 5;
    }

    @Override
    public String description() {
        return "Mobile Page";
    }
}
