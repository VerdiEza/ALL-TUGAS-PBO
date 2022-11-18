import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        System.out.println("Laptop Merk apa yang ingin anda gunakan? \n1.Macbook \n2.Lenovo \n3.Toshiba \nPilihan anda : ");
        String milih = pilih.nextLine();

        if(milih.equals("Macbook")){
            Laptop m2 = new Macbook();
            LaptopUser andri = new LaptopUser(m2);
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.print("Apa yang ingin anda lakukan? \n1.ON \n2.OFF \n3.UP \n4.DOWN \n5.UDAHAN \nOpsi apa yang anda pilih: ");
                String input = in.nextLine();
                if(input.equals("UDAHAN")){
                    System.out.println("Aku sudah selesai menggunakan laptop");
                    break;
                }
                pakaiLaptop(andri, input);
            }
        }

        else if(milih.equals("Lenovo")){
            Laptop thinkpad = new Lenovo();
            LaptopUser andri = new LaptopUser(thinkpad);
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.print("Apa yang ingin anda lakukan? \n1.ON \n2.OFF \n3.UP \n4.DOWN \n5.UDAHAN \nOpsi apa yang anda pilih: ");
                String input = in.nextLine();
                if(input.equals("UDAHAN")){
                    System.out.println("Aku sudah selesai menggunakan laptop");
                    break;
                }
                pakaiLaptop(andri, input);
            }
        }

        else if(milih.equals("Toshiba")){
            Laptop dynabook = new Toshiba();
            LaptopUser andri = new LaptopUser(dynabook);
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.print("Apa yang ingin anda lakukan? \n1.ON \n2.OFF \n3.UP \n4.DOWN \n5.UDAHAN \nOpsi apa yang anda pilih: ");
                String input = in.nextLine();
                if(input.equals("UDAHAN")){
                    System.out.println("Aku sudah selesai menggunakan laptop");
                    break;
                }
                pakaiLaptop(andri, input);
            }
        }


    }
    
    public static void pakaiLaptop(LaptopUser laptop, String input){
        if(input.equals("ON")){
            laptop.turnOnLaptop();
        }
        else if(input.equals("OFF")){
            laptop.turnOffLaptop();
        }
        else if(input.equals("UP")){
            laptop.makeLaptopLouder();
        }
        else if(input.equals("DOWN")){
            laptop.makeLaptopSilence();
        } 
    }
}
