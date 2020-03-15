package com.epam.designpatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dog implements Animal {
	private static final Logger LOGGER=LogManager.getLogger(Dog.class);
    @Override
    public void eat() {
        LOGGER.debug("Dog is eating, woof!");
    }    
}
