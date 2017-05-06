package array;
import java.util.Arrays;

/** 
Copyright 2017 prahveen29@gmail.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
* 
http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
* 
* @author Tomba
**/

/**
* Let LA be a Linear Array (unordered) with N elements and K is a 
* positive integer such that K<=N. 

* when ->
* LA[]  = {1,3,5,7,8};
* Kth possession is 3
*
* Do ->
* Insert item in 3rd possession is 10
 **/

public class arrayInsert {
    public static void main(String[] args) {
        
        int [] LA = {1,3,5,7,8};
        int item = 10, k = 3;
        
        System.out.println("Array values before Insert ");
        
        //Print each element in the array LA
        for(int i = 0; i < LA.length; i ++){
            System.out.format("LA[%d] = %d \n", i, LA[i]);
        }
        
        //Insert tem value in Kth postion
        int [] newArray = Arrays.copyOf(LA, 6);
        int i= LA.length;
        while(i > 0){
            if(i > k){
                newArray[i] = LA[i - 1];
            }else if(i == k) {
                newArray[i] = item;
            }
            i--;
        }
        /* print array in oneline code
            System.out.println(Arrays.toString(newArray));
        */
        
        System.out.println("Array values After Insert ");
        //Print each element in the array newArray
        for(int x = 0; x < newArray.length; x ++){
            System.out.format("LA[%d] = %d \n", x, newArray[x]);
        }
    }
}
