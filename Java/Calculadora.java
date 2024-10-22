import java.util.Scanner;

//calculadora básica
public class Calculadora {
    public static void main(String[] args) {
        while (true) {
            
            
            //chama a função que mostra as opções para o usuário
            menu();
            
            
              
        }

    }

    public static void selecao_menu(float firstNum, float secondNum, int opcao){
        

        switch (opcao) {
            
            case 1:
                
                System.out.println("Resultado da soma: " 
                + sum(firstNum, secondNum));              
                break;
            
            case 2:
                
                System.out.println("Resultado da subtração: " + sub(firstNum, secondNum));              
                break;

            case 3:
                
                System.out.println("Resultado da multiplicação: " + multi(firstNum, secondNum));              
                break;

            case 4:
                
                System.out.println("Resultado da divisão: " + div(firstNum, secondNum));              
                break;

            default:
                
                System.out.println("Opção inválida. Insira um valor válido, de acordo com as opções!");
                break;
        }
    }
    //pega os números inseridos pelo usuário do terminal
    public static float[] pegarNumeros() {
        //criando o scanner para entrada de dados do usuário
        Scanner myScanner = new Scanner(System.in);
        
        //entrada dos números para a operação
        System.out.println("Insira o primeiro número");
        float firstNumber = myScanner.nextFloat();
 
        System.out.println("Insira o primeiro número");
        
        float secondNumber = myScanner.nextFloat();
        float[] numbers = {firstNumber, secondNumber};
        
        //retornando um array do tipo float, contendo os números informados pelo usuário
        return numbers;

    }

    //menu de opções
    public static void menu(){
        

        System.out.println("--------------------------");
        System.out.println("| \t1 - Somar          |");
        System.out.println("| \t2 - Subtrair       |");
        System.out.println("| \t3 - Multilicar     |");
        System.out.println("| \t4 - Dividir        |");
        System.out.println("| \t0 - Sair           |");
        System.out.println("--------------------------");


        //criação do scanner para a entrada de dados do terminal
        Scanner myOptionScanner = new Scanner(System.in);
        
        /*Entrada de um número entre 0 e 4 que determina
        o tipo de operação será executado*/
        System.out.println("Qual operação matemática deseja fazer? Padrão: 1");
        int opcao = myOptionScanner.nextInt();
        System.out.println("Opção: " + opcao);

        if (opcao == 0) {
            System.exit(-1);
        }

        /*chama a função que permite o usuário inisira 
        os números para efetuar as operações*/
        float[] numbers = pegarNumeros();
        
        /*Esta função é responsável por pegar qual operação 
        aritimética o usuário deseja realizar e partir dessa entrada 
        chamar a função responsável por tal ooperação*/
        selecao_menu(numbers[0], numbers[1], opcao); 

    }

    //Função de soma
    public static float sum(float number1,float number2) {
        float result = number1 + number2;
        return result; 
    }

    //Função de subtração
    public static float sub(float number1, float number2){
        float result = number1 - number2;
        return result;
    }

    //Função de multiplicação
    public static float multi(float number1, float number2) {
        float result = number1 * number2;
        return result;
    }

    //Função de divisão
    public static float div(float number1, float number2) {
        float result = number1 / number2;
        return result;
    }
}
