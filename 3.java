import java.util.Scanner;
public class No3 {

    public int a;
    public void setAngka(int b){
        a=b;
    }
    public static void main(String[] args) {
        No3 put=new No3();
        int c;
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka=input.nextInt();
        put.setAngka(angka);
        c=angka;
        System.out.print(c+"!="+c+"x");
        for(int i=1;i<c;i++){
            System.out.print(c-i+"x");
            angka=angka*(c-i);
        }
        System.out.print("="+angka);
        System.out.println("Hasil : "+angka);
    }
    
}
