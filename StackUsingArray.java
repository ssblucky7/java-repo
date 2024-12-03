import java.util.Scanner;

public class StackUsingArray {
    // Constants
    private static final int MAX = 5; // Maximum size of the stack

    // Variables
    private int[] stack = new int[MAX];
    private int top = -1;

    // Push method to add an element to the stack
    public void push(int value) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow! Cannot push.");
        } else {
            stack[++top] = value;
            System.out.println("Value " + value + " pushed onto the stack.");
        }
    }

    // Pop method to remove the top element of the stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
        } else {
            System.out.println("Value " + stack[top--] + " popped from the stack.");
        }
    }

    // Display method to show all elements in the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform selected operation
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}