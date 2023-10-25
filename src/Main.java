

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Calculator myCalculator = new Calculator();

//        myCalculator.add(9,10);
        System.out.println("The addition is " + myCalculator.add(9,10) + ".");
        System.out.println("The subtraction is " + myCalculator.minus(20, 9) + ".");
        System.out.println("The multiplication is " + myCalculator.multiply(5, 7) + ".");
        System.out.println(myCalculator.divide(21, 2));
        System.out.println(myCalculator.sqrt(10100));
        System.out.println(myCalculator.exp(2, 3));
        System.out.println(myCalculator.cube(-11));

    }
}