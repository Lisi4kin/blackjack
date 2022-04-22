public class Play {

    public static void main(String[] args) {


        Game game = new Game();
        play(game);

    }

    public static void play(Game game) {
        game.startGame();
        showHand(game.player);
        System.out.println("Ход игрока");
        boolean isGameFinished = false;
        for (; ; ) {
            System.out.print("Хотите взять ещё карту? (да/нет) : ");
            if (game.playerTakesCard()) {
                showHand(game.player);
                if (game.overdraw(game.player)) {
                    System.out.println("Перебор");
                    isGameFinished = true;
                    break;
                }
            } else {
                break;
            }

        }
        if (isGameFinished) {
            return;
        }

        System.out.println("Ход дилера");
        showHand(game.dealer);
        for (; ; ) {
            if (game.dealerTakesCard()) {
                showHand(game.dealer);
                if (game.overdraw(game.dealer)) {
                    System.out.println("Перебор дилера");
                    isGameFinished = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (isGameFinished) {
            return;
        }
        if (game.whoWin() > 0) {
            System.out.println("Победа игрока");
        } else if (game.whoWin() == 0) {
            System.out.println("Ничья");
        } else {
            System.out.println("Победа дилера");
        }
    }

    public static void showHand(Player player) {
        for (int i = 0; i < player.hand.size(); i++) {
            System.out.print(player.hand.get(i) + " ");
        }
        System.out.println();
        System.out.println("Score = " + player.getScore());
    }

}
