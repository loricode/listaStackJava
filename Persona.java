
public class Persona {
  private String nombre;
  private int edad;
  private float estatura;
  
  //constructor
  public Persona(){
     nombre="";
     edad=0;
     estatura=0;
  }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public float getEstatura() {
      return estatura;
   }

   public void setEstatura(float estatura) {
      this.estatura = estatura;
   }
  
}
