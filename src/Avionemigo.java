public abstract class Avionemigo {

    private String name;
    private double amtDamage;

    public String getName() {return name; }
    public void setName(String newname) { name= newname; }

    public double getDamage() {return amtDamage; }
    public void setDamage(double newDamage) { amtDamage= newDamage; }

    public void followHeroPlane(){
        System.out.println("Un " + getName() + " Te esta persiguiendo");
    }

    public void displayEnemyPlane(){
        System.out.println("Un " + getName() + " fue detectado");
    }

    public void enemigoDispara(){
        System.out.println("Un " + getName() + " Ataca y hace:" + getDamage() + " Daño");
    }

}
