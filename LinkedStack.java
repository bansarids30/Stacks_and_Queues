/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stacks_and_Queues;

import java.util.EmptyStackException;

/**
 *
 * @author Bansari
 */
public class LinkedStack {
    private Node top = null;
    
//    public LinkedStack(){
//        this.top = new Node();
//    }
    
    public void push(int data){
        if(top == null)
            top = new Node(data);
//        else if(top.getData() == 0)
//            top.setData(data);
        else{
            Node n = new Node(data);
            n.setNext(this.top);
            this.top = n;
        }            
    }
    
    public int pop(){
        if(top == null)
            throw new EmptyStackException();
        else{
            int data = top.getData();
            top = top.getNext();
            return data;
        }            
    }
    
    public int top(){
        if(this.top == null)
            return 0;
        else
            return top.getData();
    }
    
    public boolean isEmpty(){
        return (this.top == null);
    }
    
    public void deleteStack(){
        this.top = null;
    }
    
    public void display(){
        if(top == null)
            return;
        Node ptr = top;
        while(ptr.getNext() != null){
            System.out.println(ptr.getData()+" ");
            ptr = ptr.getNext();
        }
        System.out.println(ptr.getData()+" ");
            
    }
    public static void main(String ar[]){
        LinkedStack s = new LinkedStack();
         
        s.push(2);
        s.push(4);
        s.push(1);
        s.push(5);
        s.push(1);
        s.display();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.pop());
        System.out.println("");
        s.display();
    }
}
