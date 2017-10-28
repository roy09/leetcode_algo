public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)){
            return false;
        }
        int reversedNumber = 0;
        for (int count = x; count != 0; count /= 10){
            reversedNumber = reversedNumber * 10 + count % 10;
        }

        if (x == reversedNumber || (x / 10) == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        if(new PalindromeNumber_9().isPalindrome(10)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }

        System.out.println(105%10);
    }
}
