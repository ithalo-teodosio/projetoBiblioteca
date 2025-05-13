# 📚 Sistema de Gerenciamento de Biblioteca

> 🔁 *This README is available in both **Portuguese** and **English**. Scroll down for the 🇺🇸 English version.*

---

## 📌 Sobre o Projeto

Projeto simples em Java que simula o gerenciamento de uma biblioteca no terminal.  
Utiliza os princípios da **Programação Orientada a Objetos (POO)** para cadastro e gerenciamento de **livros** e **revistas**.

---

## 🚀 Funcionalidades

- 📖 Adicionar livro com título, autor e gênero
- 📰 Adicionar revista com título, autor e número da edição
- 🔍 Pesquisar material por título
- ❌ Excluir material por título
- 📋 Listar todos os materiais cadastrados

---

## 🧱 Estrutura do Projeto

src/
├── main/ → Classe principal com menu interativo
├── models/ → Classes base: Material, Livro e Revista
├── biblioteca/ → Classe Biblioteca com regras de negócio
└── enums/ → Enum com os gêneros disponíveis


---

## 💻 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/ithalo-teodosio/projetoBiblioteca.git
cd projetoBiblioteca
```

2. Compile e execute com sua IDE favorita (IntelliJ, Eclipse)
ou diretamente no terminal:

```bash
javac src/**/*.java
java src/main/Main
```

💡 Posíveis melhorias
- 💾 Persistência com arquivos ou banco de dados

- 🖼️ Interface gráfica (Swing ou JavaFX)

- 🔠 Filtros por autor, gênero, tipo

- 📊 Ordenação de materiais

🧠 Conceitos aplicados
- Java 11+

- POO (herança, polimorfismo)

- enum e encapsulamento

- Manipulação de entrada via Scanner

✍️ Autor
Feito por @ithalo-teodosio

---

🇺🇸 Library Management System
🇧🇷 This README is also available in Portuguese above.

📌 About the Project
A simple Java project that simulates a library management system in the terminal.
It uses Object-Oriented Programming (OOP) to register and manage books and magazines.

🚀 Features
📖 Add book with title, author, and genre

📰 Add magazine with title, author, and issue number

🔍 Search material by title

❌ Delete material by title

📋 List all registered materials

🧱 Project Structure
vbnet

src/
├── main/             → Main class with interactive menu
├── models/           → Base classes: Material, Book, Magazine
├── biblioteca/       → Biblioteca class with logic
└── enums/            → Enum for available genres

💻 How to Run

1. Clone the repository:

```bash
git clone https://github.com/ithalo-teodosio/projetoBiblioteca.git
cd projetoBiblioteca
```

2. Compile and run using your favorite IDE or via terminal:

```bash
javac src/**/*.java
java src/main/Main
```

💡 Future improvements
- 💾 Data persistence with files or database

- 🖼️ Graphical interface (Swing or JavaFX)

- 🔠 Filter by author, genre, or type

- 📊 Sort materials

🧠 Concepts used
- Java 11+

- OOP (inheritance, polymorphism)

- Enums and encapsulation

- Scanner for terminal input

✍️ Author
Built by @ithalo-teodosio
