package entity.mod2;

public class FatorialPDBottomUp {
    public static long[] listaFatoriais = new long[100];

    public static long fatorialList(int fatorial){
        for (int i = 0; i < listaFatoriais.length; i++){
            listaFatoriais[i] = -1;
        }
        return findFatorial(fatorial);
    }
    public static long findFatorial(int element) {
        if (listaFatoriais[element] == -1) {
            if (element == 0) {
                return listaFatoriais[element] = 1;
            }
            listaFatoriais[element] = element * findFatorial(element - 1);
        }
            return listaFatoriais[element];
    }

    public static void main(String[] args) {

        System.out.println(fatorialList(10));

    }
}
