import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        // add your code here
        System.out.println("Enter x:");
        int x = scanner.nextInt();

        System.out.println("Enter y:");
        int y = scanner.nextInt();

        Circle circle16 = new Circle(new Point(x, y), 16.0);
        Circle circle40 = new Circle(new Point(14, 12), 40.0);

        boolean intersects = circle16.intersects(circle40);
        System.out.println(intersects);

        scanner.close();

    }
}