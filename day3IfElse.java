import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
    public class day2IfElse {
        
    }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==1){//ODD
            System.out.println("Weird");
        }else{//EVEN
            if(2 <=N && N<=5){
                System.out.println("Not Weird");   
            }else if(6 <=N && N<=20){
                System.out.println("Weird"); 
            }else if(N>20){
                System.out.println("Not Weird");