public class Stack {
    private int top = -1;
    private static int defaultSize = 10;
    private int[] stack;
    private int size;

    public Stack(int size) {
        this.stack = new int[size]; // Assign the array to the instance variable
        this.size = size; // Set the size
    }

    public Stack() {
        this(defaultSize);
    }

    void push(int value){
        top++;
        
    }
}
