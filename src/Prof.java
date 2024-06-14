import java.util.Date;

public class Prof extends Pessoa{
    
    public Prof(String _nome, String _cpf, Date _data, double salarios, String disciplina) {
        super(_nome, _cpf, _data);
        this.salarios = salarios;
        this.disciplina = disciplina;
    }
    public double salarios;
    public String disciplina;
}
