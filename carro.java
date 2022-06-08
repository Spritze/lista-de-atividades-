public class carro {
    //atributos
    String marca;
    String cor;
    Integer velocidade;
    float altura;

  //metodos
  void aceleracao(Integer acelerar){
      velocidade += acelerar;
  }
  void freio(Integer freiar){
      velocidade -= freiar;
    }
}
