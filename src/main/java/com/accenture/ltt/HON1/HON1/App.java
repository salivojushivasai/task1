package com.accenture.ltt.HON1.HON1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to use credit 1 or credit 2? give single digit");
        int choice  = sc.nextInt();
        if(choice==1) {
        	MyCard crd1 = new Credit1();
        	crd1.payment();
        	crd1.pay();
        } else {
        	MyCard crd2 = new Credit2();
        	crd2.payment();
        	crd2.pay();
        }
    }
}
 