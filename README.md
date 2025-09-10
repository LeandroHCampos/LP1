<h1 align="center">
  Exercício 1 - Teste de mesa.
</h1>
<img width="1219" height="562" alt="Captura de tela 2025-09-01 204838" src="https://github.com/user-attachments/assets/f9b7ff1f-7fb0-4aa6-b9d8-d797cc42a40a" />
<h1 align="center">
  Exercício 2 - Musica.
</h1>
<p align="center">
  Horizonte Azul - Leandro e Leonardo.
</p>
<img width="1200" height="272" alt="Diagrama em branco (4)" src="https://github.com/user-attachments/assets/57d7b564-9a7f-4a3c-a1ec-63264b1a4c14" />
<h1 align="center">
  Exercício 3 - Imagem Vik Muniz.
</h1>
<p align="center">
  Track brawl 
</p>
<p align="center">
  <img width="628" height="787" alt="Captura de tela 2025-09-09 223324" src="https://github.com/user-attachments/assets/36bb3308-7a63-44d9-8a39-5e444118d809" />
</p>

<p align="center">
  <img width="1189" height="249" alt="Diagrama em branco (5)" src="https://github.com/user-attachments/assets/079a9861-2483-4a17-b3df-ee3a7e92fe2c" />
</p>

<h1 align="center">
  Exercício 4 - Imagem Doodle.
</h1>

<p align="center">
  Cobra Criada - Mauro Martins
</p>

<p align="center">
  <img width="599" height="748" alt="Captura de tela 2025-09-09 212313" src="https://github.com/user-attachments/assets/902ba1fe-cb85-4748-82e4-ddc1489f943c" />
</p>

<p align="center">
  <img width="1372" height="309" alt="Diagrama em branco (6)" src="https://github.com/user-attachments/assets/d033bb21-a3b1-4aac-9306-1a79c8553210" />
</p>


<h1 align="center">
  Exercício 5 - Video.
</h1>

<p align="center">
  <a href="https://www.youtube.com/watch?v=dGEB6QUjWWw">
    Corinthians 3 x 1 Boca Juniors ● Final Libertadores 2012 Gols e Melhores Momentos HD
  </a>
</p>

<p align="center">
  <img width="1372" height="299" alt="Diagrama em branco (7)" src="https://github.com/user-attachments/assets/a12bb46e-9448-48f7-af00-ee587fb9fc11" />
</p>


<h1 align="center">
  Exercício 7 - Classe Java para Calculo de média.
</h1>


```java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("P1: ");
        double P1 = input.nextDouble();
        System.out.println("E1: ");
        double E1 = input.nextDouble();
        System.out.println("E2: ");
        double E2 = input.nextDouble();
        System.out.println("X: ");
        double X = input.nextDouble();
        System.out.println("Sub: ");
        double sub = input.nextDouble();
        System.out.println("API: ");
        double api =  input.nextDouble();

        double y = P1 * 0.5 + (E1 * 0.2) + (E2 * 0.3) + X + (sub * 0.15) - 5.9;

        double media = ((P1*0.5 + (E1 * 0.2) + (E2 * 0.3) + X + (sub*0.15)) * 0.5)+ Math.max(y,0) / y * (api * 0.5);

        System.out.println("Media: " + media);
        
    }
}
    
```


<h1 align=center>
  Exercicio 8
</h1>
<h2 align=center>
  Classes do exercício 2
</h2>

```java

public class Apartamento {
    private int numero;
    private String vista;
    private boolean silencioso;

    public Apartamento(int numero, String vista, boolean silencioso) {
        this.numero = numero;
        this.vista = vista;
        this.silencioso = silencioso;
    }

    public void olharJanela() {
        System.out.println("Olhando pela janela do apartamento " + numero + ", vejo: " + vista);
    }

}
```

```java

public class Coracao {
    private boolean batendo;
    private int nivelSaudade;
    private boolean machucado;

    public Coracao(boolean batendo, int nivelSaudade, boolean machucado) {
        this.batendo = batendo;
        this.nivelSaudade = nivelSaudade;
        this.machucado = machucado;
    }

    public void chorar(){
        if(batendo == true || machucado == true){
            System.out.println("Coração não bate\n" +
                    "Apanha no meu peito\n" +
                    "Morto de saudade\n" +
                    "Eu choro, não tem jeito");
        }

    }
}


```

```java

public class Horizonte {
    private String cor;
    private boolean visivel;
    private boolean luzesABrilhar;

    public Horizonte(String cor, boolean visivel, boolean luzesABrilhar) {
        this.cor = cor;
        this.visivel = visivel;
        this.luzesABrilhar = luzesABrilhar;
    }

    public void mudarCor() {
        if (!cor.equalsIgnoreCase("azul")) {
            cor = "azul";
        }else{
            cor = "vermelho";
        }
    }
}

```

<h2 align=center>
  Classes do exercício 3
</h2>

```java

public class Chapéu {
    private String tipo;
    private String cor;
    private String material;

    public Chapéu(String tipo, String cor, String material) {
        this.tipo = tipo;
        this.cor = cor;
        this.material = material;
    }

    public void mostrarDetalhes() {
        System.out.println("Chapéu do tipo: " + tipo + ", cor: " + cor + ", feito de: " + material);
    }
}


```

```java

public class PessoasNaImagem {
    private String roupa;
    private int quantidadeDePessoas;
    private boolean segurandoAlavanca;

    public PessoasNaImagem(String roupa, int quantidadeDePessoas, boolean segurandoAlavanca) {
        this.roupa = roupa;
        this.quantidadeDePessoas = quantidadeDePessoas;
        this.segurandoAlavanca = segurandoAlavanca;
    }

    public void brigarPelaAlavanca() {
        if(segurandoAlavanca) {
            System.out.println("Tem "+quantidadeDePessoas+" pessoas brigando pela alavanca");
        }
    }
}

```

```java

public class TrilhoDoTrem {
    public String material;
    public boolean alavanca;
    public int comprimento;

    public TrilhoDoTrem(String material, boolean alavanca, int comprimento) {
        this.material = material;
        this.alavanca = alavanca;
        this.comprimento = comprimento;
    }

    public void mudarEstadoAlavanca(){
        if (alavanca == true){
            alavanca = false;
        }else {
            alavanca = true;
        }
    }
}


```

<h2 align=center>
  Classes do exercício 4
</h2>

```java

public class Cachorro {
    private String nome;
    private String cor;
    private String raca;

    public Cachorro(String nome, String cor, String raca) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
    }

    public void latir(){
        System.out.println("AU AU AU!");
    }

    public void correr(){
        System.out.println(nome + " Está Correndo!");
    }

    public void exibirCachorro(){
        System.out.println( "Nome: " + nome
                            +"\nCor: " + cor
                            +"\nRaca: " + raca);

    }
}

```

```java

public class Cobra {
    private String especie;
    private double comprimento;
    private boolean venenosa;

    public Cobra(String especie, double comprimento, boolean venenosa) {
        this.especie = especie;
        this.comprimento = comprimento;
        this.venenosa = venenosa;
    }

    public void rastejar() {
        System.out.println("A cobra está rastejando silenciosamente...");
    }

    public void silvar() {
        System.out.println("A cobra faz 'ssssss' para se defender.");
    }

    public void mostrarInformacoes() {
        System.out.println("Espécie: " + especie);
        System.out.println("Comprimento: " + comprimento + " metros");
        System.out.println("É venenosa? " + (venenosa ? "Sim" : "Não"));
    }
}

```

```java

public class Lampada {
    private String cor;
    private int potencia;
    private boolean ligada;

    public Lampada(String cor, int potencia, boolean ligada) {
        this.cor = cor;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    public void ligar(){
        ligada = true;
        System.out.println("Está Ligada!");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Está desligada!");
    }

    public void estadoLampada() {
        System.out.println(ligada);
    }
}

```


<h2 align=center>
  Classes do exercício 5
</h2>

```java

public class Bola {
    private String marca;
    private String cor;
    private double circunferencia;

    public Bola(String marca, String cor, double circunferencia) {
        this.marca = marca;
        this.cor = cor;
        this.circunferencia = circunferencia;
    }
    public void chutar() {
        System.out.println("Você chutou a bola com força!");
    }

    public void inflar(double psi) {
        System.out.println("A bola foi inflada com " + psi + " PSI.");
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Circunferência: " + circunferencia + " cm");
    }
}

```

```java

public class Grama {
    private String tipo;
    private double altura;
    private boolean estaMolhada;

    public Grama(String tipo, double altura, boolean estaMolhada) {
        this.tipo = tipo;
        this.altura = altura;
        this.estaMolhada = estaMolhada;
    }

    public void crescer(double crescimento) {
        altura += crescimento;
        System.out.println("A grama cresceu " + crescimento + " cm. Nova altura: " + altura + " cm.");
    }

    public void molhar() {
        estaMolhada = true;
        System.out.println("A grama foi molhada.");
    }

    public void mostrarInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Está molhada? " + (estaMolhada ? "Sim" : "Não"));
    }
}

```

```java

public class Jogador {

    private String nome;
    private int numeroCamisa;
    private String posicao;

    public Jogador(String nome, int numeroCamisa, String posicao) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
    }

    public void correr() {
        System.out.println(nome + " está correndo em campo.");
    }

    public void chutar() {
        System.out.println(nome + " chutou a bola!");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Número da camisa: " + numeroCamisa);
        System.out.println("Posição: " + posicao);
    }
}


```
