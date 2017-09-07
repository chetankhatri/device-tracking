package com.myboiler.heating.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author chetan
 * This application is for MyBoiler's internal in house team, customer property maintenance tracking.
 */
@SpringBootApplication
public class MyBoilerApp 
{
    public static void main( String[] args )
    {
       SpringApplication.run(MyBoilerApp.class, args);
    }
}
