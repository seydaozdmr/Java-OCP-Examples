package javaocp.OracleOCP.Generics;

//multi type parameters
public class OrderedPair <K,V> implements Pair<K,V> {
    /**
     * Type Parameter and Type Argument Terminology:
     * Many developers use the terms "type parameter" and "type argument" interchangeably,
     * but these terms are not the same. When coding,
     * one provides type arguments in order to create a parameterized type.
     * Therefore, the T in Foo<T> is a type parameter and the String in Foo<String> f is a type argument.
     * This lesson observes this definition when using these terms.
     */
    private final K key;
    private final V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
