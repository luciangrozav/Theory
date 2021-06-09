package org.fasttrackit;


public class Child extends Parent {


 Child(int a)
 {
     super(a);
 }

    public void multiple(int a, int b)
    {
        System.out.println(a*b);
    }

    public static void function(int a, int b, int c)  // method hiding
    {
        System.out.println(a*b*c);
    }

}
