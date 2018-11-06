/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018_09_20_javaapp_oop;

public class Main
{
    public static void main(String[] args)
    {
        Pont p1 = new Pont();
        Pont p2 = new Pont(20);
        Pont p3 = new Pont(3, -9);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3.toString());
        System.out.println("");
        
        Pont[] pontok = new Pont[10];
        for (int i = 0; i < pontok.length; i++)
        {
            pontok[i] = new Pont(50);
            System.out.println(pontok[i] + " " + pontok[i].Origotol_Vett_tavolsag());
        }
        Pont p4 = new Pont(-3,4);
        System.out.println(p4.Origotol_Vett_tavolsag());
        
        Pont p5 = new Pont(0,0);
        double tavolsag =  p4.Tavolsag(p5);
        System.out.println(tavolsag);
        
        System.out.println(p5.equals("sajt")); // false
        System.out.println(p5.equals(34)); // false
        System.out.println(p5.equals(new Pont(1,1))); // false
        System.out.println(p5.equals(p1)); // true
        System.out.println(p5.equals(p5));
        
    }
}