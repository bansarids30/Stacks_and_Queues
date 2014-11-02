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
// get minimum element from stack in O(1) time
public class AdvancedStack extends Stack{
    private Stack mainStack = new Stack();
    private Stack minStack = new Stack();
    
    public void push(int data){
        mainStack.push(data);
        if(minStack.stackEmpty() || minStack.getTopElement() >= data)
            minStack.push(data);
//        else
//            minStack.push(minStack.getTopElement());
    }
    public int pop(){
        if(mainStack.stackEmpty())
            return 0;
        if(minStack.getTopElement() == mainStack.getTopElement())//
            minStack.pop();
        return mainStack.pop();
    }
    public int getMinimumElement(){
        return minStack.getTopElement();
    }
    public int top(){
        return mainStack.getTopElement();
    }
    public boolean isEmpty(){
        return mainStack.stackEmpty();
    }
    
    public static void main(String ar[]){
        AdvancedStack s = new AdvancedStack();
        s.push(2);
        s.push(4);
        s.push(1);
        s.push(5);
        s.push(1);
        System.out.println(s.getMinimumElement());
        //s.mainStack.display();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.getMinimumElement());
    }
}
