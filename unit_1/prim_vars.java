public class prim_vars {
    public static void main(String args[]) {
        System.out.println("Demonstration of the primative variables, operations, and casting");

        int x = 10;
        double y = 5.55;

        int x_int = (int)(x + y);
        double y_int = x + y;

        // System.out.println("Demonstration of casting and addition");
        System.out.println("int x_int = (int)(x + y) " + x_int);
        System.out.println("double y_int = x + y " + y_int);

        int foo = 2321;
        int claire = 1293;

        int combined_cf = foo * claire;
        double _combined_cf = foo * claire;

        System.out.println("int vs double: " + combined_cf + " and " + _combined_cf);

    }
}