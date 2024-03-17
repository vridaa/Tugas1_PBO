/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author ASUS
 */
public class persegi implements OperasiBangunDatar{
    private double panjang, lebar;
    public persegi(double panjang,double lebar){
    this.panjang = panjang;
    this.lebar = lebar;
}

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
        //double.parsedouble=untuk string ke angka
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2* (panjang + lebar) ;
    }
    
   
}
