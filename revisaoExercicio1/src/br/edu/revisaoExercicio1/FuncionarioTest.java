package br.edu.revisaoExercicio1;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) throws ParseException {


        Funcionario func = new Funcionario();
        Scanner sc = new Scanner((System.in));

        System.out.println("Digite o id do funcionário");
        func.setIdFunc(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do funcionário");
        func.setNomeFunc(sc.nextLine());
        System.out.println("Digite o documento do funcionário");
        func.setDocumento(sc.nextLine());
        System.out.println("Digite o departamento do funcionário");
        func.setDepartamento(sc.nextLine());
        System.out.println("Digite a data de contratação do funcionário");
        DateTimeFormatter formatador;
        formatador = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = sc.nextLine();
        func.setDataContratacao(LocalDate.parse(date, formatador));
        System.out.println("Digite o salario do funcionário");
        func.setSalario(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite funcionario ativo (true) não ativo (false)");
        func.setAtivo(Boolean.parseBoolean(sc.nextLine()));
        if(func.isAtivo()==true){
            System.out.println("Digite o valor do aumento");
            double aumento = Double.parseDouble(sc.nextLine());
            func.atualizarSalario(aumento);
            System.out.println();
            System.out.println("Dados do funcionário:");
            func.imprimir();
            System.out.println();
            System.out.println("Dados do funcionário após demissão:");
            func.demiteFuncionario();
            System.out.println();
            func.imprimir();
        }else
        {
            System.out.println();
            System.out.println("Dados do funcionário:");
            func.imprimir();
        }

    }
}
