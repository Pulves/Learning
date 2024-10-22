public class Casting {
    public static void main(String[] args) {
        /*  Convertendo dados de um tipo primitivo para outro */

        long longNumber = 1000776L;

        int intNumberCovert = (int) longNumber;

        System.out.println("data type long to int: " + intNumberCovert);

        /*É possível coverter o tipo de dado de uma variavel
         quando o valor guardado nessa variavel excede o 
         valor limite do outro tipo de dado para o qual 
         será convertido */

        //maior valor suportado pelo tipo inteiro positivo
        int intNumber = 2147483647;

        /* o menor valor suportado pelo tipo short é:
         32767 positivo
        */
        short shortNumber = (short) intNumber;
        
        System.out.println("Short number converted: " + shortNumber);

        /*É retornado o valor -1 o que indica um insucesso
         na operação
        */


    }
}
