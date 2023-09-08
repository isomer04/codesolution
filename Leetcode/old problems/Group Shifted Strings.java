import static java.util.stream.Collectors.toList;

public class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        return Arrays.stream(strings)
            .collect(Collectors.groupingBy(this::normalize))
            .values()
            .stream()
            .collect(toList());
    }
    
    private List<Integer> normalize(String s) {
        return s.chars()
            .mapToObj(
                c -> (c - s.charAt(0) + 26) % 26
            )
            .collect(toList());
    }
}