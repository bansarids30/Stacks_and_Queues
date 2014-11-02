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
public class TwoStacksInOneArray {
    private int array[];
    private int size;
    private int topleft;
    private int topright;
    
    public TwoStacksInOneArray(int size){
        if(size < 2)
            System.out.println("Could not initialize, Size should be greater than 2");
        else{
            this.size = size;
            topleft = -1;
            topright = size; 
            array = new int[size];
        }
    }
    
    public void push(int stackId, int data){
        if(topright == topleft +1)
            return;
        if(stackId == 1){
           this.topleft = this.topleft + 1;
           array[this.topleft] = data; 
        }
            
        else if(stackId == 2)
            array[--topright] = data;
        else
            return;        
    }
    
    public int pop(int stackId, int data){
        if(stackId == 1){
            if(topleft == -1)
                return 0;
            int num = array[this.topleft];
            this.topleft = this.topleft - 1;
            return num;
        }else{
            if(topright == this.size)
                return 0;
            int num = array[this.topright];
            this.topright = this.topright + 1;
            return num;
        }
        
    }
    public int top(int stackId){
        if(stackId == 1){
            if(topleft == -1)
                return 0;
            
            return topleft;
        }else{
            if(topright == this.size)
                return 0;
            
            return topright;
        } 
    }
    public void display(){
        int i = this.topleft;
        int j = this.topright;
        System.out.println("Printing left array elements");
        while(i != -1){
            System.out.println(this.array[i]);
            i--;
        }
        System.out.println("Printing right array elements");
        while(j != (array.length)){
            System.out.println(this.array[j]);
            j++;
        }
        
    }
    public static void main(String args[]){
        TwoStacksInOneArray s = new TwoStacksInOneArray(10);
        s.push(1,2);
        s.push(1,3);
        s.push(1, 4);
        s.push(2, 12);
        s.push(2, 13);
        s.push(2,14);
        s.display();
    }
    
    
}
