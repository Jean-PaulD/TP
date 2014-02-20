/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.objectcomparisons;

import com.mycompany.objectcomparisons.config.ObjectComparisonConfig;
import com.mycompany.objectcomparisons.service.ObjectCompareService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class ObjectComparisonsTest {
    
    
    
    
    public ObjectComparisonsTest() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    private static ObjectCompareService compareService;
    
    @Test
    public void compareObjectTest(){
        
    }
    
    
          
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = 
                new AnnotationConfigApplicationContext(ObjectComparisonConfig.class);
        compareService = (ObjectCompareService)ctx.getBean("bean1");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
