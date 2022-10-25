
package Tugas5;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Masukkan alamat : ");
        String alamat = input.nextLine();
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlah = input.nextInt();
        Student student = new Student(nama, alamat);
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan mata kuliah : ");
            String matkul = input.next();
            System.out.print("Masukkan nilai : ");
            int nilai = input.nextInt();
            student.addCourseGrade(matkul, nilai);
        }
        student.printGrades();
        System.out.println("Rata-rata nilai : " + student.getAverageGrade());
        
        System.out.println();
        System.out.println("====================================");
        Scanner in = new Scanner (System.in);
      System.out.print("Masukan nama dosen : ");
      String name = in.nextLine();
      System.out.print("Masukan alamat: ");
      String address = in.nextLine();
      
      Teacher t1 = new Teacher(name, address);
      System.out.println(t1);  // toString()
      // Tambahkan mata kuliah 
      System.out.print("Masukan jumlah mata kuliah yang diambil : ");
      int num = input.nextInt();
      String[] courses = new String[num];
      for(int i = 0; i < num; i++){
          System.out.print("Masukan nama mata kuliah " + (i+1) + ": ");
          courses[i] = input.next();
      }
      for (String course: courses) {
         if (t1.addCourse(course)) {
            System.out.println(course + " ditambahkan.");
         } else {
            System.out.println(course + " tidak bisa ditambahkan.");
         }
      }
      //remove mata kuliah
      System.out.print("Masukan jumlah mata kuliah yang akan dihapus : ");
      int num1 = input.nextInt();
      String[] courses1 = new String[num1];
      for(int i = 0; i < num1; i++){
          System.out.print("masukan nama mata kuiah " + (i+1) + ": ");
          courses1[i] = input.next();
      }
      for (String course: courses1) {
         if (t1.removeCourse(course)) {
            System.out.println(course + " dihapus.");
         } else {
            System.out.println(course + " tidak bisa dihapus.");
         }
      }
    }
}
