package homeworks8;

public class Main {
    //Задание 1  В отдельном классе создайте объект класса компьютер, и выведите в консоль
    //    информацию о вашем объекте

    public static void main(String[] args) {
        Computer computer=new Computer("Asus",1000,32,610);
        computer.getInfo();

        //Задание 2   Создать в отдельном классе main 4 объекта класса Tree используя 4 созданных конструктора.
        Tree tree1=new Tree("ива",20);
        Tree tree2=new Tree(10,15,"Оранжевый");
        Tree tree3=new Tree();
        Tree tree4=new Tree("дуб");
        System.out.println("1=============");
        System.out.println(tree1);
        System.out.println("2=============");
        System.out.println(tree2);
        System.out.println("3=============");
        System.out.println(tree3);
        System.out.println("4=============");
        System.out.println(tree4);


    }


}
