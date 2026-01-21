import  java.util.Scanner;
public class intIntoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        String s=" hello "+n;
        System.out.println(s);

    }
}
