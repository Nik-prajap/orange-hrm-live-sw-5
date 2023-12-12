package com.orangehrmlive.demo.testdata;

import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.DataProvider;

public class TestDataForLoginTest extends TestBase {
    @DataProvider(name = "data set")
    public Object[][] getdata()
    {
        Object [] [] data = new Object[][]
                {
                        { " " , " " , "Required"},                                            //3 columns so 3 variables
                        { "test123@gmail.com" ," " ,"Required" },
                        { " " , "test123" ,   "Required"},
                        {"test123@gmail.com" ,"test123",  "Invalid credentials"}             //4 rows .... 4 times execution

                };
        return data;
    }
}
