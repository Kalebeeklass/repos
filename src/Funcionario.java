import java.util.Date;

public class Funcionario extends Pessoa{

    public double salarios;
    public String disciplina;
    public String cargo;
    public Funcionario(String _nome, String _cpf, Date _data, double salarios, String disciplina, String cargo) {
        super(_nome, _cpf, _data);
        this.salarios = salarios;
        this.disciplina = disciplina;
        this.cargo = cargo;
    }

}
