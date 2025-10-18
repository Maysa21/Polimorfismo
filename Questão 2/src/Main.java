public class Main {
    public static void main(String[] args) throws Exception {
       Funcionario[] listaDePagamento = new Funcionario[3];

        
        listaDePagamento[0] = new Funcionario("Maysa ", " 018.770.172-56");
        listaDePagamento[1] = new Gerente("Larissa ", " 018.770.182-28");
        listaDePagamento[2] = new Programador("César ", " 761.792.302-34");

        
        System.out.println("--- Lista de Pagamento ---");
        
        for (Funcionario f : listaDePagamento) {
            System.out.println("Nome: " + f.nome + "CPF: " + f.cpf + "Salário: R$ " + f.calcularSalario());
        }
    }
}
