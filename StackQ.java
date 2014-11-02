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

//in this algo we will make sure that one queue is always empty
public class StackQ {
    LinkedQueue newQueue = new LinkedQueue();//q1
    LinkedQueue oldQueue = new LinkedQueue();//q2
    
    public void push(int data){
        if(newQueue.isEmpty())
            oldQueue.enqueue(data);
        else
            newQueue.enqueue(data);
    }
    
    public int pop(){
        //Transfer n-1 elements to other queue and then dequeue the last element
        int i,size;
        if(!newQueue.isEmpty()){
            size = newQueue.size();
            i = 0;
            while(i<size-1){
                oldQueue.enqueue(newQueue.dequeue());
                i++;
            }
            return newQueue.dequeue();
        }else{
            size = oldQueue.size();
            i = 0;
            while(i<size-1){
                newQueue.enqueue(oldQueue.dequeue());
                i++;
            }
            return oldQueue.dequeue();
        }
    }
    public void display(){
        if(!oldQueue.isEmpty()){
            Node ptr = oldQueue.front;
            while(ptr != oldQueue.rear){
                System.out.println(ptr.getData()+" ");
                ptr = ptr.getNext();
            }   
            System.out.println(ptr.getData()+" ");
        }else if(!newQueue.isEmpty()){
            Node ptr = newQueue.front;
            while(ptr != newQueue.rear){
                System.out.println(ptr.getData()+" ");
                ptr = ptr.getNext();
            }   
            System.out.println(ptr.getData()+" ");
        }
        
    }
    public static void main(String ar[]){
        StackQ s = new StackQ();
        s.push(3);
        s.push(2);
        s.push(4);
        s.display();
        System.out.println("");
        s.pop();
        s.display();
        
    }
}
