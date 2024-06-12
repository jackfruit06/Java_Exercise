import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ComicStoreManagement {
    public static ArrayList<Comic> readComics(String filename) {
        ArrayList<Comic> comics = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                String id = sc.nextLine();
                String name = sc.nextLine();
                boolean available = Boolean.parseBoolean(sc.nextLine());
                int days = Integer.parseInt(sc.nextLine());
                double price = Double.parseDouble(sc.nextLine());
                if (id.charAt(0) == 'N') {
                    comics.add(new Comic(id, name, available, days, price));
                } else if (id.charAt(0) == 'C') {
                    int nPages = Integer.parseInt(sc.nextLine());
                    boolean latest = Boolean.parseBoolean(sc.nextLine());
                    comics.add(new ColorComic(id, name, available, days, price, nPages, latest));
                } else {
                    int maxDays = Integer.parseInt(sc.nextLine());
                    boolean valuable = Boolean.parseBoolean(sc.nextLine());
                    comics.add(new SpecialComic(id, name, available, days, price, maxDays, valuable));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return comics;
    }

    public static void printComicsInfor(ArrayList<Comic> comics) {
        for (Comic comic : comics) {
            System.out.println(comic.toString());
        }
    }

    public static ArrayList<Comic> sortByPrice(ArrayList<Comic> comics) {
        ArrayList<Comic> comics1 =new ArrayList<>();
        for(Comic comic : comics){
            if(!comic.getAvailable()){
                comics1.add(comic);
            }
        }
        Comic temp;
        for (int i = 0; i < comics1.size(); i++) {
            for (int j = 1; j < comics1.size(); j++) {
                if (comics1.get(j).getPayment() > comics1.get(j - 1).getPayment()) {
                    temp = comics1.get(j);
                    comics1.set(j, comics1.get(j - 1));
                    comics1.set(j - 1, temp);
                }
            }
        }
        return comics;
    }

    public static ArrayList<Comic> getAvailableComics(ArrayList<Comic> comics) {
        ArrayList<Comic> comics1 = new ArrayList<>();
        for (Comic comic : comics) {
            if (comic.getAvailable()) {
                comics1.add(comic);
            }
        }
        return comics1;
    }

    public static  ArrayList<Comic> filterComicByPrice(ArrayList<Comic> comics, double minPrice, double maxPrice) {
        ArrayList<Comic> comics1 = new ArrayList<>();
        for (Comic comic : comics) {
            if (comic.getPrice() >= minPrice && comic.getPrice() <= maxPrice) {
                comics1.add(comic);
            }
            Comic temp;
            for (int i = 0; i < comics1.size(); i++) {
                for (int j = 1; j < comics1.size(); j++) {
                    if (comics1.get(j).getPrice() > comics1.get(j - 1).getPrice()) {
                        temp = comics1.get(j);
                        comics1.set(j, comics1.get(j - 1));
                        comics1.set(j - 1, temp);
                    }
                }
            }
        }
        return comics1;
    }

    public static void main(String[] args) {
        String path = "C:\\ThanhMai\\Java\\MAT2505\\src\\Comics.txt";
        printComicsInfor(sortByPrice(readComics(path)));
    }
}
