package coesao;

public class CalculadoraDeSalario {


    public double calcula(Funcionario funcionario) {
        return new Funcionario().getCargo().getRegra().calcula(funcionario);
    }

}
