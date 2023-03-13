package com.github.curriculeon;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType> {

    private SomeType[] content;
    private Integer index;

    private static final Integer RE_SIZE = 1;
    public MyArrayList() {
        index = 0;
        content = (SomeType[]) new Object[1];
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        content = (SomeType[]) new Object[1];
        content = valuesToBePopulatedWith;
    }
}
