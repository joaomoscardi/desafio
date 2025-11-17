package desafios.herança;

public class uchiha extends ninja{
    String habilidade;

    public void ativar(){
        if (habilidade == null){
            mostrarinforacoes();
            System.out.println("-----------------");
        }else {

            mostrarinforacoes();
            System.out.println("habilidade: "  + habilidade);}
            System.out.println("-----------------");
    }
}
