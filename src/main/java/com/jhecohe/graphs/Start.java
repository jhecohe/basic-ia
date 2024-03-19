package com.jhecohe.graphs;

public class Start {
     public static void main(String[] args) {
        
        Node<Integer> z1 = new Node<>(1);
        Node<Integer> z2 = new Node<>(2);
        Node<Integer> z4 = new Node<>(4);
        Node<Integer> z5 = new Node<>(5);
        Node<Integer> z9 = new Node<>(9);
        Node<Integer> z10 = new Node<>(10);
        Node<Integer> z12 = new Node<>(12);
        Node<Integer> z13 = new Node<>(13);
        Node<Integer> z14 = new Node<>(14);
        Node<Integer> z15 = new Node<>(15);
        Node<Integer> z16 = new Node<>(16);
        Node<Integer> z21 = new Node<>(21);

        z21.connect(z12);
        z12.connect(z13);
        z13.connect(z9);
        z13.connect(z14);
        z14.connect(z10);
        z10.connect(z9);
        z10.connect(z15);
        z10.connect(z16);
        z9.connect(z4);
        z9.connect(z1);
        z4.connect(z5);
        z4.connect(z1);
        z1.connect(z5);
        z1.connect(z2);

        
        BreadthFirstSearch.search(16, z21);
        
    }
}
