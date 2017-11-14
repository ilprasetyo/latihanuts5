/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116496_latihanuts5;

/**
 *
 * @author Alaba
 */
public class Segitiga implements BangunDatar {
    private int luas,keliling;
    private final int sisiAb,sisiBc,sisiCa;
    private final int alas,tinggi;
    
    public Segitiga(int ab,int bc,int ca,int alas,int tinggi){
    this.sisiAb=ab;
    this.sisiBc=bc;
    this.sisiCa=ca;
    this.alas=alas;
    this.tinggi=tinggi;
}

    @Override
    public void hitungLuas() {
        double luas;
        luas=0.5*alas*tinggi;
        System.out.println("Luas Segitiga : "+luas);
    }

    @Override
    public void hitungKeliling() {
        int keliling;
        keliling=sisiAb+sisiBc+sisiCa;
        System.out.println("Luas Segitiga : "+keliling);
    }

}
