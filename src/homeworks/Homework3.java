package homeworks;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
      /*  У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры в консоль.

                Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine()) присвоить
        перемнным типа String следующие значения:
        string1 = Я string2 = тестирую string3 = замечательно string4 = Что еще нужно? Помимо string1, string2, string3, string4
        новых переменных создавать нельзя.*/

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Введите текст");
        String string1=scanner.next();
        System.out.println(string1);
        String string2=scanner.next();
        System.out.println(string2);
        String string3=scanner.next().replace(".","");
        System.out.println(string3);
        String string4=scanner.next()+" "+scanner.next()+" "+scanner.next();
        System.out.println(string4);*/

       /*
        2
        Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно ли из этих сторон
        построить треугольник. (необходимо вспомнить правило построения треугольника по трем сторонам).
*/
      /*  Scanner scanner1=new Scanner(System.in);
        System.out.println("Введите число");
        int a=scanner1.nextInt();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Введите число");
        int b=scanner2.nextInt();
        Scanner scanner3=new Scanner(System.in);
        System.out.println("Введите число");
        int c=scanner3.nextInt();
        if (a<b+c&&b<a+c&&c<a+b){
            System.out.println("Можно построить треугольник");
        } else {
            System.out.println("Нельзя построить треугольник");
        }*/

      /*  3)
        При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
        и всегда отнимать от большего меньшее.
        Вывести эту разность в консоль.*/

        /*Scanner scanner4=new Scanner(System.in);
        System.out.println("Введите число");
        int x=scanner4.nextInt();
        Scanner scanner5=new Scanner(System.in);
        System.out.println("Введите число");
        int y=scanner5.nextInt();
        int z=x>y?x-y:y-x;
        System.out.println(z);*/

       /* 4)
        (Использовать операторы if-else-if)
        Пользоватьель вводит с клавиатуры числа:
        Если число равно 1, то выводин на консоль "Понедельник";
        Если число равно 2, то выводин на консоль "Вторник";
        Если число равно 3, то выводин на консоль "Среда";
        Если число равно 4, то выводин на консоль "Четверг";
        Если число равно 5, то выводин на консоль "Пятница";
        Если число равно 6, то выводин на консоль "Суббота";
        Если число равно 7, то выводин на консоль "Воскресенье";
        В противном случае выводим текст: "Лучше бы сегодня была пятница".*/

       /* Scanner scanner6 = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner6.nextInt();
        if (n == 1) {
            System.out.println("Понедельник");

        } else if (n == 2) {
            System.out.println("Вторник");
        } else if (n == 3) {
            System.out.println("Среда");
        } else if (n == 4) {
            System.out.println("Четверг");
        } else if (n == 5) {
            System.out.println("Пятница");
        } else if (n == 6) {
            System.out.println("Суббота");
        } else if (n == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Лучше бы сегодня была пятница");

        }
*/
       /* 5)
        Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа и символ
        -или + или % или / или *.На экран выводится резултат действия над двумя введенными числами.Если пользователь
        ввел что -то кроме данных символов, то необходимо вывести 0.
                */

       /* Scanner scanner7 = new Scanner(System.in);
        System.out.println("Введите число");
        int a1 = scanner7.nextInt();

        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Введите число");
        int b1 = scanner8.nextInt();

        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Введите символ(-,+,%,*,/)");
        String c1 = scanner9.next();
        int d1 = c1.equals("-") ? a1 - b1 : c1.equals("+") ? a1 + b1 : c1.equals("%") ? a1 % b1 : c1.equals("/") ?
                a1 / b1 : c1.equals("*") ? a1 * b1 : 0;
        System.out.println(d1);*/

       /* 6)
        Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания
        программы.Из выбора программ взять:IntelliJ IDEA, Git, Java.Из выбора ОС взять:Linux, macOS, Windows.Программа
        должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует, а
        после вывести в консоль необходимую ссылку.Если программа с таким названием не существует выводит сообщение в
        консоль, о том что такой программы не существует.Если указанной пользователем ОС нет, то выводится сообщение
        в консоль, о том что такой ОС не существует.
*/
        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Какая программа вам интересна?");
        String p = scanner10.nextLine();

        Scanner scanner11 = new Scanner(System.in);
        System.out.println("Какую ОС вы используете?");
        String oc = scanner11.nextLine();
        switch (p){
            case ("IntelliJ IDEA"):
                switch (oc){
                    case("Linux"):
                        System.out.println("http 1");
                        break;
                    case("macOS"):
                        System.out.println("http 2");
                        break;
                    case("Windows"):
                        System.out.println("http 3");
                        break;
                    default:
                        System.out.println("Нет такой ОС");


                }
                break;
            case ("Git"):
                switch (oc){
                    case("Linux"):
                        System.out.println("http 4");
                        break;
                    case("macOS"):
                        System.out.println("http 5");
                        break;
                    case("Windows"):
                        System.out.println("http 6");
                        break;
                    default:
                        System.out.println("Нет такой ОС");

                }
                  break;
            case ("Java"):
                switch (oc){
                    case("Linux"):
                        System.out.println("http 7");
                        break;
                    case("macOS"):
                        System.out.println("http 8");
                        break;
                    case("Windows"):
                        System.out.println("http 9");
                        break;
                    default:
                    System.out.println("Нет такой ОС");

                }
                break;
            default:
                System.out.println("Нет такой программы");
        }

    }
}
