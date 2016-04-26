package test;
import it.test.progGen.ArrayInvert;

import it.test.progGen.ArrayOutput;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by test on 26.04.16.
 */
public class ArrayOutputTest {
    private ArrayOutput outputMas;

    @Before
    public void setUp(){
        this.outputMas = new ArrayOutput();
    }

    @Test
    public void testOutput(){
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(1);
        tmp.add(2);
        tmp.add(3);

        this.outputMas.printMassive(tmp);

        //How do make unit test for console output?
    }
}
