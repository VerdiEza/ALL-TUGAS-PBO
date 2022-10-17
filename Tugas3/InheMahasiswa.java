
package Tugas3;

public class InheMahasiswa {
    String nama, nim, grade;
    int nilai;

    InheMahasiswa(String nama, String nim, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        setGrade();

    }


    public void setGrade(){
        if(getNilai() >= 80 && getNilai() <= 100){
            SetGrade("A");
        }

        else if(getNilai() >= 70 && getNilai() < 80){
            SetGrade("B");
        }

        else if((getNilai() >= 60 && getNilai() < 70)){
            SetGrade("C");
        }

        else if((getNilai() >= 50 && getNilai() < 60)){
            SetGrade("D");
        }
        else if((getNilai() < 50)){
            SetGrade("E");
        }
        else{
            SetGrade("Input nilai anda salah");
        }
    }

    public void SetGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return this.grade;
    }




    public void infoMahasiswa(){
        System.out.println("NIM: " + getNim());
        System.out.println("Nama: " + getNama());
        System.out.println("Nilai: " + getNilai());
        System.out.println("GRADE: " + getGrade());
        System.out.println("========================================");
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}
