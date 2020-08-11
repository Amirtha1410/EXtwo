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
public class electricbill {
    
    public static void main(String [] args)
    {
        currentbill obj=new currentbill(3476,"SUNDAR",19230,19660,"commercial current");
        System.out.println("\nCONSUMER DETAILS\n");
        obj.getnumber();
        obj.getname();
        obj.getprevmonth();
        obj.getcurmonth();
        obj.gettype();
        obj.consumption();
        obj.domestic();
        obj.commercial();
        
        
      
    }
}






class currentbill
{
   int number;
   String name;
   double prevmonth;
   double curmonth;
   String EBtype;
   double c;
   
   
   currentbill(int num,String n,double p,double c,String t)
   {
       number=num;
       name=n;
       prevmonth=p;
       curmonth=c;
       EBtype=t;
       
   }
   void getnumber()
   {
       System.out.println("\nCONSUMER NUMBER:"+number);
   }
   void getname()
   {
       System.out.println("\nCONSUMER NAME:"+name);
   }
   void getprevmonth()
   {
       System.out.println("\nPREVIOUS MONTH READING:"+prevmonth);
   }
   void getcurmonth()
   {
       System.out.println("\nCURRENT MONTH READING:"+curmonth);
   }
   void gettype()
   {
       System.out.println("\nTYPE OF EB CONNECTION:"+EBtype);
   }
   void consumption()
   {
       c=(curmonth-prevmonth);
       System.out.println("\nCONSUMPTION:"+c);
   }
   void domestic()
   {
       
       if(EBtype=="domestic current")
       {
          if(c==100)
          {
              System.out.println("\nCURRENT BILL IS Rs.150");
          }
          else if(c>=101 && c<=200)
          {
              System.out.println("\nCURRENT BILL IS Rs.3.00");
          }
          else if(c>=201 && c<=500)
          {
               System.out.println("\nCURRENT BILL IS Rs.4.50");
          }
          else
          {
               System.out.println("\nCURRENT BILL IS Rs.7.00");
          }
       }
     }
     
     void commercial()
   {
       
       if(EBtype=="commercial current")
       {
          if(c==100)
          {
              System.out.println("\nCURRENT BILL IS Rs.2.50");
          }
          else if(c>=101 && c<=200)
          {
              System.out.println("\nCURRENT BILL IS Rs.5.00");
          }
          else if(c>=201 && c<=500)
          {
               System.out.println("\nCURRENT BILL IS Rs.6.50");
          }
          else
          {
               System.out.println("\nCURRENT BILL IS Rs.9.00");
          }
                   
       }     
   }
}
   