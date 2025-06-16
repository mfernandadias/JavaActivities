package revisaoCompleta.revisao01Basico.alunos;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Aluno> aluno = new ArrayList<>();
        String continuar;

        do{
            System.out.println("Digite o nome do aluno: ");
            String nome = scan.nextLine();

            System.out.println("Digite a matricula");
            String matricula = scan.nextLine();

            System.out.println("Digite a primeira nota: ");
            double nota1 = scan.nextDouble();

            System.out.println("Digite a segunda prova");
            double nota2 = scan.nextDouble();

            Aluno aluno1 = new Aluno(nome, matricula, nota1, nota2);

            scan.nextLine();
            aluno.add(aluno1);

            System.out.print("Deseja cadastrar outro aluno? (s/n): ");
            continuar = scan.nextLine();

        }while(continuar.equalsIgnoreCase("s"));

        System.out.println("\nLista de Alunos e suas Médias: ");
        //public static double calcularMedia(double nota1, double nota2){
        for(Aluno alunoA : aluno){
            System.out.println("Nome: " + alunoA.getNome());
            System.out.println("Média: " + alunoA.calcularMedia(alunoA.getNota1(), alunoA.getNota2()));
            System.out.println("----------------------");
        }
    }
}
