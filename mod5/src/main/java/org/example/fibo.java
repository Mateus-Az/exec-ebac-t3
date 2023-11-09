package org.example;

public class fibo {
    private static final int maxx = 100;
    private static final long[]listFibo = new long[maxx];
    public static int FindFibo(int n){

        if (n <= 1){
            return n;
        }
        return FindFibo(n -1 ) + FindFibo(n - 2);

    }

    public static void main(String[] args){
        int n = 4;

        System.out.println(FindFibo(n));
    }
}