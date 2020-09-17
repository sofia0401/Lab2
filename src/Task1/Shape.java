package Task1;

import java.util.Scanner;
public class Shape {
    String type;
    int square;

    void setType(String type)
    {
        this.type=type;
    }
    String getType() {
        return type;
    }

    void setSquare(int square) {
        this.square = square;
    }
    int getSquare() {
        return square;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape geom=new Shape();
        String type=sc.next();
        int square=sc.nextInt();
        geom.setType(type);
        geom.setSquare(square);
        System.out.println(geom.getType());
        System.out.print(geom.getSquare());
    }
}
