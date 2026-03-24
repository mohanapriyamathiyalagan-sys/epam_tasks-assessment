package org.epam.design_patterns.decorator_pattern;

public class DesktopVersion implements WebPage{
    @Override
    public int rank() {
        return 10;
    }

    @Override
    public String description() {
        return "Desktop Page";
    }
}
