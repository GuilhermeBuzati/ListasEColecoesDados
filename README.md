# 📘 Resumo das Anotações

---

#### Curso: Java: Aplicando a Orientação a Objetos

---

## 🧠 Inferência de Tipos (var)

### 📌 O que é?

- A palavra-chave var permite que o compilador deduza o tipo da variável com base no valor atribuído.
- Introduzido no Java 10.

### 🧱 Exemplo:

```java
var nome = "Guilherme";   // tipo deduzido: String
var idade = 30;           // tipo deduzido: int
var lista = new ArrayList<String>(); // tipo deduzido: ArrayList<String>
```

### ⚠️ O tipo é definido em tempo de compilação, e não pode mudar depois.

### ✅ Quando usar?

- Quando o tipo for óbvio e a inferência tornar o código mais legível.
- Evitar quando isso causar ambiguidade ou dificultar o entendimento do código.

--- 

## 📦 ArrayList em Java

### 📌 O que é?

- ArrayList é uma estrutura de dados dinâmica, que funciona como um array redimensionável.
- Faz parte da biblioteca java.util.

### 🧱 Sintaxe:

```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("Bruno");

System.out.println(nomes.get(0)); // Ana
System.out.println(nomes.size()); // 2
```

### 🔧 Métodos úteis:

- add(elemento): adiciona elemento ao fim
- get(indice): retorna o elemento na posição
- size(): retorna o tamanho da lista
- remove(indice): remove o elemento da posição
- contains(elemento): verifica se contém

### 📌 Dica com var e ArrayList juntos:

```java
var nomes = new ArrayList<String>();
nomes.add("Lucas");
```

- A inferência funciona, mas o tipo ainda é fixo: ArrayList<String>.

---

## 🧮 Arrays em Java

### 📌 O que é?

- Um array é uma estrutura de dados fixa que armazena múltiplos valores do mesmo tipo.
- O tamanho do array é definido na criação e não pode ser alterado.

---

## 🧱 Sintaxe

### ✅ Array de tipos primitivos:

```java
int[] numeros = new int[5]; // array com 5 posições
numeros[0] = 10;
System.out.println(numeros[0]); // 10
```

### ✅ Array de objetos (classes):

```java
Filme[] filmes = new Filme[2];
filmes[0] = new Filme();
```

### 🔁 Percorrendo arrays

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

- Ou com for-each:

```java
for (int numero : numeros) {
    System.out.println(numero);
}
```

### 🧠 Características:

- Os elementos são indexados a partir do zero.
- Arrays de objetos são inicializados com null, e arrays de primitivos com 0 (ou equivalente).
- Arrays têm atributo .length (sem parênteses, diferente de métodos!).

---

## 🧱 Object – A Superclasse de Todas as Classes

### 📌 O que é?

- Em Java, todas as classes herdam da classe Object, direta ou indiretamente.
- Object está no pacote java.lang e fornece comportamentos comuns a todos os objetos.

### 📦 Exemplo:

```
public class Pessoa {
    String nome;
}
```

- Mesmo sem escrever explicitamente, essa classe é equivalente a:

```java
public class Pessoa extends Object {
    String nome;
}
```

### 🧠 Métodos herdados de Object:

- toString(): representação textual do objeto
- equals(Object obj): compara se dois objetos são "iguais"
- hashCode(): usado em estruturas como HashMap
- getClass(): retorna a classe do objeto em tempo de execução
- clone(): cria uma cópia (se suportado)
- finalize(): chamado antes do garbage collector remover o objeto

---

## 📂 Pacote java.lang

### 📌 O que é?

- O pacote java.lang contém as classes fundamentais da linguagem Java.
- É importado automaticamente, ou seja, não precisa usar import.

### 🚀 Principais classes de java.lang:

- Object → superclasse de tudo
- String, StringBuilder, StringBuffer
- Math, Integer, Double, Boolean
- System, Runtime, Thread, Exception, Throwable

### ✅ Dicas:

- Você pode sobrescrever métodos de Object para adaptar o comportamento da sua classe, como por exemplo:

```java
@Override
public String toString() {
    return "Nome: " + this.nome;
}
```

---

## 📝 Sobrescrevendo toString() com @Override

### 📌 O que é?

- O método toString() vem da classe Object e serve para representar um objeto como texto.
- Por padrão, retorna algo como: MinhaClasse@3fa7efb9 (nome da classe + hashcode).
- Ao sobrescrever (@Override), você pode definir uma saída legível para depuração, logs, prints etc.

### 🧱 Exemplo:

```java
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$ " + preco;
    }
}
```

### ▶️ Uso:

```java
Produto p = new Produto("Caderno", 14.99);
System.out.println(p); // Saída: Produto: Caderno, Preço: R$ 14.99
```
- Quando usamos System.out.println(obj);, o Java chama automaticamente obj.toString().

### ✅ Dica:

- Sempre que quiser que sua classe tenha uma representação de texto personalizada e útil, sobrescreva toString() com @Override.

---

## 🏗️ Construtores em Java

### 📌 O que é?

- Um construtor é um método especial que é chamado automaticamente quando um objeto é instanciado.
- Serve para inicializar atributos de um objeto.
- Tem o mesmo nome da classe e não tem tipo de retorno (nem void).

### 🧱 Exemplo:
```java
public class Filme {
    private String titulo;
    private int ano;

    // Construtor
    public Filme(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return titulo + " (" + ano + ")";
    }
}
```
### ▶️ Instanciando um objeto com construtor:

```java
Filme f = new Filme("Matrix", 1999);
System.out.println(f); // Matrix (1999)
```
### 🔁 Construtor padrão

- Se nenhum construtor for declarado, o compilador cria um construtor padrão (sem parâmetros) automaticamente.
- Se você criar qualquer construtor, o padrão deixa de ser gerado.

```java
public class Pessoa {
    public Pessoa() {
    System.out.println("Pessoa criada!");
    }
}
```

### 🧠 Dicas:

- Você pode ter vários construtores com parâmetros diferentes (sobrecarga).
- Use this(...) para chamar outro construtor da mesma classe.