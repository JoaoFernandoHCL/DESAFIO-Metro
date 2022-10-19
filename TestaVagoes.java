
package Aula10;


import java.util.Scanner;


public class TestaVagoes {
    public static void main(String[] args) {
        Vagoes v1 = new Vagoes ();
        int [] carros = {0, 0, 0, 0, 0, 0};
        
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i<carros.length; i++){
            System.out.print("Digite aqui o numero de passageiros dentro desse carro do vagao: ");
            carros[i] = sc.nextInt() ;
            v1.setPassageiros(carros[i]);
            if (carros[i] < 0 || carros[i]> 250){
                do {
                    System.out.print("Este numero é invalido, insira um numero inteiro positivo menor ou igual a 250: ");
                    carros[i] = sc.nextInt();
                    v1.setPassageiros(carros[i]);
                } while (carros[i] < 0 || carros[i]> 250);
            }
            v1.setSinalizacao();

            sc.nextLine();
            sc.nextLine();

            v1.Imprimir();
        }
        int total = carros [0] + carros [1] + carros [2] + carros [3] + carros [4] + carros [5];
        System.out.println("================================================");
        System.out.println("Tendo um total de " + total + " de passageiros");
        System.out.println("================================================");
    }
}
