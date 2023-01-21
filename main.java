import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int total1=1,n,r,total3=1;
        int total2=1;

        Scanner input=new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        n=input.nextInt();
        System.out.print("r sayısını giriniz: ");
        r=input.nextInt();
        for(int a=1; a<=n; a++){

            total1 *=a;
        }for(int b=1; b<=r; b++){

            total2 *=b;}
        for(int c=1; c<=(n-r); c++){

            total3 *=c;}

        System.out.print("n sayısının r li kombinasyonu=  "+ total1/(total2*total3));




    }}








//www.patika.dev



































































