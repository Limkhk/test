import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] input = {50,60,70,80,90,100};
        List<Integer> result = Arrays.stream(input)
                .filter(x->x<90)
                .map(x->x+10)
                .limit(3)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result);

        List<String>list = Arrays.asList("one","two","three");
        boolean anyMathch = list.stream()
                .anyMatch(value -> value.startsWith("o"));
        System.out.println(anyMathch);
        List<String> uppercaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseList);
    }
}