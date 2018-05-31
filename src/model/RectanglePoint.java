/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Represents one point (angle) of Rectangle
 *
 * @author zoig
 */
public class RectanglePoint {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public RectanglePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
}
