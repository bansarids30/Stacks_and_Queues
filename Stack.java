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
public class Stack {
    public int top;
    private int array[];
        
    public Stack(){
        array = new int[5];
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
    
    public void push(int data){
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
    public Stack sort(Stack s){
        Stack r = new Stack();
        while(!s.stackEmpty()){
            int temp = s.pop();
            while(!r.stackEmpty() && r.getTopElement() > temp)
                s.push(r.pop());
            r.push(temp);            
        }
        return r;
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.display();
        s.pop();
        s.display();
        Stack r = new Stack();
        r = r.sort(s);
        r.display();
        
    }
    
}
