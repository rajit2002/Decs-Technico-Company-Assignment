# File Sharing Application - Testing Documentation  

##  Project Overview  
This repository contains testing documentation for the **File Sharing Application**, covering both **manual testing** and **automation testing** approaches. The application allows users to **register, log in, and upload files**, and our testing ensures that these features work as expected.  

We have structured our work into two branches:  
- `automation-testing-project` → For automated test scripts using page object model 
- `manual-testing-project` → For manual testing documentation  

---
##  Manual Testing  
### ** Test Plan & Scope**  
The manual testing process focused on verifying the core functionalities of the application, including:  
- **User Registration** → Ensuring valid sign-ups and handling invalid inputs  
- **Login** → Testing credential validation   
- **File Upload** → Checking file size limits, format restrictions, and upload behavior  
- **UI & Usability** → Verifying responsiveness and ease of use  
  

A detailed **Test Plan** document is available in this branch, along with test cases and a bug report.  

### ** Test Cases & Bug Reports**  
- The **test case document** contains positive and negative test scenarios.  
- A **bug report** lists identified issues along with their severity and resolution status.  

 All manual testing documents are stored in the `manual-testing-project` branch.  

---

##  Automation Testing  
### ** Features Covered in Automation**  
Automated test scripts have been written using **Selenium WebDriver with Java**, covering:  
   **Sign-Up Process** → Validating registration flow with different inputs  
   **Login Functionality** → Ensuring secure authentication mechanisms  
   **File Upload Process** → Automating upload verification for different file types  

### ** Tools & Technologies Used**  
- **Selenium WebDriver** (for automation)  
- **Java** (as the programming language)  
- **TestNG & page object models**   
- **Maven** (for dependency management)  



