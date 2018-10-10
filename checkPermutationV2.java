// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String s1 = "god";
        String s2 = "dog";
        String s3 = "hog";
        String s4 = "go";
        System.out.println(checkPermutation(s1,s2));
         System.out.println(checkPermutation(s1,s3));
        System.out.println(checkPermutation(s3,s4));
        System.out.println(checkPermutation(s1,s4));
    }
    
    public static boolean checkPermutation(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        int[] letters = new int[128];
        for (int i = 0; i < s.length(); i++){
            letters[s.charAt(i)]++;
        }
        for (int i = 0; i<t.length(); i++){
            letters[t.charAt(i)]--;
             if (letters[t.charAt(i)] < 0){
                 return false;
             }
        }
        return true;
    }
}