import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CandidateManager {
    private ArrayList<Candidate> candidates;

    public CandidateManager() {
        this.candidates = new ArrayList<>();
    }

    /*
     * readData
     * Đọc dữ liệu từ file văn bản textFile và lưu dữ liệu vào các biến thành viên
     */
    public boolean readData(String textFile) {
        File file = null;
        Scanner fileReader = null;
        try {
            file = new File(textFile);
            fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String[] fields = fileReader.nextLine().trim().split("\\|");
                if (fields.length != 6) {
                    continue;
                }

                String id = fields[0].trim();
                String name = fields[1].trim();
                String selection = fields[2].trim();
                String sex = fields[3].trim();
                int year = Integer.parseInt(fields[4].trim());
                int priority = Integer.parseInt(fields[5].trim());

                Candidate newCandidate = new Candidate(id, name, selection, sex, year, priority);

                this.candidates.add(newCandidate);
            }
            return true;
        } catch(IOException ex) {
            System.out.println("Error reading file '" + textFile + "'");
            return false;
        }  finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }

    /*
     * getSelectionCandicates
     * Trả về danh sách các thí sinh có khối thi là selection
     */
    public ArrayList<Candidate> getSelectionCandicates(String selection) {
        /* TODO */
        ArrayList<Candidate> candidates1 = new ArrayList<>();
        for(Candidate candidate : candidates){
            if(candidate.selection().equals(selection)){
                candidates1.add(candidate);
            }
        }
        return candidates1;
    }

    /*
     * getPriorityCandidates
     * Trả về danh sách thí sinh được ưu tiên (có độ ưu tiên bằng 1)
     */
    public ArrayList<Candidate> getPriorityCandidates() {
        /* TODO */
        ArrayList<Candidate> candidateArrayList = new ArrayList<>();
       for(Candidate c1: candidates){
           if(c1.priority() == 1){
               candidateArrayList.add(c1);
           }
       }
       return candidateArrayList;

    }
    public static void sortNames(String[] names) {
        String temp;
        for (int i = 0; i < names.length ; i++) {
            for (int j = 1 ; j < names.length; j++) {

            }
        }
    }

    /*
     * sortByName
     * Trả về danh sách các thí sinh được sắp xếp theo họ và tên
     */
    public ArrayList<Candidate> sortByName() {
        /* TODO */
        Candidate temp;

        for (int i = 0; i < candidates.size() - 1; i++) {
            for (int j = i + 1; j < candidates.size(); j++) {
                String[] nameParts1 = candidates.get(i).name().trim().split("\\s+");
                String[] nameParts2 = candidates.get(j).name().trim().split("\\s+");
                String fullName1 = candidates.get(i).name();
                String fullName2 = candidates.get(j).name();
                // Compare full names
                if (fullName1.compareToIgnoreCase(fullName2) > 0) {
                    temp = candidates.get(i);
                    candidates.set(i, candidates.get(j));
                    candidates.set(j,temp) ;
                } else if(fullName1.compareToIgnoreCase(fullName2) == 0){ // if full name are the same, compare last name
                        String lastName1 = nameParts1[nameParts1.length - 1];
                        String lastName2 = nameParts2[nameParts2.length - 1];
                        int compareLastName = lastName1.compareToIgnoreCase(lastName2);
                        if (compareLastName > 0) {
                            temp = candidates.get(i);
                            candidates.set(i, candidates.get(j));
                            candidates.set(j, temp);
                        }
                }
            }
        }
        return candidates;
    }

    /*
     * getSecondYoungestCandidates
     * Trả về danh sách các thí sinh có tuổi trẻ thứ 2 trong danh sách
     *  (ví dụ: các khách hàng có các năm sinh 1990 1991 1992 1993,
     *  trả về danh sách các khách hàng sinh năm 1992)
     */
    public ArrayList<Candidate> getSecondYoungestCandidates() {
        /* TODO */
        int max = 0;
        int secondMax = 0;
        for(Candidate candidate1 : candidates){
            if(candidate1.year() > max){
                secondMax = max;
                max = candidate1.year();
            } else if(candidate1.year() > secondMax && candidate1.year() != max){
                secondMax = candidate1.year();
            }
        }
        ArrayList<Candidate> candidatesList = new ArrayList<>();
        for(Candidate candidate2 : candidates){
            if(candidate2.year() == secondMax){
                candidatesList.add(candidate2);
            }
        }
        return candidatesList;
    }

    /*
     * printCandidatesFromArray
     * In danh sách các thí sinh từ một List đã cho
     */
    public void printCandidatesFromArray(ArrayList<Candidate> candidates) {
        if (candidates == null) {
            return;
        }

        for (int i = 0; i < candidates.size(); i++) {
            candidates.get(i).print();
        }
    }

    /*
     * printCandidates
     * In danh sách các thí sinh được lưu trong biến thành viên candidates
     */
    public void printCandidates() {
        printCandidatesFromArray(this.candidates);
    }

    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        if (!candidateManager.readData("C:\\ThanhMai\\Java\\MAT2505\\src\\candidates.txt")) {
            return;
        }

//        ArrayList<Candidate> selectionCandidates = candidateManager.getSelectionCandicates("A");
//        candidateManager.printCandidatesFromArray(selectionCandidates);
//        System.out.println();

//        ArrayList<Candidate> priorityCandidates = candidateManager.getPriorityCandidates();
//        candidateManager.printCandidatesFromArray(priorityCandidates);
//        System.out.println();

        ArrayList<Candidate> sortedNameCandidates = candidateManager.sortByName();
        candidateManager.printCandidatesFromArray(sortedNameCandidates);
        System.out.println();

//        ArrayList<Candidate> secondYoungestCandidates = candidateManager.getSecondYoungestCandidates();
//        candidateManager.printCandidatesFromArray(secondYoungestCandidates);
    }
}