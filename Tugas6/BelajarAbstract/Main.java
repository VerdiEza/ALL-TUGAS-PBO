public class Main {
    public static void main(String[] args) {
        
        BangunDatar segitiga = new Segitiga(12,20);
        BangunDatar lingkaran = new Lingkaran(60);
        
        System.out.println("Luas dari bangun datar Segitiga : " + segitiga.getLuas());
        System.out.println("Luas dari bangun datar Lingkaran : " + lingkaran.getLuas());
    }
}
