package com.thetestingacademy.ex_01032026_CRUD_E2E.testngexample;

import org.testng.annotations.Test;

public class TestNGE2E_04 {
    @Test(priority = 1)
    public void t1(){
        System.out.println("1");
    }

    @Test(priority = 0)
    public void t2(){
        System.out.println("3");
    }

    @Test(priority = 3)
    public void t3(){
        System.out.println("2");
    }
}
