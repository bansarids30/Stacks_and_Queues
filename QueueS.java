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
//Implement queue using two stacks
public class QueueS {
    Stack newStack = new Stack();
    Stack oldStack = new Stack();
    
    public void enqueue(int data){
      //any new entries that come in queue will be inserted into stack
      newStack.push(data);
    }
    
    public int dequeue(){
        
        int i=newStack.top;
        //add elements into old stack only if elements in old stack are empty
        if(oldStack.top == -1){            
            
            while(i != -1){
               
                int data = newStack.pop();
                oldStack.push(data);
                i--;
            }
                       
        }
        //pop element from old stack
        int num = oldStack.pop();
        return num;
    }
    public void display(QueueS q){
        if(q.oldStack.top != -1){
            q.oldStack.display();
        }
        if(q.newStack.top != -1){
            q.newStack.display();
        }
        System.err.println("");
    }
    
    public static void main(String ar[]){
        QueueS q = new QueueS();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(q);
        q.dequeue();
        q.display(q);
        q.enqueue(40);
        q.dequeue();
        q.display(q);
    }
}
