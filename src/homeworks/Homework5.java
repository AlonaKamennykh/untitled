package homeworks;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        /*•За допомогою java.util.Random програма загадує випадкове число в діапазоні[0 - 100] та пропонує гравцеві через
        консоль ввести своє ім’я, яке зберігається в змінній name. •Перед початком на екран виводиться текст:Let the
        game begin ! •Сам процес гри обробляється у нескінченному циклі. •Гравцеві пропонується ввести число
        в консоль, після чого програма порівнює загадану кількість з тим, що ввів користувач. •Якщо введене число менше
        загаданого, програма виводить на екран текст:Your number is too small.Please,try again..Якщо введене
        число більше за загадане, то програма виводить на екран текст:
        Your number is too big.Please,try again.. •Якщо введене число відповідає загаданому, то програма виводить текст:
        Congratulations, {name} ! •Завдання повинно бути виконане за допомогою
        масиви(НЕ використовуйте інтерфейси List, Set, Map).*/

        Random a = new Random();
        int b=a.nextInt(0,100);
        System.out.println(b);
        System.out.println("Write your name: ");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Let the game begin ! ");
        int i=1;
        while (i>0){
            System.out.println("Write the number: ");

            Scanner scanner1=new Scanner(System.in);
            int number=scanner1.nextInt();
            if (b<number){
                System.out.println("Your number is too big.Please,try again.");
            }else if (b>number){
                System.out.println("Your number is too small.Please,try again.");
            }else if (b==number){
                System.out.println("Congratulations, "+name+" !");
                --i;

            }
        }

    }
}
