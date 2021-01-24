import java.util.Scanner;

import fileActions.Actions;
import logFiles.logOperations.updateLog;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        boolean runtime = true;

        Actions fileActions = new Actions();
        updateLog updateLog = new updateLog();

        while(runtime) {
            System.out.println("_________________________________________________________");
            System.out.println("Please select one of the following options: ");
            System.out.println("1: List the files you are able to play with.");
            System.out.println("2: Get the size of a specific file");
            System.out.println("3: Get the number of lines withing the file");
            System.out.println("4: Search a file for a specific word");
            System.out.println("5: Get count of how many times a certain word appears in the file");
            System.out.println("");    

            System.out.println("999: Exit program");

            Scanner scan = new Scanner(System.in);

            double timeBefore = 0;
            double timeAfter = 0;

            int choise = scan.nextInt();
            switch(choise) {
                case 1:
                    
                    //Calling void method which prints result to console;
                    timeBefore = System.currentTimeMillis();
                    fileActions.directoryfiles();
                    timeAfter = System.currentTimeMillis();
                        
                    updateLog.update("User requested a list of files in directory", (timeAfter - timeBefore));

                    break;

                case 2:
                    fileActions.directoryfiles();
                
                    System.out.println("Please enter the filename (Hint: file options listed in console)");
                    System.out.println("Remember to also include the file extension: ");

                    
                    scan =  new Scanner(System.in);
                    String file = scan.nextLine();

                    timeBefore = System.currentTimeMillis();
                    String sizeResult = "File " + file + " has the size of: " + fileActions.getFileSize(file) + " bytes";
                    timeAfter = System.currentTimeMillis();

                    updateLog.update(sizeResult, (timeAfter - timeBefore));
                    System.out.println(sizeResult);
                    
                    break;

                case 3: 
                    fileActions.directoryfiles();
                
                    System.out.println("Please enter the filename (Hint: file options listed in console)");
                    System.out.println("Remember to also include the file extension: ");

                    
                    scan =  new Scanner(System.in);
                    String file3 = scan.nextLine();

                    timeBefore = System.currentTimeMillis();
                    String lineResult = "File contains: " + fileActions.getLinereader(file3) + " lines.";
                    timeAfter = System.currentTimeMillis();

                    updateLog.update(lineResult, (timeAfter - timeBefore));
                    System.out.println(lineResult);
                    
                    break;
                case 4:
                    fileActions.directoryfiles();
                
                    System.out.println("Please enter the filename (Hint: file options listed in console)");
                    System.out.println("Remember to also include the file extension: ");

                    
                    scan = new Scanner(System.in);

                    String fileName = scan.nextLine();

                    System.out.println("please enter the word you want to search for: ");
                    String word = scan.nextLine();

                    timeBefore = System.currentTimeMillis();
                    String wordSearch = "Search for " + word + " resulted in: " + fileActions.getSearchWord(fileName, word) + "!";
                    timeAfter = System.currentTimeMillis();

                    updateLog.update(wordSearch, (timeAfter - timeBefore));

                    System.out.println(wordSearch);


                    break;

                case 5:
                    
                    fileActions.directoryfiles();
                
                    System.out.println("Please enter the filename (Hint: file options listed in console)");
                    System.out.println("Remember to also include the file extension: ");

                    scan = new Scanner(System.in);

                    String searchFile = scan.nextLine();

                    System.out.println("please enter the word you want to search for: ");
                    String searchWord = scan.nextLine().toLowerCase();

                    timeBefore = System.currentTimeMillis();
                    String wordCountResult = "The word: " + searchWord + " appeared " + fileActions.getWordcount(searchFile, searchWord) + " times";
                    timeAfter = System.currentTimeMillis();

                    updateLog.update(wordCountResult, (timeAfter - timeBefore));

                    System.out.println(wordCountResult);

                    break;
                

                case 999: 
                    updateLog.update("User exited program...", 0);
                    scan.close();
                    System.exit(0);
                    break; //doesn't reach it but good practice to include anyways.

                default:
                    System.out.println("Invalid input!");

            }
        }
    }
}