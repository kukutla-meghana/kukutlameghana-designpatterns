package com.epam.designpatterns;

public class Skyscraper implements Strategy {

    @Override
    public String build(String location) {
        return "Building a skyscraper in the " + location + " area.";
    }
}