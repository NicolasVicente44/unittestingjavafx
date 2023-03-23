package com.example.demo4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle rectangle;
    private Rectangle square;


    @org.junit.Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(20,30);
        square = new Rectangle(20, 20);
    }

    @org.junit.Test
    public void setHeight() {
        rectangle.setHeight(50);
        assertEquals(50, rectangle.getHeight(), 0.0);
    }

    @org.junit.Test
    public void setHeightInvalid() {
        rectangle.setHeight(50);
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle.setHeight(0);
        });
    }


    @org.junit.Test
    public void setWidthInvalid() {
        rectangle.setWidth(50);
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            rectangle.setWidth(0);
        });
    }







    @org.junit.Test
    public void setWidth() {
        rectangle.setWidth(50);
        assertEquals(50, rectangle.getWidth(), 0.0);
    }



    @org.junit.Test
    public void isSquareFalse() {
        assertFalse(rectangle.isSquare());
    }

    @org.junit.Test
    public void isSquareTrue() {
        assertFalse(rectangle.isSquare());
    }


    @org.junit.Test
    public void getArea() {
        //rectangle is 20x30 = 600
        assertEquals(600, rectangle.getArea(), 0.0);

    }

    @org.junit.Test
    public void getAreaSquare() {
        //rectangle is 20x30 = 600
        assertEquals(400, square.getArea(), 0.0);

    }


    @org.junit.Test
    public void setWidthConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Rectangle(0, 20);
        });
    }
}