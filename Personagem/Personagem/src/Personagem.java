import java.util.Random;

public class Personagem {

    String nome;
    int nivel;
    int forca;

    // void --> significa que não está retornando nada
    void mostrarStatus() {

        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);

    }
    int calcularDano() {
        Random gerador = new Random();
        int dado20faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20faces;
        return dano;
    }

    // método que não retorna nada e recebe um parámetro alvo que é o do tipo String
    void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano();
        // "" o tamanho (.length) é igual 0
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou a '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);

        }

    }

}
