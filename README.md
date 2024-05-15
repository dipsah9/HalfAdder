# HalfAdderSimulator

This project is a Java-based simulation of a half adder circuit using object-oriented programming principles, specifically leveraging interfaces for defining common behavior. 
The half adder circuit is a fundamental building block in digital logic design, used to perform binary addition of two bits.

Overview:
The Gate class serves as the parent class, defining the basic operations of logic gates. 
Derived classes AndGate, OrGate, NotGate, and XorGate represent specific types of logic gates, each extending the functionality defined in the Gate class.

=> The program prompts the user to enter two boolean values representing binary digits (0 or 1).
=> It then performs addition using the half adder circuit implementation. 
=> The sum of the two binary digits and the carry are displayed as output.
=> Additionaly, the program provides information about the half adder circuit used. 

#To Run
=> compile the code using javac HalfAdder/Main.java
=> run the code using java HalfAdder/Main
