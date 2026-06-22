# Jogo da Forca

![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=openjdk)
![License](https://img.shields.io/badge/license-MIT-blue?style=flat-square)

## 📌 Sobre o Projeto

Implementação do clássico **Jogo da Forca** rodando no terminal, desenvolvida em Java puro como exercício de lógica e fundamentos da linguagem. O jogador tenta descobrir uma palavra secreta chutando letras uma a uma, com um limite de tentativas antes de perder.

## 🚀 Tecnologias Utilizadas

- Java 21
- Eclipse IDE

## 🎮 Como Jogar

1. Ao iniciar, o programa sorteia aleatoriamente uma das palavras disponíveis.
2. A palavra é exibida como uma sequência de `_`, um por letra.
3. A cada rodada, o jogador digita uma letra.
   - **Acerto**: a(s) posição(ões) correspondente(s) são reveladas.
   - **Erro**: o contador de tentativas diminui em 1.
4. O jogo termina quando:
   - Todas as letras forem descobertas → **vitória**
   - As 6 tentativas forem esgotadas → **derrota**

**Palavras disponíveis:** `cobra`, `elefante`, `girafa`

### Exemplo de execução

```
Palavra: [_, _, _, _, _, _, _, _]
Chute uma letra: e

Palavra: [e, _, e, _, _, _, _, e]
Chute uma letra: x
Você tem mais: 5 tentativas
```

## ▶️ Como Executar

**Pré-requisito:** [JDK 21](https://www.oracle.com/java/technologies/downloads/) instalado.

```bash
# Clone o repositório
git clone https://github.com/MarceloJustin/ProjetoJogoDaForca.git
cd ProjetoJogoDaForca

# Compile
javac -d bin src/application/Program.java

# Execute
java -cp bin application.Program
```

## 👨‍💻 Autor

**Marcelo Justin**

[![GitHub](https://img.shields.io/badge/GitHub-MarceloJustin-181717?style=flat-square&logo=github)](https://github.com/MarceloJustin)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-marcelojustin-0A66C2?style=flat-square&logo=linkedin)](https://www.linkedin.com/in/marcelojustin)

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
