import java.util.Scanner;

public class avionenemigotesting {

    public static void main(String[] args) {

       factory facoryavion =  new factory();
       Avionemigo theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Ruso o Americano");
        if(userInput.hasNextLine()){
            String typodeavion = userInput.nextLine();

            theEnemy = facoryavion.haceravion(typodeavion);
        }
if (theEnemy != null){
    hacercosas(theEnemy);
}

    }

    public static void hacercosas(Avionemigo unenemigo){
        unenemigo.displayEnemyPlane();
        unenemigo.followHeroPlane();
        unenemigo.enemigoDispara();
    }
}
