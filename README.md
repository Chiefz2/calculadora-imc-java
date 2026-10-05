# Calculadora de IMC
Um programa em Java para calcular o Índice de Massa Corporal (IMC) com base no peso, na altura e no género do utilizador. Esta implementação destaca-se por aplicar tabelas de classificação distintas para homens e mulheres, garantindo uma avaliação mais precisa da condição física em vez da tabela genérica tradicional.
## 🧮 Critérios de Classificação
A lógica de cálculo utiliza a fórmula padrão de IMC (`peso / altura²`), mas avalia o resultado final de acordo com limiares rigorosos para cada género:
### Mulheres (F)

| IMC | Classificação |
| :--- | :--- |
| Menor que 19.1 | Abaixo do peso |
| 19.1 a 25.7 | Peso normal |
| 25.8 a 27.2 | Marginalmente acima do peso |
| 27.3 a 32.2 | Acima do peso ideal |
| 32.3 ou mais | Obesa |

### Homens (M)

| IMC | Classificação |
| :--- | :--- |
| Menor que 20.7 | Abaixo do peso |
| 20.7 a 26.3 | Peso normal |
| 26.4 a 27.7 | Marginalmente acima do peso |
| 27.8 a 31.0 | Acima do peso ideal |
| 31.1 ou mais | Obeso |

## 🚀 Tecnologias e Padrões
- **Java** (POO)
- **Tratamento de Exceções:** Lançamento de `IllegalArgumentException` no construtor e *setters* para prevenir a instanciação de objetos com pesos ou alturas negativas, e para forçar a inserção estrita dos caracteres 'M' ou 'F'.
- **Encapsulamento:** Proteção do estado da aplicação através de modificadores de acesso e métodos de modificação seguros.
## 📦 Como utilizar
1. Clone o repositório para a sua máquina local.
2. Compile o ficheiro da classe principal:
```bash
javac IMC.java
