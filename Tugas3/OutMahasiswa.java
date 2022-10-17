
package Tugas3;
import java.util.ArrayList;
import java.util.Scanner;
public class OutMahasiswa extends InheMahasiswa{
    OutMahasiswa(String nama, String nim, int nilai){
        super(nama, nim, nilai);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <InheMahasiswa> mhs = new ArrayList<>();
        ArrayList <InheMahasiswa> lulus = new ArrayList<>();
        ArrayList <InheMahasiswa> tidaklulus = new ArrayList<>();
        

        for (int i = 0; i < 4; i++) {
            System.out.print("isikan NIM: ");
            String nim = sc.nextLine();
            
            System.out.print("isikan Nama: ");
            String nama = sc.nextLine();

            System.out.print("isikan nilai: ");
            int nilai = Integer.parseInt(sc.nextLine());
            
            mhs.add(new InheMahasiswa(nama, nim, nilai));
            if((mhs.get(i).getGrade().compareTo("A") == 0) || (mhs.get(i).getGrade().compareTo("B") == 0) || (mhs.get(i).getGrade().compareTo("C") == 0)){
                lulus.add(new InheMahasiswa(nama, nim, nilai));
            }
            else{
                tidaklulus.add(new InheMahasiswa(nama, nim, nilai));
            }
            System.out.println("===================================");
        }

        //print tiap mahasiswa 
        for(int i = 0; i < 4; i++){
            mhs.get(i).infoMahasiswa();
        }
        System.out.println("jumlah mahasiswa : " + mhs.size());
        System.out.print("jumlah mahasiswa yang lulus : ");
        printMhs(lulus);
        System.out.print("jumlah mahasiswa yang tidak lulus: ");
        printMhs(tidaklulus);
        printNilai(mhs, "A");
        printNilai(mhs, "B");
        printNilai(mhs, "C");
        printNilai(mhs, "D");
        printNilai(mhs, "E");
        System.out.println();
        System.out.println("rata rata nilai: ");
        rataRata(mhs);
        
        sc.close();
    }

    public static void printMhs(ArrayList<InheMahasiswa> mhs){
        System.out.print(mhs.size() + " yaitu ");
        for (int i = 0; i < mhs.size(); i++) {
            System.out.print(mhs.get(i).getNama() + ", ");
        }
        System.out.println();

    }

    public static void printNilai(ArrayList<InheMahasiswa> mhs, String nilai){
        if(jumlahGrade(mhs, nilai) > 0){
            System.out.println();
            System.out.print("Jumlah mahasiswa dengan nilai " + nilai +  " : " + jumlahGrade(mhs, nilai) + " yaitu ");
        }
        
        for(int i = 0; i < mhs.size(); i++){
            if(mhs.get(i).getGrade().equals(nilai)){
                System.out.print(mhs.get(i).getNama() + ", ");
            }
        }
    }

    public static int jumlahGrade(ArrayList<InheMahasiswa> mhs, String nilai){
        int jumlah = 0;
        for(int i = 0; i < mhs.size(); i++){
            if(mhs.get(i).getGrade().equals(nilai)){
                jumlah++;       
            }
        }
        return jumlah;
    }

    public static float rataRata(ArrayList<InheMahasiswa> mhs){
        System.out.println();
        int jumlah = 0;
        for(int i = 0; i < mhs.size(); i++){
            if(mhs.get(i).getNilai() <= 100 && mhs.get(i).getNilai() >= 0){
                jumlah += mhs.get(i).getNilai();
                System.out.print(mhs.get(i).getNilai() + " + ");
            }
            else{
                System.out.println("0 + ");
            }
        }

        System.out.print(" = " + (float)jumlah/mhs.size());

        return jumlah / mhs.size();
    }


}
