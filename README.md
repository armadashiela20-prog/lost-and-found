# lost-and-found
# Campus Lost-and-Found Tracker

## Project Description

The Campus Lost-and-Found Tracker is a Java desktop application designed to help manage lost and found items within the campus. It allows users to record item information, search for records, update item statuses, and delete records.

The application provides a graphical user interface using Java Swing and uses a singly linked list to manage item records.

## Features

- **Add Record** – Register a lost or found item.
- **Search Record** – Find an item using its name.
- **Show All Records** – Display all registered items.
- **Update Status** – Change the status of a selected record.
- **Delete Record** – Remove a selected record.
- **Item Classification** – Identify records as Lost Item or Found Item.

## Technologies Used

- Java
- Java Swing
- Apache NetBeans IDE
- Git and GitHub

## Object-Oriented Programming Concepts

The project applies the following OOP concepts:

- **Encapsulation** – Protects item information using private fields and access methods.
- **Inheritance** – Uses `LostItem` and `FoundItem` as subclasses of the parent `item` class.
- **Polymorphism** – Allows the parent `item` reference to hold different item types.
- **Method Overriding** – Provides specific implementations of inherited methods.
- **Constructors** – Initialize objects and their attributes.

## Data Structures and Algorithms

The project implements the following DSA concepts:

- **Singly Linked List** – Stores item records using connected nodes.
- **Array** – Tracks the original indexes of displayed records.
- **Insertion** – Adds new records to the linked list.
- **Traversal** – Visits nodes to display records.
- **Linear Search** – Searches for an item by its name.
- **Update** – Changes the status of an existing record.
- **Deletion** – Removes a record from the linked list.

## Project Structure

```text
campuslostandfound/
│
├── item.java
├── LostItem.java
├── FoundItem.java
├── Node.java
├── ItemLinkedList.java
├── LostFoundFrame.java
└── Main.java
```

## How to Run

1. Open the project in Apache NetBeans.
2. Make sure a Java Development Kit (JDK) is installed.
3. Locate the `LostFoundFrame.java` file.
4. Run the project's main class.
5. The Campus Lost-and-Found Tracker window will appear.

## Purpose of the Project

This project demonstrates the practical application of Object-Oriented Programming and Data Structures and Algorithms in developing a simple campus item management system.