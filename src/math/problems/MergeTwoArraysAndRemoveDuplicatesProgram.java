package math.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    public static void SortArray(int a[], int b[], int res[], int n, int m)
    {
        int i=0, j=0, k=0;
        while (i < n){
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            res[k] = b[j];
            j++;
            k++;
        }
        Arrays.sort(res);

    }

    static int removeDuplicates(int res[], int a){

        if(a == 0 || a ==1 ){
            return a;
        }

        int j= 0 ;
        for(int i= 0; i <a-1; i++ )
            if(res[i] !=res [i+1])
                res[j++]= res [i];
        res[j++] = res [a-1];

        return j;


    }



    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}


    public static void main(String[] args)
    {
        int a[] = {1,3,4};
        int b[] = {4,5,6,7,8};
        int n = a.length;
        int m = b.length;
        int res[] = new int[ n + m];
        SortArray(a, b, res, n, m);
        System.out.println("Sorted merged list");

        for (int i= 0 ; i < n+ m ;i++){
            System.out.println( " "+ res[i]);
        }

        //------------------------------------------

        int h = res.length;
        h =removeDuplicates(res, h);

        System.out.println("Printing element after removing duplicates");
        for (int i=0; i<h; i++){
            System.out.println (res[i]+" ");
        }



    }





}
