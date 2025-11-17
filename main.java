package desafios.herança;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        uchiha [] ninjas = new uchiha[3];
        int opcoes = 0;
        int i = 0;
        int del = 0;

        while (opcoes != 5 ) {
            System.out.println("menu de cadastro:");
            System.out.println("1 -  cadastrar ninja");
            System.out.println("2 -  cadastrar habilidade e especial");
            System.out.println("3 -  listar ninja ");
            System.out.println("4 -  deletar");
            opcoes = scanner.nextInt();
            scanner.nextLine();

            switch (opcoes) {
                case 1:
                    if (i < 3) {
                        ninjas[i] = new uchiha();
                        System.out.println("Nome: ");
                        ninjas[i].nome = scanner.nextLine();
                        System.out.println("Idade: ");
                        ninjas[i].idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Aldeia: ");
                        ninjas[i].aldeia = scanner.nextLine();
                        System.out.println("Missao: ");
                        ninjas[i].missao = scanner.nextLine();
                        System.out.println("Nivel da missao: ");
                        ninjas[i].NivelDaMissao = scanner.nextLine();
                        System.out.println("Status da missao: ");
                        ninjas[i].statusMissao = scanner.nextLine();
                        i++;
                    } else {
                        System.out.println("Numero cheio");
                    }
                    break;
                case 2:
                    if (i < 3) {
                        ninjas[i] = new uchiha();
                        System.out.println("Nome: ");
                        ninjas[i].nome = scanner.nextLine();
                        System.out.println("Idade: ");
                        ninjas[i].idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Aldeia: ");
                        ninjas[i].aldeia = scanner.nextLine();
                        System.out.println("Missao: ");
                        ninjas[i].missao = scanner.nextLine();
                        System.out.println("Nivel da missao: ");
                        ninjas[i].NivelDaMissao = scanner.nextLine();
                        System.out.println("Status da missao: ");
                        ninjas[i].statusMissao = scanner.nextLine();
                        System.out.println("Habilidade especial: ");
                        ninjas[i].habilidade = scanner.nextLine();
                        i++;
                        break;
                    } else {
                        System.out.println("NInja cheio");
                    }
                case 3:

                    for (int j = 0; j < i; j++) {
                        if (ninjas[j] != null) {
                            ninjas[j].ativar();
                        }
                    }
                    break;
                case 4:
                    if (i > 0) {
                        for (int j = 0; j < i; j++) {
                            System.out.println(j + 1 + "º " + ninjas[j].nome);
                        }

                        System.out.println("QUal ninja voce deseja deletar? ");
                        del = scanner.nextInt() - 1;
                        // Move todos para trás
                        if (del < 3) {
                            if (ninjas[del] != null) {
                                for (int j = del; j < i - 1; j++) {
                                    ninjas[j] = ninjas[j + 1];
                                }
                                ninjas[i - 1] = null;
                                i--;
                                System.out.println("Ninja deletado com sucesso!");
                            }else {
                                System.out.println("Opção invalida;");
                            }
                        }else {
                            System.out.println("Opção invalida");
                            break;
                        }
                    }else {
                        System.out.println("Nao tem ninja jumento");
                    }

                break;
            }
        }
    }
}
