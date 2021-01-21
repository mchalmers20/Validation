package javapenguin;

import java.util.Scanner;
public class JavaPenguin{ 
    static Scanner polarBear = new Scanner(System.in);
    public static void main(String[] args){
    int input, age = 0;
    double answer = 0;
    
    for(int a = 0; a < 10; a++){
        System.out.println("Enter the age");
        input = polarBear.nextInt();
        answer += input;
    }
    
    answer = 1.0 * answer / 10;
    System.out.print("Average is:" + answer);
    }
    
}