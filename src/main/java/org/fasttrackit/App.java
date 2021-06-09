package org.fasttrackit;

public class App 
{
    public static void main( String[] args )

    {
        Parent parent = new Parent(9);

        parent.divide(100, 5);
        parent.divide(100 , 10, 20);

        parent.multiple(3, 4, 5, 6);

        Child child = new Child(625);

         child.multiple(3,3);

         Parent.function(5, 4);

         Parent object = new Child(125); // object e un obiect de tip Child (cu referinta stocata in Parent)

         object.function(5,4);  // metoda function e statica, deci nu poate fi overridden => object va apela metoda din superclasa, nu cea din subclasa

    }

}
