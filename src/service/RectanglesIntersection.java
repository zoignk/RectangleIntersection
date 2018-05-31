package service;


import model.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zoig
 */
public interface RectanglesIntersection {
    
/**
 * Compares if two rectangles intersect
 * 
 * @param r1 - Rectangle 1
 * @param r2 - Rectangle 2
 * @return - true if tworectangles intersect
 */
    public boolean rectanglesIntersect(Rectangle r1, Rectangle r2);
    /**
     * Analyze if there is intersection between any couple
     * @param rectangles - set of rectangles for which is needed to analyze if there is intersection between any couple
     * @return - true if intersection exists
     */
    public boolean rectanglesSetIntersect(Rectangle[] rectangles);
}
