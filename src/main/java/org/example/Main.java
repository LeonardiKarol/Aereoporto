package org.example;
import java.util.Scanner;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Arr n= new Arr();
        System.out.printf("inserire quanti valori si vuole avere");
        int num=input.nextInt();
        n.fillArr(num);
        n.printArr();
        int check= n.searchElement(12);
        if(check==1)
            System.out.printf("%nelemento %d trovato nell'array", 12);
        else
            System.out.printf("%nElemento %d non trovato",12);
        int c= n.alternedSum();
        System.out.printf("%nla somma e'%d",c);
    }
}
