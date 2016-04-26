package test;
import it.test.progGen.ArrayInvert;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;


/**
 * Unit Test for ArrayInvert
 */
public class ArrayInvertTest {
    private ArrayInvert invertMas;

    @Before
    public void setUp(){
        this.invertMas = new ArrayInvert();
    }

    @Test
    public void testInvert(){
        List<Integer> tmp = new ArrayList<Integer>();
        List<Integer> original = new ArrayList<Integer>();
        original.add(1);
        original.add(2);
        original.add(3);
        tmp.add(3);
        tmp.add(2);
        tmp.add(1);
        this.invertMas.invertMassive(original);

        assertArrayEquals("Some Error", tmp.toArray(), original.toArray());
    }

}
