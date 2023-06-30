public class App {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Barbatos";
        heroi.nivel = 7;
        heroi.forca = 16;

        heroi.mostrarStatus();
        
        //Chamei o método atacar e passei como argumento um String "Hydra"
        heroi.atacar("Hydra", "");

      

    }
}
