public class App {
    public static void main(String[] args) throws Exception {
    

        // %s - substitui no  texto um valor string
        system out printf ("vai imprimir $s", "um texto");

        // %s-substitui no texto um valor string
        system.out.print("vai imprimir %s. %s \n"), "um numero inteiro no texto", "qualquer" 

         // %d - substitui o coringa %d por um numero inteiro no texto
         system.out.print("minha idade é: %d", 23);

         //%f - substitui o coringa %f por um numero flutuante
        System.out.printf("\n0 valor de PI é: %f", 31415f);
 
        //%f.2 - substitui o coringa %f.2 por um numero flutuante
        System.out.printf("\n0 valor de PI é: %f.2", 31415f);
 
        // %b - substitui o coringa %b por um valor booleano
        System.out.printf("\nEsse valor é %b", true);
        System.out.printf("\nEsse valor é %b", false);

        // %c - substitui o coringa %c por um caractere
        system.out.printf("\n caractere é: %c", 'A');
        system.out.printf("\n caractere é: %c", '5');
        system.out.printf("\n caractere é: %c", '*');
        system.out.printf("\n caractere é: %c", '\\');
        system.out.printf("\n caractere é: %c", '\"');

        // printf com todos os tipos variáveis
        string texto = "alguma coisa";
        int numerointeiro = 1;
        float numeroquebrtado = 123.232f;
        boolean valorverdeiro = true;
        char umcaractere = 'º';
        system.out.ptintf("\n%s, %d, 5.2f, %b, %c",
        texto, numerointeiro, numeroquebrtado, valorverdeiro, umcaractere);


    
        
       
 
    
    }
}
