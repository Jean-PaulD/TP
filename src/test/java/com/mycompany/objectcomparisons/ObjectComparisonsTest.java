/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objectcomparisons;

import com.mycompany.objectcomparisons.config.ObjectComparisonConfig;
import com.mycompany.objectcomparisons.service.Impl.ObjectClassToCompare;
import com.mycompany.objectcomparisons.service.Impl.ObjectComparisonServiceImpl;
import com.mycompany.objectcomparisons.service.ObjectCompareService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
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
    public void compareObjectTest() throws Exception {

        ObjectClassToCompare oc1 = new ObjectClassToCompare("Jean", "De Buys");
        Assert.assertEquals(oc1.toString(), "name + surname = Jean De Buys", "The 2 objects are equal");

    }

    @Test
    public void equalsOperatorTest() throws Exception {
        ObjectClassToCompare objectComparison = new ObjectClassToCompare();
        Assert.assertEquals(objectComparison.compareObjects(), false, "The 2 objects are equal()udsing == operator");
    }

    @Test
    public void truthTest() {
        ObjectClassToCompare objectComparison = new ObjectClassToCompare();
        Assert.assertTrue(objectComparison.returnTrue(), "Object should be true");
    }

    @Test
    public void falsityTest() {
        ObjectClassToCompare objectComparison = new ObjectClassToCompare();
        Assert.assertFalse(objectComparison.returnFalse(), "Object should be false");
    }

    @Test
    public void nullnessTest() {
        ObjectClassToCompare objectComparison = new ObjectClassToCompare();
        Assert.assertNull(objectComparison.returnNull(), "This value should be null");
    }

    @Test
    public void notNullnessTest() {
        ObjectClassToCompare objectComparison = new ObjectClassToCompare();
        Assert.assertNotNull(objectComparison.returnNotNull(), "This value should not be null");
    }

    @Test
    public void failTest() {
        ObjectClassToCompare objectComparison = new ObjectClassToCompare();
        Assert.fail("This test has failed");
    }
    /*
    @Test(   = IndexOutOfBoundsException.class)
    public void verifyZipCodeGroupException() throws Exception {
        Matcher mtcher = this.pattern.mtcher("22101-5051");
        boolean isValid = mtcher();
        mtcher.group(2);
    }*/

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ObjectComparisonConfig.class);
        compareService = (ObjectCompareService) ctx.getBean("bean1");
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
