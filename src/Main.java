import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionService collectionService = new CollectionService();

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        System.out.println("\nПечать нечетных чисел:");
        collectionService.printingOddNumbers(nums);

        System.out.println("\nПечать четных чисел без повторений по порядку:");
        collectionService.printingEvenNumbers(nums);

        String text = "Тот, кто ничего не знает и знает, что он ничего не знает, знает больше, чем тот, кто ничего не знает и не знает, что он ничего не знает";

        System.out.println("\nПечать уникальных слов из текста:");
        collectionService.printingUniqueWords(text);

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        System.out.println("\nПечать количества дублей:");
        collectionService.printingNumbersOfRepetitions(strings);
    }
}