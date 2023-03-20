package com.github.curriculeon;

public interface MyMapInterface<KeyType, ValueType> {
    void put(KeyType key, ValueType value);
    ValueType get(KeyType key);
    MySet<KeyType> getKeySet();
    MyCollectionInterface<ValueType> getValues();
    MySet<KeyValue<KeyType, ValueType>> getList();
    MyMapInterface<ValueType, KeyType> invert();
}

// public class main
// { public static void Main(String[] args)
//      int count1 = 200000000
//      int count2 =
//      int
//      Sout ("sum=" + sum }

