package inflearn.section7;

class Node {
    int val;
    Node lt;
    Node rt;

    public Node(int val) {
        this.val = val;
    }
}

public class Ex7_5 {

    public void DFS(Node node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        DFS(node.lt);
        DFS(node.rt);
    }

    public static void main(String[] args) {
        Ex7_5 ex = new Ex7_5();
        Node node = new Node(1);
        node.lt = new Node(2);
        node.rt = new Node(3);
        node.lt.lt = new Node(4);
        node.lt.rt = new Node(5);
        node.rt.lt = new Node(6);
        node.rt.rt = new Node(7);
        ex.DFS(node);
    }
}
