package desafios.herança;

public class ninja {

    String nome;
    String aldeia;
    String missao;
    String NivelDaMissao;
    String statusMissao;
    int idade;

    public void mostrarinforacoes(){
        System.out.println("meu nome é: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Missao:  " + missao);
        System.out.println("Nivel da missao:  " + NivelDaMissao);
        System.out.println("Status da missão " + statusMissao);
    }

}
