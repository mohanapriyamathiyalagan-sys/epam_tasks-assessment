package org.epam.design_patterns.decorator_pattern;

abstract class DecoratorPage implements WebPage{
    protected WebPage webPage;

    public DecoratorPage(WebPage webPage){
        this.webPage = webPage;
    }
}
