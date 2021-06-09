package org.fasttrackit;

import java.util.InputMismatchException;

public class Parent {


    public void multiple(int a, int b, int c, int d)  // method multiple -overriden - polimorfism dinamic
        {
            System.out.println(a*b*c*d);
        }

        public void divide(int a, int b)
        {
            System.out.println(a/b);
        }

        public void divide(int a, int b, int c)  // method divide- overloading - polimorfism static
        {
            System.out.println((a*b)/c);
        }
        Parent(int a)
        {
            System.out.println("This is a constructor");
            System.out.println("Root square: " + Math.sqrt(a));
        }

        public static void function(int a, int b)  // metoda static function se stocheaza in memoria clasei Parent, deci nu are nevoie neaparat de un obiect pt a putea fi folosita
        {
            System.out.println((a+3)*Math.pow(b, 3));
        }

        public void method(int a, int b) throws Exception
        {
            try
            {System.out.println(Math.pow(a,2) + Math.pow(b,3));}
            catch (InputMismatchException e)
            {throw new Exception("You have entered an invalid value!");}
            catch (ArrayIndexOutOfBoundsException e)
            {throw new RuntimeException("You have entered an invalid number!");}
        }

}
