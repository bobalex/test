package it.test.progIF;

import java.util.List;

/**
 * Created by test on 23.04.16.
 */
public interface IMyArrayOutput {

    /**
     * nterface printMassive.
     * @param dataMas - massive with data.
     * @param <T> - generic type.
     */
    <T> void printMassive(List<T> dataMas);
}
