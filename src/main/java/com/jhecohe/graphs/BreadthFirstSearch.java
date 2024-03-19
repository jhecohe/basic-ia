package com.jhecohe.graphs;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearch {
   
    public static<T> Optional<Node<T>> search(T value, Node<T> start){

        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(start);

        Node<T> current;
        Set<Node<T>> closed = new HashSet<>();
        
        while (!queue.isEmpty()) {
            current = queue.remove();
            System.out.println("Se recorrio el nodo: " + current.getValue());
            
            if(current.getValue().equals(value))
                return Optional.of(current);
            
            closed.add(current);
            queue.addAll(current.getNeighbors());
            queue.removeAll(closed);
        }

        return Optional.empty();
    }
}
