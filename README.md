# Documentação: Projeto Gerador de Formas
Este projeto escrito em Java permite ao usuário criar objetos baseados em formas geométricas — especificamente círculos e retângulos —, calcular suas áreas e imprimir uma representação gráfica simples.

## Estrutura do Projeto
O projeto é dividido em classes destinadas às representações das entidades, à lógica principal da aplicação e a uma interface para desenhos. Aqui está uma breve descrição de cada componente:

### 1. Classes de Entidades:
Arquivos dentro do pacote `entities`.

#### `Forma.java`
Classe abstrata base que define a estrutura para outras formas geométricas incluirão os métodos para o cálculo da área.

#### `Circulo.java`
Representa um círculo, é derivada de `Forma` e implementa a interface `Desenhavel`. Armazena o raio como atributo privado.

```java
public class Circulo extends Forma implements Desenhavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenho de um círculo com raio: " + raio);
    }
}
```

#### `Retangulo.java`
Representa um retângulo. Armazena largura e altura, calcula sua área e desenha sua representação simplificada.

```java
public class Retangulo extends Forma implements Desenhavel {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenho de um retângulo de largura: " + largura + " e altura: " + altura);
    }
}
```

### 2. Interface:
Localizada no pacote `repository`.

#### `Desenhavel.java`
Define o método `desenhar()`, que deve ser implementado por todas as formas que possuem uma representação gráfica.

```java
package repository;

public interface Desenhavel {
    void desenhar();
}
```

### 3. Classe Principal:
Localizada no pacote `application`.

#### `Program.java`
Contém o `main` método para executar o programa. Realiza funções de entrada de dados usando `Scanner`, cria uma lista de objetos `Forma`, realiza operações de acordo com a entrada do usuário (criando círculos ou retângulos), e exibe a representação gráfica e a área de cada forma.

```java
public class Program {
    public static void main(String[] args) {
        // Configurações iniciais, criação de lista de formas, input básico, loop para criação e cálculo 
    }
}
```

## Como Compilar e Executar:
Com o ambiente Java adequadamente configurado:

1. Navegue até a pasta raiz do projeto.
2. Compile o código com:
   ```sh
   javac -d ./bin ./src/application/*.java ./src/entities/*.java ./src/repository/*.java
   ```
3. Execute a aplicação com:
   ```sh
   java -cp ./bin application.Program
   ```
4. Siga as instruções no console para inserir as informações das formas que deseja criar.

Este documento foi gerado com base no código fonte fornecido, detalhando a estrutura e funcionamento do programa.