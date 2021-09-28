package com.cybertek.tests.day11_property_driver_faker_pom;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerPracticeTest {

@Test
    public void testPrintFakeData(){

    Faker faker = new Faker();

    //faker.YourCategory().WhateverAvailable

    System.out.println("faker.name().fullName() = " + faker.name().fullName());
    System.out.println("faker.backToTheFuture().character() = " + faker.backToTheFuture().character());

    System.out.println("faker.beer().name() = " + faker.beer().name());
    System.out.println("faker.food().spice() = " + faker.food().spice());
    System.out.println("faker.music().instrument() = " + faker.music().instrument());

    System.out.println("faker.numerify(\"###-###-####\") = "
            + faker.numerify("###-###-####"));

}

}
