import java.util.Scanner;

public class gols {
    public static void main(String[] args) {
        int casa1;
        int casa2;
        int casa3;
        int casa4;
        int casa5;

        int visitante1;
        int visitante2;
        int visitante3;
        int visitante4;
        int visitante5;

        int casatotal1;
        int visitantetotal1;

        int casatotal2;
        int visitantetotal2;

        int casatotal3;
        int visitantetotal3;

        int casatotal4;
        int visitantetotal4;

        int casatotal5;
        int visitantetotal5;

        Scanner pontuacao = new Scanner(System.in);
        System.out.println("Informe quantos gols o time da casa marcou no primeiro jogo: ");
        casa1 = pontuacao.nextInt();

        System.out.println("Informe quantos gols o time visitante marcou no primeiro jogo: ");
        visitante1 = pontuacao.nextInt();

        if (casa1>visitante1){
            casatotal1 = 3;
        }else{
            if (visitante1>casa1){
                visitantetotal1 = 3;
            }else{
                visitantetotal1 = 1;
                casatotal1 = 1;
            }
        }

        System.out.println("Informe quantos gols o time da casa marcou no segundo jogo: ");
        casa2 = pontuacao.nextInt();

        System.out.println("Informe quantos gols o time visitante marcou no segundo jogo: ");
        visitante2 = pontuacao.nextInt();

        
        if (casa2>visitante2){
            casatotal2 = 3;
        }else{
            if (visitante2>casa2){
                visitantetotal2 = 3;
            }else{
                visitantetotal2 = 1;
                casatotal2 = 1;
            }
        }

        System.out.println("Informe quantos gols o time da casa marcou no terceiro jogo: ");
        casa3 = pontuacao.nextInt();

        System.out.println("Informe quantos gols o time visitante marcou no terceiro jogo: ");
        visitante3 = pontuacao.nextInt();

        
        if (casa3>visitante3){
            casatotal3 = 3;
        }else{
            if (visitante3>casa3){
                visitantetotal3 = 3;
            }else{
                visitantetotal3 = 1;
                casatotal3 = 1;
            }
        }

        System.out.println("Informe quantos gols o time da casa marcou no quarto jogo: ");
        casa4 = pontuacao.nextInt();

        System.out.println("Informe quantos gols o time visitante marcou no quarto jogo: ");
        visitante4 = pontuacao.nextInt();

        
        if (casa4>visitante4){
            casatotal4 = 3;
        }else{
            if (visitante4>casa4){
                visitantetotal4 = 3;
            }else{
                visitantetotal4 = 1;
                casatotal4 = 1;
            }
        }

        System.out.println("Informe quantos gols o time da casa marcou no quinto jogo: ");
        casa5 = pontuacao.nextInt();

        System.out.println("Informe quantos gols o time visitante marcou no quinto jogo: ");
        visitante5 = pontuacao.nextInt();


        if (casa5>visitante5){
            casatotal5 = 3;
        }else{
            if (visitante5>casa5){
                visitantetotal5 = 3;
            }else{
                visitantetotal5 = 1;
                casatotal5 = 1;
            }
        
    


        
        int somacasa;
        int somavisitante;

        somacasa = casatotal1+casatotal2+casatotal3+casatotal4+casatotal5;
        somavisitante = visitantetotal1+visitantetotal2+visitantetotal3+visitantetotal4+visitantetotal5;

        if(somacasa > 10){
            System.out.println("Time da casa tem uma pontuação maior!");
        }else{
            System.out.println("Time visitante tem uma pontuação maior!");
        }
        

        pontuacao.close();

    }

}

}


