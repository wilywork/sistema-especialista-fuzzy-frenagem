# Frenagem Fuzzy com jFuzzyLogic

Este projeto implementa um sistema de frenagem fuzzy usando a biblioteca jFuzzyLogic. O programa recebe variáveis de entrada como `Velocidade`, `Distancia`, `Condicao_Estrada`, `Peso_Veiculo`, e `Tempo`, e calcula a `Frenagem` com base em regras fuzzy.

## Pré-requisitos

- **Java 17** ou superior.
- **jFuzzyLogic** (arquivo `jFuzzyLogic.jar`).

## Passos para Visualizar

No terminal execute o seguinte comando para compilar:

```bash
java -jar jFuzzyLogic.jar frenagem.fcl
```


## Passos para Compilar e Executar

### 1. Compilar o programa Java

No terminal execute o seguinte comando para compilar:

#### **Windows**:
```bash
javac -cp .;jFuzzyLogic.jar TesteFrenagem.java
```

#### **Linux/Mac**:
```bash
javac -cp .:jFuzzyLogic.jar TesteFrenagem.java
```

### 2. Executar o programa Java

Após a compilação execute o programa:

#### **Windows**:
```bash
java -cp .;jFuzzyLogic.jar TesteFrenagem
```

#### **Linux/Mac**:
```bash
java -cp .:jFuzzyLogic.jar TesteFrenagem
```

### 3. Resultado Esperado

Ao executar o programa verá seguinte saída:

```
Teste 1:
Frenagem calculada: 61.341458184417405%

Teste 2:
Frenagem calculada: 54.916716306775804%

Teste 3:
Frenagem calculada: 72.5877574370706%
```