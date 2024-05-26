class MinStack {
    private Node head;

    private class Node {
        int value;
        int min;
        Node next;

        Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x, null);
        } else {
            head = new Node(x, Math.min(x, head.min), head);
        }
    }

    public void pop() {
            head = head.next;
    }

    public int top() {
            return head.value;
    }

    public int getMin() {
            return head.min;
    }
}
