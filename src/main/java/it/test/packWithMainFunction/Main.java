package it.test.packWithMainFunction;
import it.test.progGen.ArrayOutput;
import it.test.progGen.ArrayInvert;
import it.test.progGen.GenObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Input point.
 */
class Main {
    /**
     * The variable contains the size of int massive.
     */
    private static final Integer MASCOUNT = 15;
    /**
     * Input method.
     * @param args string
     */

    public static void main(final String[] args) {

        //Testing generic class
        GenObject<Integer> testVal = new GenObject<Integer>(MASCOUNT);
        System.out.println(testVal.myGetValue());

        GenObject<String> testVal2 = new GenObject<String>("Hello, world");
        System.out.println(testVal2.myGetValue());

        //Forming massive with data(int, str) and testing generic methods
        //Int massive
        List<Integer> masDataInt = new ArrayList<Integer>();
        for (int i = 0; i < MASCOUNT; i++) {
            masDataInt.add(i);
        }

        //str massive
        List<String> masDataStr = new ArrayList<String>();
        masDataStr.add("Hello");
        masDataStr.add("World");
        masDataStr.add("!!!");

        ArrayInvert genMeth = new ArrayInvert();
        ArrayOutput arrOut = new ArrayOutput();

        arrOut.printMassive(masDataInt);
        genMeth.invertMassive(masDataInt);
        arrOut.printMassive(masDataInt);

        arrOut.printMassive(masDataStr);
        genMeth.invertMassive(masDataStr);
        arrOut.printMassive(masDataStr);

    }
}
