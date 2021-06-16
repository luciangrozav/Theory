package org.fasttrackit;

import java.util.*;

public class Colectii {

    public static void main(String[] args) {

        List <String> x= new ArrayList<>();  // elementele se afiseaza in ordine crescatoare + elementele repetate

        x.add("Orange");
        x.add("Mango");
        x.add("Peach");
        x.add("Cherry");
        x.add("BLueberry");
        x.add("Orange");

        for( String y:x)
            System.out.println(y);

        System.out.println(" ");

        Set <String> a= new HashSet<String>();  // elementele se afiseaza haotic, dar nu afiseaza dubluri
        a.add("Orange");
        a.add("Mango");
        a.add("Peach");
        a.add("Orange");
        a.add("Cherry");
        a.add("Strawberry");

        for (String b:a)  // afiseaza elementele in mod unicat
            System.out.println(b);

        System.out.println(" ");

        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(1, "English");
        m.put(2, "Deutsch");

        for (Map.Entry n: m.entrySet())
            System.out.println(n);
        System.out.println(" ");
        System.out.println(m);

        System.out.println(" ");

        int n=5;

        List<Integer> v = new Vector<Integer>(n);

        for (int i=1; i<=n;i++)
            v.add(i*i);

        System.out.println(v);
        System.out.println(" ");

        for (int i=0; i<v.size();i++)
            System.out.println(v.get(i)); // get <-> afisare
    }



}
