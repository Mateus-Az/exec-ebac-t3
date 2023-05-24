package ativ.listaDupla.mod1.app;

import ativ.listaDupla.mod1.entity.ListaDupla;
import ativ.listaDupla.mod1.entity.Node;

public class Main {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla();
        listaDupla.push(new Node(10));
        listaDupla.push(new Node(20));
        listaDupla.push(new Node(30));
        listaDupla.printList();
        System.out.println("===================");
        Node pop = listaDupla.pop();
        listaDupla.printList();
        System.out.println("===================");
        System.out.println(pop.getValue());
    }
}
