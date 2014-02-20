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
public class ObjectClassToCompare implements ObjectCompareService {
    
    String name;
    String surname;
    
    public ObjectClassToCompare(){
    
    }
    
    public ObjectClassToCompare(String n, String s){
        
        name = n;
        surname = s;
        
    }
    
    
    @Override
    public void setConcatStrings(String n, String s){
        
    }
    
    @Override
    public String getConcatStrings(){
        return name + " " + surname;
    }
    
    @Override
    public String toString(){
        return "name + surname = " + getConcatStrings();
    }
    
    
}
