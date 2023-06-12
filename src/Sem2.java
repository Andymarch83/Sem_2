public class Sem2 {

    public static void main(String[] args) {

        String s = "Привет!"; //Создание строки.
        String s1 = "Привет!";
        s1 = s;

        Thread r = new Thread(); //Создание двух объектов с одинаковыми значениями
        Thread r1 = new Thread();

        System.out.println(r.equals(r1)); //Метод сравнения строковых объектов не по адресу, а по содержимому объекта
        s.length(); //вывод длинны строки
        s.concat("A"); //сложение двух строк
        s += "A"; //сложение двух строк
        s.endsWith("!"); //возвращает тру, если строка оканчивается конкретным символом.
        s.charAt(s.length()/2); //возвращает символ по индексу в котором он находится.
        s.indexOf("ри"); //возвращает индекс первого заданного символа
        s.lastIndexOf("!"); //возвращает индекс последнего заданного символа
        s.getBytes(); //Возвращает массив из символов строки
        System.out.println(s.toLowerCase()); //переводит все буквы строки в нижний регистр
        System.out.println(s.toUpperCase()); //переводит все буквы строки в ВЕРХНИЙ регистр
        System.out.println(s.substring(s.length()/2, s.length()-1)); //Вырезает подстроку по параметрам от и до.
        s.subSequence(1, 3); //Возвращает последовательность букв строки по параметрам от и до.
        System.out.println(s.repeat(4)); // повторить заданное количество раз.
        System.out.println(s.repeat(4).replace("!", "?")); // повторить заданное количество раз с заменой символа
        System.out.println(s.repeat(4).replace("!", "")); // повторить заданное количество раз с удалением символа
        String[] tmp = s.repeat(4).split(" "); // повторить заданное количество раз с распилом по разделителю
        System.out.println(s);

        StringBuilder builder = new StringBuilder("Привет"); // Инициализация создания метода через конструктор
        s = builder.toString(); // возвращает билдер в строковом представлении
        builder.append(.235f); // добавление символов в билдер
        builder.charAt(0); // установить символ по указанному индексу
        builder.setCharAt(builder.length()/2, 'O'); // добавить О в середину строки билдера
        builder.deleteCharAt(builder.length()/2-1); // удаляет символ по указанному индексу
        builder.compareTo(new StringBuilder("!")); // сравнение двух билдеров, если равны, то вернёт 0
        builder.delete(0, 2); // удалить от и до
        builder.insert(builder.length()/2-1, true); // вставить значение в билдер по номеру заданного индекса.
        builder.indexOf("!"); // возвращает первый индекс заданного символа
        builder.lastIndexOf("!"); // возвращает последний индекс заданного символа
        builder.replace(0, builder.length()/2, "Set new chars"); // замена от и до и на что
        builder.reverse(); // разворачивает строку билдера
        System.out.println(builder);

        s = new StringBuilder(s).reverse().toString(); // перевод строки в билдер, разворот и перевод обратно в строку

        String str = "";
        StringBuilder stringBuilder = new StringBuilder("");

        long start = System.currentTimeMillis(); //Возвращает количество милисекунд
        for (int i = 0; i < 10000; i++) {
            str += Character.getName(i); // возвращает название символа по заданному индексу
        }
        System.out.println("String result: "+ (System.currentTimeMillis() - start)); // разница милисекунд по окончании и на старте


        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(Character.getName(i));
        }
        System.out.println("StringBuilder result: "+ (System.currentTimeMillis() - start));
    }

}
