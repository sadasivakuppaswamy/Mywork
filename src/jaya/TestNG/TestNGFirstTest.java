package jaya.TestNG;


import org.testng.annotations.*;

/**
 * Created by Sadasiva.Kuppaswamy on 30-08-2015.
 */
public class TestNGFirstTest {
    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("beforeSuite()");

    }
    @BeforeTest
    public static void beforeTest(){
        System.out.println("beforeTest()");

    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass()");

    }
    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("beforeMethod()");

    }
    @Test
    public static void test1(){
        System.out.println("Test1()");

    }
    @Test(priority=0,dependsOnMethods = "test1")
    public static void test2(){
        System.out.println("Test2()");

    }


    @AfterSuite
    public static void AfterSuite(){
        System.out.println("AfterSuite()");

    }
    @AfterTest
    public static void AfterTest(){
        System.out.println("AfterTest()");

    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("AfterClass()");

    }
    @AfterMethod
    public static void AfterMethod(){
        System.out.println("AfterMethod()");

    }

}
