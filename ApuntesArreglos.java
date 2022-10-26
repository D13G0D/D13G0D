
import java.util.ArrayList;
import java.util.Arrays;

public class ApuntesArreglos {
    public static void main(String[] args) {
    /*Arreglos , array
     * son variables u objetos que nos permiten guardar datos
     * tipos de arreglos que existen en java
     * arreglos
     * Definicion: int [] miArreglo = {} -> se tiene que definir desde el INICIO el largo del arreglo.  
     * Metodo de insercion: miArreglo[0]=7; -> [7, , , ] -> hay que poner si o si en que posicion entrara el numero */
     //int [] miArreglo = new int[3]; //arreglo vacio al cual debemos agregar todo desde cero utilizando el metodo de insercion  
     int [] listanumeros = {1,2,3}; //arreglo listo con los datos y el length
     String [] pelotas = {"futbol" , "tenis"};
     System.out.println(Arrays.toString(listanumeros));  //un metodo para mostrar un array en consola es utilizando Arrays.toString(nombredelarreglo)
     System.out.println(Arrays.toString(pelotas));
     listanumeros[0]=9;                                  // reemplaza el numero si la posicion esta ocupada
     System.out.println(Arrays.toString(listanumeros));
     listanumeros[3]=6;                                  // nos da error al agregar ya que el length lo definimos al inicio  y este lo sobrepasa
     System.out.println(Arrays.toString(listanumeros));  //demuestra el error 

     /*********************************************************************************
     * 
     * ArrayList
     * Definicion: ArrayList <Integer> miArray = new ArrayList <integer>(); ->No necesita definir desde el inicio el largo del Array 
     * Metodo de insercion: miArray.add(7); -> entra en la ultima posicion
     * // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)

     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * HashMap
     * Definicion: Map <String , Integer> miHashMap = new HashMap <String , Integer>();
     * Metodo de insercion -> miHashMap.put("llave",2)
     */

     //ArrayList<String> nombreArrayList = new ArrayList<String>(); // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
     ArrayList<String> ListadeEjemplo = new ArrayList<String>();
     System.out.println(ListadeEjemplo);
     ListadeEjemplo.add("Zyra"); // Añade el elemento al final del ArrayList
     ListadeEjemplo.add("Fer");
     ListadeEjemplo.add("Diego");
     ListadeEjemplo.add("Nicolas");
     System.out.println(ListadeEjemplo);
    
     ListadeEjemplo.add(4,"Dominga"); // Añade el elemento al ArrayList en la posición 'n'
     System.out.println(ListadeEjemplo);
     ListadeEjemplo.add(3, "Benito");
     System.out.println(ListadeEjemplo);
     
     System.out.println(ListadeEjemplo.size()); // Devuelve el numero de elementos del ArrayList

     System.out.println(ListadeEjemplo.get(3));// Devuelve el elemento que esta en la posición '3' del ArrayList

     System.out.println(ListadeEjemplo.contains("Diego")); // Comprueba si existe el elemento que entregamos (responde con un boleano)

     System.out.println(ListadeEjemplo.indexOf("Fer")); // Devuelve la posición cuando encuentra por primera vez el elemento solicitado

      
     ListadeEjemplo.add("Zyra");//Agregamos el elemento Zyra para que este en dos posiciones diferentes
     System.out.println(ListadeEjemplo);
     System.out.println(ListadeEjemplo.lastIndexOf("Zyra")); //Para que ahora nos indique la posicion de la ultima vez encontrado el elemento solicitado
    
     ListadeEjemplo.remove(6); // Borra el elemento de la posición '6' del ArrayList 
     System.out.println(ListadeEjemplo);
     
     ListadeEjemplo.remove("Diego"); //Borra el primer elemento entregado que se encuentre en la ArrayList por ejemplo si hay 2 elimina el que este en la posicion mas cercana al 0  
     System.out.println(ListadeEjemplo);    

     ListadeEjemplo.clear();
     System.out.println(ListadeEjemplo);//Borra todos los elemenos del Arraylist 
  
     System.out.println(ListadeEjemplo.isEmpty()); // Devuelve True si el ArrayList esta vacio. Sino Devuelve False  

     //ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  // Copiar un ArrayList  
     // Object[] array = nombreArrayList.toArray();   // Pasa el ArrayList a un Array  
    }
}

