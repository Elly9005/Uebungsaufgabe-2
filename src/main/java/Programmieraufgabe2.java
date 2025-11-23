public class Programmieraufgabe2 {

    public static void main(String[] args) {
        calculate(1, 1, "sum");
        calculate(5, 2, "quotient");
        calculate(10, 4, "difference");
        calculate(3, 3, "plus");         
        calculate(7, 0, "quotient"); 
    }

    public static void calculate(int num1, int num2, String op) {
        if (op.equals("sum")) {
            double ergebnis = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + ergebnis);

        } else if (op.equals("difference")) {
            double ergebnis = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + ergebnis);

        } else if (op.equals("product")) {
            double ergebnis = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + ergebnis);

        } else if (op.equals("quotient")) {
            if (num2 == 0) {            
                System.out.println("Division durch 0 nicht erlaubt.");
                return;
            }
            double ergebnis = (double) num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + ergebnis);

        } else {
            System.out.println("Unbekannte Operation");
        }
    }
}
