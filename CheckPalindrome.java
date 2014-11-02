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
public class CheckPalindrome {
    public boolean isPalindrome(int arr[],int data){
        DynamicStack d = new DynamicStack();
        int i = 0;
        while(arr[i] != data){
            d.push(arr[i]);
            i++;            
        }
       i++;
        while(i!=arr.length){
            if(arr[i] != d.pop()){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String ar[]){
        CheckPalindrome cp = new CheckPalindrome();
        int arr[] = {1,2,3,4,10,4,3,2,1};
        System.out.println(cp.isPalindrome(arr, 10));
    }
}
