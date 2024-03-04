package homeworks;

import java.util.Arrays;

public class Homework7 {
    /*  Работа с методами и классами.
                Задание
        1)
        Написать метод, принимающий в качестве параметра массив целых чисел.И выводит на экран все четные
        числа списком, a также нечетные числа списком.
*/
  /*  public static void main(String[] args) {
        Homework7 a=new Homework7();
        int[] array={1,2,3,4,5,6,7,8,9,10};
        a.evenOddNumber(array);

    }

    public void evenOddNumber(int[] array){
        String evenNumbers="EvenNumbers: ";
        String oddNumbers="OddNumbers: ";
        for (int number:array){
            if (number%2==0){
                evenNumbers+=number+" ";
            }else {
                oddNumbers+=number+" ";
            }
        }
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

    }
    }*/




    /*
       2)
       Написать перегруженный метод, который может:

•Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
       "Я пустой".
•Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
•Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
•Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
•Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
       "Ваше сообщение - " %%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/

    public void print(){
        System.out.println("Я пустой");
    }


   public void print(String message){
        System.out.println(message);
    }
    public void print(String[] array){
        String b="";
        for (int i=0;i<array.length;i++) {
           b=b+array[i]+" ";

        }
        System.out.println(b);

    }
    public void print(String massage,int number){
        System.out.println("Ваше сообщение "+massage+" Ваше число "+number);
    }
    public void print(int[] array){
        int b=0;
        for (int i=0;i<array.length;i++){

            b=b+array[i];
        }
        System.out.println("Сумма элементов массива "+b);
    }
    public static void main(String[] args) {
        Homework7 a = new Homework7();
        a.print();
        a.print("Hello");
        a.print(new String[]{"Hello", "people"});
        a.print("Hello", 3);
        a.print(new int[]{1, 2, 3});






    }
}