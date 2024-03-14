package homeworks8;

import java.util.Arrays;
import java.util.Objects;

public class Computer {
    /*1)
    Создать класс Computer c конструктором принимающим параметры
    Марка тип String, цена тип int, оперативная память тип int,
    и видеокарта тип int.
    Переопределить метод toString для вывода объекта класса в след. виде:

            "Создан PC.
    Имя = марка.
            Цена = цена.
            Видеокарта = объем видеокарты.
    ОЗУ = Объем оперативной памяти."

    Все поля класса Computer должны быть приватными.
    Также создайте публичные методы для получения информации о полях класса Computer.

    А также методы для изменения его полей.
    Переопределите метод equals и метод hashCode для вашего класса.
    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
    равны значения полей марка, оперативная память и видеокарта.
    В отдельном классе создайте объект класса компьютер, и выведите в консоль
    информацию о вашем объекте*/
    private String brand;
    private int price;

    private int ram;
    private  int videoCard;

    public Computer(String brand, int price, int ram, int videoCard) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.videoCard = videoCard;
    }
    public String toString(){
        return "Создан PC.\nИмя = "+brand+"\n"+"Цена = "+price+"\n"+"Видеокарта = "+ram+"\n"+"ОЗУ = "+videoCard;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && videoCard == computer.videoCard && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ram, videoCard);
    }

    public void getInfo(){
        System.out.println("Имя = "+brand);
        System.out.println("Цена = "+price);
        System.out.println("Видеокарта = "+ram);
        System.out.println("ОЗУ = "+videoCard);
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }


    public static void main(String[] args) {
        Computer computer=new Computer("Asus",100,50,300);
        Computer computer1=new Computer("Asus",100,50,300);
        System.out.println(computer.toString());
        System.out.println("==================");
        System.out.println(computer.getBrand());
        computer.setPrice(5000);
        System.out.println(computer.getPrice());
        System.out.println(computer.equals(computer1));
        System.out.println("============");
       computer.getInfo();

    }
}
