package javaapplication13;
import java.util.Scanner;
public class JavaApplication13 {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []a={5,10,12,13,14};
        for(int x=0; x<4; x++){
            for(int j=x+1; j<5; j++){
              if(a[x]>a[j]){
                  int temp=a[x];
                  a[x]=a[j];
                  a[j]=temp;
              }
            }
        }
        System.out.println("2nd largest value"+a[3]);
        System.out.println("2nd lowest value"+a[1]);
    }

       
    }
}