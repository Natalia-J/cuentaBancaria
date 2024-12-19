public class Persona extends Humano {
    String name;
    Integer edad;

    private static void muestraAlgo(){
        System.out.println("lo que seaaa muestro lo que quieraaa");
    }


    public Persona(String name, Integer edad, String raza) {
        super(raza);
        this.name = name;
        this.edad = edad;
    }
}