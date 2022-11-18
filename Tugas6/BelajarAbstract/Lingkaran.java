public class Lingkaran extends BangunDatar{

    float jari_jari;
    
    public Lingkaran(float jari_jari){
        this.jari_jari = jari_jari;
    }
    
    @Override
    float getLuas() {
        return (float) Math.PI*jari_jari*jari_jari;
    }
    
}
