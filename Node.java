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
public class Node {
    private int data;
    private Node next;
    
    public Node(){
        data = 0;
        next = null;
    }
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    
    public void setNext(Node n){
        next = n;
    }
    
    public void setData(int data){
        this.data = data;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public int getData(){
        return this.data;
    }
    
}
