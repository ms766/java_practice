package com.mshalaby._static;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        StaticTest first = new StaticTest("testOne");
        System.out.println(first.getName() + " is instance number " + StaticTest.getNumInstance());
        StaticTest second = new StaticTest("secondTest");
        System.out.println(second.getName() + " is instance number " + StaticTest.getNumInstance());
        StaticTest third = new StaticTest("thirdTest");
        System.out.println(third.getName() + " is instance number " + third.getNumInstance());
    }


}
