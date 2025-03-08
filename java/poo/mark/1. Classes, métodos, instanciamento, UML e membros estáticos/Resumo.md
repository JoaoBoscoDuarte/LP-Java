### Classe
- É a definição do tipo
- Pode conter: Atributos e métodos
- Definida por `class`
### Objetos
- São instâncias da classe
- Entidades que obedecem as definições da classe
### Instanciamento
 - É preciso instanciar para criar objetos da classe (objetos não estáticos)
```
classe nome_do_objeto = new classe(parâmetros quando necessário)
```
- Qual o membro é estático, não precisa instanciar o objeto
```
tipoDeDado nome = Classe.metodo(parâmetros)
```
- Uma vez instanciado, é possível mudar os atributos do objeto
```
//Instanciamento do objeto  
Product produto = new Product();  

//modificando os atributos do objeto  
produto.nome = sc.nextLine();   
produto.preco = sc.nextDouble();
```

```
//modificando o atributo com uma entrada de inteiros
objeto.atributo = sc.nextInt();
```
### Métodos
- Blocos de códigos pertencentes a uma classe que representa um comportamento ou ação que o objeto dessa classe pode realizar
- Usa-se a palavra ***this*** para se refereir ao atributo da classe
```
public double valorTotalEmEstoque() {  
    return preco * quantidade;  
}  
  
public void adicionarItem(int quantidade) {  
    //this é usado para referenciar o atributo da classe  
    this.quantidade += quantidade;  
}  
  
public void removerItens(int quantidade) {  
    this.quantidade -= quantidade;  
}
```

#### UML
Estrutura de como uma classe deve ser formulada
- **Atributos** (dados da classe)
- **Métodos** (comportamentos da classe)
- **Relacionamentos** entre classes (herança, associação, agregação, composição, etc.)

### Objetct
- **Toda classe em Java é uma subclasse da classe Object**

### toString()
- O método **`toString()`** é um método presente na classe `Object` e pode ser sobrescrito em qualquer classe para retornar uma representação em forma de string de um objeto.
- Basta mudar o nome do método para toString()

### Membros estáticos
- Em Java, **membros estáticos** são atributos e métodos que pertencem à classe, e não a instâncias individuais
- Eles são declarados usando a palavra-chave **`static`**.
- São membros que fazem sentido independentemente de objetos.

#### Atributo estático
- São compartilhados por todas as instâncias da classe.
- Exemplo:
```
public class Exemplo {
    static int contador = 0; // Variável estática

    Exemplo() {
        contador++;  // Incrementa o contador a cada instância criada
    }
}
```

```
public class Main {
    public static void main(String[] args) {
        new Exemplo();  // contador = 1
        new Exemplo();  // contador = 2
        new Exemplo();  // contador = 3
        
        System.out.println("Total de objetos criados: " + Exemplo.contador);
    }
}
```

#### Métodos estáticos
 - Pertencem à classe, não a uma instância.
- Podem ser chamados sem criar um objeto.
- Não podem acessar atributos ou métodos de instância diretamente (pois não dependem de um objeto específico).