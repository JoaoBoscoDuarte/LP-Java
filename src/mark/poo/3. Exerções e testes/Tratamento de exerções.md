# Tratamento de exerções

Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução.

Em Java, uma exceção é um objeto herdado da classe: 
- java.lang.Exception - o compilador obriga a tratar ou propagar
- java.lang.RuntimeException - o compilador não obriga a tratar ou propagar

Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada (tratada) ou o programa seja encerrado.
## Hierarquia de execuções em Java e tipos
![[Pasted image 20250209225432.png]]
- Error - Erros que o programador não consegue tratar (por exemplo, erros do compilador);
- Exception - Erros que nem sempre serão tratadas
## Por que exceções? 

- O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas 
- Vantagens:
	- Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro
	- Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes 
	- A exceção pode carregar dados quaisquer

Para se entender o funcionamento do tratamento de exerção, será utilizado uma estrutura dividida em duas partes, bloco de exerção (onde estará a exerção) e o bloco try catch (onde será chamada a exerção) existe duas principais formas de tratamento de erros, são elas: 
- `throw`: Lança uma exceção explicitamente no código.
- `throws`: Declara que um método pode lançar uma exceção.

Toda exerção é um objeto do tipo Exception, portanto, é necessário o instanciamento de toda nova exerção utilizando a palavra reservada `new`. Exemplo: `throw new Exception`.

## try catch

Antes de tudo, primeiro deve-se entender o bloco try-catch
```
try { 

} catch (ExceptionType e) { 

} catch (ExceptionType e) { 

} catch (ExceptionType e) { 

} finally {

}
```

- Bloco try: Contém o código que representa a execução normal do trecho de código que pode acarretar em uma exceção

- Bloco catch: Contém o código a ser executado caso uma exceção ocorra; Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)

- finally: É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.
	- Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento.

## throw
- **Função:** A palavra-chave `throw` é usada **para lançar uma exceção** de dentro do código. Com ela, você cria e dispara uma exceção, que pode ser capturada em um bloco `try-catch` ou propagada para métodos superiores.

- **Uso:** Quando você deseja **lançar explicitamente** uma exceção em determinado ponto do seu código, seja para indicar um erro ou para sinalizar que algo de errado aconteceu.

```
public class ExemploThrow {
    public static void verificarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        System.out.println("Idade válida: " + idade);
    }

    public static void main(String[] args) {
        try {
            verificarIdade(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
```

- O `throw` está sendo usado para lançar uma exceção `IllegalArgumentException` quando a idade for negativa.
- Nesse caso, a exceção é criada e imediatamente lançada com a palavra-chave `throw`.

## throws

- **Função:** A palavra-chave `throws` é usada **para declarar que um método pode lançar uma exceção**, ou seja, ela indica que o método não lida diretamente com a exceção, mas a propaga para quem chamar o método.

- **Uso:** Quando um método pode gerar uma exceção e você deseja **propagar** essa exceção para métodos superiores. Ela é usada na **assinatura** do método.

```
public class ExemploThrows {
    public static void verificarIdade(int idade) throws IllegalArgumentException {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        System.out.println("Idade válida: " + idade);
    }

    public static void main(String[] args) {
        try {
            verificarIdade(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
```

- O método `verificarIdade` **declara** que pode lançar a exceção `IllegalArgumentException` usando a palavra-chave `throws` na assinatura do método.
- Quando chamamos `verificarIdade`, o método pode lançar essa exceção, então é necessário tratá-la com `try-catch` ou declarar novamente a exceção no método `main` (por exemplo, `throws IllegalArgumentException`).

