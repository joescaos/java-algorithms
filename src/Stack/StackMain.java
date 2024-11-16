package Stack;

public class StackMain {

    public static void main(String[] args){
        Stack<Integer> myStack = new Stack<Integer>();


        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.peek());

        myStack.push(4);

        System.out.println("now is: " + myStack.peek());
        System.out.println("item removed: " + myStack.pop());
        System.out.println("now: is: "+ myStack.peek());



    }
}
