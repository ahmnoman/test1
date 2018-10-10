// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String test1 = "abjfii";
        String test2 = "ao9rhfm";
        String test3 = "";
       
        System.out.println(charisUnique(test1));
        System.out.println(charisUnique(test2));
        System.out.println(charisUnique(test3));

    }
    public static boolean charisUnique(String s)    {
        if (s.length() > 128)
            return false;
        Set<Character> charSet = new HashSet<>();
        for(char c: s.toCharArray()){
            if(charSet.contains(c))
                return false;
            charSet.add(c);
        }
        return true;
        
    }
}
