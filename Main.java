import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Addicionando 10.000 elementos");
        HashSet<Integer> myCollection = new HashSet<Integer>();
        for(int i=0; i < 10000; i++) {
            myCollection.add(i);
        }
        System.out.println("Pronto");

        System.out.println("Removendo 5.000 elementos");
        for(int i=0; i < 5000; i++) {
            myCollection.remove(i);
        }
        System.out.println("Pronto");
    }
}