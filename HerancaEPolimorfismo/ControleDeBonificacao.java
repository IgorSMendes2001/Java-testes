package HerancaEPolimorfismo;

public class ControleDeBonificacao {
    private double soma;
   //utilizamos os metodos genéricos que apontam para os métodos especificos para cada tipo de funcionários
   public void registra(Funcionario f){
    double bonif=f.getBonificacao();
    this.soma=this.soma+bonif;
   }
  //Isso permite que inventamos diversos tipos de bonificação para cada funcionário, mas utilizando o mesmo método genérico,sendo a principal vantagem do polimorfismo
   public double getSoma() {
       return soma;
   }
   
}
