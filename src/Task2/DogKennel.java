package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
    ArrayList<Dog> dogs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("How many dogs do you want to add?");
    int n;
    n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            dogs.add(new Dog(sc.next(), sc.nextInt()));
        }
    }
}






