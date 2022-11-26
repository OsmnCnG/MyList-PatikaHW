import java.util.*;
public class Main {
    public static void main(String[] args) {



    MyList<Integer> liste= new MyList<>();
    System.out.println("*****************************************");
    System.out.println("Dizinin kapasitesi\t:"+liste.getCapacity());
    System.out.println("Dizideki eleman sayısı\t:"+liste.size());
    System.out.println("*****************************************");

    liste.add(10);
    liste.add(20);
    liste.add(30);
    liste.add(40);
    System.out.println("*****************************************");
    System.out.println("Dizinin kapasitesi\t:"+liste.getCapacity());
    System.out.println("Dizideki eleman sayısı\t:"+liste.size());
    System.out.println("*****************************************");
    liste.add(50);
    liste.add(60);
    liste.add(70);
    liste.add(80);
    liste.add(90);
    liste.add(100);
    liste.add(110);

        System.out.println("*****************************************");
        System.out.println("Dizinin kapasitesi\t:"+liste.getCapacity());
        System.out.println("Dizideki eleman sayısı\t:"+liste.size());
        System.out.println("*****************************************");

    liste.add(120);

        System.out.println("*****************************************");
        System.out.println("Dizinin kapasitesi\t:"+liste.getCapacity());
        System.out.println("Dizideki eleman sayısı\t:"+liste.size());
        System.out.println("*****************************************");


    liste.getIndex(2); // "30"
    liste.remove(2);
    liste.getIndex(2); // "40"
        liste.getIndex(3);
        liste.getIndex(4);
        liste.getIndex(5);
        liste.getIndex(6);


        System.out.println(liste.toString());

        System.out.println("Girilen data "+liste.indexOf(10)+" numaralı indextedir.");



    }
}