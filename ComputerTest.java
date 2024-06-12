import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class   ComputerTest implements Serializable {

    // hàm ghi ra file dưới dạng Object, trong đó filename là tên file truyền vào, coms là danh sách các Computer muốn ghi ra file
    public static void outputObject(String fileName, ArrayList<Computer> coms) {
        ObjectOutputStream buff = null;
        try{
            FileOutputStream file = new FileOutputStream(fileName);
            buff = new ObjectOutputStream(file);
            for(Computer computer : coms){
                buff.writeObject(computer);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void inputObject(String fileName, ArrayList<Computer> coms) {
        ObjectInputStream buff = null;
        try{
            FileInputStream input = new FileInputStream(fileName);
            buff = new ObjectInputStream(input);
            while(true){
                try {
                    Computer c1 = (Computer) buff.readObject();
                    coms.add(c1);
                } catch (EOFException e){
                    break;
                } catch (ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    // Hàm in ra màn hình thông tin của các máy tính trong danh sách computers
    public static void output(ArrayList<Computer> computers)
    {
        for(int i =0; i < computers.size(); i ++)
            System.out.println(computers.get(i).toString());
    }

    // Hàm trả về giá trung bình của các máy tính trong danh sách coms
    public static double getAvgPrice(ArrayList<Computer> coms)
    {
        double sum = 0;
        for(Computer computer : coms){
            sum += computer.getPrice();
        }
        return sum / coms.size();
    }

    // Hàm trả về các máy tính có giá lớn nhất
    public static ArrayList<Computer> getMaxPrice(ArrayList<Computer> coms)
    {
        double max = Double.MIN_VALUE;
        for(Computer computer: coms){
            if(computer.getPrice() > max){
                max = computer.getPrice();
            }
        }
        ArrayList<Computer> computers = new ArrayList<>();
        for(Computer computer : computers){
            if(computer.getPrice() == max){
                computers.add(computer);
            }
        }
        return computers;
    }

    // Hàm trả về danh sách các máy tính có hãng sản xuất là Dell
    public static ArrayList<Computer> getDell(ArrayList<Computer> coms)
    {
        ArrayList<Computer> computers = new ArrayList<>();
        for(Computer computer : coms){
            if(computer.getManu().equals("Dell")){
                computers.add(computer);
            }
        }
        return computers;
    }

    // Hàm sắp xếp theo giá giảm dần và in ra danh sách các máy tính sau khi sắp xếp
    public static void sort(ArrayList<Computer> coms)
    {
        Computer temp;
        for(int i = 0; i < coms.size(); i++){
            for(int j = 1; j < coms.size(); j++){
                if(coms.get(j).getPrice() > coms.get(j-1).getPrice()){
                    temp = coms.get(j);
                    coms.set(j, coms.get(j-1));
                    coms.set(j - 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ComputerTest test = new ComputerTest();
        ArrayList<Computer> newC = new ArrayList<>();
        test.inputObject("computer.dat", newC);
        ArrayList<Computer> dell = test.getDell(newC);
        test.outputObject("dell.dat", dell);
    }

}
