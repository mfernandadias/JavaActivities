package avancado.classesWrappers;

public class Exemplo02 {
    public static void main(String[] args){
        /* Diferenças entre valueOf() e parseXXX()
        Resumo:
        valueOf(): retorna um objeto wrapper
        parseXXX() retorna um tipo primitivo
         */
        String s = "123";
        Integer obj = Integer.valueOf(s); //retorn um integer
        int num = Integer.parseInt(s); //retorna um int
        System.out.println(obj + ", " + num);

        /*
        trabalhando com diferente bases numéricas
        Resumo: Conversão de strings em difenretntes bases (como binário, octal e
        hexadecimal).
        Exemplo:
         */
        int binario = Integer.parseInt("1010", 2); //binario para decimal
        int octal = Integer.parseInt("17", 8);     // octal para decimal
        int hexa = Integer.parseInt("1F", 16);     // hexa para decimal
        System.out.println(binario + ", " + octal + ", " + hexa);

        /* unboxing
        System.out.println(obj + "
        Tirando proceito do autoboxing
        Java converte automaticamente tipos primitivos em wrappers e vice-versa
        Exmeplo:
         */
        Integer objt = 10; //autoboxing
        int prim = obj;

        /*
        Comparando objetos de classes wrappers de forma segura
        Use .equals() para comparar wrappers(pois == compara referÊncias, não valores
         */
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);        // false (referência)
        System.out.println(a.equals(b));

        /*
        Classes wrappers e referências nulas
        Um wrapper pode ser null, e isso pode causar NullPointerException
        Exemplo:
         */
    }
}
