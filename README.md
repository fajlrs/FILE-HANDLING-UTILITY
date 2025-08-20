# FILE HANDLING UTILITY


*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: SHAIK RAYEES

*INTERN ID*: CT04DY392

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTHOSH KUMAR




## DESCRIPTON

1.Overview

2.Features

3.Requirements

4.Installation & Usage

5.Code Walkthrough

6.Example Runs (with expected outputs)

7.Error Handling Explanation

8.Future Improvements

9.License



### 📂 FileHandlingUtility – Java File Handling Tool

#### 1.📝 Overview

FileHandlingUtility is a menu-driven Java console application designed to demonstrate file handling operations in Java using BufferedReader, BufferedWriter, and FileWriter.
It allows users to:

Write data to a file (overwrites existing content)

Read data from a file

Append (modify) data to an existing file

This project is useful for Java beginners and intermediate learners who want to understand how to:

Work with files in Java

Use try-with-resources for automatic resource management

Handle exceptions gracefully

Use menu-driven programming in console applications



#### 2.🚀 Features

✅ Write to a file – Overwrites the file with new content.

✅ Read from a file – Displays the entire file content in the console.

✅ Modify a file (Append) – Adds new content to the end of the file.

✅ Exception handling – Prevents crashes due to missing files or I/O errors.

✅ Menu-based interface – Easy for beginners to navigate.

✅ Cross-platform – Works on Windows, macOS, and Linux.



Requirements

Java JDK: Version 8 or higher

Text Editor / IDE: IntelliJ IDEA, Eclipse, NetBeans, or even Notepad++

Command Line Interface: Terminal / Command Prompt



#### 3.⚙️ How to Run


git clone https://github.com/<your-username>/FileHandlingUtility.git

cd FileHandlingUtility



2️⃣ Compile the Program

javac FileHandlingUtility.java



3️⃣ Run the Program

java FileHandlingUtility





#### 4.📂 Project Structure


FileHandlingUtility/

│

├── FileHandlingUtility.java    # Main Java source code

├── sample.txt                  # File to read/write/append

└── README.md                   # Documentation









#### 5.📜 Code Walkthrough

1. File Name Constant

private static final String FILE_NAME = "sample.txt";




Stores the file name in one place for easy modification.



The file is created in the program's execution directory.


2. Write to File

try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
 
    writer.write(content);

}




Uses BufferedWriter for efficiency.


FileWriter (without true) overwrites the file.



3. Read from File

try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

    String line;

    while ((line = reader.readLine()) != null) {

        System.out.println(line);

    }

}




Reads file line-by-line to avoid memory issues.



Uses try-with-resources to close automatically.



4. Append to File

try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
 
    writer.newLine();

    writer.write(newContent);

}



Uses true in FileWriter to enable append mode.

Adds a newline before appending.



5. Menu & User Interaction

switch (choice) {

    case 1: writeFile(...); break;

     case 2: readFile(); break;

    case 3: modifyFile(...); break;

    default: System.out.println("❌ Invalid option!");

}


Provides an easy navigation system.

Handles invalid choices gracefully.





#### 6.💻 Example Runs

Example 1 – Writing to a File

===== FILE HANDLING UTILITY =====


1. Write to File

2. Read File

3. Modify File

Choose an option: 1

Enter text to write: Hello World

✅ File written successfully!



sample.txt now contains:



Hello World



Example 2 – Reading from a File

===== FILE HANDLING UTILITY =====

1. Write to File

2. Read File

3. Modify File

Choose an option: 2



📄 File Content:

Hello World



Example 3 – Appending to a File

===== FILE HANDLING UTILITY =====

1. Write to File

2. Read File

3. Modify File

Choose an option: 3

Enter text to append: This is Java

✅ File modified successfully!


sample.txt now contains:


Hello World

This is Java


Example 4 – Invalid Option

===== FILE HANDLING UTILITY =====

1. Write to File

2. Read File

3. Modify File

Choose an option: 7

❌ Invalid option!






#### 7.🛡 Error Handling


The program is built to handle:


File not found – Displays "❌ Error reading file: ...".


Permission issues – Informs the user without crashing.


Invalid menu option – Prints "❌ Invalid option!".


Empty input – File will still be created but with no content.






#### 8.🔮 Future Improvements


Add Delete File option.


Add Search in File option.


Add File Encryption/Decryption.


Allow multiple operations in one run (loop until exit).


Add GUI version using Java Swing or JavaFX.





#### 9.📜 License


This project is licensed under the MIT License – you are free to use, modify, and distribute it with attribution.





### 👨‍💻 Author


#### SHAIK RAYEES

#### 📧 asmathunnisam@gmail.com

#### 🌐 SHAIK RAYEES (fajlrs)



## OUTPUT

<img width="1920" height="1080" alt="Image" src="https://github.com/user-attachments/assets/b4d018a2-84ac-4d1e-b124-cfe59e77a46b" />




