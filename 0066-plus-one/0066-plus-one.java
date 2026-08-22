import java.math.BigInteger; // Required for BigInteger
import java.util.ArrayList; 
class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> digit = new ArrayList<>();
        BigInteger a = BigInteger.ZERO ;
        int j = 0;
        for(int i = 0 ; i<digits.length;i++){
            int b = digits[i];
            a=a.multiply(BigInteger.TEN).add(BigInteger.valueOf(b));
            System.out.println(a);  
        }
        System.out.println(a);
        a=a.add(BigInteger.ONE);
        System.out.print(a);
        while(a.compareTo(BigInteger.ZERO)>0){
            BigInteger[] divAndRem = a.divideAndRemainder(BigInteger.TEN);
            
            int b = divAndRem[1].intValue(); // This is your 'a % 10'
            digit.add(0, b);                 // Insert at the front
            
            a = divAndRem[0]; 
        }  
        int[] out =new int[digit.size()];
        for(int i = 0 ; i<digit.size();i++){
            out[i]=digit.get(i);
        }

        return out;
    }
}