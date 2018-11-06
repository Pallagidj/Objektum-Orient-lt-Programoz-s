/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018_09_20_javaapp_oop;

public class Pont
{
    // adattagok
    private int x;
    private int y;
    
    // metódusok
    
    // kontstruktor
    public Pont() // mindig megegyezik az osztály nevével
    {
        
    }
    public Pont(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public Pont(int max)
    {
        this.x =(int) (Math.random() * 2 * max-max);
        this.y =(int) (Math.random() * 2 * max-max);
    }
    @Override
    public String toString()
    {
        return "(" + this.x + " " + this.y + ")";
    }
    public double Origotol_Vett_tavolsag()
    {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public double Tavolsag(Pont p)
    {
        return Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y, 2));
    }
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        final Pont masikPont = (Pont) obj;
        if (this.x != masikPont.x || this.y != masikPont.y)
        {
            return false;
        }
                return true;
    }
}