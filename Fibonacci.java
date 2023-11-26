//Fibonacci series using for loop

public class Fibonacci {
  
public static void main(String[] args) {
    int n1 = 0;
    System.out.print(n1);
    int n2= 1;
    System.out.print(" "+n2);
    int temp = 0;
    for (int i=2 ; i<=10 ; i++){
        temp = n1+n2;
        System.out.print(" "+temp);
        n1 = n2;
        n2 = temp;

    } 
}
}

