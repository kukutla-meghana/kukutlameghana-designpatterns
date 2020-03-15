package com.epam.designpatterns;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rectangle implements Shape {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
      @Override
      public void draw() {
    	  LOGGER.debug("Drawing Rectangle");
      }
      @Override
      public void resize() {
    	  LOGGER.debug("Resizing Rectangle");
      }
      @Override
      public String description() {
    	  return "Rectangle object";
      }
      @Override
      public boolean isHide() {
    	  return false;
      }
}
