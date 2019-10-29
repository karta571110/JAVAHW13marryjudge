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
            System.out.println("請輸入性別:(如果是男性請輸入1女性則是2)");
            bg=scanner.nextInt();
            if(bg==1){
                boy=true;
            }
            else if(bg==2){
                girl=true;
            }
            else {
                System.out.println("你輸入的東西是無效的!");
                return;
            }
            System.out.println("請輸入你的年齡:");
            age=scanner.nextInt();
            if(age-8>=18 && boy==true){
                System.out.println("在民國100年以前你已經可以結婚!");
            }
            else if(age-8<18 && boy==true) {
                System.out.println("在民國100年前你是不能結婚的!");
            }
            if(age-8>=16 && girl==true){
                System.out.println("在民國100年以前妳已經可以結婚!");
            }
            else if(age-8<16 && girl==true){
                System.out.println("在民國100年前妳是不能結婚的!");
            }
        }

    }
}
