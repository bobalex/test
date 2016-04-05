package it.test.progGen;
import it.test.progIF.IMyIFInv;
import java.util.List;

/**
 * This class contains genric method for inverting massive with data.
 */
public class GenMeth implements IMyIFInv {
    /**
     * This is generic method.
     * @param  dataMas - massive with data.
     * @param <T> - generic type.
      */
    public <T> void invertMassive(final List<T> dataMas) {

        T tmp;
        int masSize = dataMas.size();

        for (int i = 0; i < masSize / 2; i++) {
            tmp = dataMas.get(i);
            dataMas.set(i, dataMas.get(masSize - i - 1));
            dataMas.set(masSize - i - 1, tmp);
        }


    }

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
