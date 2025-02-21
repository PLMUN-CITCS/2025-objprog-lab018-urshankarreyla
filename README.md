# **2025-OBJPROG-LAB018**
Week 05 - Methods in Java

Laboratory # 18 - Group Activity # 01 - Problem 02: Even or Odd Checker with Input and Logic Functions

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 18 - Group Activity # 01 - Problem 02: Even or Odd Checker with Input and Logic Functions**

   **Objective:**
   - Develop a Java program that checks if a given integer is even or odd.
   - Demonstrate the use of methods to separate input handling and logic.

   **File Naming Convention:**
   - `EvenOddChecker.java`

   **Desired Output:**
   ```txt
   Enter an integer: 17
   17 is an Odd number.
   
   Enter an integer: 24
   24 is an Even number.
   ```

   **Notable Observations:**
   - This activity emphasizes the separation of concerns by using different methods for input and logic.
   - Using methods makes your code more modular and easier to test and debug.

   **Java Programming Best Practices:**
   - Use meaningful method names that clearly describe their purpose.
   - Keep your methods concise and focused on a single task.
   - Add comments to your code to explain the logic and purpose of each method.
   - Validate user input to prevent unexpected errors.
      
   **Method Requirements:**

   1. getIntegerInput()
      - Purpose: To get an integer input from the user.
      - Requirements:
         - Prompt the user to enter an integer.
         - Read the user's input from the console.
         - Validate the input to ensure it is a valid integer (optional, but recommended).
         - Return the entered integer.
            
   2. checkEvenOrOdd(number)
      - Purpose: To determine if the given number is even or odd.
      - Requirements:
         - Take an integer as a parameter.
         - Use the modulo operator (%) to check if the number is divisible by 2.
         - Return a string message indicating whether the number is even or odd, including the number itself in the message (e.g., "17 is an Odd number.").

   3. Main Program Flow
      - Call the getIntegerInput() method to get an integer from the user.
      - Pass the obtained integer to the checkEvenOrOdd() method to get the result message.
      - Display the result message to the user.

   **Conclusion**

   By completing this coding challenge, you will gain experience in:
   - Designing and implementing methods in Java.
   - Using the modulo operator for calculations.
   - Handling user input.
   - Creating formatted output messages.
   - Following Java programming best practices for clean and maintainable code.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 05 - Laboratory # 18"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
