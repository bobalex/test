package test;

import it.test.progGen.GenObject;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by test on 26.04.16.
 */
public class GenObjectTest {
    private GenObject<Integer> intVal;
    private GenObject<String> stringVal;
    private final int MASCOUNT = 10;

    @Before
    public void setUp(){
        intVal = new GenObject<Integer>(MASCOUNT);
        stringVal = new GenObject<String>("Hello,world!!!");
    }

    @Test
    public void testOutput(){
        Integer tmpInt = new Integer(MASCOUNT);
        String tmpStr = new String("Hello,world!!!");
        assertEquals("Error Integer", tmpInt, intVal.myGetValue());
        assertEquals("Error String", tmpStr, stringVal.myGetValue());
    }
}
