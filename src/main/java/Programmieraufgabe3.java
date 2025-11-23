public class Programmieraufgabe3 {

    public static double cP(double sideLength) {
        if (sideLength < 0) {
            System.out.println("Negative Kantenlängen sind nicht möglich");
            return -1;
        }
        double perimeter = 4 * sideLength;
        System.out.println("Der Umfang von einem Quadrat mit den Kantenlängen "
                           + sideLength + " beträgt " + perimeter);
        return perimeter;
    }
    
    public static double cP(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Negative Kantenlängen sind nicht möglich");
            return -1;
        }
        double perimeter = 2 * (length + width);
        System.out.println("Der Umfang von einem Rechteck mit den Kantenlängen "
                           + length + " und " + width + " beträgt " + perimeter);
        return perimeter;
    }

    public static void main(String[] args) {
        cP(5);
        cP(3, 4);
        cP(-2);
    }
}
