import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationOperations {
    public static int countOperations(List<Integer> p) {
        Set<Integer> visited = new HashSet<>();
        int counter = 0;
        for (int element : p) {
            if (!visited.contains(element)) {
                visited.add(element);
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        List<Integer> p = Arrays.asList(1, 3, 2);
        int count = countOperations(p);
        System.out.println(count);
        ;
    }
}