
package calculoimc;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso;
        float altura;
        float imc;
        
        System.out.println("Informe o peso: ");
        peso = sc.nextInt();
        
        System.out.println("Informe a altura: ");
        altura = sc.nextFloat();
        
        imc = peso / (altura * altura);
        
        System.out.println("Seu IMC é " + imc);
        
    }
    
}
