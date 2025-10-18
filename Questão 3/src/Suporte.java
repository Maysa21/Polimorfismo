public class Suporte extends Funcionario {
 
    private static final double AjudaDeCusto = 200.00;

    public Suporte(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
       return salarioBase + AjudaDeCusto;
    }
}