//
//import java.util.Scanner;
//import java.util.ArrayList;
//public class  BookTest {
//    static Scanner sc = new Scanner(System.in);
//    public static ArrayList<Book> inputBook(ArrayList<Book> books){
//
//        String  name, id, pubisher;
//        int quantity;
//        double price, tax;
//        boolean statics;
//        String line = null;
//        while(!(line = sc.nextLine()).isEmpty()){
//            String[] str = line.split(" ");
//                name = sc.nextLine();
//                id = sc.nextLine();
//                pubisher = sc.nextLine();
//                quantity = Integer.parseInt(sc.nextLine());
//                price = Double.parseDouble(sc.nextLine());
//            if(str[0].equals("1")) {
//                statics = Boolean.parseBoolean(sc.nextLine());
//                TextBook book1 = new TextBook(name, id, pubisher, quantity, price, statics);
//                books.add(book1);
//            } else if(str[0].equals("2")) {
//                tax = Double.parseDouble(sc.nextLine());
//                ReferenceBook book2 = new ReferenceBook(name, id, pubisher, quantity, price, tax);
//                books.add(book2);
//            }
//        }
//        return books;
//    }
//
//
////    public static ArrayList<Book> getMaxPrice(ArrayList<Book> books){
////        double maxPrice = books.get(0).getPrice();
////        for(Book book : books){
////            if(book.getPrice() > maxPrice){
////                maxPrice = book.getPrice();
////            }
////        }
////
////        ArrayList<Book> listOfMaxPrice = new ArrayList<>();
////        for(Book book1 : listOfMaxPrice){
////            if(book1.getPrice() == maxPrice){
////                listOfMaxPrice.add(book1);
////            }
////        }
////        return listOfMaxPrice;
////    }
//
//
//
//
