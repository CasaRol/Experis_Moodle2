# Experis Academy - File Manipulation Application

This is the first hand-in for Experis Academy taught by Noroff.

![Running in git-bash](https://github.com/CasaRol/Experis_Moodle2/blob/main/Screenshots/Running_bash.png)

The application here is a simple fil manipulator which takes an argument as to which file to look at 
and then outputs one of the selectable functions: 
* List all files ready for manipulation
* List hos many lines a certain file consist of
* List the size of a given file
* Look for a certain word within a file
* Look up how many times a certain word appears within a given file

### How This project is made

This project has been made using Visual Studio Code in order to learn how a normal IDE (Integraded Development Environment) handles files and folders/packages.  
This means that every single project file has been manually compilled using the terminal/CMD for the exstra learning experience as to how to create an executable JAR-file.  

### How to manually create a JAR-file

First is to open the terminal and go to your root of your project.  
Then you want to compile every single java-file in the project using only one command like shown below.  
Make sure to also specify a folder for where to put the compiled files like here where I specify /out to be the endpoint.   

![Compiling java-files to class-files](https://github.com/CasaRol/Experis_Moodle2/blob/main/Screenshots/javac.png)

* Note that I'm using the astrix symbol. This is in order to take all files with a .java extention withing a certain folder and compile them all without calling every single file.  

After that we want to go to our new out folder with the CD command:  

![cd out](https://github.com/CasaRol/Experis_Moodle2/blob/main/Screenshots/cd_out.png)

* This command lets us enter the newly created folder out.  
After that the creation of the JAR-file begins with the following command:  

![Creating JAR-file](https://github.com/CasaRol/Experis_Moodle2/blob/main/Screenshots/jar_cfe.png)

* Using this command we tell teh computer which files we want to be compiled into teh JAR-file aswell as specifying what to call the JAR-file and which java class is the main class for the entire project. 
* If this command runs without errors there should appear a new JAR-file which can be run via the terminal/CMD using the following command:  

![Run JAR-file](https://github.com/CasaRol/Experis_Moodle2/blob/main/Screenshots/jar.png)

* From here it is just to have fun running the program and check out all the files within the assets provided within the project!

### Have fun!

Please note: A compiled version is added within this GitHub Repository and you do therefor not need to compile the project yourself.  
just navigate to the correct folder and run the last provided command and your should be good to go!

