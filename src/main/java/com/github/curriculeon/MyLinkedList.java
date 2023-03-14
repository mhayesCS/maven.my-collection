package com.github.curriculeon;

import java.util.Iterator;

public class MyLinkedList<SomeType> implements MyCollectionInterface<SomeType>{
    private MyNode<SomeType> headNode;
    public MyLinkedList() {

    }

    public MyLinkedList(SomeType... valuesToBePopulatedWith) {
        for (SomeType value : valuesToBePopulatedWith) {
            add(value);
        }

    }
    @Override
    public void add(SomeType objectToAdd) {
        // declare the type of object and name and set it to a new node
        MyNode<SomeType> nodeToAdd = new MyNode<>();
        nodeToAdd.setData(objectToAdd);
        // if there is no objects in the head node then add a new one
        if (headNode == null) {
            headNode = nodeToAdd;
            return;

        }
        // while the current node is empty get the next node
        MyNode<SomeType> current = headNode;
        while (current != null) {
            MyNode<SomeType> nextNode = current.getNext();
            boolean isNextNodeNull = nextNode == null;
            // if there is nothing inside of the nextNode then add a node
            if (isNextNodeNull) {
                current.setNext(nodeToAdd);
                break;
            }
            current = current.getNext();
        }

    }

    @Override
    public void remove(SomeType objectToRemove) {

    }

    @Override
    public void remove(int indexOfObjectToRemove) {

    }

    @Override
    public SomeType get(int indexOfElement) {
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

