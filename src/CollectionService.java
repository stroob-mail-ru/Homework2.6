import java.util.*;

public class CollectionService {
    public void printingOddNumbers(List<Integer> nums) {

        List<Integer> oddNums = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 != 0) {
                oddNums.add(num);
            }
        }
        System.out.println(oddNums);
    }
    public void printingEvenNumbers(List<Integer> nums) {

        List<Integer> evenNums = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 == 0 && !evenNums.contains(num)) {
                evenNums.add(num);
            }
        }
        Collections.sort(evenNums);
        System.out.println(evenNums);
    }

    public void printingUniqueWords(String text) {

        String newText = text.replaceAll(",", "");
        List<String> words = new ArrayList<>(Arrays.asList(newText.split(" ")));
        Set<String> uniqueWorlds = new HashSet<>(words);

        System.out.println(uniqueWorlds);
    }

    public void printingNumbersOfRepetitions(List<String> strings) {

        Map<String, Integer> resultMap = new HashMap<>();

        for (String string : strings) {
            if (resultMap.containsKey(string)) {
                resultMap.put(string, resultMap.get(string) + 1);
            } else {
                resultMap.put(string, 1);
            }
        }
        System.out.println(resultMap.values());
    }
}
