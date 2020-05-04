package JavaCollectionOptionalTask;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public void writeAndReadFile() throws IOException {
        FileWriter writeFile = new FileWriter("file.txt");
        writeFile.write("Belarus Canada Croatia");
        writeFile.close();

        FileReader readFile = new FileReader("file.txt");
        Scanner scan = new Scanner(readFile);

        String fileText = null;
        while (scan.hasNext()){
            fileText = scan.nextLine();
        }
        readFile.close();
        ArrayList<String> fileArray = new ArrayList<>();
        for (String retval : fileText.split(" ")){
            fileArray.add(retval);
        }

        Collections.reverse(fileArray);

        FileWriter writeFileReverce = new FileWriter("file.txt");
        for (String e: fileArray) {
            writeFileReverce.write(e + " ");
        }
        writeFileReverce.close();
    }

    public void stackReverse(){
        System.out.println("input number");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();
        String numberToString = Integer.toString(number);
        System.out.println(numberToString + " test");

        Stack<String> stackNumber = new Stack<>();
        for (String e : numberToString.split("")) {
            stackNumber.add(e);
        }
        Collections.reverse(stackNumber);
        for (String e : stackNumber)
        System.out.print(e);
     }

     public void catalogList(){
        File catalog = new File("C://projects");
        ArrayList<String> catalogList = new ArrayList<>();
        if (catalog.isDirectory()){
            for (File item : catalog.listFiles()){
                if (item.isDirectory()){
                    catalogList.add(item.getName());
                    System.out.println(item.getName() + " Folder")
                    ;}
                else {
                    catalogList.add(item.getName());
                    System.out.println(item.getName() + " File");
                }
            }
        }
         System.out.println(catalogList.toString());
     }

    public final Comparator<String> LINE_LENGHT = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

     public void poemSort(){
        String poem = "From childhood's hour I have not been\n" +
                "As others were; I have not seen\n" +
                "As others saw; I could not bring\n" +
                "My passions from a common spring.\n" +
                "From the same source I have not taken";

        ArrayList<String> poemInList = new ArrayList<>();
        for (String e : poem.split("\n")){
            poemInList.add(e);
        }

        Collections.sort(poemInList, LINE_LENGHT);
         System.out.println(poemInList +" \n");
     }




    public static void main(String[] args) throws IOException {
        Main main = new Main();

        main.writeAndReadFile();

//        main.stackReverse();

//        main.catalogList();

        main.poemSort();
    }

}
