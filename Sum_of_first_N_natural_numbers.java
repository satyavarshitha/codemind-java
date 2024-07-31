import java.util.Scanner;
public class SumOfnNaturalNumbers {
    public static void main(String[] args){
    int sum,n;
        Scanner read = new Scanner(System.in);
        n=read.nextInt();
        sum =n*(n+1)/2;
        System.out.println(sum);
  }
}
