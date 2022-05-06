
# Individual Project Asha

Name: Asha Yalla
StudentId: 016006250


## Problem Statement

Created a java application to stimulate user purchase scenario the application has a inventory and cap by number of items to be purchased by three categories i.e., Essentials, Luxury, Misc. If the user order is processed correctly the data is stored in output.csv, else the error is loaded to output.txt.

## Steps to run the applicaton

git clone this repo and Run the following commands in src folder of the application and then enter the below commands. 
javac Billing.java 
java Billing "/Users/ashayalla/Desktop/individual-project-AshaYalla/resources/Input.csv"
Billing class has to be provided the url of the input file. 


## Design Pattern
**Singleton Pattern**
- Singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance.
- I've used this pattern for storage of entire application data. It is implemented in the DatasetStore class. 
- getters and setters method in DatasetStore is used to get the access the application. 

**Factory Pattern**
- Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
- Billing class calls the Process factory class to instantiate the read card or read inventory class which is implemented using ReadData Interface

**Iterator Pattern**
- Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation
- Iterator is implemented to check if the given credit card exists in the database else it adds the card to the database. 





## Class Diagram

![project image](https://github.com/gopinathsjsu/individual-project-AshaYalla/blob/main/202individual.jpeg)

## Cap for categories Essentials, Luxury, Misc is 10 respectively.

Output for the given input

![project image](https://github.com/gopinathsjsu/individual-project-AshaYalla/blob/main/output%20for%20the%20input%20provided.png)

Output of correct order

![project image](https://github.com/gopinathsjsu/individual-project-AshaYalla/blob/main/correct%20order.png)

Output of Error Order

![project image](https://github.com/gopinathsjsu/individual-project-AshaYalla/blob/main/error%20order.png)


