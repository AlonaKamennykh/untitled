package Lesson3;

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
          /*    1) Создать пять любых переменных типа String ( word1, word2, word3 и т.д. ).
Создать также переменную типа String result1 и result2.
Поместить в result1 все слова word1 - word5 используя метод concat.
Поместить в result2 все слова word1 - word5 используя оператор +.
Вывести result1 и result2 в консоль.
*/
       String word1="space1";
        String word2="space2";
        String word3="space3";
        String word4="space4";
        String word5="space5";
        String result1 , result2;
        result1=word1.concat("").concat(word2).concat("").concat(word3).concat("").concat(word4).concat("").concat(word5);
        result2=word1+" "+word2+" "+word3+" "+word4+" "+word5;
        System.out.println(result1);
        System.out.println(result2);






 /*     2) Создайте строку resumeStringName со значением:
"Hello! My name is {NAME}.",
а также переменную resumeStringCity со значением:
"I am from {CITY}."

Создать также переменную типа String result1 и result2.
В result1 поместить значение resumeStringName и resumeStringCity и заменить внутри текст переменных
{NAME} и {CITY} на ваше имя и город используя методы concat и substring.
В result2 поместить значение resumeStringName и resumeStringCity и заменить внутри текст переменных
{NAME} и {CITY} на ваше имя и город используя метод replace.
Вывести в консоль сравнение на равенство двух переменных result1 и result2
*/
        String resumeStringName = "Hello! My name is {NAME}.";
        String resumeStringCity = "I am from {CITY}.";
        String result3 = resumeStringName.substring(0, resumeStringName.length() - 7).concat("Alona").
                concat(resumeStringCity.substring(0, resumeStringCity.length() - 7)).concat("Niko");
        String result4 = resumeStringName.replace("{NAME}", "Alona").concat(resumeStringCity.
                replace("{CITY}", "Niko"));
        System.out.println(result3);
        System.out.println(result4);

/* Переменная текст стринг , в нём текст.Если текст больше 100 - тру, меньше фолс.*/
        String text="kvkkfkffkgf kfglfgk flfgfkgjjf fkfk";
        System.out.println(text.length()<100);

        String a="Good";
        System.out.println(a.indexOf("o"));
        System.out.println(a.lastIndexOf("o"));
    }
}




