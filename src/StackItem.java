public class StackItem {

    private T data  ;
    private



        private Object item;
        private StackItem next;

        public StackItem() {

        }

        public StackItem(T item) {
            this.item = item;
        }

        public StackItem(Object item, StackItem next) {
            this.item = item;
            this.next = next;
        }

        public Object getItem() {

            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public StackItem getNext() {
            return next;
        }

        public void setNext(StackItem next) {
            this.next = next;

        }

    @Override
    public String toString() {
        return "StackItem{" +
                "data=" + data +
                ", item=" + item +
                ", next=" + next +
                '}';
    }
}

}
