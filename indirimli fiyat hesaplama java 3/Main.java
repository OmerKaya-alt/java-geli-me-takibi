import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
Scanner scannerbaba = new Scanner(System.in);
System.out.println("kendi fiyati");
double kendifiyati = scannerbaba.nextDouble();
double indirim = kendifiyati * 0.18;
double sonfiyat = kendifiyati - indirim;
System.out.println("indiirmli fiyat" + sonfiyat);
      }} 