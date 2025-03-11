# Tratamento de exerções
Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução.

Em Java, uma exceção é um objeto herdado da classe: 
- java.lang.Exception - o compilador obriga a tratar ou propagar
- java.lang.RuntimeException - o compilador não obriga a tratar ou propagar

Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada (tratada) ou o programa seja encerrado.
## Hierarquia de execuções em Java
![](../img/Pasted_image_20250209225432.png)
- Error - Erros que o programador não consegue tratar (por exemplo, erros do compilador);
- Exception - Erros que nem sempre serão tratadas

## Por que exceções? 
- O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas 
- Vantagens: • 
	- Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro
	- Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes 
	- A exceção pode carregar dados quaisquer

## Sintaxe 
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

