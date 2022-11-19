import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen yıl bilgisini giriniz: ");
        yil = inp.nextInt();
        if(yil%4==0){
            if(yil%100==0){
                if(yil%400==0){
                    System.out.println(yil + " artik bir yıldır");
                }
                else{
                    System.out.println(yil + " artik bir yıl değildir");
                }
            }
            else{
                System.out.println(yil + " artik bir yıldır.");
            }
        }
        else{
            System.out.println(yil + " artik bir yıl değildir");
        }
    }
}