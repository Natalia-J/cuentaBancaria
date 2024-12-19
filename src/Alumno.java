public class Alumno {
    int id;
    String nombre;
    String apellido;
    Integer perrons =6;



    public Alumno() {
        nombre = "maria";
        apellido = "lopez";
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void getPerros(){
        this.perrons = this.perrons -2;
        System.out.println("tengo " + this.perrons);

    }

    public void mostrarNombre () {
        System.out.println("Hola, aoy un alumno y puedo decir mi nombre" + this.nombre + "y tengo "+ this.perrons +"perros");
    }
    public void saberAprobado(double calificacion) {

        if(calificacion >= 6) {
            System.out.println("Estoy aprobado");
        }
        else {
            System.out.println("uuy no aprobe");
        }

    }
}
