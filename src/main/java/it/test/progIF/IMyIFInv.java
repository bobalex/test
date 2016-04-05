package it.test.progIF;

import java.util.List;

/**
 * The interface provides access to the method, which inverts massives.
 */
public interface IMyIFInv {
    /**
     * Interface invertMassive.
     * @param dataMas - massive with data.
     * @param <T> - generic type.
     */
    <T> void invertMassive(List<T> dataMas);

    /**
     * nterface printMassive.
     * @param dataMas - massive with data.
     * @param <T> - generic type.
     */
    <T> void printMassive(List<T> dataMas);
}
