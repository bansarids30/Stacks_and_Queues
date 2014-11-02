/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stacks_and_Queues;

/**
 *
 * @author Bansari
 */
public class LinkedQueue {
    public Node front;
    public Node rear;
    
    public LinkedQueue(){
        this.front = null;
        this.rear = null;
    }
    
    public boolean isEmpty(){
        return front ==null;
    }
    
    public void enqueue(int x){

       Node n = new Node(x);
       if(rear != null)
           rear.setNext(n);
       rear = n;
       if(front == null)
           front = rear;
    }
    
    public int dequeue(){
        int x;
        if(this.isEmpty())
            return 0;
        else{
            x = front.getData();
            front = front.getNext();
        }
        return x;
    }
    
    public void display(){
        Node ptr = this.front;
        while(ptr != rear){
            System.out.println(ptr.getData()+" ");
            ptr = ptr.getNext();
        }   
        System.out.println(ptr.getData()+" ");
    }
    public int size(){
        Node ptr = this.front;
        int count = 0;
        while(ptr != rear){
            count++;
            ptr = ptr.getNext();
        }   
        return count+1;
    }
    
    public void reverseQueueUsingStack(){
        Stack s = new Stack();
        while(!this.isEmpty())
            s.push(this.dequeue());
        
        while(!s.stackEmpty())
            this.enqueue(s.pop());
        
    }
    
    public static void main(String ar[]){
        LinkedQueue q = new LinkedQueue();
        q.enqueue(12);
        q.enqueue(23);
        q.enqueue(34);
        q.display();
//        q.dequeue();
//        q.display();
        System.out.println(q.size());
        q.reverseQueueUsingStack();
        q.display();
        
    }
}
