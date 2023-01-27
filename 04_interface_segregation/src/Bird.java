public interface Bird {
    void molt();

    default void fly() {
        throw new UnsupportedOperationException();
    }
}
