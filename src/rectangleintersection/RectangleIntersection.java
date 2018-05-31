/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleintersection;


import model.Rectangle;
import service.RectanglesIntersection;
import service.RectanglesIntersectionImpl;

/**
 *
 * @author zoig
 */
public class RectangleIntersection {

    /**
     * main method for testing if some set of rectangles intersect.
     * Comment out second and third for false result.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(0, 0, 10, 0, 0, 5, 10, 5);
        Rectangle rect2 = new Rectangle(20, 0, 40, 0, 20, 5, 40, 5);
        Rectangle rect3 = new Rectangle(5, 0, 15, 0, 5, 10, 15, 10);
        Rectangle rect4 = new Rectangle(25, 33, 50, 33, 25, 50, 50, 50);
        
        Rectangle[] rects = new Rectangle[]{rect1, rect2, rect3, rect4};
        
        RectanglesIntersection intersection = new RectanglesIntersectionImpl();
        
        System.out.println(intersection.rectanglesSetIntersect(rects));
        
        
    }
    
}
