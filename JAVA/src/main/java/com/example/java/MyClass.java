package com.example.java;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]){
        boolean boy,girl;
        int age,bg;

        Scanner scanner=new Scanner(System.in);
        while (true){
            girl=false;
            boy=false;
            System.out.println("�п�J�ʧO:(�p�G�O�k�ʽп�J1�k�ʫh�O2)");
            bg=scanner.nextInt();
            if(bg==1){
                boy=true;
            }
            else if(bg==2){
                girl=true;
            }
            else {
                System.out.println("�A��J���F��O�L�Ī�!");
                return;
            }
            System.out.println("�п�J�A���~��:");
            age=scanner.nextInt();
            if(age-8>=18 && boy==true){
                System.out.println("�b����100�~�H�e�A�w�g�i�H���B!");
            }
            else if(age-8<18 && boy==true) {
                System.out.println("�b����100�~�e�A�O���൲�B��!");
            }
            if(age-8>=16 && girl==true){
                System.out.println("�b����100�~�H�e�p�w�g�i�H���B!");
            }
            else if(age-8<16 && girl==true){
                System.out.println("�b����100�~�e�p�O���൲�B��!");
            }
        }

    }
}
