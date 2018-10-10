// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("After replacement: " + urlify("My Name"));
        System.out.println(urlify("Hello World !"));
        System.out.println("Hello World!");    
    }  
    public static String urlify(String s){
        return s.replace(" ", "%20" );
    }
}