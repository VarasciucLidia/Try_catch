import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public int getInt()
    {
        int number=0;
        boolean repeat=false;
        do{
            try {
                Scanner scan = new Scanner (System.in);
                number=scan.nextInt();
                repeat=false;
            }
            catch (InputMismatchException exception) {
                System.out.println("Please enter a valid number!!");
                repeat=true;
            }
        } while(repeat==true);
        return number;
    }
//2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode, care sa citeasca si sa
// returneze si alte tipuri de numere (float, int, double, long, etc)
    public float getFloat()
    {
        float number=0;
        boolean repeat=false;
        do{
            try {
                Scanner scan = new Scanner (System.in);
                number=scan.nextFloat();
                repeat=false;
            }
            catch (InputMismatchException exception) {
                System.out.println("Please enter a valid float number!!");
                repeat=true;
            }
        } while(repeat==true);
        return number;
    }
    public double getDouble()
    {
        double number=0;
        boolean repeat=false;
        do{
            try {
                Scanner scan = new Scanner (System.in);
                number=scan.nextDouble();
                repeat=false;
            }
            catch (InputMismatchException exception) {
                System.out.println("Please enter a valid double number!!");
                repeat=true;
            }
        } while(repeat==true);
        return number;
    }
    //4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura. Metoda nu va primii
    // parametru lungimea. In rezolvarea ei trebuie folosit try-catch. (Hint: a se citi de la tastatura atata timp cat
    // valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
    public List<Integer> getList(){
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numerele din lista: ");
        do {
            try {
                list.add(scan.nextInt());
            }catch (InputMismatchException e){
                if (scan.nextLine().equalsIgnoreCase("q")){
                    break;
                }else {
                    System.out.println("Valoare invalida" );
                }
            }

        }while (true);
        return list;
    }

    //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura. Metoda sa primeasca
    // ca si parametru un numar, care reprezinta cate pozitii are.
    public int[] getArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for position " + i + ":");
            arr[i] = getInt();
        }
        return arr;
    }
 //6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar sa primeasca un parametru de
 // tip int. In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in
 // secunde, cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.
    public void wait(int millisec) {

        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
