package com.practice.ds.recursion;

public class CheckIfArrayIsSorted {

    public static void main(String arg[]){
        int input1[] = {2,4,8,9,9,15};
        System.out.println(isSorted(input1,0,input1.length));

        int input2[] = {2,4,8,9,9,1};
        System.out.println(isSorted(input2,0,input2.length));

        int input3[] = {2};
        System.out.println(isSorted(input3,0,input3.length));

        int input4[] = {};
        System.out.println(isSorted(input3,0,input4.length));
    }

    private static boolean isSorted(int[] input1,int si, int length) {
        if(si>=length-1){
            return true;
        }
        if(input1[si] > input1[si+1]){
            return false;
        }
        return isSorted(input1,si+1,length);
    }
}
