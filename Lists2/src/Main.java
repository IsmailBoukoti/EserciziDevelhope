import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> divisorsOf52 = new ArrayList<>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);

        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        randomNumbers.addAll(divisorsOf52);

        System.out.println(randomNumbers);
        System.out.println("The list contains : " + randomNumbers.size() + " integers");

        randomNumbers.remove((Integer) 1);
        randomNumbers.remove((Integer) 13);

        Set<Integer> setOfNumber = new HashSet<>();
        for (Integer numero : randomNumbers) {
            setOfNumber.add(numero);
        }

        System.out.println(setOfNumber);

        System.out.println("----Removing duplicates----");
        System.out.println(randomNumbers);
        System.out.println("The list contains : " + randomNumbers.size() + " integers");

        System.out.println("----Sorting numbers in descending order----");
        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println(randomNumbers);
    }

}
