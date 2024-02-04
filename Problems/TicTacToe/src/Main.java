import controllers.GameController;
import exceptions.PlayersCountDimensionMismatchException;
import models.*;
import strategies.winningstrategies.OrderOneColumnWinningStrategy;
import strategies.winningstrategies.OrderOneDiagonalWinningStrategy;
import strategies.winningstrategies.OrderOneRowWinningStrategy;
import strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("|| Welcome To Tic Tac Toe ||");
        System.out.println("===========================");
        int credits = 10;
        System.out.println("At the beginning of the match you have 10 credits. Each time a player plays they loose 5 credits.");
        System.out.println("If the player wins they get back 10 credits. While if they draw they get 3 more points deducted.");
        while(credits >= 0) {
            credits -= 5;
            System.out.println("Total credit: " + credits + ". Continue with the game.");
            System.out.println("Enter the size of board you would like to play in: ");
            int n = scanner.nextInt();
            try {
                System.out.println("According to board size of " + n + "x" + n + ", please provide at least " + (n-2) + " player(s) to start the game.");
                System.out.println("Enter the number of players: ");
                int players  = scanner.nextInt();
                List<Player> playerList = new ArrayList<>(players);
                int counter = 1;
                while(players > 0) {
                    System.out.println("Enter name of Player " + counter + ": ");
                    String name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter any symbol you would like to choose for player: ");
                    char symbol = scanner.next().charAt(0);
                    playerList.add(new Player(new Symbol(symbol), name, PlayerType.HUMAN));
                    System.out.println("Player: " + name + " with symbol: " + symbol +  " added to playing list");
                    counter++;
                    players--;
                }

                if(playerList.size() == n - 2) {
                    System.out.println("Adding a bot player to compensate a human");
                    int incorrectInput = 3;
                    while(incorrectInput > 0) {
                        System.out.println("Please select the difficulty level from the list to continue: ");
                        System.out.println("1. Easy \n2. Medium \n3. Hard");
                        int x = scanner.nextInt();
                        Symbol symbol = new Symbol('B');
                        String botName = "Bot_Chitti";
                        Bot bot;
                        String level = "";
                        boolean botCreated = true;
                        if(x == 1) {
                            level = "EASY";
                            playerList.add(new Bot(symbol, botName, BotDifficultyLevel.EASY));
                        } else if (x == 2) {
                            level = "MEDIUM";
                            playerList.add(new Bot(symbol, botName, BotDifficultyLevel.MEDIUM));
                        } else if (x == 3) {
                            level = "HARD";
                            playerList.add(new Bot(symbol, botName, BotDifficultyLevel.HARD));
                        } else {
                            botCreated = false;
                        }
                        if(!botCreated) {
                            incorrectInput--;
                            System.out.println("Please provide a correct input for the bot difficulty level. Number of correct attempts left: " + incorrectInput);
                        } else {
                            incorrectInput = 0;
                            System.out.println("Bot: " + botName + " with symbol: " + symbol.getaChar() + " difficulty: " + level + " added to the playing list");
                        }
                    }
                }
                System.out.println("Players saved for the game.");
                List<WinningStrategy> winningStrategies = new ArrayList<>();
                int winningStrategySelection = 3;
                while(winningStrategySelection > 0) {
                    System.out.println("Currently defined winning strategies: 1. Row Wise 2. Col Wise 3. Diagonal Wise");
                    System.out.println("Please select y/n if you are ok with the default winning strategies.");
                    char x = scanner.next().charAt(0);
                    winningStrategies.add(new OrderOneRowWinningStrategy());
                    winningStrategies.add(new OrderOneColumnWinningStrategy());
                    winningStrategies.add(new OrderOneDiagonalWinningStrategy());
                    if(x == 'y') {
                        winningStrategySelection = 0;
                        System.out.println("All the winning strategies are being added.");
                    } else if (x == 'n') {
                        System.out.println("Select the correct option: ");
                        System.out.println("1. Remove a strategy");
                        System.out.println("2. Add a strategy definition (NA currently)");
                        int s = scanner.nextInt();
                        if(s == 1) {
                            System.out.println("Select which of the following strategies would you like to remove: ");
                            System.out.println("1. Row Wise \n2. Col Wise \n3. Diagonal Wise");
                            int r = scanner.nextInt();
                            if(r == 1) {
                                System.out.println("Removed: " + r + "st strategy from the strategy list");
                                winningStrategies.remove(0);
                            } else if (r == 2) {
                                System.out.println("Removed: " + r + "nd strategy from the strategy list");
                                winningStrategies.remove(1);
                            } else if (r == 3) {
                                System.out.println("Removed: " + r + "rd strategy from the strategy list");
                                winningStrategies.remove(2);
                            } else {
                                System.out.println("Invalid input: " + r);
                                System.out.println("Continuing with the run with all default strategies");
                            }
                        } else if (s == 2) {
                            System.out.println("Sorry we are currently not accepting any strategies. We'll let you know once we are open to this change.");
                            System.out.println("Continuing with the run with all default strategies");
                        } else {
                            System.out.println("Invalid input: " + s);
                            System.out.println("Continuing with the run with all default strategies");
                        }
                        winningStrategySelection = 0;
                    } else {
                        winningStrategySelection--;
                        System.out.println("Please select y/n to continue. Current input: " + x + " not valid. Number of successful attempts remaining: " + winningStrategySelection);
                    }
                }
                System.out.println("============ LETS BEGIN: TIC TAC TOE ============");
                Game game = gameController.startGame(n, playerList, winningStrategies);
                boolean start = false;
                while(gameController.checkStatus(game).equals(GameStatus.IN_PROGRESS)) {
                    //1. Print Board (every time)
                    gameController.printBoard(game);
                    //2. Ask for undo
                    if(start) {
                        System.out.println("Do you want to undo the last move? (y/n)");
                        char u = scanner.next().charAt(0);
                        if(u == 'y') {
                            gameController.undo(game);
                            continue;
                        }
                        if(u != 'n') {
                            System.out.println("Invalid input: " + u + ". Hence continuing.");
                        }
                    }
                    //3. Make move
                    gameController.makeMove(game);
                }
                gameController.printBoard(game);
                System.out.println("Current Game ended");
                GameStatus state = gameController.checkStatus(game);
                if(state.equals(GameStatus.DRAW)) {
                    credits -= 3;
                    System.out.println("It is a draw. Thank you for playing");
                } else {
                    credits += 10;
                    System.out.println(gameController.getWinner(game).getName() + " won the match. Thank you for playing.");
                }

            } catch (Exception e) {
                System.out.println("Exception Caught: " + e);
            }
            if(credits >= 0) {
                System.out.println("Credits left: " + credits + ". Would you like to continue? (y/n)");
                char c = scanner.next().charAt(0);
                if(c == 'y') {
                    System.out.println("Continuing with the game...");
                } else if (c == 'n') {
                    credits = -1;
                } else {
                    System.out.println("Invalid input " + c + ". Continuing.");
                }
            }
        }
        scanner.close();
        System.out.println("=======================================================");
        System.out.println("||            Thank you for playing \uD83D\uDE4F               ||");
        System.out.println("|| Developed with ❤\uFE0F by: https://github.com/i-am-tj  ||");
        System.out.println("=======================================================");

    }
}