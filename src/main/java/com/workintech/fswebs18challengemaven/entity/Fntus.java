package com.workintech.fswebs18challengemaven.entity;

public class Fntus {
    private String name;
    private String surname;
    private int sayi;

    public Fntus(String name, String surname, int sayi) {
        this.name = name;
        this.surname = surname;
        this.sayi = sayi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
}
