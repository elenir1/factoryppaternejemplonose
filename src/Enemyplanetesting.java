import java.util.Scanner;

public class Enemyplanetesting {

    public static void main(String[] args) {

        Avionemigo elenemigo = null;
        Avionemigo f15 = new f15();

        Scanner userInput = new Scanner(System.in);
        String enemyshipoption = "";
        System.out.println("Ruso o Americano");

        if(userInput.hasNextLine()){
            enemyshipoption = userInput.nextLine();
        }

        if(enemyshipoption.equals("Ruso")) {
            elenemigo = new su29();
        } else
        if(enemyshipoption.equals("Americano")) {
            elenemigo = new f15();
        }

        hacercosas(elenemigo);

    }

    public static void hacercosas(Avionemigo unenemigo){
        unenemigo.displayEnemyPlane();
        unenemigo.followHeroPlane();
        unenemigo.enemigoDispara();
    }
}
