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

## Directions/instructions to install your language: https://github.com/MayankBatra005/SER502-Spring2020-Team25/blob/master/doc/Installation%20Guide%20and%20Execution%20Guide.pdf
Directions/instructions to install Sparky language
Follow the below steps to install via GitHub:
•	Clone the git project from 
https://github.com/MayankBatra005/SER502-Spring2020-Team25
•	Download this git project and Unzip the project in a new folder.
< Make sure there should be no spaces or invalid characters>
•	Open the project in Eclipse using following steps:
•	Files >> Open Project From File System. Browser your project folder here upto extracted project directory.
Steps to build JARS for sparky 
1. Right click on the project folder at the top.
2. Click on Export -> Under the Java Option, select Runnable JAR File option. -> Click Next.
3. Select the destination directory in which you want to export the jar.
4. Under Library handling chose "package required libraries into generated Jar" 
6. Click on Finish 
Note : Jar will be generated under selected destination folder mentioned in step 3
Please refer to Installation steps as shown in YouTube video 
How to run any program using Sparky language
Run via Eclipse:
1. Select the Compiler.java class under src>sparkyCompiler>Complier.java
2. Right click and select run as Run Configurations
3. Select Arguments tab 
4. Provide the complete path of the file located on your disk with extension as sparky
** Make sure the file should be stored on path containing no white spaces or invalid characters such as _ / - etc. **
5. Click on Run 
6. Output can be seen in Eclipse console
Run using compiler Jars:
Pre requisite: 
1.	Jar should be generated as illustrated in above steps
2.	Source code with extension as “.sparky” is created and path to this file is known 
Steps to run on console(Windows command prompt):
1. Navigate to the folder where compiler.jar was created
2. open command prompt (CMD) on this location 
3. Type the following command Java - jar compiler.jar "path\Filename.sparky"
 Path stands for the path to the file 
 Filename stands for the name of the file which contains the source code 
4. Hit Enter 
5. Code is executed on command prompt

## ONE LINE of bash script that builds the compiler and ONE LINE that runs the runtime.
JAVA -jar Compiler.jar filename.sparky
## Link to the YouTube video
