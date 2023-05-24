package fifo.mod1.app;

import fifo.mod1.entity.FilaFifo;

public class Main {
    public static void main(String[] args) {
        FilaFifo fifo = new FilaFifo();
        fifo.enqueue(10);
        fifo.enqueue(20);
        fifo.enqueue(30);
        fifo.imprimir();
        System.out.println("=================================");
        System.out.println(fifo.size());
        System.out.println(fifo.front());
        System.out.println(fifo.rear());
        System.out.println(fifo.isEmpty());
        System.out.println("=================================");
        fifo.dequeue();
        fifo.dequeue();
        fifo.imprimir();
        System.out.println("=================================");
        fifo.enqueue(40);
        fifo.enqueue(50);
        fifo.imprimir();
    }
}
