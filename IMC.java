public class IMC {
    private double altura;
    private double peso;
    private char genero;

    public IMC(double peso, double altura, char genero) {
        setPeso(peso);
        setAltura(altura);
        setGenero(genero);
    }

    public void setGenero(char gen) {
        char upperGen = Character.toUpperCase(gen);
        if (upperGen != 'M' && upperGen != 'F') {
            throw new IllegalArgumentException("O género deve ser masculino (M) ou feminino (F).");
        }
        this.genero = upperGen;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public double getAltura() { return this.altura; }
    public double getPeso() { return this.peso; }
    public char getGenero() { return this.genero; }

    public String calcularIMC() {
        double imc = this.peso / Math.pow(this.altura, 2);

        if (this.genero == 'F') {
            if (imc >= 32.3) return "Obesa";
            if (imc >= 27.3) return "Acima do peso ideal";
            if (imc >= 25.8) return "Marginalmente acima do peso";
            if (imc >= 19.1) return "Peso normal";
            return "Abaixo do peso";
        }

        if (imc >= 31.1) return "Obeso";
        if (imc >= 27.8) return "Acima do peso ideal";
        if (imc >= 26.4) return "Marginalmente acima do peso";
        if (imc >= 20.7) return "Peso normal";
        return "Abaixo do peso";
    }
}
