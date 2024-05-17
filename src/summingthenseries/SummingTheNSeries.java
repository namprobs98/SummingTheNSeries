/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package summingthenseries;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class SummingTheNSeries {

    /**
     * @param args the command line arguments
     */
    //Ham tinh module cua tong
    public static int moduleOfSum(int n) {
        return (n * n) % 1000000007;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Doc input so luong test case
        System.out.print("Enter number of test case: ");
        int numberOfTestCase = sc.nextInt();
        sc.nextLine();
        int[] numbers = new int[numberOfTestCase];
        //Doc tung test case
        for (int i = 0; i < numberOfTestCase; i++) {
            numbers[i] = sc.nextInt(); sc.nextLine();
        }
        System.out.println("Output: ");
        for (int i = 0; i < numberOfTestCase; i++) {
            System.out.println(moduleOfSum(numbers[i]));
        }
    }

}
