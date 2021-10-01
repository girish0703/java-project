package com.spring.factory;

import java.awt.Shape;

public interface ShapeFactory {
    
    Shape getShape(String name);
    
}