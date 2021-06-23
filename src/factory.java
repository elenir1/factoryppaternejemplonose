public class factory {

    public Avionemigo haceravion(String newAviontipo){

        Avionemigo nuevoavion = null;
        if(newAviontipo.equals("Ruso")) {
            return new su29();
        } else
        if(newAviontipo.equals("Americano")) {
            return new f15();
        } else return null;
    }
}
