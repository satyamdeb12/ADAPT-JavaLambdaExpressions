package ADAPT.LambdaExpressions;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Printed inside Runnable");
            }
        });
        myThread.run();

        Thread myLambdaThread = new Thread(()->System.out.print("\nPrinted inside Lambda Runnable"));
        myLambdaThread.run();
    }
}
