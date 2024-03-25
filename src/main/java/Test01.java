import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    public int solution(int[] A){
        int numberSmallest = 1;
        List<Integer> shortList = Arrays.stream(A).boxed().distinct().collect(Collectors.toList());
        Collections.sort(shortList);

        for (Integer integer : shortList) {
            int number = integer.intValue();
            if(number >= numberSmallest) {
                numberSmallest++;
            } else if(number < numberSmallest && number > 0) {
                return numberSmallest;
            }
        }
        return numberSmallest;
    }

    public static class Main {
    }
}
