package aCursoRevisao.secao20.avancado;

public class POO2 {

    public static void main(String[] args){
        //1 - Classes com final
        ContaBancaria conta = new ContaBancaria(580);

        System.out.println("Saldo: " + conta.getSaldo());

        /*
        não posso estender a classe com final
        public class NovaConta extends ContaBancaria

        Classe final - não pode ser herdada
        metodo final - não pode ser sobreescrito
         */
    }
}
