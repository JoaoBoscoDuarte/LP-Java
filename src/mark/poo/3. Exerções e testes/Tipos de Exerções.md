# Tipos de exerções

## 1. **Exceções Verificadas (Checked Exceptions)**
As exceções verificadas são aquelas que o compilador exige que o programador trate explicitamente, seja com um bloco `try-catch` ou declarando que o método pode lançar a exceção usando `throws`. Elas geralmente representam situações que podem ser recuperadas ou precisam ser tratadas de forma específica. Exemplos:

- **IOException**: Usada para indicar problemas de entrada e saída, como erros ao ler ou escrever arquivos.

- **SQLException**: Indica erros relacionados ao acesso a bancos de dados.

- **ClassNotFoundException**: Quando uma classe necessária não pode ser encontrada.

- **FileNotFoundException**: Exceção lançada quando um arquivo não pode ser encontrado durante uma operação de leitura.

### Características

- Essas exceções são verificadas em tempo de compilação, ou seja, o compilador garante que sejam tratadas ou declaradas.
- Representam condições que são razoavelmente esperadas em operações normais, como erros de leitura de arquivo, falhas na rede, etc.
## 2. Exceções Não Verificadas (Unchecked Exceptions) 

As exceções não verificadas são aquelas que o compilador não exige que sejam tratadas explicitamente. Elas geralmente indicam erros de programação, como tentar acessar um índice de um array fora do limite ou realizar uma operação de divisão por zero. Exemplos:

- **NullPointerException**: Lançada quando uma operação é realizada em um objeto nulo.

- **ArrayIndexOutOfBoundsException**: Indicando que foi tentado acessar um índice de um array que não existe.

- **ArithmeticException**: Lançada em operações aritméticas inválidas, como divisão por zero.

- **ClassCastException**: Quando há uma tentativa de fazer um cast (conversão) de um tipo de objeto para outro tipo incompatível.

- **IllegalArgumentException**: Quando um método recebe um argumento inválido.

### Características:
- São usadas para indicar erros em tempo de execução.

- Não é obrigatório tratá-las, mas é recomendado para garantir maior robustez.

- Muitas vezes são causadas por falhas de lógica ou erros do programador.

## 3. **Erro (Error)**

Erros são condições graves que não são normalmente recuperáveis e não devem ser tratadas diretamente pelo código do aplicativo. Elas geralmente indicam problemas no ambiente de execução da aplicação, como falta de memória ou falhas do sistema operacional. Exemplos:

- **OutOfMemoryError**: Quando a JVM fica sem memória para alocar mais objetos.

- **StackOverflowError**: Lançado quando a pilha de chamadas de um programa excede o limite devido a uma recursão infinita, por exemplo.

- **VirtualMachineError**: Indica um erro grave na máquina virtual Java.

### Características:

- Erros geralmente indicam falhas que não podem ser tratadas adequadamente pelo código, como problemas críticos no ambiente de execução da aplicação.

- Não é recomendado tentar capturá-los com `try-catch`, pois geralmente não há uma maneira de se recuperar de erros desse tipo.

### 4. **Exceções Personalizadas**

Além das exceções fornecidas pela API do Java, você também pode criar suas próprias exceções personalizadas para lidar com situações específicas da sua aplicação. Para isso, basta criar uma nova classe que estenda `Exception` (para exceções verificadas) ou `RuntimeException` (para exceções não verificadas).

```
public class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}
```

```
public void meuMetodo() throws MinhaExcecao {
    // Lógica que pode lançar a exceção
    throw new MinhaExcecao("Algo deu errado!");
}
```

## 5. **Exceções da Classe `Throwable`**

A classe `Throwable` é a superclasse de todas as exceções e erros em Java. Isso inclui tanto as **Exceções** (classes que estendem `Exception`) quanto os **Erros** (classes que estendem `Error`). Embora não seja comum, é possível capturar ou lançar um `Throwable`, mas é uma prática não recomendada, pois ele pode envolver tanto exceções tratáveis quanto erros graves.

```
try {
    // algum código
} catch (Throwable t) {
    // Captura qualquer tipo de erro ou exceção
}
```