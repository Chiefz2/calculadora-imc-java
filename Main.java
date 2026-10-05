public class Main {
    public static void main(String[] args) {
        IMC paciente1 = new IMC(75.5, 1.75, 'M');
        String classificacao = paciente1.calcularIMC();
        System.out.println("Classificação do Paciente 1: " + classificacao);
        IMC paciente2 = new IMC(62.0, 1.60, 'F');
        System.out.println("Classificação do Paciente 2: " + paciente2.calcularIMC());
    }
}
