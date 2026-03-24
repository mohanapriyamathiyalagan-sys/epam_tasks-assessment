package org.epam.design_patterns.decorator_pattern;

public class ChatWidget extends DecoratorPage{
    public ChatWidget(WebPage webPage) {
        super(webPage);
    }

    public int rank(){
        return webPage.rank()+10;
    }

    public String description(){
        return webPage.description()+ " + ChatWidget";
    }
}
