package Model;

public class LinkedList{
    //Class variables for the Linked List
    private Node head;
    private int numNodes;

    public LinkedList() {
        this.head = null;
        this.numNodes = 0;
    }
	        	    

    public void addOrder(int value){        
        if(this.head == null){
            this.head = new Node(value);  
            numNodes++;
        }       
        else if(value <= this.head.getValue()){
            this.addAtHead(value);
        }
//        else if(value == this.head.getValue()){
//            Node temp = this.head;
//            this.head = new Node(value);
//            this.head.setLink(temp);
//        }
        else if(this.head.getValue() < value){           
            Node temp = this.head;
            Node last = this.head;
            Node aux = temp.getLink();
            Node aux2 = new Node(value);
            while(last.getLink() != null){
                last = last.getLink();
            }
            if(last.getValue() < value){
                last.setLink(new Node(value));
                numNodes++;
            }else{
                while(aux != null){
                    if(temp.getValue()< value && aux.getValue() >= value){
                        aux2.setLink(aux);
                        temp.setLink(aux2);
                        numNodes++;
                        break;
                    }
                    temp = temp.getLink();
                    aux = aux.getLink();
                }
            }
            
        }
//        this.printList();
    }                        
                      
    public void addAtHead(int dat){
	Node temp = this.head;
        Node aux = new Node(dat);

	aux.setLink(temp);
        this.head = aux;
	this.numNodes++;
        
    }
	
    public void addAtTail(int value){ 
        
        if(this.isEmpty()){
            this.head = new Node(value);
            this.numNodes++;
        } 
        else {
            Node temp = this.head;
            while(temp.getLink() != null){
                temp = temp.getLink();
            }
            temp.setLink(new Node(value));
            this.numNodes++;
        }
}
    
    public void deleteRep(){
        int counter=0;
       Node temp = this.head;       
       Node aux = temp.getLink();
       Node last = this.getLast();
//       if(last.getValue() == this.head.getValue()){
//           this.head.setLink(null);
//           numNodes = 1;
//       }       
       if(temp.getLink() != null){
           while(aux != null)
           {    
//               if(aux.getLink() == null && temp.getValue() == aux.getValue())
//               {
//                   temp.setLink(null);
//                   System.out.println("Entro si el ultimo y el penultimo son iguales");
//                   numNodes--;
//                   break;
//               }
               if(temp.getValue() == aux.getValue()){
                   while(temp.getValue() == aux.getValue() && aux.getLink() !=  null){
                       aux = aux.getLink();
//                       System.out.println("flag");
                       numNodes--;
                   }
//                   aux = aux.getLink();
                   if(aux.getValue() == temp.getValue()){
                       temp.setLink(null);
                       numNodes--;
                   } else {
                   temp.setLink(aux);
                   }
               }
               temp = temp.getLink();
               if(aux==null){                   
               break;
               } else {
               aux = aux.getLink();
               }
           }
       }
    }
    
    public LinkedList concat(LinkedList a, LinkedList b){
        LinkedList temp = new LinkedList();
        Node aux = a.getHead();
        Node aux2 = b.getHead();
        int x=0;
        
        for(int i=0;i<a.getSize();i++){
            x = aux.getValue();
            temp.addOrder(x);
            aux = aux.getLink();
        }
        
        for(int i=0;i<b.getSize();i++){
            x = aux2.getValue();
            temp.addOrder(x);
            aux2 = aux2.getLink();
        }
        
        return temp;
    }
       
    public Node getLast(){
        Node temp = this.head;
        while(temp.getLink() != null){
            temp = temp.getLink();
        }
        return temp;
    }
    
    public Node getHead(){
        return this.head;
    }
    
    public void printList(){
	System.out.println("Number of elements:"+ this.getSize());
	Node temp = this.head;
	while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.getLink();
        }
    }
	
    public int getSize(){   
	return this.numNodes;
    }
    
    public boolean isEmpty(){
        if(this.head == null)
            return true;
        else     
            return false;
    }
	     
}
