/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author BiankaBotka
 */
public class dolgozo implements Serializable{
    private String nev;
    private int kor;
    private int fizetes;

    public dolgozo(String nev, int kor, int fizetes) {
        this.nev = nev;
        this.kor = kor;
        this.fizetes = fizetes;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public int getFizetes() {
        return fizetes;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }

    @Override
    public String toString() {
        return "dolgozo{" + "nev=" + nev + ", kor=" + kor + ", fizetes=" + fizetes + '}';
    }

}
