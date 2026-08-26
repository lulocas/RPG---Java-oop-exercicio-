# 🎮 Mini RPG — Prática de POO em Java

Mini projeto desenvolvido com o objetivo de **praticar e consolidar conceitos de Programação Orientada a Objetos (POO) em Java**.

A proposta é construir um pequeno sistema de RPG no qual diferentes personagens possuem atributos, habilidades, armas, inventários e podem participar de batalhas.

> 🚧 **Projeto de estudo:** a implementação está sendo desenvolvida como exercício prático após o estudo dos fundamentos de POO em Java.

---

## 🎯 Objetivo

Aplicar na prática os principais conceitos de POO estudados, evitando exercícios isolados e criando um sistema em que as diferentes funcionalidades interagem entre si.

O projeto deve permitir a criação de diferentes tipos de personagens, cada um com características e comportamentos próprios.

---

## 🧠 Conceitos praticados

Durante o desenvolvimento serão utilizados:

* Classes e objetos
* Encapsulamento
* Herança
* Abstração
* Classes abstratas
* Interfaces
* Polimorfismo
* Sobrescrita de métodos (`@Override`)
* Sobrecarga de métodos
* Enumeradores (`enum`)
* Modificadores de acesso
* Construtores
* `List` e coleções
* Composição entre classes
* `static` e `final`

---

## ⚔️ Funcionalidades

### 👤 Personagens

O sistema contará inicialmente com três tipos de personagens:

* Guerreiro
* Mago
* Arqueiro

Todos possuem características comuns, como:

* Nome
* Nível
* Vida atual
* Vida máxima
* Experiência
* Tipo de personagem
* Arma equipada

Cada personagem também possui características específicas relacionadas à sua classe.

---

### ⚔️ Sistema de ataques

Cada tipo de personagem possui uma forma diferente de atacar.

O dano do ataque deve considerar as características do personagem e a arma equipada.

Exemplo conceitual:

```text
Dano = atributo principal + dano da arma
```

O objetivo é utilizar **polimorfismo** para permitir que cada personagem implemente seu próprio comportamento de ataque.

---

### ✨ Habilidades especiais

Cada personagem possui uma habilidade especial diferente.

Exemplos:

* Guerreiro → Golpe Devastador
* Mago → Bola de Fogo
* Arqueiro → Flecha Perfurante

As habilidades serão implementadas utilizando uma **interface**.

---

### 🗡️ Sistema de armas

O personagem poderá equipar diferentes tipos de armas.

Exemplos:

* Espada
* Machado
* Arco
* Cajado

Cada arma possui um valor de dano próprio.

---

### 🎒 Inventário

Cada personagem possui um inventário capaz de armazenar itens.

O inventário deverá permitir:

* Adicionar itens
* Remover itens
* Listar itens
* Verificar se determinado item está disponível

Também existirão diferentes tipos de itens, como poções.

---

### 🧪 Poções

Poções podem ser utilizadas durante o jogo para recuperar vida.

A cura deve respeitar a vida máxima do personagem.

Por exemplo:

```text
Vida atual: 80
Vida máxima: 100
Cura: 50

Resultado: 100
```

A vida nunca deve ultrapassar o limite máximo.

---

### 🆙 Sistema de experiência

Personagens podem ganhar experiência ao participar de batalhas.

Ao atingir a quantidade necessária de XP, o personagem sobe de nível.

Ao subir de nível, alguns atributos podem ser aumentados, como:

* Vida máxima
* Atributo principal
* Outros atributos definidos durante a implementação

---

### ⚔️ Sistema de batalha

O sistema contará com uma classe responsável por controlar as batalhas entre personagens.

Uma batalha deve:

1. Receber dois personagens.
2. Definir quem inicia.
3. Realizar os ataques alternadamente.
4. Verificar se o adversário foi derrotado.
5. Continuar até que um dos personagens seja derrotado.
6. Declarar o vencedor.
7. Conceder experiência ao vencedor.

---

## 🏗️ Estrutura planejada

A estrutura inicial do projeto pode seguir esta organização:

```text
src/
│
├── personagem/
│   ├── Personagem.java
│   ├── Guerreiro.java
│   ├── Mago.java
│   └── Arqueiro.java
│
├── enums/
│   ├── TipoPersonagem.java
│   ├── TipoArma.java
│   └── TipoItem.java
│
├── interfaces/
│   └── HabilidadeEspecial.java
│
├── inventario/
│   ├── Inventario.java
│   └── Item.java
│
├── batalha/
│   └── Batalha.java
│
└── Main.java
```

A estrutura pode ser modificada conforme o projeto evoluir.

---

## 📚 Regras do exercício

O projeto está sendo desenvolvido como uma forma de **fixar os conceitos de POO através da prática**.

Por isso, a implementação deve ser construída gradualmente, evitando copiar soluções prontas.

### Etapas

* [x] Criar a classe abstrata `Personagem`
* [x] Criar os atributos e métodos básicos
* [ ] Criar os enums
* [ ] Criar `Guerreiro`, `Mago` e `Arqueiro`
* [ ] Implementar o polimorfismo nos ataques
* [ ] Criar a interface de habilidades especiais
* [ ] Criar o sistema de armas
* [ ] Criar o inventário
* [ ] Criar os itens e poções
* [ ] Implementar experiência e níveis
* [ ] Criar o sistema de batalha
* [ ] Integrar todas as funcionalidades
* [ ] Refatorar e melhorar o código

---

## 🚀 Objetivo final

Ao final do projeto, a aplicação deverá permitir criar personagens, equipá-los, gerenciar seus inventários, utilizar habilidades e participar de batalhas utilizando os conceitos de **Programação Orientada a Objetos**.

O principal objetivo não é criar um RPG completo, mas sim utilizar um projeto pequeno para transformar os conceitos teóricos de POO em código funcional.

---

## 🛠️ Tecnologias

* **Java**
* **Git**
* **GitHub**
* **InteliJ IDEA**

---

## 📌 Status

🚧 **Em desenvolvimento**

Projeto criado para fins de estudo e prática de Programação Orientada a Objetos em Java.
