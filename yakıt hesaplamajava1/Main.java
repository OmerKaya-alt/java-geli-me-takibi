import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner scannerbaba = new Scanner(System.in);
System.out.println("sürücünün ismi : ");
String isim = scannerbaba.next();
System.out.println("gidilecek yol (km) : ");
double yol = scannerbaba.nextDouble();
System.out.println("ortalama hiziniz : ");
int hiz = scannerbaba.nextInt();
System.out.println("1 km de harcanan yakit : ");
int kmbasi = scannerbaba.nextInt();
double sure =  yol / hiz;
double maliyet = yol * kmbasi;
System.out.print("sayin" + isim + yol + "km yolu" + hiz + "km/s hizla yaklaşık " + sure + "saatte gidersiniz." + "toplam yakit miktarı ise : " + maliyet );
}
}