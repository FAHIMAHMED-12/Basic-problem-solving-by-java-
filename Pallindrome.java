// A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.

public class Pallindrome {

    public static int reverseNumber(int num){
        int reverse = 0;
        while (num!=0) {
            int lastDigit= num%10;
            reverse = reverse*10+lastDigit;
            num = num/10;

        }
        System.out.println("Reversed number: "+reverse);
        return reverse;


    }

    public static void palindromeCheck(int number){

        if (reverseNumber(number)==number){
            System.out.println("The number is pallindrome");
        }
        else{
            System.out.println("The number is not pallindrome");
        }
    }

    public static void main(String[] args) {
        palindromeCheck(2552);
    }
    
    
}
