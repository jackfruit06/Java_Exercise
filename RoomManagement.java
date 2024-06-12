import java.util.*;
import java.io.*;
public class RoomManagement {
    public ArrayList<Room> readData(String filename) {
        ArrayList<Room> rooms = new ArrayList<>();
        try {
            Scanner sc  = new Scanner(new File(filename));
            int n = Integer.parseInt(sc.nextLine());
            for( int i = 0 ; i< n ; i++) {
                String id = sc.nextLine();
                String name = sc.nextLine();
                boolean available = Boolean.parseBoolean(sc.nextLine());
                int days = Integer.parseInt(sc.nextLine());
                double price = Double.parseDouble(sc.nextLine());

                if( id.charAt(0)=='R' ){
                    rooms.add(new Room(id,name , available ,days,price));
                }
                else if( id.charAt(0)=='L'){
                    int nBeds = Integer.parseInt(sc.nextLine());
                    boolean view = Boolean.parseBoolean(sc.nextLine());
                    rooms.add(new LuxuryRoom(id, name , available , days , price , nBeds,view));
                }
                else {
                    int services = Integer.parseInt(sc.nextLine());
                    boolean catering = Boolean.parseBoolean(sc.nextLine());
                    rooms.add(new PrimeRoom(id , name , available , days , price , services , catering));
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rooms;
    }

    public void printRoomsInfor(ArrayList<Room> rooms) {
        for( Room room : rooms){
            if( room instanceof PrimeRoom){
                PrimeRoom room1 = (PrimeRoom) room;
                System.out.println(room1.toString());
            }
            else {
                LuxuryRoom room2 = (LuxuryRoom) room;
                System.out.println(room2.toString());
            }
        }
    }

    public ArrayList<Room> sortByPrice(ArrayList<Room> rooms) {
        ArrayList<Room> result = new ArrayList<>();
        for( Room room : rooms){
            if( room.getAvailable()){
                result.add(room);
            }
        }
        for(int i = 0; i < result.size(); i++){
            for( int j  = 0; j < result.size(); j++){
                if( result.get(i).getPrice() > result.get(j).getPrice()){
                    Room temp = result.get(i);
                    result.set(i,result.get(j));
                    result.set(j,temp);
                }
            }
        }
        return result ;
    }

    public ArrayList<Room> getAvailableRooms(ArrayList<Room> rooms) {
        ArrayList<Room> result = new ArrayList<>();
        for( Room room : rooms){
            if( !room.getAvailable()){
                result.add(room);
            }
        }
        return result;
    }

    public ArrayList<Room> filterRoomByPrice(ArrayList<Room> rooms, double minPrice, double maxPrice) {
        ArrayList<Room> result = new ArrayList<>();
        for( Room room : rooms){
            if( minPrice <= room.getPrice() && maxPrice >= room.getPrice()){
                result.add(room);
            }
        }
        return sortByPrice(result);
    }
}