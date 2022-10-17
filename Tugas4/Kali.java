
package Tugas4;

class formula{
    int kali2(int a, int b){
        return a * b;
    }
    
    double kali3(double x, double y, double z){
    return x * y *z;
    }
}
public class Kali {
    public static void main(String[] args) {
        formula f1 = new formula();
        int hasil1 = f1.kali2(2, 1);
        double hasil2 = f1.kali3(2.0, 1.0, 3.0);
        System.out.println("Hasil formula 1 = "+hasil1);
        System.out.println("Hasil formula 2 = "+hasil2);
        
    }
}
