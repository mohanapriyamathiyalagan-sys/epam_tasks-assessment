package org.epam.design_patterns.decorator_pattern;

public class Test {
    public static void main(String[] args) {
        WebPage page = new DesktopVersion();
        page = new ChatWidget(page);
        page = new VideoWidget(page);

        System.out.println(page.description());
        System.out.println("Total Rank: "+page.rank());

    }
}
