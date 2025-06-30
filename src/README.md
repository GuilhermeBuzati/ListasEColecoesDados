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