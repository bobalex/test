package it.test.progGen;

/**
 * This is user-defined generic class.
 * @param <T> - generic type.
 */
public class GenObject <T>{
    /**
     * tmp - temporary variable.
     */
    private T tmp;

    /**
     * This is default constructor.
     * @param data - user-defined data.
     */
    public GenObject(final T data) {
        tmp = data;
    }

    /**
     * Return value of the variable.
     * @return variable.
     */
    public T myGetValue() {
        return tmp;
    }

    /**
     * Set new value.
     * @param newValue - new value.
     */
    public void mySetValue(final T newValue) {
        tmp = newValue;
    }

}
