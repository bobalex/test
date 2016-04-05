package it.test.progIF;

/**
 * Interface for user-defined Object.
 */
public interface IMyIFObj<T> {
    /**
     * Interface for myGetValue.
     * @param <T> - generic type.
     */
    T myGetValue();
    /**
     * Interface for mySetValue.
     * @param <T> - generic type new value.
     */
    void mySetValue(final T newValue);
}

