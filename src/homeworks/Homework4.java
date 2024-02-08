package homeworks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
      /*  1)
        Написать программу, которая будет считывать введенные пользователем слова с клавиатуры слова, и склеивать их
        в одно предложение до тех пор, пока пользователь не введет с клавитуры слово STOP.Все слова введенные до
        этого должны отобразится в консоли одним предложением.

*/    /*  Scanner scanner = new Scanner(System.in);
        int x=1;
        String b="stop";
        String c="";
        while (x>0){
            System.out.println("Введите текст");
            String a =scanner.next();
            if (!a.equalsIgnoreCase(b)){
                c=c+a+" ";
            }else {
                System.out.println(c+".");
                --x;
            }

        }*/


      /*  2)
        Написать программу в которой пользователь вводит с клавиатуры число, а программа определяет, является
        она полиндромом или нет.И выводит данную информацию на экран.*/
      /* Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число");
        String a2=scanner1.nextLine();
        String b2="";
        for (int i=a2.length()-1;i>=0;i--){
            b2=b2+a2.charAt(i);

        }
        System.out.println(a2);
        System.out.println(b2);
        if(a2.equals(b2)) {
            System.out.println("Это полиндром");
        }else {
            System.out.println("Это не полиндром");
        }*/




       /* 3)
        Написать проограмму, условно для склада приема металла.Представим, что склад может хранить определенный
        вес металла.Пользователь вводит с клавиатуры вес, который может хранится на складе.Дальше пользователь вводит с
        клавиатуры вес, который условно собирается сдать на склад пользователь.Программа должна после каждой
        сдачи металла показывать сколько веса еще может принять склад.Если пользователь хочет сдать металла больше
        чем осталось места на складе, то программа не дает ему это сделать и уведомляет пользователя, о
        невозможности данной операции.Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
        о невозможности приемки такого малого веса.Программа завершается, когда место на складе закончилось.
*/



/*
        Scanner scanner = new Scanner(System.in);
        int x=1;
        System.out.println("Введите вес хранилища");
            int a =scanner.nextInt();

        while (x>0){

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите вес металла");
            int b=scanner2.nextInt();
            if (a>=b&&b>5){
                int c=a-b;
                a=c;
                System.out.println("Осталось  "+a+"кг.");

            }else if (a<b&&a==0) {
                System.out.println("Места больше нет");
                --x;
                continue;
            } else if (a<b){
                System.out.println("Слишком большой вес.");
            }else if (b==5){
                System.out.println("Слишком маленький вес.");
            }


        }*/
        /*
        4)
        Первый будет состоять из следующих имен: “Петя”, “Маша”, “Алёна”, “Федя”, “Саша”, “Антон”, “Глеб”.Второй будет
        содержать следующие значения типа int:10, 12, 14, 16, 18, 20. Третий будет содержать следующие значения: “школу”, “
        магазин”, “церковь”, “тренажерный зал”, “кино”, “поликлинику”.Пользователь вводит три числа
        с клавиатуры, которые будут соответствовать индексам каждого из элементов массивов.Пример1.после ввода 3, 2, 1:
        На экране должно вывестись следующее сообщение: “Федя будет идти в магазин в 14:00”Пример2.после ввода 1, 2, 3:
        На экране должно вывестись следующее сообщение: “Маша будет идти в тренажерный зал в 14:00”
*/
      /*  String[] arrayname={"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] time={10, 12, 14, 16, 18, 20};
        String[] arrayplace={"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число");
        int a=scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите число");
        int b=scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите число");
        int c=scanner3.nextInt();
        System.out.println(arrayname[a]+" будет идти в "+arrayplace[b]+" в "+time[c]+":00");
*/




        /*5)
        Есть одномерный массив из 10 элементов, заполнен - ный случайными числами.Пользователь вводит с клавиатуры
        число.Программа показывает есть ли такое число в созданном до этого массиве.
*/
      /*  Random a = new Random();
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = a.nextInt(100);
        }
        System.out.println(Arrays.toString(randomArray));

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число");
        int b = scanner1.nextInt();
        int c=0;

        for (int i = 0; i < randomArray.length; i++) {
            if (b == randomArray[i]) {
                c++;
            } else {
                c=c+0;
            }
        }
        if (c>0){
            System.out.println("Есть такое число");
        }else {
            System.out.println("Нет такого числа");
        }
*/
       /* 6)
        Заполнить массив на 45 элементов случайными числами от -50 до + 50. Найти минимальный элемент и вывести его
        на консоль.Найти максимальный элемент и вывести его на консоль.*/
       Random a=new Random();
        int[] randomArray=new int[45];
        for (int i=0;i<randomArray.length;i++){
            randomArray[i]= a.nextInt(-50,50);
        }
        System.out.println(Arrays.toString(randomArray));

       for(int i = 0; i < randomArray.length; i++){
            int min;
            for(int b = i + 1; b < randomArray.length; b++ ){
                if(randomArray[i] > randomArray[b]){
                    min = randomArray[b];
                    randomArray[b] = randomArray[i];
                    randomArray[i] = min;
                }
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(randomArray));
        System.out.println("Max: "+randomArray[randomArray.length-1]);
        System.out.println("Min: "+randomArray[0]);


    }
}
