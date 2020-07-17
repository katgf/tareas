
package parte1;



public class Ciudadano {
    private int edad;
    private String nombre;
    private int experiencia;
    
    public Ciudadano() {
       
    }

    public Ciudadano(int edad, String nombre, int experiencia) {
        this.edad = edad;
        this.nombre = nombre;
        this.experiencia = experiencia;
           
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
   
    
}
