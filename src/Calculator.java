

public class Calculator {

//    public Calculator() {
//
//    }

    public double add(double a, double b){
        return (a + b);
//        int sum = a + b;
//        System.out.println("The sum is " + sum + ".");
    }

    public double minus(double a, double b){
        return (a - b);
    }

    public double multiply(double a, double b){
        return (a * b);
    }

    public double divide(double a, double b){
        return (a/b);
    }

    public double square(double a){
        return a*a;
    }

    public double cube(double a){
        return a*a*a;
    }

    public double exp(double a, int b){
        if (b == 0){
            if (a != 0) {
                return 1;
            }
            return 0;
        }
        if (b == 1){
            return a;
        }
        double c = a;
        for (int i = 0; i < (b-1); i++){
            c *= a;
        }
        return c;
    }
    public double sqrt(double a){
        double i, j;
        if (a < 0){
            return 0;
        }
        for (i = 0; i < 2147483647 && a >= 0; i += 0.1){
//            for (j = 0; j < 1; j += 0.1) {
////                if (i * i <= a){
////                    continue;
////                }
//                System.out.println(j);
                if ((i * i) > a){
                    break;
//                }
//            System.out.println(i);
            }
        }

//        int precision;
        int scale = (int) Math.pow(10, 3);
        System.out.println("scale: " + scale);
        System.out.println("i times scale: " + (i * scale / scale));
        double p = (i * scale) / scale;
        double d = Math.round(p);
//        System.out.println(); // sout + "tab"

//        java.text.DecimalFormat df = new java.text.DecimalFormat("#.#");
//        df.format(d);
//        double d = Math.round(i * scale) / scale;

//        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
//        df.format(i);
//        Math.round(d);
        return d;
//        return (i - 0.1);
    }
}
