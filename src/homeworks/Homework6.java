package homeworks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
       /* 1)Пользователь задает размерность двумерного массива с клавиатуры.
                Массив заполняется случайными числами от 0 до 1000.
        Необходимо создать одномерный массив, состоящий из максимальных значений
        каждого отдельного массива входящего в двумерный.
        Новый полученный массив вывести на экран.*/
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество строк");
        int line=scanner.nextInt();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Введите количество столбцов");
        int column=scanner.nextInt();
        Random c=new Random();
    int[][] a=new int[line][column];
    int[] b=new int[line];
        for (int i=0;i< a.length;i++){
            a[i][0]=c.nextInt(0,1000);
            for (int d = 0; d < a[i].length; d++) {
                a[i][d]=c.nextInt(0,1000);
                }

        }
       System.out.println(Arrays.deepToString(a));
        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int d = 0; d < a[i].length; d++) {
                if (a[i][d] > max) {
                    max = a[i][d];
                }
            }
            b[i] = max;
        }
        System.out.println(Arrays.toString(b));
*/

       /* 2)Написати програму “стрільба по цілі”.
        Технічні вимоги:

•Даний квадрат 5 х5, де програма випадковим чином ставить ціль.
•Перед початком гри на екран виводиться текст:
        All Set.Get ready to rumble !.
•Сам процес гри обробляється у нескінченному циклі.
•Гравцеві пропонується ввести лінію для стрільби;
        програма перевіряє, щоб було введено число, і введена лінія
•знаходиться в межах ігрового поля(1 - 5).У випадку, якщо гравець помилився, пропонує ввести число ще раз.
•Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
•Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі.Клітинки, куди гравець вже стріляв, слід
        зазначити як *.
•Гра закінчується при попаданні в ціль.Наприкінці гри вивести в консоль фразу You have won !, а також ігрове поле.
•Уражену ціль відзначити як x.
•Завдання повинно бути виконане за допомогою масивів(НЕ використовуйте інтерфейси List, Set, Map).
                Приклад виведення в консоль:

[0, 1, 2, 3, 4, 5]
[1, -, *,-, -, -]
[2, -, -, -, -, -]
[3, -, *,-, -, -]
[4, -, -, *,-, -]
[5, -, *,-, -, *]*/

        Scanner scanner=new Scanner(System.in);

        Random c1=new Random();
        char [][] a1=new char[5][5];
        System.out.println(" All Set.Get ready to rumble !");
        a1[c1.nextInt(0,5)][c1.nextInt(0,5)]='$';
        System.out.println(Arrays.deepToString(a1));

        int n=0;
        while (n==0){
            System.out.println(" Enter the shooting line !");
            int line=scanner.nextInt();
            System.out.println(" Enter the shooting column !");
            int column=scanner.nextInt();
            if (line<=5&&column<=5){
                if(a1[line][column]=='$'){
                    a1[line][column]='x';
                    System.out.println("You have won !");
                    System.out.println(Arrays.deepToString(a1));
                    ++n;


                }else {
                    a1[line][column]='*';
                    System.out.println(Arrays.deepToString(a1));
                    System.out.println("Try again !");
                }
            }

        }
        System.out.println(Arrays.deepToString(a1));
    }
}
