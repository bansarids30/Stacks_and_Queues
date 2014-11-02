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
public class ReverseStack {
    
    public void reverseStack(Stack s){
        if(s.stackEmpty())
            return;
        int temp = s.pop();
        reverseStack(s);
        insertAtBottom(s,temp);                
    }
    public void insertAtBottom(Stack s, int data){
        if(s.stackEmpty()){
            s.push(data);
            return;            
        }
        int temp = s.pop();
        insertAtBottom(s, data);
        s.push(temp);
    }
    public static void main(String ar[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        ReverseStack r = new ReverseStack();
        r.reverseStack(s);
        s.display();
    }
}
