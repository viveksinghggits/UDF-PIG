package com.vivek.userdf;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

import java.io.IOException;

/****
 * Just a simple class, that will return the string converting
 * it into the upper class
 * @author vivek singh
 *
 */
public class TOUPPER extends EvalFunc<String> {

    /***********
     * This is the abstract method from the class EvalFunc,
     * its implementation will decide what should be done with the
     * parameter, this function is called for
     *
     * @param tuple
     * @return String
     * @throws IOException
     */
    @Override
    public String exec(Tuple tuple) throws IOException {
        System.out.println(tuple.getAll());
        /*****
         * tuple contains the parameter that has been passed to the
         * TOUPPER function from the PIG LATIN script.
         * if we call TOUPPER() on ""vivek, amit""
         * value of tuple.getAll() will be [vivek, amit]
         */
        if(tuple!=null && tuple.size()!=0){
            return tuple.get(0).toString().toUpperCase();
        }
        else{
            return  null;
        }



    }
}
