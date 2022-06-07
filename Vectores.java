public class Vectores 
{
    public static void main(String[] args) 
    {
        System.out.println(E1());
        System.out.println(E2());
        System.out.println(E3());
        System.out.println(E4());
    }
    public static String E1()
    {
        System.out.println("Ejercicio 1:");
        int[]bekthor = new int[11];                                     //Inicializamos el vector.
        for (int i = 0; i < bekthor.length; i++)                        //Con el ciclo for para pasar
        {                                                               //por las posiciones del vector.
            bekthor[i]=(int)(Math.random()*11);                         //Le asignamos valores random al vector.
            System.out.println("Posición "+i+" - "+bekthor[i]);         //Imprimimos en consola 
        }                                                               //la posicion y el contenido del vector.
        return "";
    }
    public static String E2()
    {
        System.out.println("Ejercicio 2:");
        char[]bekthor = new char[26];                                   //Inicializamos el vector con el numero de las letras del abecedario.
        for (int i = 0; i < bekthor.length; i++)                        //Con el ciclo for pasaremos 
        {                                                               //por las 26 posiciones del vector.
            bekthor[i]=(char)('a'+i);                                   //Le asignamos valor desde "a" sumandole uno las 26 posiciones.
            System.out.print(bekthor[i]);                               
        }
        System.out.println("\nTamaño: "+bekthor.length);                //Imprimimos en pantalla el tamaño del vector.
        return "";
    }
    public static String E3()
    {
        System.out.println("Ejercicio 3:");
        String[]bekthor = new String[5];                                //Inicializamos el vector con 5 elementos.
        bekthor[0]="Ale";                                               //A cada posicion le agregamos un valor de
        bekthor[1]="Kenny";                                             //tipo String.
        bekthor[2]="Huasteco";
        bekthor[3]="Costeño";
        bekthor[4]="Computadora";
        for (int i = 0; i < bekthor.length; i++)                        //Con el ciclo for vamos a 
        {                                                               //imprimir cada una de las
            System.out.println("Posición "+i+" - "+bekthor[i]);         //posiciones del vector.
        }
        return "";
    }
    public static String E4()
    {
        System.out.println("Ejercicio 4:");
        char[][]bekthor = new char[2][13];                              //Inicializamos la matriz con x=2 y y=13
        char l='a';                                                     //Declaramos l de tipo char con valor "a", para que inicie desde ahí el abecedario.
        for (int i = 0; i < 2; i++)                                     //Necesitamos 2 ciclos para cada eje de la matriz.
        {                                                               //El primer ciclo es para el valor de x.
            for (int j = 0; j < 13; j++)                                //En el segundo ciclo con el valor de y.
            {
                bekthor[i][j]=(char)(l);                                //Llenamos posicion por posicion los valores del abecedario, ayudandonos con los ciclos.
                System.out.print(bekthor[i][j]+" ");                    //Imprimimos posicion por posicion para ir almacenandolas.
                l++;                                                    //Sumamos uno a letra para ir pasando por las 26 letras del abecedario.
            }
            System.out.println();                                       //Al terminar el ciclo de las y tenemos que pasar de linea para empezar con la segunda fila de la matriz.
        }
        return "";
    }
}
