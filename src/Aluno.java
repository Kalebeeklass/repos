import java.util.Date;

import javax.xml.crypto.Data;

public class Aluno extends Pessoa {
public Aluno(String _nome, String  _cpf, Date data) {
    super(_nome, _cpf, data);
}

 public String matricula;

 public double tirarCopias(int qtd) {
    return 0.7 * (double) qtd;
 }
}