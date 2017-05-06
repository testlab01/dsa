/*
Copyright 2017 prahveen29@gmail.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package arrays;

/**
 *
 * @author tomba
 */

/**
 * Consider LA is a linear array with N elements and K is a positive integer such
 * that K<=N. Following is the algorithm to delete an element available at the
 * Kth position of LA.
 * 
 */
public class arrayDelete {
    public static void main(String [] args){
        int LA[] = {1,3,5,7,8};
        int k = 3;
        
        System.out.println("Array values before Deletion ");
        
        //Print each element in the array LA
        for(int i = 0; i < LA.length; i ++){
            System.out.format("LA[%d] = %d \n", i, LA[i]);
        }
        
        int [] newArray = new int[LA.length - 1];
        int x = 0;
        int y = 0;
        while(y < LA.length){
            if(y == k){
                y++;
            }else{
                newArray[x] = LA[y];   
                x++;
                y++;
            }
        }
               
        LA = newArray;
        System.out.println("Array values After Deletion");
        //Print each element in the array LA
        for(int i = 0; i < LA.length; i ++){
            System.out.format("LA[%d] = %d \n", x, LA[i]);
        }
        
        
    }
}
