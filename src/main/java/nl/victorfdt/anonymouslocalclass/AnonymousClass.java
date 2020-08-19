package nl.victorfdt.anonymouslocalclass;

import nl.victorfdt.utils.Exercise;

public class AnonymousClass implements Exercise {

    public void execute() {

        // Create an anonymous class and provide its implementation.
        // Even though Sales is an Interface, I must use new to declare its implementation.
        Sales sales = new Sales() {
            public void toSell() {
                System.out.println("Make the selling");
            }
        };
        sales.toSell();

        // Create an anonymous class using lambdas.
        Sales salesLambda = () -> {
            System.out.println("Make the selling via Lambda");
        };
        salesLambda.toSell();

        // Creating an anonymous class in the parameter
        int result = sum(1, new Sales() {

            public void toSell(){
                // I must implement this method.
            }
            public int returnNumber() {
                return 3;
            }
        });

        System.out.println(result);
    }

    private int sum(int number1, Sales sales) {
        return number1 + sales.returnNumber();
    }
}
