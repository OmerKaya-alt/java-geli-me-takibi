import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner scannerbaba = new Scanner(System.in);
System.out.println("yari çapi giriniz :");
double r = scannerbaba.nextDouble();
System.out.println("merkez açisi giriniz");
double ma = scannerbaba.nextDouble();
double pi = 3.14;
double formül = pi*r*r*ma / 360;
System.out.println("Daire Diliminin Alani :" + formül);
}}