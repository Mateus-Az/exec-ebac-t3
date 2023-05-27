package entity.mod2;

public class FatorialPDTopDown {
    public static long[] listaFatoriais;

    public static long fatorialList(int fatorial) {
        listaFatoriais = new long[fatorial];
        for (int i = 0; i < listaFatoriais.length; i++) {
            listaFatoriais[i] = -1;

        }
        return findFatorial(fatorial);
    }

    public static long findFatorial(int element) {
        if (element == 0 && listaFatoriais[element] == -1) {
            return listaFatoriais[element] = 1;
        }if (element == 0 && listaFatoriais[element] != -1){
            return listaFatoriais[element];
        }else{
            listaFatoriais[element - 1] = element * findFatorial(element - 1);
        }
        return listaFatoriais[element-1];
    }

    public static void main(String[] args) {

        System.out.println(fatorialList(10));

    }
}

