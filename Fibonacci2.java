
//using recursion

public class Fibonacci2 {
public static int n1 = 0;
public static int n2 = 1;
public static int temp = 0;
    
public static void fibonacciSeries(int count){
    int i =0;
    while (i<count) {
    temp = n1+n2;
    n1=n2;
    n2=temp;
    System.out.print(" "+temp);
    i++; 
    }
    

}

public static void main(String[] args) {
    System.out.print(n1+" "+n2);
    fibonacciSeries(10);
}
}
