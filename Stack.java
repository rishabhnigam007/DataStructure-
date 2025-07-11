import java.util.Scanner;

class Stack {
    public int size;
    private int top;
    private int stack[];

    Stack(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    boolean isFull() {
        return top == stack.length - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean push(int x) {
        if (!isFull()) {
            top = top + 1;
            stack[top] = x;
            return true;
        } else {
            return false;
        }
    }

    int pop() {
        return stack[top--];
    }

    void display() {
        System.out.println("one pop element is :" + pop());
        System.out.println("stack element is :");
        for (int i = 0; i < size; i++)
            System.out.print(stack[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the stack :");
        int size = sc.nextInt();
        int i;
        Stack s = new Stack(size);
        System.out.println("enter stack element :");
        for (i = 0; i < size; i++) {
            int x = sc.nextInt();
            s.push(x);
        }
        s.display();
        sc.close();
    }
}
/*
output:
enter the size of the stack :
4
enter stack element :
1
3
5
7
one pop element is :7
stack element is :
1 3 5 7
 */