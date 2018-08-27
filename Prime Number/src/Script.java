
public class Script {
    

    public static void main(String args[]) {
        long i;
        long j;
        long k = 0;
        for (i = 3; i <= 9000000000000000000L; i++ ) {
            for (j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 0 ) {
                System.out.println(i);
            }
            k = 0;
            
        }
        
    }
}
