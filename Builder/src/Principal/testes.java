package Principal;

import java.util.Comparator;

public class testes implements Comparator {
    public static void main(String[] args) {
    int v1=1;
    Integer v2 = v1;
        System.out.println(v1);
        System.out.println(v2);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
