import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner scannerbaba = new Scanner(System.in);
System.out.println("tell us the total money :");
double anapara = scannerbaba.nextDouble();
System.out.println("yearly interest (percentage) :");
double faiz = scannerbaba.nextDouble();
System.out.println("how many month you will keep the money");
double kacay = scannerbaba.nextDouble();
double aylikoran = faiz / (12 * 100);
double yilsayisi = kacay/12.0;
double gelecekdeger = anapara * Math.pow(1 + aylikoran , kacay);
double netfaiz = gelecekdeger - anapara;
System.out.println("Gelecek Değer :" + gelecekdeger + "Net Faiz Geliri : " + netfaiz);
}}