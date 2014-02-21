/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objectcomparisons.service.Impl;

import com.mycompany.objectcomparisons.service.ObjectCompareService;
import java.lang.reflect.Array;

/**
 *
 * @author student
 */
public class ObjectClassToCompare implements ObjectCompareService {

    String name;
    String surname;
    String[] firstArray;
    String[] secondArray;     
    
    public ObjectClassToCompare() {
        
    }

    public ObjectClassToCompare(String n, String s) {

        name = n;
        surname = s;
        firstArray = new String[]{name, surname};
        secondArray = new String[]{name, surname};
    }
    
    public String[] returnFirstArray(){
        return firstArray;
    }

    public String[] returnSecondArray(){
        return secondArray;
    }
    
    public boolean compareObjects() {
        ObjectClassToCompare object1 =
                new ObjectClassToCompare("jean", "De Buys");
        ObjectClassToCompare object2 =
                new ObjectClassToCompare("jean", "De Buys");
        if (object1 == object2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setConcatStrings(String n, String s) {
    }

    @Override
    public String getConcatStrings() {
        return name + " " + surname;
    }

    public boolean returnTrue() {
        return true;
    }

    public boolean returnFalse() {
        return false;
    }

    public String returnNull() {
        return null;
    }

    public String returnNotNull() {
        return "not null";
    }

    @Override
    public String toString() {
        return "name + surname = " + getConcatStrings();
    }
}
