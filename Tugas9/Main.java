import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {
  public static void main(String[] args) {
    // Membuat objek ArrayList untuk menyimpan data string
    ArrayList<String> arrayList = new ArrayList<>();

    // Menambahkan beberapa elemen ke ArrayList
    arrayList.add("Halo");
    arrayList.add("Dunia");
    arrayList.add("!");

    // Menampilkan elemen ArrayList menggunakan loop for
    for (String str : arrayList) {
      System.out.println(str);
    }

    // Membuat objek ArrayDeque untuk menyimpan data integer
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    // Menambahkan beberapa elemen ke ArrayDeque
    arrayDeque.add(1);
    arrayDeque.add(2);
    arrayDeque.add(3);

    // Menampilkan elemen ArrayDeque menggunakan iterator
    for (int num : arrayDeque) {
      System.out.println(num);
    }
  }
}
