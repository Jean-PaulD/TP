/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.objectcomparisons.config;

import com.mycompany.objectcomparisons.service.Impl.ObjectClassToCompare;
import com.mycompany.objectcomparisons.service.ObjectCompareService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class ObjectComparisonConfig {
    @Bean(name = "bean1")
    public ObjectCompareService getService(){
        return new ObjectClassToCompare();
    }
}
