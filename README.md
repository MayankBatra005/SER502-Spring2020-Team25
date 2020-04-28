# SER502-Spring2020-Team-25

## Language Name: Sparky

## Course Information
- **Instructor**: Dr. Ajay Bansal
- **TA**: Sarthak Tiwari

## Teammates
- Mayank Batra
- Rahul Jain
- Rishika Bera
- Sayali Suryakant Tanawade

## System on which your compiler and runtime are built (GNUstep, Linux, Unix, Windows or Mac OS)
- Windows OS

## Tools used
- ANTLR
- Eclipse
- Git
- ANT

## Directions/instructions to install your language
## Directions/instructions to build and run your language (compiler/runtime).
Steps after importing the project into Eclipse: 
1. Right click on the project folder at the top.
2. Click on Export -> Under the Java Option, select Runnable JAR File option. -> Click Next.
3. Select the destination directory in which you want to export the jar..
< Make sure there should be no spaces in the path > and name the file <Compiler.jar>
4. Under Library handling chose "package required libraries into generated Jar" 
5. Under the option Launch Configuration, select the respective files for the respective JAR: Compiler - SER502-Spring2020-Team25
6. Click on Finish and hit okay 
7. Go to the folder where jar is generated 
8. Save the source code at this location with extension .sparky
9. Run the command prompt at this location 
10. provide the command as follows:
JAVA -jar Compiler.jar filename.sparky

## ONE LINE of bash script that builds the compiler and ONE LINE that runs the runtime.
JAVA -jar Compiler.jar filename.sparky
## Link to the YouTube video
