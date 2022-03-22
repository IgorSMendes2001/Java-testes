class Carro{
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;

    void liga(){
        System.out.println("O carro está ligado");
    }
    void acelera(double quantidade){
        double velocidadeNova=this.velocidadeAtual+quantidade;
        this.velocidadeAtual=velocidadeNova;
    }
    int pegaMarcha(){
        if(this.velocidadeAtual<0){
            return -1;
        }
        if(this.velocidadeAtual>=0&&this.velocidadeAtual<40){
            return 1;
        }
        if(this.velocidadeAtual>=40&&this.velocidadeAtual<80){
            return 2;
        }
        return 3;
    }
}



public class Somas {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i %3==0){
                System.out.println(i);
            }
            }
    }
    }

