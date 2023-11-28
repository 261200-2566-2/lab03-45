// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        character player1 = new character("pp",2,"sword","shield");

        character player2 = new character("joy",1,"sword","");


        System.out.println("-------------------CHARACTER-------------------");

        player1.showValue();
        System.out.println("--------------------------------------");
        player2.showValue();

        System.out.println("-------------------START FIGHTING-------------------");

        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);


        if(player1.hp >0){
            player1.levelUp(player1);
        }else {
            player2.levelUp(player2);
        }

        player1.showValue();
        System.out.println("--------------------------------------");
        player2.showValue();

        System.out.println("-------------------GAME OVER-------------------");
    }
}