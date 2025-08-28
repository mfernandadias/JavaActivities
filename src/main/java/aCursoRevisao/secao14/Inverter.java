package aCursoRevisao.secao14;

public class Inverter {
   public static void inverterArray(int[] arr){
       int i = 0, j = arr.length - 1;
       while(i < j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
   }

   public static void main(String[] args){
       int[] arr = {1, 2, 3, 4, 5, 6};
       inverterArray(arr);
       for(int n : arr) System.out.println(n + " "); /// 4, 3,
   }
}

