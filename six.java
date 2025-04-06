import java.util.*;

public class six {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 1));
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        ArrayList<Integer> result = new ArrayList<>(uniqueNumbers);
        System.out.println("Unique numbers: " + result);
    }    
}
