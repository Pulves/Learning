public class Main {
    public static void main(){
        //comentario igual o da linguagem C e JS
        //println printa uma linha e automáticamente quebra a linha
        System.out.println("Hello World " + 3);
        //printf é igual o da linguagem C, para quebra de linha é necessário atribuir um \n
        float pi = 3.4f;
        System.out.printf("Hello World %f \n", pi);
        //%f indica que o elemento a ser formatado é do tipo float
        
        /*se colocar %s também é aceito, com algumas diferenças,
        como pode ser visto no printf abaixo*/ 
        System.out.printf("Print variavel do tipo float com o percent para string %s \n", pi);

        /*para definir a quantidade de casas após a virgula
         que será mostrado no print, segue o padrão de '%' 'quantidade-de-casas' e 'f'. ex:. %.2f
        */

        System.out.printf("Hello World %.2f\n", pi);
    }
}