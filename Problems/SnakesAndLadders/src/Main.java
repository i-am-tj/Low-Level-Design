import controllers.GameController;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("|| Welcome To Snakes and Ladders ||");
        System.out.println("===================================");
        System.out.println("We are populating the board with snakes and ladders.");
        try {
                System.out.println("Please enter the number of players playing the game: ");
                int players  = scanner.nextInt();
                List<Player> playerList = new ArrayList<>(players);
                int counter = 1;
                while(players > 0) {
                    System.out.println("Enter name of Player " + counter + ": ");
                    String name = scanner.next();
                    scanner.nextLine();
                    playerList.add(new Player(name, PlayerType.HUMAN));
                    System.out.println("Player: " + name + " added to playing list");
                    counter++;
                    players--;
                }
                if(playerList.size() == 1) {
                    System.out.println("Adding a bot player to compensate a human");
                    int incorrectInput = 3;
                    while(incorrectInput > 0) {
                        System.out.println("Please select the difficulty level from the list to continue: ");
                        System.out.println("1. Easy \n2. Medium \n3. Hard");
                        int x = scanner.nextInt();
                        String botName = "Bot_Chitti";
                        Bot bot;
                        String level = "";
                        boolean botCreated = true;
                        if(x == 1) {
                            level = "EASY";
                            playerList.add(new Bot(botName, BotDifficultyLevel.EASY));
                        } else if (x == 2) {
                            level = "MEDIUM";
                            playerList.add(new Bot(botName, BotDifficultyLevel.MEDIUM));
                        } else if (x == 3) {
                            level = "HARD";
                            playerList.add(new Bot(botName, BotDifficultyLevel.HARD));
                        } else {
                            botCreated = false;
                        }
                        if(!botCreated) {
                            incorrectInput--;
                            System.out.println("Please provide a correct input for the bot difficulty level. Number of correct attempts left: " + incorrectInput);
                        } else {
                            incorrectInput = 0;
                            System.out.println("Bot: " + botName + " with difficulty: " + level + " added to the playing list");
                        }
                    }
                }
                System.out.println("Players saved for the game.");

            List<GameEntity> gameEntities = new ArrayList<>();

                System.out.println("============ LETS BEGIN: TIC TAC TOE ============");
                Game game = gameController.startGame(playerList, gameEntities);
                boolean start = false;
                while(gameController.checkStatus(game).equals(GameStatus.IN_PROGRESS)) {
                    //1. Print Board (every time)
                    gameController.printBoard(game);
                    //2. Ask for undo
//                    if(start) {
//                        System.out.println("Do you want to undo the last move? (y/n)");
//                        char u = scanner.next().charAt(0);
//                        if(u == 'y') {
//                            gameController.undo(game);
//                            continue;
//                        }
//                        if(u != 'n') {
//                            System.out.println("Invalid input: " + u + ". Hence continuing.");
//                        }
//                    }
//                    if(!start) start = true;
                    //3. Make move
                    gameController.makeMove(game);
                }
                gameController.printBoard(game);
            System.out.println("===== Game ended ======");
            System.out.println(gameController.getWinner(game).getName() + " won the match. Thank you for playing.");
        } catch (Exception e) {
            System.out.println("Exception Caught: " + e);
        }
        scanner.close();
        System.out.println("=======================================================");
        System.out.println("||            Thank you for playing \uD83D\uDE4F               ||");
        System.out.println("|| Developed with ❤\uFE0F by: https://github.com/i-am-tj  ||");
        System.out.println("=======================================================");

    }
    }
}