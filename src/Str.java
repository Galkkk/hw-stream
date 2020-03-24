import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Str {

    public static int letter;

    public static void main(String[] args) {

        List<String> generatedString = new ArrayList<>(); //Лист из строк, каждаяя из которых символ

        int length = (int) (61 + Math.random() * 100);     //Количество символов в строке
        for (int i = 0; i < length; i++) {
            letter = 60 + (int) (Math.random() * 70);
            char c = (char) letter;
            String s = "";
            s += c;
            generatedString.add(s);
        }


        //Вывод сгенерированной строки
        System.out.print("Сгенирированная строка: ");
        for (String str : generatedString) {
            System.out.print(str);
        }
        System.out.println();

        //Лист, обозначающий строку без повторяющихся символов
        List<String> stringWithoutRep = generatedString.stream().distinct().collect(Collectors.toList());


        for (String st : stringWithoutRep) {
            System.out.print("Символ <" + st + "> составляет ");
            int numberOfRep = (int) generatedString.stream().filter((st)::equals).count();
            double percent = (((double) numberOfRep) / (double) length) * 100;
            System.out.println(percent + "% от общего числа символов");
        }

    }
}
