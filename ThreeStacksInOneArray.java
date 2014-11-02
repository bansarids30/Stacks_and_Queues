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
//we will keep four information
//1.Top index of first stack
//2.Top index of second stack
//3.Base of middle stack
//4.Top index of middle stack
public class ThreeStacksInOneArray {
    private int array[];
    private int size;
    private int topleft;
    private int topright;
    private int topmiddle;
    private int basemiddle;
    
    public ThreeStacksInOneArray(int size){
        if(size < 2)
            System.out.println("Could not initialize, Size should be greater than 2");
        else{
            this.size = size;
            topleft = -1;
            topright = size; 
            basemiddle = size/2;
            topmiddle = basemiddle - 1;
            array = new int[size];
        }
    }
    
    public void push(int stackId, int data){
        if(stackId == 1){
            if(topleft+1 == basemiddle){
                if(stack3RightShiftable()){
                    shiftStack3Right();
                    array[++topleft] = data;
                }else
                    return;
            }else{
                array[++topleft] = data;
            }    
        }else if(stackId == 2){
            if(topright-1 == topmiddle){
                if(stack3LeftShiftable()){
                    shiftStack3Left();
                    array[--topright] = data;
                }else
                    return;
            }else{
                array[--topright] = data;
            }
        }else if(stackId == 3){
                if(topmiddle == topright - 1){
                    if(stack3LeftShiftable()){
                    shiftStack3Left();
                    array[++topmiddle] = data;
                }else
                    return;
            }else{
                array[++topmiddle] = data;
            }
        }else
            return;
    }
    
    
    public int pop(int stackId, int data){
        if(stackId == 1){
            if(topleft == -1)
                return 0;
            int num = array[this.topleft];
            this.topleft = this.topleft - 1;
            return num;
        }else if(stackId == 2){
            if(topright == -1)
                return 0;
            int num = array[this.topright];
            this.topright = this.topright + 1;
            return num;
        }else if(stackId == 3){
            if(topmiddle == basemiddle)
                return 0;
            int num = array[topmiddle];
            if(topmiddle>basemiddle)
                topmiddle = topmiddle -1;            
        }
        return 0;
        
    }
    public int top(int stackId){
        if(stackId == 1){
            if(topleft == -1)
                return 0;
            
            return array[topleft];
        }else if(stackId == 2){
            if(topright == this.size)
                return 0;            
            return array[topright];
        }else{
            if(topmiddle == basemiddle){
                return 0;
            }
            return array[topmiddle];
        }
    }
    public void display(){
        int i = this.topleft;
        int j = this.topright;
        int k = this.basemiddle+1;
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
        System.out.println("Printing middle array elements");
        while(k<topmiddle+1){
            System.out.println(this.array[k]);
            k++;
        }        
    for(int m=0;m<array.length;m++){
           System.out.println(" "+this.array[m]);
        }
    }    

    private boolean stack3LeftShiftable() {
        return topleft+1 <basemiddle;
    }

    private void shiftStack3Left() {
        for(int i = basemiddle;i<=topmiddle;i++){
            array[i] = array[i+1];
        }
        topmiddle--;
        basemiddle--;
    }

    private boolean stack3RightShiftable() {
        return topmiddle+1<topright;
    }

    private void shiftStack3Right() {
        for(int i = topmiddle + 1;i>=basemiddle;i--){
            array[i] = array[i-1];
        }
        topmiddle++;
        basemiddle++;
    }
    
    public static void main(String args[]){
        ThreeStacksInOneArray s = new ThreeStacksInOneArray(10);
        s.push(1,2);
        s.push(1,3);
        s.push(1, 4);
        
        s.push(2, 12);
        s.push(2, 13);        
        s.push(2,14);
        
        s.push(3, 22);
        s.push(3, 23);
        s.push(3,24);
        
        s.display();
    }
}
