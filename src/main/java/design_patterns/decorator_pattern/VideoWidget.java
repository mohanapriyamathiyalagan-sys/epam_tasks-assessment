package org.epam.design_patterns.decorator_pattern;

public class VideoWidget extends DecoratorPage{
    public VideoWidget(WebPage webPage) {
        super(webPage);
    }
    public int rank(){
        return webPage.rank()+3;
    }

    public String description(){
        return webPage.description()+ " + VideoWidget";
    }
}
