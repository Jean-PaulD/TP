/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objectcomparisons.service.Impl;

import com.mycompany.objectcomparisons.service.ObjectCompareService;

/**
 *
 * @author student
 */
public class ObjectComparisonServiceImpl{

    /*
    @Override
    public void setConcatStrings(String a, String b) {
        
    }

    @Override
    public String getConcatStrings() {
        return null;
    }*/

    public boolean compareObjects() {
       ObjectClassToCompare object1 = 
               new ObjectClassToCompare("jean", "De Buys");
       ObjectClassToCompare object2 = 
               new ObjectClassToCompare("jean", "De Buys");
       if(object1 == object2)
       return true;
       else return false;
    }

}
