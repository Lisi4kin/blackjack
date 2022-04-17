public class Play {

    public static void main(String[] args) {


        Game game = new Game();
        play(game);
    }

    public static void play(Game game) {
        game.startGame();
        showHand(game.player);
        System.out.println("Ход игрока");
        for (; ; ) {
            System.out.print("Хотите взять ещё карту? (да/нет) : ");
            if (game.playerTakesCard()) {
                showHand(game.player);
                if (game.isPlayerLost()) {
                    System.out.println("Перебор");
                    break;
                }
            } else {
                break;
            }

        }
        System.out.println("Ход дилера");
        showHand(game.dealer);
        for (;;) {
            if (game.dealerTakesCard()) {
                showHand(game.dealer);
            } else {
                break;
            }
        }
        play(game);
    }

    public static void showHand(Player player) {
        for (int i = 0; i < player.hand.size(); i++) {
            System.out.print(player.hand.get(i) + " ");
        }
        System.out.println();
        System.out.println("Score = " + player.getScore());
    }

}
