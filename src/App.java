import java.util.Date;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class App {
  /**
   * @param args
   */
  public static void main(String[] args) {
    int s, p=4, k;
    Pessoa x = new Pessoa("geraldo", "09676543210", new Date());
    Pessoa y = new Pessoa("cassio", "00000000011", new Date());
    Aluno c = new Aluno("gerson", "111223322", new Date());
    Aluno a = new Aluno("Jose Fransisco", "12345678900", new Date());
    Scanner leia = new Scanner(System.in);
    System.out.println("informe, voce é ALUNO ou PESSOA?\n aluno-digite 1 \n pessoa-digite 2\n");
    while (p >= 3) {
      
    p = leia.nextInt();
    if (p == 1) {
      System.out.println("digite o numero de copias a serem multiplicados");
      k = leia.nextInt();
      System.out.println(a.tirarCopias(k));
    }
    if (p == 2) {
      System.out.println("digite o numero de copias a serem multiplicados");
      s = leia.nextInt();
      System.out.println(x.tirarCopias(s));
    }
    if (p>=3){
      System.out.println("informe outro número");
    }
    if (p<=0){
      System.out.println("informe outro número");
    }
  }
  }
}