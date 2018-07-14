package com.vivek.tests;

import com.vivek.userdf.TOUPPER;
import org.apache.pig.data.DefaultTuple;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TOUPPERTest {

    @Test
    public void checkUpper(){
        String expected= "VIVEK";
        String input = "vivek";


        DefaultTuple tuple = new DefaultTuple();
        tuple.append(input);

        try {
            Assert.assertEquals(expected, new TOUPPER().exec(tuple));
        }
        catch (IOException IO){
            //log the error
        }

    }
}
