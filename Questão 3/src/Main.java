public class Main {
    public static void main(String[] args) {
        
        Funcionario dev = new Desenvolvedor(6000.00);
        Funcionario sup = new Suporte(4000.00);
        
        System.out.println("Cálculo do Desenvolvedor: ");
        System.out.printf("Salário Final (Desenvolvedor): R$ %.2f\n", dev.calcularSalarioFinal()); 
        
        System.out.println("Cálculo do Suporte: ");
        System.out.printf("Salário Final (Suporte): R$ %.2f\n", sup.calcularSalarioFinal());
    }
}
