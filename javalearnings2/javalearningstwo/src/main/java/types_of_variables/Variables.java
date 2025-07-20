package types_of_variables;

public class Variables implements ITopics {

    @Override
    public void firstDemo() {
        // TODO Auto-generated method stub
        int age = 25;

        String name = "Ariel Abelgas";

        double sweldo = 50000.00d;

        System.out.println("Age :" + age);
        System.out.println("Name :" + name);
        System.out.println("My Sweldo :" + sweldo);
    }

    @Override
    public void InitializingVariable() {
        // Demonstrating ug unsaon pag initialize sa data sa lain2 type sa data
        // mag declare ug initialize sa variables

        // Initialize float variable
        float si = 5.5f;

        // Initialize integer variables
        int t = 10;
        int s = 20;

        // Initialize character variable
        char cha = 'K';

        // Pag display sa mga values
        System.out.println("float si :" + si);
        System.out.println(String.format("int t %d and s %d", t, s));
        System.out.println(String.format("Character : %s", cha));

    }

    @Override
    public void VariableDeclaration() {
        // Demonstarting how to declare and use a variable in Java

        // Integer variable
        int age = 25;

        // String variable
        String name = "Ariel loves Java";

        // Double variable
        double salary = 500000.50d;

        // Display the values of variable
        System.out.println(String.format("Name : %s, Age : %d, Salary %.2f\n", name, age, salary));
    }

    @Override
    public void Local_Variables() {

        // Declared a Local Variable
        int var = 10;

        // This variable is local to this main metohd only
        System.out.println(String.format("Local variable : %d", var));
    }

    @Override
    public void Local_Variables2() {
        // Java Program to show use of Local Variables

        // x is a local variable
        int x = 10;

        // message is also a local variable
        String message = "Hello world";

        System.out.println(String.format("x = %d, message %s", x, message));

        if (x > 5) {
            // result is a local variable
            String result = "x is greater than 5";
            System.out.println(result);
        }

        // Uncommenting this line below will result in a compile-time error
        // System.out.println(result);

        for (int i = 0; i < 3; i++) {
            String loopMessage = "Iteration " +
                    i; // Loopmessage is a local variable
            System.out.println(loopMessage);
        }

        // Uncommenting the line below will result in a
        // compile-time error
        // System.out.println(loopMessage);
    }

}
