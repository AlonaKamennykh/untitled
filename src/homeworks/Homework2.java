package homeworks;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {

        /*
      1
    Создать переменную string1 = "This line that i want to cut, cause it is too long".
    Создать строку string2 в которой должно быть помещено значение строки string1,
    Обрезанное до "This line that i want to cut, cause".
    Создать строку string3 на основе string2 которое будет содержать значение
"This line that don't want to cut, cause it is perfect".
    Вывести на консоль каждое сообщение и его длину.
*/
        String string1="This line that i want to cut, cause it is too long";
        String string2=string1.substring(0,35);
        String string3=string2.replace(" i "," don't ").concat(" it is perfect");
        System.out.println(string1);
        System.out.println(string1.length());
        System.out.println(string2);
        System.out.println(string2.length());
        System.out.println(string3);
        System.out.println(string3.length());
/*

        2
        Создать строку string = "Testing, is my favourite job".
                Вывести на экран отдельно каждое слово и длину этого слова в след виде:
        Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
        Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
        и т.д.
                Вывести на консоль true, если первое слово длиннее остальных, в
        противном случае вывести false.

*/
        String string = "Testing, is my favourite job";
        System.out.print("Cлово1 = " + string.split(" ")[0]);
        System.out.println(", Длина этого слова = " + string.split(" ")[0].length());
        System.out.print("Cлово1 = " + string.split(" ")[1]);
        System.out.println(", Длина этого слова = " + string.split(" ")[1].length());
        System.out.print("Cлово1 = " + string.split(" ")[2]);
        System.out.println(", Длина этого слова = " + string.split(" ")[2].length());
        System.out.print("Cлово1 = " + string.split(" ")[3]);
        System.out.println(", Длина этого слова = " + string.split(" ")[3].length());
        System.out.print("Cлово1 = " + string.split(" ")[4]);
        System.out.println(", Длина этого слова = " + string.split(" ")[4].length());
        boolean a=string.split(" ")[0].length()>string.split(" ")[1].length()&&
                string.split(" ")[0].length()>string.split(" ")[2].length()&&
                string.split(" ")[0].length()>string.split(" ")[3].length()&&
                string.split(" ")[0].length()>string.split(" ")[4].length();
        System.out.println(a);

        /*3

        При применении к массиву строк поля length, можно узнать сколько
        элементов находится в массиве.
        Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
        то при вызове поля lenth:
        int size = arrayOfString.length;
        можно получить какое количество символов находится в данном массиве.

                Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
        символ 'a' встречается в  строке:
        "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there.
        And we can use the split method and the length method."

        Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'.
*/
        String arrayOfString="Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there.\n" +
                "        And we can use the split method and the length method.";
        int x=arrayOfString.split("a").length-1;
        int y=arrayOfString.split("A").length-1;
        int sum=x+y;

        System.out.println(x);
        System.out.println(y);
        System.out.println("Количество а= "+sum);




    }


}
