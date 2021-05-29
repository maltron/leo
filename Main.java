import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Addicionando 10.000 elementos");
        HashSet<Integer> myCollection = new HashSet<Integer>();
        long inicio = System.currentTimeMillis();
        for(int i=0; i < 10000; i++) {
            myCollection.add(i);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Pronto: "+(fim - inicio)+"ms");

        System.out.println("Removendo 5.000 elementos");
        inicio = System.currentTimeMillis();
        for(int i=0; i < 5000; i++) {
            myCollection.remove(i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Pronto: "+(fim - inicio)+"ms");
    }
}