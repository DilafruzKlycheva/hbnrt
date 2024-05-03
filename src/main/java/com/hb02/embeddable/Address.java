package com.hb02.embeddable;

import javax.persistence.Embeddable;

/*
 * Adress icin ayri bir tablo olusmasin, Ama Adress sinifindaki degiskenler ,
 * Student tablosunda kolon olarak eklenmesini sagliyor
 */

@Embeddable
public class Address {


    public void setStreet(String orange_street) {
    }

    public void setCity(String istanbul) {
    }

    public void setCountry(String turkey) {
    }

    public void setZipCode(String s) {
    }
}






