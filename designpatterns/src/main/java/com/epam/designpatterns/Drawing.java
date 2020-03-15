package com.epam.designpatterns;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Drawing {
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    List<Shape> shapes = new ArrayList<Shape>();
    public Drawing() {
    super();
    }
    public void addShape(Shape shape) {
    shapes.add(shape);
    }
    public List<Shape> getShapes() {
    return new ArrayList<Shape>(shapes);
    }
    public void draw() {
          if (shapes.isEmpty()) {
          LOGGER.debug("Nothing to draw!");
          } else {
          shapes.stream().forEach(shape -> shape.draw());
          }
    }
    public void resize() {
          if (shapes.isEmpty()) {
          LOGGER.debug("Nothing to resize!");
          } else {
          shapes.stream().forEach(shape -> shape.resize());
          }
    }
}

