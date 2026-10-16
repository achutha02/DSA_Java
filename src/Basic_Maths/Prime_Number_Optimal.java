package Basic_Maths;

public class Prime_Number_Optimal {
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i=2; i<= Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    static void main(String[] args) {

    }
}
