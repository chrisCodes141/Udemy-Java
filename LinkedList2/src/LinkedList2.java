public class LinkedList2 {
    public static void main(String[] args) {
        //THIS IS MANUALLY!!!!!!!
        //IDEALLY you would want to have classes automate this process

        //creating the Node Objects (boxes)
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);

        //assigning the reference to next noe
        nodeA.next = nodeB;
        nodeB.next = nodeC;
    }
}
