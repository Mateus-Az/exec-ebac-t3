package pilha.mod1.app;

import pilha.mod1.entity.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.pop();
        pilha.push(30);

        pilha.imprimir();

        System.out.println("================");
        System.out.println(pilha.isEmtpy());
        System.out.println(pilha.size());
        System.out.println(pilha.top());
        System.out.println("================");
        pilha.imprimir();

        System.out.println("================");
        pilha.pop();
        pilha.pop();
        pilha.imprimir();

        System.out.println("================");
        pilha.push(20);
        pilha.push(30);
        pilha.imprimir();
        System.out.println(pilha.size());
    }
}