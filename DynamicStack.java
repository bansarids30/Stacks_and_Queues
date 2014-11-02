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
public class DynamicStack {
    public int top;
    private int array[];
    private int capacity;
        
    public DynamicStack(){
        capacity = 1;
        array = new int[capacity];
        top = -1;
    }
    
    public int getTopElement(){
        return this.array[top];
    }
    
    public boolean stackEmpty(){
        
        if(this.top == -1)
            return true;
        return false;
    }
    public void doubleStack(){
        
        int[] newArray = new int[capacity*2];
        System.arraycopy(this.array, 0, newArray, 0, capacity);
        this.capacity = capacity*2;
        this.array = newArray;
    }
    
    public void push(int data){
        if(top == capacity - 1)
            doubleStack();
        this.top = this.top + 1;
        array[this.top] = data;
    }
    
    public int pop(){
        if(stackEmpty()){
            System.out.println("Stack is empty, item could not be deleted..");
            return 0;
        }else{
            int num = array[this.top];
            this.top = this.top - 1;
            return num;
        }
    }
    public void display(){
        int i = this.top;
        while(i != -1){
            System.out.println(this.array[i]);
            i--;
        }
    }
    public static void main(String args[]){
        DynamicStack s = new DynamicStack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.display();
        s.pop();
        s.display();        
    }
    
}
