# BookStore
A Simple Book Store application

Installation and Build & Execution of Application
—————————————————————————————————————————————----
Download the BookStore.jar into your local computer.
Extract the jar into a Web application project in an IDE like Eclipse or into a folder in the Computer
Run the program either in the IDE or Command line with the 4 required command line arguments.

CONSTRAINTS:
———————————————
1. Budget - in the range of 0 to 10^9 
2.  Initial Price - in the range of 0 to 10^9 
3. Discount amount - which ranges between 0 and Initial Price
4. Floor price - which also ranges between 0 and Initial Price

FOR e.g: ( For the example in the problem)
 
cmd> javac BookStore.java 300 50 4 25 

Execution of Unit tests
————————————————————————————————————————————————————————————
There are 3 unit tests written in JUnit for the application which tests valid , invalid and Big price inputs. 

Run the test class TestBookStore in the IDE or Command line with no arguments and It should display the results on the Unit tests.
Modify any Unit tests to test against a particular scenario. 
The Unit tests give about 85% coverage for the application code and also the different user scenarios associated with the application 

Application Design choices and Explanation
————————————————————————————————————————————————————————————
The BookStore application is designed to take 4 arguments in the order of:

1. Budget - in the range of 0 to 10^9 
2.  Initial Price - in the range of 0 to 10^9 
3. Discount amount - which ranges between 0 and Initial Price
4. Floor price - which also ranges between 0 and Initial Price

The conditions 1 & 2 are to prevent negative budget and initial prices. 
And since it is represented in Double to save any decimals in the price, The range is limited to a maximum budget to the order of 10 power 9.
Also a try-catch block to catch any other exceptions.

Algorithm used:
———————————————
1. Validate all inputs are within range and valid.
2. Allocate initial Balance = Budget
3. Price to for the book to buy next is initially equal to the Initial Price.
4. If the Balance is high enough to buy a book, Buy and add the book to the HashMap.
5. Reduce the Book price from Balance and Also calculate how much the next book price would be based on the discount amount given.
6. Loop 4 & 5 until the Balance remaining is not enough to buy the next book.
7. Print results


Improvements and Scalability
————————————————————————————————————————————————————————————
The parts commented out in the code:
1. It also includes the Books brought and the price each one of them are brought at in a HashMap “books” , which can be used to do further analysis 
Or data representation as the application scales or requires. 
2. The Bookstore budget , prices and books brought have been added to a JSONArray and can then be used to provide a rest service for the application’s functionality.
Please Uncomment the code and add the required JAR files to the project LIB location to execute them.  Required JAR files are in a GIT folder.

Scalability: 
1. Would like to add an interface to the application if intended to Use as a Product or Web Application.
2. Would like to provide as service using RestAPI if intended for backend use.
3. Would like to provide multi-threading and concurrent access to the same budget from different users if that is a valid use can to scale to a warehouse or multiuser model.
4. Would like to divide and conquer the book buying process into different processes to buy for Huge Budgets and to have quick response time.
5. To scale to numerous users, Would also include algorithm and strategies to allocation requests to different servers based on the heaviness of the process.
