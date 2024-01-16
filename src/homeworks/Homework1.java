package homeworks;

public class Homework1 {
    public static void main(String[] args) {
      /*  1
        mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
        volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
        opel = mercedes%volvo;
        Необходимо вычислить значения mersedes, volvo и opel.

        mercedes=3;
        volvo=28;
        opel=3;

        2
        int x = 3;
        int y = ++x*2;
        x+=-y*3 + ++x + --y;
        y+=(-x++)%3;
        int z = x + y;
        Необходимо вычислить значения x, y и z.
        x=-7;
        y=9;
        z=2;

        3
        boolean a = (85/5 + (19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
        boolean b = !a||a&&!a;
        boolean c = false&&!true||!((23%3+14)%3==7);
        Необходимо вычислить значения a, b и c.

        a=false;
        b=true;
        c=true;

*/



       /* int mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
        int volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
        int opel = mercedes%volvo;
        System.out.println(mercedes);
        System.out.println(volvo);
        System.out.println(opel);
        System.out.println("============");

        int x = 3;
        int y = ++x*2;
        x+=-y*3 + ++x + --y;
        y+=(-x++)%3;
        int z = x + y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("============");

        boolean a = (85/5 + (19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
        boolean b = !a||a&&!a;
        boolean c = false&&!true||!((23%3+14)%3==7);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

        /*Coздать две переменные типа int:
        int a = 7;
        int b = 9;
        Поменять между собой значения переменных a и b.
        Создавать новые переменные нельзя.
        Можно применять только арифметические действия к перемнным a и b.
        Вывести в консоль значения переменных a и b после их переопределения.*/
        int a=7;
        int b=9;
        a=b;
        b=a-2;
        System.out.println(a);
        System.out.println(b);









    }
}
