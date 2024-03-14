package homeworks8;

public class Converter {
     /*  3)
    Необходимо создать класс конвертер, который будет иметь методы конвертации примитивных типов данных:
    метод convertToInt; (конвертирует byte, short, int, long, char, float, double, String).
    При вводе boolean выводитсообщение, что введен тип boolean.

    convertToDouble;    (конвертирует byte, short, int, long, char, float, double, String).
    При вводе boolean выводит сообщение, что введен тип boolean.

    converToString;     (конвертирует byte, short, int, long, char, boolean, float, double, String).

    У данного класса должен быть только один конструктор, в параметрах которого можно указать его имя.
    А также только один метод геттер для получения информации о названии данного конвертра.*/
    private String converterName;
    public Converter(String converterName){
        this.converterName=converterName;

    }
    public String getConverterName(){
        return converterName;
    }
    public int convertToInt(Object object){
        if (object instanceof Boolean){
            System.out.println("введен тип boolean");
            return 0;
        } else if (object instanceof String) {
        try {
            return Integer.parseInt((String) object);
        }catch (NumberFormatException e) {
            System.out.println("Ошибка переобразования строки в число");
            return 0;
        }
        }else {
            try {
                return ((Number)object).intValue();
            }catch (Exception e){
                System.out.println("Невозможно выполнить конвертацию");
                return 0;
            }
        }

    }
    public double convertToDouble(Object object) {
        if (object instanceof Boolean) {
            System.out.println("введен тип boolean");
            return 0.0;
        } else if (object instanceof String) {
            try {
                return Double.parseDouble((String) object);
            }catch (NumberFormatException e){
                System.out.println("Ошибка переобразования строки в число");
                return 0.0;
            }
        }  else {
            try {
                return ((Number)object).doubleValue();
            }catch (Exception e){
                System.out.println("Невозможно выполнить конвертацию");
                return 0.0;
            }
        }
    }
    public String convertToString(Object object){
        return String.valueOf(object);
    }

    public static void main(String[] args) {
        Converter converter=new Converter("doubleToInt");
        System.out.println(converter.convertToInt(6.7));
        System.out.println(converter.getConverterName());
    }
}
