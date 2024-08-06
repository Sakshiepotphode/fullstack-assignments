import java.util.Scanner;

public class StackDemo {

    int top = -1, val;
    int size = 5;
    int[] stk = new int[5];

    void push(int value) {
        if (isFull() == 1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stk[top] = value;
            display();
        }
    }

    void display(){
        if(isEmpty()==1)
        {
            System.out.println("Stack is Empty");
        }
        else{
            for(int i=0;i<=top;i++)
            {
                System.out.println(""+stk[i]);
            }
        }
    }

    void pop() {
        if(isEmpty()==1){
            System.out.println("Stack is Empty");
        }
        else{
            top--;
            display();
        }
    }

    int isEmpty() {
        if (top < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    int isFull() {
        if (top == size) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String ch1="y";
        int ch2;
        StackDemo sd = new StackDemo();
        while(ch1.equals("y"))
        {
            System.out.println("1. Push \n2. Pop \n3.Print");
            java.util.Scanner sc = new Scanner(System.in);
            System.out.println("Enter Choice: ");
            ch2 = sc.nextInt();

            switch (ch2) {
                case 1:
                   {
                    int v;
                    System.out.println("Enter Value to push in stack: "); 
                    v = sc.nextInt();
                    sd.push(v);
                    break;
                   }
                case 2:
                {
                    sd.pop();
                    break;
                }
                case 3:
                {
                    sd.display();
                    break;
                }
                default:
                {
                    System.out.println("Wrong choice..!");
                    break;
                }
            }
        System.out.println("Do you wish to perform operations again?(n/y): ");
        ch1 = sc.next();
        }
    }

}