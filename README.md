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
  
</p>
<p align="center">
  
</p>
<p align="center">
  
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
  Exercicio 7
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
