# Documentação para Projeto de Formas Geométricas

## Introdução

Este projeto Java tem como objetivo criar um sistema interativo que permite ao usuário inserir dados de formas geométricas, como círculos e retângulos, e calcula suas áreas. Este sistema também inclui uma interface de desenho que permite visualizar as formas inseridas pelo usuário.

## Estrutura de Arquivos

O projeto é composto pelos seguintes arquivos Java dentro do diretório `src`:

- `Program.java` - Arquivo principal que executa o programa.
- `Circulo.java` - Define a classe `Circulo`, que estende `Forma` e implementa `Desenhavel`.
- `Retangulo.java` - Define a classe `Retangulo`, que também estende `Forma` e implementa `Desenhavel`.
- `Forma.java` - Classe abstrata que define a estrutura básica de uma forma geométrica.
- `Desenhavel.java` - Interface que define a capacidade de um objeto ser desenhável.

## Descrição das Classes

### Program.java

A classe `Program` é o ponto de entrada do programa. Este arquivo contém:
- A configuração da localidade padrão para `Locale.US`.
- A criação de uma lista de objetos do tipo `Forma`.
- Leitura da quantidade de formas a serem inseridas pelo usuário.
- Um loop para ler os detalhes de cada forma, baseando-se no input do usuário sobre o tipo da forma (círculo ou retângulo).
- Um loop para imprimir os detalhes das formas, como desenho e área.

### Circulo.java

A classe `Circulo` estende a classe abstrata `Forma` e implementa a interface `Desenhavel`. Essa classe representa uma forma geométrica circular e inclui:
- Um campo privado `raio` para o raio do círculo.
- Construtor que aceita o raio como argumento.
- Implementação do método `area()` para calcular a área do círculo.
- Implementação do método `desenhar()` da interface `Desenhavel`, que exibe um texto simples simbolizando o círculo.

### Retangulo.java

Similar ao `Circulo`, a classe `Retangulo` estende `Forma` e implementa `Desenhavel`. Esta classe representa um retângulo e inclui:
- Campos privados `largura` e `altura` para as dimensões do retângulo.
- Construtor que aceita largura e altura como argumentos.
- Implementação do método `area()` que calcula a área do retângulo.
- Implementação do método `desenhar()` para exibir um texto simbolizando o retângulo.

### Forma.java

A classe abstrata `Forma` é utilizada como a base para outras formas geométricas. Contém:
- Um método abstrato `area()` que deve ser implementado pelas subclasses para calcular a área da forma.

### Desenhavel.java

A interface `Desenhavel` define um único método `desenhar()`, que precisa ser implementado por qualquer classe que deseje oferecer uma representação visual simples de sua instância.

## Como Compilar e Executar

Para compilar e executar este projeto, você precisa ter o Java SDK instalado. Abra o terminal, navegue até a pasta do projeto e execute:

```
javac application/*.java entities/*.java repository/*.java
java application.Program
```

Siga as instruções na tela para inserir o número e os tipos de formas que deseja calcular e visualizar.

## Conclusão

Este projeto demonstra os conceitos de herança, interfaces e polimorfismo na prática, usando formas geométricas como exemplo. Ele permite a interação do usuário para a entrada de dados e mostra resultados imediatos de cálculos e visualizações simples.