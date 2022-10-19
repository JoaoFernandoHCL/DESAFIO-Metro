
package Aula10;

public class Vagoes {
 
   
    private  int passageiros;

    Vagoes(){};
   
    private String sinalizacao;
    

    public String getSinalizacao() {
        return sinalizacao;
    }

    public void setSinalizacao() {
        if (this.getPassageiros() <= 50){
            this.sinalizacao = "Azul, (vazio ou ocupacao baixa)";
        } else if (this.getPassageiros() >= 51 && this.getPassageiros()<=100){
            this.sinalizacao = "Amarela, (ocupacao média)";
        } else if (this.getPassageiros() >=101 && this.getPassageiros()<=150){
            this.sinalizacao = "Laranja, (ocupacao alta)";
        } else if (this.getPassageiros() >=150 && this.getPassageiros()<=250){
            this.sinalizacao= "Vermelha, (ocupacao altíssima ou lotado)";
        }
    }
   
    public int getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
    
    
    
    public void Imprimir(){
        System.out.println("=============================================================================");
        System.out.println("Esse carro tem " + this.getPassageiros()+" passageiros");
        System.out.println("A cor da sua sinalizacao eh " + this.getSinalizacao()); 
        System.out.println("=============================================================================\n");
    }
   
}
