package com.github.curriculeon;

import java.util.Iterator;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType> {

    private SomeType[] content;
    private int index;
    private static final Integer resize = 1;

    public MyArrayList() {
        index = 0;
        this.content = (SomeType[]) new Object[1];
    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        content = (SomeType[]) new Object[1];
        content = valuesToBePopulatedWith;
    }

    @Override
    public void add(SomeType objectToAdd) {
        Integer threshold = content.length-1;
        if(index >= threshold) {
            Integer newSize = content.length + resize;
            SomeType[] newContent = (SomeType[]) new Object[newSize];
            for (int i = 0; i < content.length; i++)
            { newContent[i] = content[i]; }
            content = newContent;
        }
        content[index] = objectToAdd;
        index++;
    }

    @Override
    public void remove(SomeType objectToRemove) {
        SomeType[] newContent = (SomeType[]) new Object[content.length];
        Integer newIndex = 0;
        for(int x = 0; x < content.length; x++) {
            SomeType currentElement = content[x];
            if(currentElement == null ) {
                continue;
            }
            if(!currentElement.equals(objectToRemove)) {
                newContent[newIndex] = content[x];
                newIndex++;
            } else {
                index --;
            }
        }
        content = newContent;
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        return null;
    }

    @Override
    public SomeType get(int indexOfElement) {
        for (int i = 0; i < content.length; i++) {
            SomeType currentElement = content[i];
            if (currentElement == null) {
                continue;
            }
            if(indexOfElement == i) {
                return currentElement;
            }
        }
        return null;
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return null;
    }

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
