import java.util.ArrayList;
import java.util.Scanner;
public class MotorbikeTest {
    static Scanner sc = new Scanner(System.in);
    public static void inputMotorbike (ArrayList<Motorbike> motorbikes, int n)
    {
        n =   Integer.parseInt(sc.nextLine());
        String id, name, manu, date;
        int quantity;
        double price, weight;
        for(int i = 0; i < n; i++){
            id = sc.nextLine();
            name = sc.nextLine();
            manu = sc.nextLine();
            quantity =  Integer.parseInt(sc.nextLine());
            price = Double.parseDouble(sc.nextLine());
            weight = Double.parseDouble(sc.nextLine());
            date = sc.nextLine();
            Motorbike motorbike = new Motorbike(id, name, manu, quantity, price, weight, date);
            motorbikes.add(motorbike);
        }
    }
    public static void outputMotorbike(ArrayList<Motorbike> motorbikes)
    {
        for(Motorbike motorbike : motorbikes){
            System.out.println(motorbike.printMotorbike());
        }
    }
    public static ArrayList<Motorbike> search (String manu, ArrayList<Motorbike> motorbikes)
    {
        ArrayList<Motorbike> ans = new ArrayList<>();
        for(Motorbike motorbike : motorbikes){
            if(motorbike.getManu().equals(manu)){
                ans.add(motorbike);
            }
        }
        return ans;
    }
    public static ArrayList<Motorbike> maxWeight (ArrayList<Motorbike> motorbikes)
    {
        double max = Double.MIN_VALUE;
        for(Motorbike mk : motorbikes){
            if(mk.getWeight() > max){
                max = mk.getWeight();
            }
        }
        ArrayList<Motorbike> maxWeigth = new ArrayList<>();
        for(Motorbike motorbike: motorbikes){
            if(motorbike.getWeight() == max){
                maxWeigth.add(motorbike);
            }
        }
        return maxWeigth;
    }
    public static ArrayList<Motorbike> minQuanlity (ArrayList<Motorbike> motorbikes)
    {

        double min = Double.MAX_VALUE;
        for(Motorbike mk : motorbikes){
            if(mk.getQuantity() < min){
                min = mk.getQuantity();
            }
        }
        ArrayList<Motorbike> minQuantity = new ArrayList<>();
        for(Motorbike motorbike: motorbikes){
            if(motorbike.getQuantity() == min){
                minQuantity.add(motorbike);
            }
        }
        return minQuantity;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 0;
        ArrayList<Motorbike> motorbikes = new ArrayList<>();
        inputMotorbike(motorbikes,n);
        int c = sc.nextInt();
        if(c == 1){
            ArrayList<Motorbike> result1 = search("Honda", motorbikes);
            outputMotorbike(result1);

        } else if(c == 2){
            ArrayList<Motorbike> result2 = maxWeight(motorbikes);
            outputMotorbike(result2);
        } else{
            ArrayList<Motorbike> result3 = minQuanlity(motorbikes);
            outputMotorbike(result3);
        }

    }
}