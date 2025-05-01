public class RomanIntoIntegers {
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public int romanToInt(String s){
        int current = 0;
        int prev = 0 ;
        int number = 0;
        if(s == null || s.isEmpty()){
            return -1;
        }
        for (int i = s.length()-1;i>=0;i--){
            current = getValue(s.charAt(i));
            if(current >= prev){
                number += current;
            }else{
                number  -= current;
            }
            prev = current;
        }
        return number;
    }
    private  int getValue(char a){
        switch (a){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static void main(String[] args){
        RomanIntoIntegers romanIntoIntegers = new RomanIntoIntegers();
        String s = "III";
        int output = romanIntoIntegers.romanToInt(s);
        if (output == 0){
            System.out.println("Output: Invalid");
        }else if( output == -1){
            System.out.println("Output: Roman number is empty");
        }
        else {
            System.out.println("Output: " + output);
        }

    }
}
