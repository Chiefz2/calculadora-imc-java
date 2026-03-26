public class IMC {
    private double altura;
    private double peso;
    private char genero;

    public void setGenero(char gen){
        gen = Character.toUpperCase(gen);
        if(gen != 'M' && gen != 'F'){
            throw new IllegalArgumentException("O genero deve ser masculino (M) ou feminino (F)");
        }
        this.genero = gen;
    }

    public void setAltura(double altura){
        if(altura <= 0){
            throw new IllegalArgumentException("A altura não pode ser negativa");
        }
        this.altura = altura;
    }

    public void setPeso(double peso){
        if(peso <= 0){
            throw new IllegalArgumentException("O peso não pode ser menor ou igual a zero");
        }
        this.peso = peso;
    }

    public double getAltura(){ return  this.altura; }
    public double getPeso(){ return  this.peso; }
    public char getGenero(){return  this.genero; }

    public String calcularIMC() {

        double imc = this.peso / (this.altura * this.altura);

        if (this.genero == 'F') {
            if (imc >= 32.3) return "Obesa";
            if (imc >= 27.3) return "Acima do peso Ideal";
            if (imc >= 25.8) return "Marginalmente acima do Peso";
            if (imc >= 19.1) return "Peso normal";
            return "Abaixo do Peso";
        }

        if (imc >= 31.1) return "Obeso";
        if (imc >= 27.8) return "Acima do peso Ideal";
        if (imc >= 26.4) return "Marginalmente acima do Peso";
        if (imc >= 20.7) return "Peso normal";
        return "Abaixo do Peso";

    }

}
