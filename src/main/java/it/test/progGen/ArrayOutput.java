package it.test.progGen;
import java.util.List;
import it.test.progIF.IMyArrayOutput;

/**
 * Created by test on 23.04.16.
 */
public class ArrayOutput implements IMyArrayOutput {

    /**
     * Print data massive.
     * @param dataMas - massive with data.
     * @param <T> - generic type.
     */
    public <T> void printMassive( final List<T> dataMas) {
        for (int i = 0; i < dataMas.size(); i++) {
            System.out.println(dataMas.get(i));
        }
    }
}
