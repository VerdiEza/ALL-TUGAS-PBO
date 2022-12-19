public class Mahasiswa <T1, T2, T3> {
    private T1 nim;
    private T2 name;
    private T3 clas;
    
    public void setNim(T1 nim) {
        this.nim = nim;
    }
    
    public void setName(T2 name) {
        this.name = name;
    }
    
    public void setClas(T3 clas) {
        this.clas = clas;
    }
    
    public T1 getNim() {
        return this.nim;
    }
    
    public T2 getName() {
        return this.name;
    }
    
    public T3 getClas() {
        return this.clas;
    }
}
