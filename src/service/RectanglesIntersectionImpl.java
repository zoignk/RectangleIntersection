/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Rectangle;

/**
 *
 * @author zoig
 */
public class RectanglesIntersectionImpl implements RectanglesIntersection {

    @Override
    public boolean rectanglesIntersect(Rectangle r1, Rectangle r2) {
//        System.out.println(r1.getAngles()[0].getX() < r2.getAngles()[0].getX() + r2.getWidth());
//        System.out.println(r1.getAngles()[0].getX() + r1.getWidth() > r2.getAngles()[0].getX());
//        System.out.println(r1.getAngles()[0].getY() < r2.getAngles()[0].getY() + r2.getHeight());
//        System.out.println(r1.getAngles()[0].getY() + r1.getHeight()> r2.getAngles()[0].getY());
        return (r1.getAngles()[0].getX() < r2.getAngles()[0].getX() + r2.getWidth()) 
                && (r1.getAngles()[0].getX() + r1.getWidth() > r2.getAngles()[0].getX())
                &&
               (r1.getAngles()[0].getY() < r2.getAngles()[0].getY() + r2.getHeight())
                && (r1.getAngles()[0].getY() + r1.getHeight()> r2.getAngles()[0].getY());
            
    }

    @Override
    public boolean rectanglesSetIntersect(Rectangle[] rectangles) {
        for (int i = 0; i < rectangles.length-1; i++) {
            for (int j = i+1; j < rectangles.length; j++) {
                if (rectanglesIntersect(rectangles[i], rectangles[j]))
                    return true;
            }
            
        }
        return false;
    }





    
}
