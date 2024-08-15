package pdp.uz.fidobiznesstaskismoiljonovabdulaziz;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class Main {

    static Scanner sc = new Scanner(System.in);

    static int[] arr = new int[3];

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number " + i + ":");
            arr[i] = sc.nextInt();
        }

        Arrays.stream(arr).unordered().forEach(System.out::println);
    }

}
