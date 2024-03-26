public class implementation {
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }    
        }

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAt(int idx,int val){
            Node n = new Node(val);
            Node temp = head;

            if(idx == size()){
                insertAtEnd(val);
                return;
            }

            else if(idx == 0){
                insertAtHead(val);
                return;
            }

            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }

        void display(){
            
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                
                temp = temp.next;
            }
            System.out.println();
           
        }

        void deleteAt(int idx){
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        int getAt(int idx){
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }

        int size(){
            Node temp = head;
            int count = 0;
             while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }


    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);     
        ll.insertAtEnd(6);       
        ll.insertAtHead(11);
        ll.insertAtHead(12);
        ll.display();
        ll.insertAt(3,15);
        ll.display();
        ll.deleteAt(6);
        ll.display();
        System.out.println("Required data at index is " + ll.getAt(5));
    }
}
