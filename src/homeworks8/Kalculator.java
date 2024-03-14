package homeworks8;

import java.util.Scanner;

public class Kalculator {
    /*4)
    Создать класс калькулятор.
    В нем создать методы:
    summ, minus, multiply, division.
            Сложение, вычитание, умножение и деление соответственно.
    Каждый метод принимает в качестве параметров два значения типа double.
    И выводит в консоль результат действия.

    Также в классе есть метод старт. Который выводит сообщение в консоль, что
    калькулятор запущен. И предлагает ввести действие в вашей консоли.

    Калькулятор должен принимать только следующие типы действий:
            2+4;    - пример синтаксиса сложения;
5-6;    - пример синтаксиса вычитания;
25*3;   - пример синтаксиса умножения;
34/3;   - пример синтаксиса деления;

    После ввода действия на консоль выводится ответ этого действия.
    И после снова выводится сообщение о предложении ввести действие.

    В случае ввода другого синтаксисана консоль возвращается сообщение:
            "Введите корректное действие".
    И после снова выводится сообщение о предложении ввести действие.

    Программа закрывается после ввода команды Stop.
    Перед закрытием на консоль должно выводится сообщение:
            "Калькулятор закрыт".*/
    public void start(){
        System.out.println("Калькулятор запущен. Введите действие");

    }
    public void summ(double a,double b){

        System.out.println(a+b);
    }
    public void multiply(double a,double b){

        System.out.println(a*b);
    }
    public void division(double a,double b)
    {

        System.out.println(a/b);
    }
    public void minus(double a,double b){

        System.out.println(a-b);
    }

    public static void main(String[] args) {
        Kalculator kalculator=new Kalculator();
        kalculator.start();
        //int i=1;
       //while (i>0) {
        while (true){

           Scanner scanner = new Scanner(System.in);
           String input = scanner.nextLine();
            if (input.equals("stop")) {
                System.out.println("Калькулятор закрыт");
                //--i;
                break;
            }


               int a = Integer.parseInt(input.substring(0, 1));
               char c = input.charAt(1);
               int b = Integer.parseInt(input.substring(2));

           switch (c){
               case '+':
                   kalculator.summ(a,b);
                   break;
               case '-':
                   kalculator.minus(a,b);
                   break;
               case '*':
                   kalculator.multiply(a,b);
                   break;
               case '/':
                   if (b!=0) {
                       kalculator.division(a, b);
                   }else {
                       System.out.println("Деление на 0!!!");
                       return;
                   }
                   break;
               default:
                   System.out.println("Введите корректное действие");
           }
           System.out.println("Введите действие или stop ");


       }
    }
}
