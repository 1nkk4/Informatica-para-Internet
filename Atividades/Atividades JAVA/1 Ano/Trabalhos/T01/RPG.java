package trabalho;
import java.util.Scanner; 
import java.util.Random;

public class Rooms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random alea = new Random();
        String nome;

        int vida = 10;
        int vidaInimigo = 10;

        System.out.println("Você acorda numa sala escura e pequena, no meio dela tem um homem branco e velho sentando em uma cadeira com uma mesa em sua frente, roupas desgastadas, uma barba que vai até os seu peito e olhos que pareciam estar fechados.");
        System.out.println("Velho: Ah! Finalmente alguem chegou! Varios vieram antes de você então eu vou explicar com poucos detalhes... \nPara sair daqui, você deve abrir inúmeras portas, tudo para chegar em um destino incerto.");
        System.out.println("O velho puxa um papel. \nVelho: Qual o seu nome? Não se preocupe com o porque, é apenas uma coisa que nós precisamos para os recordes. \nO velho te entrega uma caneta de tinta preta.");
        nome = scanner.nextLine();

        System.out.printf("Velho: %s? Hehehehe... HAHAHAHA! É claro, um humano! Eu quase esqueci como humanos se pareciam com o passar do tempo! Eu só consegui reconhecer pela natureza do seu nome!\n", nome);

        System.out.println("O homem levanta a sua mão e estala os seus dedos. \nA sala começa a tremer até que atrás do homem aparece 3 portas.");
        System.out.println("Velho: Escolha uma e seu destino vai ser decidido. \nO homem sorri de maneira tenebrosa... Ele senta na cadeira olhando para você fixamente.");

        // Começo 
        int escolha = 0;

        // laço até escolher 1, 2 ou 3
        while (escolha != 1 && escolha != 2 && escolha != 3) {
            System.out.println("\n[1] Porta da direita");
            System.out.println("[2] Porta do meio");
            System.out.println("[3] Porta da esquerda");
            System.out.println("[4] Falar com o velho");
            escolha = scanner.nextInt();

            if (escolha == 4) {
                System.out.println("Você tenta falar com o homem, apesar das pupilas do homem te seguirem, ele não responde de maneira nenhuma...");
            } else if (escolha < 1 || escolha > 4) {
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        //Primeira escolha
        if (escolha == 1) {
            System.out.println("Você abre a porta da direita. Você mal consegue ver o que tem dentro antes de ser empurrado, você mal consegue reagir até que a porta atrás de você foi trancado.");
            System.out.println("A sala onde você está é uma floresta do tamanho de um cubilo, a folhagem parece seca e amontoada. \nEnquanto você observa o ambiente, você olha para o chão e encontra dois objetos, um regador e um isqueiro. \nVocê considera o significado desses objetos por um momento, até que você se distraiu com algumas das folhagens se mexendo sozinhas, elas tremem por um tempo até revelarem com uma porta por trás.");
            
            escolha = 0;
            while (escolha < 1 || escolha > 3) {
                System.out.println("[1] Usar o isqueiro \n[2] Passar pela porta \n[3] Usar o regador");
                escolha = scanner.nextInt();
                
                if (escolha < 1 || escolha > 3) {
                    System.out.println("Escolha inválida! Tente novamente.");
                }
            }

            if (escolha == 1) { // Usar o isqueiro
                System.out.println("Você tira o isqueiro do seu bolso e então com cuidado gira a roda de faísca, uma frágil chama se acende. E essa chama ilumina o caminho, uma porta oculta é exposta.");
                System.out.println("Você se sente atraído por esta porta, parece que uma força está te puxando ignorando a anterior e seguindo por essa a frente.");
                System.out.println("O local é mal iluminado mas a sua pequena chama ilumina o ao redor, você sente o cheiro icônico da grama depois da chuva.");
                System.out.println("Você vê símbolos estranhos marcados nas paredes e junto de cada um deles uma entrada.");
                System.out.println("O primeiro símbolo se parece com sol mas em seu caminho há apenas escuridão.");
                System.out.println("O segundo parece ser algo como um eclipse juntando o sol e a lua iluminado como um final da tarde em golden hour. Ele te chama a atenção mas o calor parece sempre ser absorvido pela frente fria.");
                System.out.println("O último é a lua e em seu caminho parece haver luz mas nada que seu pequeno cérebro consegue entender.");
                
                // Terceira escolha para o caminho do isqueiro
                escolha = 0;
                while (escolha < 1 || escolha > 3) {
                    System.out.println("\n[1] Escolher o caminho do sol");
                    System.out.println("[2] Escolher o caminho do eclipse");
                    System.out.println("[3] Escolher o caminho da lua");
                    escolha = scanner.nextInt();
                    
                    if (escolha < 1 || escolha > 3) {
                        System.out.println("Escolha inválida! Tente novamente.");
                    }
                }
                
                if (escolha == 1) { // Caminho do sol
                    System.out.println("Você caminha em direção ao símbolo do sol. A escuridão se intensifica a cada passo.");
                    System.out.println("Logo, você não consegue mais ver nada, e a chama do seu isqueiro parece ter se apagado.");
                    System.out.println("Uma sensação de calor começa a envolver seu corpo. O calor aumenta rapidamente até se tornar insuportável.");
                    System.out.println("Enquanto você tenta se orientar na escuridão, você sente seu corpo absorver uma energia mas de fonte invisível.");
                    System.out.println("De repente, seu corpo começa a queimar e brilhar intensamente. A energia do sol transformou você em um ser de luz pura.");
                    System.out.println("Você se tornou um andarilho de luz, condenado a vagar eternamente por este labirinto como fonte de luz.");
                    System.out.println("\nFIM - Andarilho de luz");
                }
                else if (escolha == 2) { // Caminho do eclipse
                    System.out.println("Você segue pelo caminho do eclipse, onde o calor e o frio se encontram em perfeito equilíbrio.");
                    System.out.println("À medida que avança, você sente a temperatura de seu corpo oscilar entre calor e frio, como se sentisse dois corpos.");
                    System.out.println("No final do corredor, você encontra um espelho que não reflete sua imagem, mas outro alguém como você.");
                    System.out.println("Ao tocar o espelho, você sente seu corpo se dividir.");
                    System.out.println("Você se tornou o que refletia os dois lados do espelho, capaz de perceber ambos, mas preso entre eles para sempre.");
                    System.out.println("\nFIM - Gêmeos");
                }
                else { // Caminho da lua
                    System.out.println("O caminho da lua é surpreendentemente brilhante, mas com uma luz que seus olhos humanos não compreendem totalmente.");
                    System.out.println("Você sente seu conhecimento se expandir, sua cabeça dói, absorvendo sabedoria que não são sua e que você ainda não entende");
                    System.out.println("Ao final do caminho, você encontra um lago que reflete o céu noturno, mesmo estando em um ambiente fechado.");
                    System.out.println("Ao olhar para seu reflexo no lago, você percebe que seus olhos agora brilham com a mesma luz que o tempo compartilha.");
                    System.out.println("Você ganhou clarividência lunar - você agora tem a capacidade de ver o passado, futuro e presente a partir da visão da lua.");
                    System.out.println("\nFIM - Vidente Lunar");
                }
            }
            else if (escolha == 2) { // Passar pela porta
                System.out.println("Você atravessa a porta e então observa o ao redor");
                System.out.println("Algo parece errado nesta sala, você sente calor em um cenário frio.");
                System.out.println("O local parece esquecido, sons mecânicos podem ser escutados... '-- Máquinas?'");
                System.out.println("Na sua frente um painel numerado");
                
                boolean resolveuPainel = false;
                int tentativas = 0;
                
                while (!resolveuPainel && tentativas < 3) {
                    System.out.println("[1] Digitar valor [2] Olhar o ao redor [3] Tentar sair");
                    int escolhaSala = scanner.nextInt();

                    if (escolhaSala == 1) {
                        System.out.println("Digite o código de 3 dígitos: ");
                        int codigo = scanner.nextInt();
                        
                        if (codigo == 312) { // código correto: JHI → 10-8-9 → 3-1-2 (deslocamento -7)
                            System.out.println("Você ouve um clique mecânico e a porta à sua direita se abre lentamente!");
                            resolveuPainel = true;
                        } 
                        else {
                            System.out.println("Um som agudo ecoa pela sala. O código parece incorreto.");
                            tentativas++;
                        }
                    }
                    else if (escolhaSala == 2) {
                        System.out.println("Você olha ao redor e nota detalhes que havia perdido antes.");
                        System.out.println("No canto da sala há um papel amarelado com três letras escritas: JHI");
                        System.out.println("Abaixo das letras, uma nota: 'César perdeu 7 posições'");
                    }
                    else if (escolhaSala == 3) {
                        System.out.println("Você tenta sair, mas a porta está trancada. Precisa resolver o enigma...");
                    }
                }
                
                // Terceira escolha para o caminho do painel
                if (resolveuPainel) {
                    System.out.println("Ao passar pela porta aberta, você se depara com um corredor que se divide em três caminhos.");
                    System.out.println("No primeiro caminho, você vê engrenagens e vapor escapando de tubulações.");
                    System.out.println("No segundo, há uma luz azulada pulsante e sons eletrônicos.");
                    System.out.println("No terceiro, apenas escuridão, mas você sente uma leve brisa.");
                    
                    escolha = 0;
                    while (escolha < 1 || escolha > 3) {
                        System.out.println("\n[1] Seguir o caminho das engrenagens");
                        System.out.println("[2] Seguir o caminho da luz azul");
                        System.out.println("[3] Seguir o caminho escuro com brisa");
                        escolha = scanner.nextInt();
                        
                        if (escolha < 1 || escolha > 3) {
                            System.out.println("Escolha inválida! Tente novamente.");
                        }
                    }
                    
                    if (escolha == 1) { // Caminho das engrenagens
                        System.out.println("Você caminha entre máquinas a vapor e engrenagens gigantes.");
                        System.out.println("O calor aumenta gradualmente, e o barulho das máquinas é ensurdecedor.");
                        System.out.println("Você encontra um painel de controle central e percebe que está em um tipo de instalação militar abandonada.");
                        System.out.println("Ao examinar os controles, você acidentalmente ativa a energia do local.");
                        System.out.println("As luzes de todo o lugar ligam e a porta do atrás de você se fecha.");
                        System.out.println("'Modo de quarentena por tempo indeterminado ativado.'");
                        System.out.println("Você está preso");

                        System.out.println("\nFIM - Prisioneiro Perpétuo");
                    }
                    else if (escolha == 2) { // Caminho da luz azul
                        System.out.println("A luz azul fica mais intensa conforme você avança pelo corredor.");
                        System.out.println("Você encontra uma sala repleta de grande telas, exibindo códigos incompreensíveis.");
                        System.out.println("No centro, um terminal conectado a uma cama com um formato estranho, no terminal aguarda-se um hospedeiro");
                        System.out.println("Movido pela curiosidade, você se deita. Você perde a consciência rapidamente.");
                        System.out.println("Você acorda em uma pequena cidade pacífica, livre das limitações físicas, mas separado para sempre do mundo real.");
                        System.out.println("\nFIM - Linda vizinhança");
                    }
                    else { // Caminho da brisa
                        System.out.println("Você avança pela escuridão, guiado apenas pela suave brisa em seu rosto.");
                        System.out.println("Após um longo percurso, a escuridão começa a dar lugar a um céu estrelado.");
                        System.out.println("Você emerge no topo de uma montanha, sob um céu noturno de beleza indescritível.");
                        System.out.println("Ao olhar para trás, não há nenhuma porta ou passagem - apenas a montanha.");
                        System.out.println("Você achou uma das saídas e encontrou a liberdade?");
                        System.out.println("\nFIM - Perdido");
                    }
                } 
                else {
                    System.out.println("Após três tentativas fracassadas, o painel emite um ruído grave e se tranca permanentemente.");
                    System.out.println("Gases começam a preencher a sala. Sua visão fica turva...");
                    System.out.println("Você acorda novamente na sala do velho, que sorri maliciosamente.");
                    System.out.println("Velho: Nem todos são dignos de continuar. Talvez na próxima vida...");
                    System.out.println("\nFIM - O Eterno Recomeço");
                }
            }
            else if (escolha == 3) { // Usar o regador
                System.out.println("Você pega o regador e examina-o. Está cheio de um líquido que parece água, mas tem um leve brilho esverdeado.");
                System.out.println("Ao derramar o líquido na vegetação seca, as plantas começam a se revitalizar rapidamente.");
                System.out.println("As folhagens crescem e se entrelaçam, formando novas estruturas. Em poucos momentos, três arcos feitos de plantas vivas se formam nas paredes.");
                System.out.println("Cada arco tem características distintas: o primeiro possui flores vermelhas vibrantes, o segundo está coberto de frutos estranhos e luminosos, e o terceiro tem folhas que mudam de cor constantemente.");
                
                escolha = 0;
                while (escolha < 1 || escolha > 3) {
                    System.out.println("\n[1] Passar pelo arco de flores vermelhas");
                    System.out.println("[2] Passar pelo arco de frutos luminosos");
                    System.out.println("[3] Passar pelo arco de folhas camaleônicas");
                    escolha = scanner.nextInt();
                    
                    if (escolha < 1 || escolha > 3) {
                        System.out.println("Escolha inválida! Tente novamente.");
                    }
                }
                
                if (escolha == 1) { // Arco de flores vermelhas
                    System.out.println("Você atravessa o arco de flores vermelhas e sente um formigamento por todo o corpo.");
                    System.out.println("Ao olhar para suas mãos, percebe que sua pele está gradualmente sendo coberta por pequenas flores vermelhas.");
                    System.out.println("A transformação continua, você não sente nada além de paz, sua consciencia some aos poucos.");
                    System.out.println("Seu corpo se torna um pequeno monte de flores vermelhas.");
                    System.out.println("\nFIM - Paz");
                }
                else if (escolha == 2) { // Arco de frutos luminosos
                    System.out.println("Ao passar pelo arco de frutos luminosos, você sente um impulso de fome irresistível.");
                    System.out.println("Você colhe um dos frutos e o devora. Seu sabor é indescritível - doce, amargo, salgado e ácido simultaneamente.");
                    System.out.println("Uma onda de conhecimento invade sua mente. Você começa a entender.");
                    System.out.println("Os frutos que consumiu eram pequenas bolsas de conhecimento passados, você absorveu a sabedoria de eras.");
                    System.out.println("Com este conhecimento você entra em disforia e fica insano");
                    System.out.println("\nFIM - Sábio ignorante");
                }
                else { // Arco de folhas camaleônicas
                    System.out.println("Você atravessa o arco de folhas camaleônicas e é envolvido por uma névoa colorida.");
                    System.out.println("Quando a névoa se dissipa, você percebe que está em um jardim infinito.");
                    System.out.println("O local é pacifico e você se sente estranhamente satisfeito.");
                    System.out.println("Você vaga pelo jardim e sente que encontrou a paz nas pequenas delicadas plantas.");
                    System.out.println("Embora nunca mais possa retornar, você encontrou uma liberdade que poucos podem imaginar.");
                    System.out.println("\nFIM - Jardim Infinito");
                }
            }
        } 
        else if (escolha == 2) {
            System.out.println("Você abre a porta do meio. Você mal consegue ver o que tem dentro antes de ser empurrado, você mal consegue reagir até que a porta atrás de você foi trancado.");
            System.out.println("A sala é completamente preta, mas antes que você pudesse processar, duas luzes apareceram: Uma luz branca a sua esquerda & uma luz cinza ao sua frente... Mas mesmo assim, sua direita chama sua atenção também apesar de não ter nenhuma luz.");
            System.out.println("[1] Luz cinza \n[2] Seguir o preto \n[3] Luz branca");
            escolha = scanner.nextInt();
            
            if(escolha == 1) {
                System.out.println("Apesar do aluro do caminho preto e incerto, você decide seguir a luz cinza. \nNão demorou muito até que você chegasse ao final da luz, seus olhos são ofuscados pela claridade, ao passar pela porta... ");
                System.out.println("Você se encontra numa arena gladiadora com inúmeros corpos estilhaçados, a areia é quase imperceptível ao mar de sangue. \nVocê olha para trás, mas a porta não está lá.");
                System.out.println("Um homem de armadura dourada, banhado em sangue se aproxima de você.");
                System.out.println("Homem: ...Pegue uma arma e me enfrente.");
                System.out.println("Você observa os seus arredores por uma arma... Você procura por algo, mas... Tem uma espada embanhada na cintura do homem, a espada parece ter um uma aura roxa que te trás atenção.");
                System.out.println("[1]Procurar uma arma \n[2]Furtar arma \n[3]Pedir piedade");
            }
            else if(escolha == 2) {
                System.out.println("Você segue o aluro do caminho incerto, a cada passo, a cada segundo, você sente seu corpo ficar mais pesado do que antes...");
                System.out.println("Você correu instintivamente, você não sabia se ia ter um final, as luzes de antes já não são visiveis.");
                System.out.println("Você tropeçou... Você desmaiou...");
                System.out.println("Um barulho agudo de grito te acorda.");
            }
        } 
        else if (escolha == 3) {
            System.out.println("Você abre a porta da esquerda... Ao entrar, você vê uma sala de jantar extremamente chique, com pinturas de alto nivel nas paredes. Tem uma mulher no final da mesa de jantar, ela usava um vestido preto e um batom violeta.");
            System.out.printf("Você tem mal tempo de processar o ambiente até que uma força invisivel te empura para dentro. \nMulher: Olá, %s.", nome);
            System.out.println("Você estranha o como essa mulher conhece seu nome. \nMulher: Ha! Eu sei o nome de todos os que passam por minha sala...");
            System.out.println("A mulher sorri de uma maneira psicotica, ela vai para uma parede e gentilmente a empurra. A parede gira, revelando inúmeros corpos de homens pregados em uma parede.");
            System.out.println("A mulher pega uma faca chef da mesa, lambendo a lamina fazendo sua lingua sangrar. \nMulher: Eu tenho uma ideia simples, ou você me obedece... Ou você morre~");
            System.out.println("Você mede suas opções... Elas não parecem muito boas...");
            System.out.println("[1]Lutar \n[2]Concordar \n[3]Aceitar ");

            escolha = scanner.nextInt();
            if(escolha == 1) {
               
            // Evento de batalha simples
                System.out.println("A MULHER bizarra se posiciona bizarramente");

                while (vida > 0 && vidaInimigo > 0) {
                    System.out.println("Sua vida: " + vida + " | Vida da MULHER: " + vidaInimigo);
                    System.out.println("[1] Atacar");
                    escolha = scanner.nextInt();
                    if (escolha == 1) {
                        int dano = alea.nextInt(5) + 1; // 1 a 5
                        System.out.println("Você deu " + dano + " de dano!");
                        vidaInimigo -= dano;
                    }
                    if (vidaInimigo > 0) {
                        int danoInimigo = alea.nextInt(4) + 1;
                        System.out.println("A MULHER te atacou e causou " + danoInimigo + " de dano!");
                        vida -= danoInimigo;
                    }
                }
        
                if (vida > 0) {
                    System.out.println("Você derrotou a MULHER bizarra!");
                } 
                else {
                    System.out.println("Você foi derrotado...");
                }  
            }
        }

        scanner.close();
    }
}