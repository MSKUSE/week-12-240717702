public class StackLinkedList <T>
        implements  Stack <T>{


        StackItem <T>top;


        @Override
        public void push(T item) {
            StackItem<T> newBox = new StackItem <T>(item)
          StackItem<T> previous_top = top;
            top.setNext(previous_top);
        }

        @Override
        public T pop(){ //throws MyEmptyStackException {
            if (top==null) {
                // throw new MyEmptyStackException("Stack is empty ");
            }
            T tempData = top.getData();
            top = top.getNext();
            return tempData ;
        }

        @Override
        public void peek() {
            System.out.println("the top is "+ top.getItem());
        }

        @Override
        public boolean isEmpty() {
            return this.top =null;
        }
        public void displayStack();
    {
        if (this.top==null) {
            System.out.println("THIS STACK IS EMPTY");
        }else{
           StackItem<T>  tempNode =top;
           while (tempNode!=null){
               System.out.println(tempNode.getData);
               tempNode = tempNode.getNext();

           }
    }


    @Override
    public String toString() {
        return "StackLinkedList{" +
                "top=" + top +
                '}';
    }
}

}
