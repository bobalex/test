package it.test.progGen;
import it.test.progIF.IMyArrayInvert;
import java.util.List;

/**
 * This class contains genric method for inverting massive with data.
 */
public class ArrayInvert implements IMyArrayInvert {
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


}
