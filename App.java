/*Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16/
*/
import java.util.Scanner;

public class App {

    public static void main(String [] args) throws Exception{

        System.out.printf("Bem vindo ao contador de inteiros!");

        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nPara começarmos começarmos faremos testes com os seguir numeros %n{326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16}%n%n e em seguida faremos o mesmo com o número inserido por você a seguir: ");
        int numCliente = scanner.nextInt();

        scanner.close();
        int centenas = 0;
        int restoCentenas = 0;
        int dezenas = 0;
        int restoDezenas = 0; 
        if(numCliente > 99){
            centenas = numCliente / 100;
            restoCentenas = numCliente % 100;
            if(restoCentenas > 9){
                dezenas = restoCentenas / 10;
                restoDezenas = restoCentenas % 10; 
            } else {
               restoDezenas = restoCentenas;
            }
            System.out.print("Quantidade de centenas"+ centenas + "Quantidade de dezenas" + dezenas + "Quantidade de unidades" + restoDezenas);
        }
        if(numCliente > 9 && numCliente <= 99){
            dezenas = numCliente / 10;
            restoDezenas = numCliente % 10; 
            System.out.print("Quantidade de dezenas" + dezenas + "Quantidade de unidades" + restoDezenas);
        }
        if(numCliente < 10){
            System.out.print("Quantidade de unidades" + numCliente);
        }

    }
}