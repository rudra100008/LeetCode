import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
//        int result = 0;
//        for(int num: digits){
//            result = result*10+num;
//        }
        //if array has negative number than this will throw error
        StringBuilder s = new StringBuilder();
        for (int i : digits){
            s.append(i);
        }
        System.out.println("Result: "+s);
        //convert string s to BigInteger and add one and convert to String resultString
        java.math.BigInteger num = new java.math.BigInteger(s.toString());
        num = num.add(java.math.BigInteger.ONE);
        String resultString = num.toString();
        int[] finalResult = new int[resultString.length()];
        // In java character is represented by ASCII internally
        // So '0'-> 48,'1'->49,'2'->50,...,'7'->55
        for (int i=0;i<s.length();i++){
            finalResult[i] = resultString.charAt(i)-'0';
        }

        return finalResult;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println("digits: "+ Arrays.toString(digits));
        int[] output = plusOne.plusOne(digits);
        System.out.println("Output: "+Arrays.toString(output));
    }
}
