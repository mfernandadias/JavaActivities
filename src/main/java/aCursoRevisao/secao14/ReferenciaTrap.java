package aCursoRevisao.secao14;

import java.util.Arrays;

public class ReferenciaTrap {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 7};
        int[] b = a;
        b[0] = 99;

        System.out.println(a[0]);

        //8 - referencia trap
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        //programou bastante coisa...
        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayCopia));


    }
}
