class Solution {
    public int reverse(int x) {
       int reverse = 0;
        while (x!=0) {
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        
         if ((reverse > Integer.MAX_VALUE) || (reverse < Integer.MIN_VALUE))   {
            return 0;
        } 
        return reverse;
        
        
    }
}

/*import java.util.scanner;
class Solution {
    public static void main (String args[]) {        
        Scanner scan = new Scanner (System.in);
        System.out.println (scan.nextLine());
    }
}*/

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution().reverse(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}