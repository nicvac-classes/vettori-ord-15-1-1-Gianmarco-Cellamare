//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        private static Random random = new Random();
        private static Scanner input = new Scanner(System.in);
    
        public static void main(String[] args) {
            int n, i;
    
            System.out.println("Inserire il numero di automobili");
            n = Integer.parseInt(input.nextLine());
            String[] nomi = new String[n];
            int[] posizioni = new int[n];


            for (i = 0; i <= n - 1; i++) {
                System.out.println("Nome " + (i + 1) + "° automobile");
                nomi[i] = input.nextLine();
            }
            impostaVettoreRandom(posizioni);
            visualizzaVettori(nomi, posizioni);
    

            bubbleSort(nomi, posizioni);
    
            System.out.println("Posizione di arrivo");
            visualizzaVettori(nomi, posizioni);
        }
        
        public static void bubbleSort(String[] nomi, int[] posizioni) {
            
            String ts;
            int t;
            boolean scambio;
            int i, j;
            int n = nomi.length;
    
            scambio = true;
            i = 0;
            while (i <= n - 1 && scambio) {
                scambio = false;
                j = 0;
                while (j <= n - 2 - i) {
                    if (posizioni[j] > posizioni[j + 1]) {
                        scambio = true;
    

                        t = posizioni[j];
                        posizioni[j] = posizioni[j + 1];
                        posizioni[j + 1] = t;
    
                        
                        nomi[j] = nomi[j + 1];
                        nomi[j + 1] = ts;
                    }
                    j = j + 1;
                }
                i = i + 1;
            }
        }

        public static int RicercaSequenziale (int[] Posizioni,String[] Nomi, int N ,int Val){
            int i,cont;
            indx=-1;
            while ( i < N-1 && indx=-1){
                if (Posizioni[i]=Val){
                    indx=1;
                    System.out.println(+Nomi[i]);
                    cont++;
                }
                i++;
                System.out.print("Numero controlli"+cont);
            }
        return indx
        }
        public static void RicercaBinaria (int[] V,int N){
            int inizio, fine, centro, valorecercato, cont, i;
            boolean trovato;
            System.out.println("Inserisci valore da cercare");
            valorecercato=in.nextLine();
            i=0;
            while (inizio <= fine && trovato=false){
                centro=(inizio+fine)/2;
                if (V[centro] == valorecercato){
                    trovato=true;
                }

                if (V[centro] > valorecercato){
                    fine=centro-1;
                }else{
                    inizio=centro+1;
                }
                cont++;
            }
        }
        
        public static void impostaVettoreRandom(int[] posizioni) {
            int i;
            int n = posizioni.length;
    
            for (i = 0; i <= n - 1; i++) {
                posizioni[i] = 1 + random.nextInt(n);
            }
        }
        
        public static void visualizzaVettori(String[] nomi, int[] posizioni) {
            int i;
            int n = posizioni.length;
    
            for (i = 0; i <= n - 1; i++) {
                System.out.println("Auto " + nomi[i] + "; Posizione: " + posizioni[i]);
            }
        }

    }
}

