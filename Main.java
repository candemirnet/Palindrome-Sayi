import java.util.Scanner;
public class Main {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0, lastNumber;
        while (temp!=0){
            lastNumber = temp %10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /=10;
        }
        if (number == reverseNumber){
            System.out.println(number + " Bir Palindrom Sayıdır");
            return true;
        }
        else{
            System.out.println(number+ " Bir Palindrom Sayı Değildir");
            return false;
        }

    }
    public static void main(String[] args) {
            Scanner imp = new Scanner(System.in);
            System.out.print("Sayı Giriniz: ");
            int sayi= imp.nextInt();
            isPalindrom(sayi);
           }
}