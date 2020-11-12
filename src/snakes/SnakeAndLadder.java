package snakes;

public class SnakeAndLadder {
    private int dice;
    private int pos;
    public int entry(int d){
        if (d == 6){
            System.out.println("Place your avatar at 1 and play again!");
            pos++;
        }else {
            System.out.println("Ooops! Try again.");
        }
        return d;
    }
    public int roll(int dice){
        if(dice > 0){
            pos += dice;
            switch (pos){
                case 4:
                    System.out.println("You have reach the ladder move up!");
                    pos = 73;
                    break;
                case 11:
                    System.out.println("You have reach the ladder move up!");
                    pos = 33;
                    break;
                case 30:
                    System.out.println("You have reach the ladder move up!");
                    pos = 51;
                    break;
                case 38:
                    System.out.println("You have reach the ladder move up!");
                    pos = 80;
                    break;
                case 44:
                    System.out.println("You have reach the ladder move up!");
                    pos = 68;
                    break;
                case 56:
                    System.out.println("You have reach the ladder move up!");
                    pos = 82;
                    break;
                case 72:
                    System.out.println("You have reach the ladder move up!");
                    pos = 94;
                    break;
                case 86:
                    System.out.println("You have reach the ladder move up!");
                    pos = 96;
                    break;

                case 20:
                    System.out.println("You have reach the snake move down!");
                    pos = 2;
                    break;
                case 43:
                    System.out.println("You have reach the snake move down!");
                    pos = 6;
                    break;
                case 87:
                    System.out.println("You have reach the snake move down!");
                    pos = 27;
                    break;
                case 52:
                    System.out.println("You have reach the snake move down!");
                    pos = 45;
                    break;
                case 84:
                    System.out.println("You have reach the snake move down!");
                    pos = 75;
                    break;
                case 99:
                    System.out.println("You have reach the snake move down!");
                    pos = 23;
                    break;

            }
            System.out.println("dice "+dice);
            System.out.println(pos);

        }
        return dice;
        // increment current position

        // check for ladders

        // else check for snakes

        // you should now have  the new position

    }

    public static void main(String[] args) {
        SnakeAndLadder snl = new SnakeAndLadder();
        snl.entry(2);
        snl.entry(4);
        snl.entry(6);
        for (int i=0; i < 50; i++){
            snl.roll(6);
            snl.roll(3);
            snl.roll(2);
            snl.roll(1);
            snl.roll(5);
            snl.roll(4);
            if(snl.pos >= 100){
                break;
            }
        }
    }
}
