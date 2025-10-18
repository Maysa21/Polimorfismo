public class Main {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();

        
        int resultado1 = calc.somar(55, 10);

       
        int resultado2 = calc.somar(5, 4, 15);

        
        double resultado3 = calc.somar(4.6, 4.5);

       
        System.out.println("Soma de dois inteiros: " + resultado1);
        System.out.println("Soma de três inteiros: " + resultado2);
        System.out.println("Soma de dois doubles: " + resultado3);
    }

    
}
