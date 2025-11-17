package desafios.herança;

public class uchiha extends ninja{
    String habilidade;

    public void ativar(){
        if (habilidade == null){
            System.out.println("-----------------");
            mostrarinforacoes();
            System.out.println("-----------------");
        }else {
            System.out.println("-----------------");
            mostrarinforacoes();
            System.out.println("habilidade: "  + habilidade);}
            System.out.println("-----------------");
    }
}
