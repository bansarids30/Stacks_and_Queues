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
public class CircularQueue {
    private int head;
    private int tail;
    private int size;
    private int[] array;
    
    public CircularQueue(int size){
        this.size = size;
        this.head = 0;
        this.tail = 0;
        array = new int[this.size];
    }
    
    public void enqueue(CircularQueue Q, int x){
//        System.out.println("head ="+Q.head);
//        System.out.println("tail ="+Q.tail);
       if(Q.head == Q.tail + 1 || (Q.head == 0 && Q.tail == array.length)){
            System.out.println("overflow");
            return;
       }
       if(Q.tail == array.length){
           Q.tail = 0;
       }
       array[Q.tail] = x;
       Q.tail = Q.tail + 1;       
    }
    
    public int dequeue(CircularQueue Q){
        if(Q.head == Q.tail){
            System.out.println("underflow");
            return 0;
        }
        int x = array[Q.head];
        if(Q.head == array.length){
            Q.head = 1;
        }
        else{
            Q.head = Q.head + 1;
        }
        return x;
    }
    
    public void display(CircularQueue q){
        if(q.tail < q.head){
            for(int i = q.head;i < array.length; i++){
                System.out.print(" "+array[i]);
            }
            for(int i = 0;i < q.tail; i++){
                System.out.print(" "+array[i]);
            }
            System.out.println();
        }else{
            for(int i = q.head;i < q.tail; i++){
                System.out.println(array[i]);
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        CircularQueue q = new CircularQueue(10);
        q.enqueue(q, 2);
        q.enqueue(q, 3);
        q.enqueue(q, 5);
        q.enqueue(q, 6);
        q.enqueue(q, 9);
        q.enqueue(q, 13);
        q.enqueue(q, 32);        
        q.display(q);
        q.dequeue(q);
        q.dequeue(q);
        q.dequeue(q);
        q.dequeue(q);
        q.display(q);
        q.enqueue(q, 63);
        q.enqueue(q, 93);
        q.enqueue(q, 43);
        q.enqueue(q, 23);
        q.display(q);
    }
}
