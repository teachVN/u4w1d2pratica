import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi una stringa");
        String s = scanner.nextLine();

        boolean b1 = stringaPariDispari(s);

        if(b1){
            System.out.println("Numero pari");
        }
        else{
            System.out.println("Numero dispari");
        }

        System.out.println("Dammi un anno");
        int anno = scanner.nextInt();

        boolean b2 = annoBisestile(anno);

        if(b2){
            System.out.println("Anno bisestile");
        }
        else{
            System.out.println("Anno non bisestile");
        }
    }

    public static boolean stringaPariDispari(String s){
        if(s.length()%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean annoBisestile(int anno){
        if(anno%400==0 || ((anno%4==0)&&(anno%100!=0))){
            return true;
        }
        else{
            return false;
        }
    }
}
