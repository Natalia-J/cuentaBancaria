public class Humano{
    String raza;
    public Humano(String raza) {
        this.raza = raza;
        respirar();
    }

    public   void respirar(){
        System.out.println("el humano respira");
    }
}