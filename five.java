// Q5. Join Strings with Comma
// Join all strings in a list using a comma as a delimiter.

// Input: ["Java", "Python", "C++"]
// Output: "Java,Python,C++"

public class five {
    public static void main(String[] args)
    {
        String[] languages = {"Java", "Python", "C++"};

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < languages.length; i++)
        {
            result.append(languages[i]);
            if(i < languages.length - 1)
            {
                result.append(",");
            }
        }

        System.out.println(result.toString());
    }
}
