// Q12. Employee Name Initial Map
// Return a map where the key is the first character of employee names, and the value is a list of names starting with that character.

// Input: ["Alice", "Andrew", "Bob"]
// Output: {A=[Alice, Andrew], B=[Bob]}
import java.util.*;
public class twelve {
    public static void main(String[] args)
    {
        String[] employees = {"Alice", "Andrew", "Bob"};
        Map<Character, List<String>> nameMap = new HashMap<>();

        for (String name : employees) {
            char initial = name.charAt(0);
            nameMap.putIfAbsent(initial, new ArrayList<>());
            nameMap.get(initial).add(name);
        }

        System.out.println("Employee Name Initial Map: " + nameMap);
    }
}
