
import javax.swing.JOptionPane;


public class ListaStack {

   public static String digitar(String men){
      return JOptionPane.showInputDialog(men);
   }
   
   public static void agregarL(Lista lista){
      Persona persona = new Persona();
      persona.setNombre(digitar("DIGITE EL NOMBRE"));
      persona.setEdad(Integer.parseInt(digitar("DIGITE LA EDAD")));
      persona.setEstatura(Float.parseFloat(digitar("DIGITE LA ESTATURA")));
      lista.agregar(persona);
   }
   
   public static void eliminar(Lista lista){
      String nombre = digitar("digite el nombre a eliminar");
      lista.eliminarPersona(nombre);
   }
   
  
   public static void main(String[] args) {
     
      Lista obj = new Lista();
      
      int opcion=0;
      
      do{
         
         opcion=Integer.parseInt(JOptionPane.showInputDialog(
                 "MENU PRINCIPAL\n"
                 + "1. Registrar una persona\n"
                 + "2. Mostar la lista\n"
                 + "3. Eliminar persona\n"
                 + "4. promedio\n"
                 + "5. Salir"));
         switch(opcion){
            case 1:
               agregarL(obj);
               break;
               
            case 2:
                 obj.mostarLista();
               break;
            case 3:
               eliminar(obj);
               break;
            case 4:
               obj.promedioP();
               break;
         }
         
         
      }while(opcion!=5);
      
      
   }
   
}
