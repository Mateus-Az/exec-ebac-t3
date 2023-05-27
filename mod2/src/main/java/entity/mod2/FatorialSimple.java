package entity.mod2;

public class FatorialSimple {

    public static long findFatorial(int element) {

        if (element == 0) {
            return 1;
        }
        return element * findFatorial(element - 1);

    }

    public static void main(String[] args) {

        System.out.println(findFatorial(10));

    }
}
