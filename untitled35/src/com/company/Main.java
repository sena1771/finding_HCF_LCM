package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        int ebob = 1,ekok=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("First number : ");
        int a= inp.nextInt();
        System.out.print("Second number: ");
        int b= inp.nextInt();


            
if(a>b){
    while (i<=b){
        if((a%i==0)&&(b%i==0)){
            ebob=i;

        }
        i++;
} 
    System.out.println("HCF: "+ebob);
    
    /* Ekok=(birinciSayi*ikinciSayi)/ebob; */
    ekok=(a*b)/ebob;
    System.out.print("LCM: "+ekok);



      }

        }
    }

