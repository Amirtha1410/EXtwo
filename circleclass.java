/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram.EXtwo;

/**
 *
 * @author ELCOT
 */
public class circleclass {
    public static void main(String[] args)
    {
     
       circle obj=new circle(4.0);
       obj.circle();
       System.out.println("RADIUS:");
       System.out.println(obj.getradius());
       System.out.println("AREA:");
       System.out.println(obj.getarea());
        
    }
            
           
}





class circle
{
    double radius=1.0;
    String color="red";
    
     void circle()
    {
        System.out.println("RADIUS="+radius+"\nCOLOR="+color);
    }
    
    
   
    circle(double r)
    {
        radius=r;
        
    }
    double getradius()
    {
        return radius;
    }
    double getarea()
    {
        return (3.14*radius*radius);
    }
}
