/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Represents one rectangle
 * @author zoig
 */
public class Rectangle {
    
    private RectanglePoint[] angles = new RectanglePoint[4];
    
    private double width;
    private double height;
    /**
     *  Creates one Rectangle and calculates height and weight
     * 
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     * @param x4
     * @param y4 
     */
    public Rectangle (double x1, double y1,double x2, double y2,double x3, double y3,double x4, double y4){
        angles[0] = new RectanglePoint(x1, y1);
        angles[1] = new RectanglePoint(x2, y2);
        angles[2] = new RectanglePoint(x3, y3);
        angles[3] = new RectanglePoint(x4, y4);
        width = x2-x1;
        height = y3-y1;
    }

    public RectanglePoint[] getAngles() {
        return angles;
    }

    public void setAngles(RectanglePoint[] angles) {
        this.angles = angles;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    
    
}
