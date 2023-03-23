package com.example.demo4;

public class Rectangle {
    private double width, height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }







    public double getWidth() {
        return width;
    }






    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;

        } else {
            throw new IllegalArgumentException("width must be greater than zero");
        }
    }






    public double getHeight() {
        return height;
    }





    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("height must be greater than zero");
        }
    }




    public boolean isSquare () {
        if (height == width) {
            return true;
        } else {
            return false;
        }
    }



    public double getArea () {
        return width * height;
    }


}
