package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
    ArrayList<Dog> dogs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            dogs.add(new Dog(sc.nextLine(), sc.nextInt()));
        }
    }
}








//    public static void main(String[] args) {
//        DogKennel a = new DogKennel();
//        a.addDog();
//    }

//            for (int i = 0; i < 4; i++) {
//                String name = sc.nextLine();
//                int age = sc.nextInt();
//                dogs.add(new Dog(super.name,super.age));
//            }







