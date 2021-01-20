import java.util.Scanner;

import fileActions.Actions;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        boolean runtime = true;

        Actions fileActions = new Actions();

        while(runtime) {
            System.out.println("Please select one of the following options: ");
            System.out.println("1: List the files you are able to play with.");
            System.out.println("2: Get the size of a specific file");
            System.out.println("3: Get the number of lines withing the file");
            System.out.println("4: Search a file for a specific word");
            System.out.println("5: Get count of how many times a certain word appears in the file");
            System.out.println("");    

            System.out.println("999: Exit program");

            Scanner scan = new Scanner(System.in);
            int choise = scan.nextInt();
            switch(choise) {
                case 1:
                    
                    for (String file1 : fileActions.directoryfiles()) {
                        System.out.println(file1);    
                    }
                    break;

                case 2:
                    for (String file2 : fileActions.directoryfiles()) {
                        System.out.println(file2);    
                    }
                
                    System.out.println("Please enter the filename (Hint: file options listed in console)");
                    System.out.println("Remember to also include the file extension: ");


                    Scanner scanning =  new Scanner(System.in);
                    String file = scanning.nextLine();
                    System.out.println("File " + file + " has the size of: " + fileActions.fileSize(file) + " bytes.");
                    break;

                case 3: 
                    for (String file3 : fileActions.directoryfiles()) {
                        System.out.println(file3);    
                    }
                
                    System.out.println("Please enter the filename (Hint: file options listed in console)");
                    System.out.println("Remember to also include the file extension: ");

                    Scanner scanner =  new Scanner(System.in);
                    String file3 = scanner.nextLine();

                    System.out.println("File contains: " + fileActions.linereader(file3) + " lines.");
                    

                case 999: 
                    System.exit(0);
                    break; //doesn't reach it but good practice to inclune anyways.

            }
        }
    }
}