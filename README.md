# Customize Virtual DBMS

A custom virtual database management system developed in Java to practice and demonstrate core DBMS concepts using an interactive command-line interface.

## Overview

This project implements a lightweight in-memory DBMS for managing student records. It accepts SQL-like commands from the console and performs operations on records stored using Java collections.

## Features

- Insert student records
- Display all records
- Search records using conditions
- Update records
- Delete records
- Count records
- Aggregate operations such as:
  - MAX
  - MIN
  - SUM
  - AVG
- Conditional queries using comparison operators
- AND / OR conditions
- BETWEEN operations
- Interactive help command
- Console-based DBMS interface

## Technologies

- Java
- Java Collections Framework
- LinkedList
- Scanner
- Object-Oriented Programming

## Project Structure

```text
Customize-Virtual-DBMS/
├── CVDB.java
├── README.md
└── .gitignore
```

## How to Run

Compile the Java source:

```bash
javac CVDB.java
```

Run the application:

```bash
java CVDB
```

## Example Commands

The application supports SQL-like commands such as:

```text
help
insert into student Omkar 50000 25 Pune
select * from student
select * from student where name = Omkar
select * from student where age > 20
select max salary
select avg salary
count
clear
exit
```

Use the `help` command inside the application to view the supported commands.

## Learning Outcomes

This project demonstrates:

- Java classes and objects
- Constructors and static variables
- Encapsulation of record data
- LinkedList-based data storage
- String parsing
- Command-line processing
- CRUD operations
- Searching and filtering
- Aggregate calculations
- Basic DBMS concepts

## Notes

This is an educational project and stores records in memory. It is intended to demonstrate DBMS concepts rather than provide a production database engine.

## Author

**Omkar Amrute**

GitHub: [OmkarAmrute1745](https://github.com/OmkarAmrute1745)
