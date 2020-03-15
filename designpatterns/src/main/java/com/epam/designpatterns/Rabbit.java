package com.epam.designpatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rabbit implements Animal {
	private static final Logger LOGGER=LogManager.getLogger(Rabbit.class);
    @Override
    public void eat() {
        LOGGER.debug("Rabbit is eating, squeak!");
    } 
}
