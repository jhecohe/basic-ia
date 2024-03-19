package com.jhecohe.graphs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Node<T> {
    private T value;
    Set<Node<T>> neighbors;

    public Node(T value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public void connect(Node<T> node){
        if(this == node) 
            throw new IllegalArgumentException("Un nodo intenta autoreferenciarce");
        this.neighbors.add(node);
        node.neighbors.add(this);
    }

    public T getValue() {
        return value;
    }

    public Set<Node<T>> getNeighbors() {
        return Collections.unmodifiableSet(neighbors);
    }

    @Override
    public String toString() {
        return "Node [value=" + value.toString() + "]";
    }

    
}
