import java.util.Scanner;

public class Binarytoseriesupto_n {


   static void Fun(int n){
       String bin[]= new String[n];
       bin[0]="1";
       for(int i=1;i<n-1;i=i+2){
           if(i%2==1) {
               bin[i] = bin[i - 1] + "0";
           }else {
               bin[i + 1] = bin[i - 1] + "1";
           }
           for(String ans:bin){
               System.out.println(ans);
           }

       }
    }

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();

        Fun(n);



    }


}
