import java.util.ArrayList;

public class StackArray<T> implements Stack<T>{


        private ArrayList<T> stack = new ArrayList<>();

        @Override
        public void push(T item) {
            stack.add(0,item);
        }

        @Override
        public T pop() {
            return this.isEmpty()? null : stack.remove(0);
        }

        @Override
        public void peek() {
            if (this.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("The top element is "
                    + stack.get(0));

        }

        @Override
        public boolean isEmpty() {
            return stack.size()==0;
}

    @Override
    public String toString() {
        return "StackArray{" +
                "stack=" + stack +
                '}';
    }
}

}
