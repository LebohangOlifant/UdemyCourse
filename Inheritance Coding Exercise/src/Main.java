public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall(5,4);
        System.out.printf("Area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("\nWidth = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());
    }
}