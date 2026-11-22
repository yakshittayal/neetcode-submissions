/// try again -> get, insert At Index, Delete At Index
class MyLinkedList {
    Node head;

   class Node {
    int val;
    Node next;

       public Node(int val) {
         this.val = val;
         next = null;
        }
    }  

    public MyLinkedList() {
        
    }
    
public int get(int index) {

    if(index < 0 || head == null){
        return -1;
    }

    Node curr = head;
    int temp = 0;

    while(temp < index && curr.next != null){
        curr = curr.next;
        temp++;
    }

    if(temp != index || curr == null){
        return -1;
    }

    return curr.val;
}
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {

        if(index<0){
            return;
        }

        if(head == null){
            if(index == 0){
                head = new Node(val);
                return;
            } else {
                return;
            }
        }

        if(index == 0){
            addAtHead(val);
            return;
        }
        
        Node curr = head;
        int temp = 0;
        Node newNode = new Node(val);
        while(temp < index - 1 && curr.next != null){
            curr = curr.next;
            temp++;
        }
        // Check if the requested index is within the linked list bounds
        if(!(temp == index - 1)){
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }
    
    public void deleteAtIndex(int index) {

        if(index < 0){
            return;
        }
        if(head == null){
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node curr = head;
        int temp = 0;
        while(temp < index-1 && curr.next!= null){
            curr = curr.next;
            temp++;
        }
        if((temp == index - 1 && curr.next != null)){
            curr.next = curr.next.next;
        } else{
            return;
        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:Node newNode = new Node(val);
 * MyLinkedList obj = new MyLinkedList();
 * int parif(index == 0){
            addAtHead(int val);
        }am_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */