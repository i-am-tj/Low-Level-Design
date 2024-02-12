import controllers.GameController;
import models.*;
import strategies.entitygenerationstrategy.*;

import java.util.ArrayList;
import java.util.Arrays;
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
            int players = scanner.nextInt();
            List<Player> playerList = new ArrayList<>(players);
            int counter = 1;
            while (players > 0) {
                System.out.println("Enter name of Player " + counter + ": ");
                String name = scanner.next();
                scanner.nextLine();
                playerList.add(new Player(name, PlayerType.HUMAN));
                System.out.println("Player: " + name + " added to playing list");
                counter++;
                players--;
            }
            if (playerList.size() == 1) {
                System.out.println("Adding a bot player to compensate a human");
                int incorrectInput = 3;
                while (incorrectInput > 0) {
                    System.out.println("Please select the difficulty level from the list to continue: ");
                    System.out.println("1. Easy \n2. Medium \n3. Hard");
                    int x = scanner.nextInt();
                    String botName = "Bot_Chitti";
                    Bot bot;
                    String level = "";
                    boolean botCreated = true;
                    if (x == 1) {
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
                    if (!botCreated) {
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
            int gameEntitySelection = 3;
            while(gameEntitySelection > 0) {
                System.out.println("Please select the difficulty level for generating snakes and ladder from the list: ");
                System.out.println("1. Easy \n2. Medium \n3. Hard");
                int x = scanner.nextInt();
                String level = "";
                List<Pair> snakesAndLadders = null;
                if (x == 1) {
                    level = "EASY";
                    System.out.println("Level Selected: " + level + ". Hence generating 3 snakes and 3 ladders for the game");
                    snakesAndLadders = new EasyGameEntityGenerationStrategy().generateEntities();
                } else if (x == 2) {
                    level = "MEDIUM";
                    System.out.println("Level Selected: " + level + ". Hence generating 4 snakes and 4 ladders for the game");
                    snakesAndLadders = new MediumGameEntityGenerationStrategy().generateEntities();

                } else if (x == 3) {
                    level = "HARD";
                    System.out.println("Level Selected: " + level + ". Hence generating 5 snakes and 5 ladders for the game");
                    snakesAndLadders = new HardGameEntityGenerationStrategy().generateEntities();
                } else {
                    gameEntitySelection--;
                    System.out.println("Please select y/n to continue. Current input: " + x + " not valid. Number of successful attempts remaining: " + gameEntitySelection);
                }
                if(snakesAndLadders != null) {
                    gameEntitySelection = 0;
                    for(int i = 0; i < snakesAndLadders.size(); i++) {
                        if(i % 2 == 0) {
                            gameEntities.add(new GameEntity("Ladder_"+i, GameEntityType.LADDER, snakesAndLadders.get(i).getStart(), snakesAndLadders.get(i).getEnd()));
                        } else {
                            gameEntities.add(new GameEntity("Snake_"+i, GameEntityType.SNAKE, snakesAndLadders.get(i).getStart(), snakesAndLadders.get(i).getEnd()));
                        }
                    }
                    System.out.println("Snakes and Ladders generated for the game");
                }
            }

            System.out.println("============ LETS BEGIN: TIC TAC TOE ============");
            Game game = gameController.startGame(playerList, gameEntities);
            System.out.println("============ Game started ============");
//            while (gameController.checkStatus(game).equals(GameStatus.IN_PROGRESS)) {
//                //1. Print Board (every time)
//                gameController.printBoard(game);
//                //2. Make move
//                gameController.makeMove(game);
//            }
            gameController.printBoard(game);
            System.out.println("===== Game ended ======");
            //System.out.println(gameController.getWinner(game).getName() + " won the match. Thank you for playing.");
        } catch (Exception e) {
            System.out.println("Exception Caught: " + e + " " + Arrays.toString(e.getStackTrace()));
        }
        scanner.close();
        System.out.println("=======================================================");
        System.out.println("||            Thank you for playing \uD83D\uDE4F               ||");
        System.out.println("|| Developed with ❤\uFE0F by: https://github.com/i-am-tj  ||");
        System.out.println("=======================================================");

    }
}