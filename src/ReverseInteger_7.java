public class ReverseInteger_7 {
    public static void main(String[] args){
        System.out.println(new ReverseInteger_7().reverse(-2147483648 ));
    }

    public int reverse(int x) {
        long reversedNumber = 0;

        for (int count = x; count != 0; count /= 10){
            reversedNumber = reversedNumber * 10 + count % 10;
            if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE){
                return 0;
            }
        }

        return (int)reversedNumber;
    }
}
