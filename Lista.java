import java.util.Stack;
import javax.swing.JOptionPane;

public class Lista {
 Stack<Persona> lista = new Stack<Persona>();
 
 public void mensaje(String men){
    JOptionPane.showMessageDialog(null, men);
 }
 
 //insertar a la lista
 public void agregar(Persona persona){
    if(persona!=null){
       lista.add(persona);
    }else{
       mensaje("objeto esta vacio");
    }
 }
 
 
 public void mostarLista(){
    String cadena="";
    for(int i=0;i<lista.size();i++){
       cadena+="NOMBRE: "+lista.get(i).getNombre()+"\n";
       cadena+="EDAD: "+lista.get(i).getEdad()+"\n";
       cadena+="ESTATURA: "+lista.get(i).getEstatura()+"\n\n";
    }
    
    mensaje(cadena);
 }
 
 //eliminar una persona
 
 public void eliminarPersona(String nom){
    for(int i=0;i<lista.size();i++){
       if(lista.get(i).getNombre().equals(nom)){
          lista.remove(i);
          mensaje("persona eliminada");
       }
    }
 }
 
 public void promedioP(){
    float promedio=0.0f;
    int suma=0;
    for(int i=0;i<lista.size();i++){
       suma=suma+lista.get(i).getEdad();
    }
    promedio = (float)suma/lista.size();
    mensaje("El promedio es: "+promedio);
 }
 
 
 
}
