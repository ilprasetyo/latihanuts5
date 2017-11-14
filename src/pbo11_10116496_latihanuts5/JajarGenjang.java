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
public class JajarGenjang implements BangunDatar{
    private int luas,keliling;
    private final int sisiAb,sisiBc,sisiCd,sisiDa;
    private final int alas,tinggi;
    
    public JajarGenjang(int ab,int bc,int cd,int da,int alas,int tinggi){
    this.sisiAb=ab;
    this.sisiBc=bc;
    this.sisiCd=cd;
    this.sisiDa=da;
    this.alas=alas;
    this.tinggi=tinggi;
    
    
    
    }

    @Override
    public void hitungLuas() {
        System.out.println("Luas Jajar Genjang : "+(alas*tinggi));
    }

    @Override
    public void hitungKeliling() {
        int keliling;
        keliling=sisiAb+sisiBc+sisiCd+sisiDa;
        System.out.println("Keliling Jajar Genjang : "+keliling);
    }

}
