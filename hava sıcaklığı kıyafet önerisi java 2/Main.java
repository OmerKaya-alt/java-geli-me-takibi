import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scannerbaba = new Scanner(System.in);
System.out.println("hava sicakliği nedir efendim ? ");
int sicaklik = scannerbaba.nextInt();
if (sicaklik >= 30){
System.out.println("hava çok sicak efendim tişört giymelisiniz");
}
else if (sicaklik >= 15){
System.out.println("hirka almalisiniz efendim");
}
else if (sicaklik >= 0){
System.out.println("deri mont zamani gelmiş efendim");
}
else {
System.out.println("efendim evinizde kalmaniz şu an da daha iyi hava da donduruu soğuk var");
}
 }
}