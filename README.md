IFelse00 – Verificador de Maioridade

Este é um programa em **Java** usando **Swing** para criar uma interface gráfica simples que verifica se a pessoa é **maior ou menor de idade** com base na idade informada pelo usuário.
---
##  Como funciona

O programa possui:
- Um **campo de texto** para digitar a idade.
- Um **botão** para verificar.
- Um **rótulo** (label) para mostrar o resultado.

Ao clicar no botão **"Verificar"**, o programa:
1. Lê o valor digitado.
2. Converte para número.
3. Usa uma **estrutura condicional (IF/ELSE)** para decidir:
   - **Maior ou igual a 18** → Mostra "MAIOR DE IDADE" em **verde**.
   - **Menor que 18** → Mostra "MENOR DE IDADE" em **vermelho**.
4. Se o valor digitado não for um número, mostra uma mensagem de erro em vermelho.

---

## Estrutura do código

## 1️Pacote e imports
O código está no pacote `com.minhaempresa.ifelse00` e importa:
- **Swing**: `JFrame`, `JLabel`, `JTextField`, `JButton`
- **AWT**: `Color`, `Font`
- **Eventos**: para capturar o clique no botão.

---

## 2️ Classe `IFelse00`
- **Atributos**
  - `txtIdade`: campo para digitar a idade.
  - `lblResultado`: exibe o resultado.

- **Construtor**
  - Define título, tamanho e layout.
  - Cria e adiciona os componentes na janela.
  - Configura a cor, fonte e borda do rótulo de resultado.
  - Centraliza a janela na tela.

---

## Método `verificarMaioridade()`
- Converte o texto para número (`Integer.parseInt()`).
- Se **idade >= 18** → Mostra mensagem de maioridade em verde.
- Caso contrário → Mostra mensagem de menoridade em vermelho.
- Se houver erro na conversão → Mostra mensagem de erro em vermelho.

---

## Método `main()`
- Executa o programa na **Thread de interface gráfica** (`SwingUtilities.invokeLater`).
- Cria o objeto `IFelse00` e o torna visível.

---
##  Exemplo de uso
1. Digite **"20"** → Resultado: `MAIOR DE IDADE (20 anos)` em verde.
2. Digite **"15"** → Resultado: `MENOR DE IDADE (15 anos)` em vermelho.
3. Digite **"abc"** → Resultado: `Erro: Digite um número válido!` em vermelho.
