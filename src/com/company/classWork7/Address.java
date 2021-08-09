package com.company.classWork7;

import javax.annotation.processing.Completion;
import java.util.Comparator;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

    private String enterUserStr( String temp){
        temp.trim();

        if (Character.isLetter(temp.charAt(0))){
            return temp;
        }else{
            return "NON";
        }
    }
    private String validCharacter(String temp){
        temp.trim();
        int exsamen =0;
        for (int count = 0; count < temp.length(); count++) {
            if(Character.isLetter(temp.charAt(count))){
                exsamen++;
            }else if(Character.isDigit(temp.charAt(count))){
            exsamen++;
            }else if ((temp.charAt(count)=='/')||(temp.charAt(count)=='-')){
                exsamen++;
            }
        }
        if (exsamen == temp.length()){
            return temp;
        }else{
            return "NON";
        }

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        if( index>9999 && index <100000) {
              this.index = index;
        } else {
              this.index = -1;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {

            this.country = enterUserStr(country);

    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
         this.city = validCharacter(city);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = validCharacter(street);
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = validCharacter(house);
    }

    public Address(int index, String country, String city, String street, String house, String apartment) {
        setIndex(index);
        setCountry(country);
        setCity(city);
        setStreet(street);
        setHouse(house);
        setApartment(apartment);
    }

    @Override
    public String toString() {
        return "Your address: " +
                "\n index:" + index +
                "\n country: " + country +
                "\n city: " + city  +
                "\n street: " + street  +
                "\n house: " + house +
                "\n apartment: " + apartment ;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = validCharacter(apartment);
    }
}
