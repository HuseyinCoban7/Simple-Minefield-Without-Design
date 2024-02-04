
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row,column;
        System.out.println("Mayin Tarlasina Hosgeldiniz!");
        System.out.println("Lutfen Oynamak Istediginiz Boyutlari Giriniz: ");
        System.out.print("Satir Sayisi: ");
        row=scan.nextInt();
        System.out.print("Sutun Sayisi: ");
        column=scan.nextInt();
        
        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();
        
        
    }
    
}
