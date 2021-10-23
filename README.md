# OOD Project - Holiday Lights Ordering Portal

This is  portal from which holiday lights can be ordered. The user woud be prompted to choose a Light Shape, then Light Type and quantity respectively. The user would be able to perform the following operations
- Choose Lights - Add them  to the cart
- Edit Cart
- Order Lights
An order summary with the list of all the items ordered and the amount charged would be displayed after the order is placed.

# Technial Details
I have used the following design patterns in the project
- State Design Pattern - To maintain the state of the cart
- Decorator Design Pattern - For the Light objects
- Singleton Design Pattern - For the cart implementation
- Iterator Design Pattern - To show the order summary

I have also made the necessary checks for validating the user input.
- Menu Selection - User would only be able to only choose from the optons provided. The number of options displayed depends up on the state of the cart
- Chosing Light Types - User will be able to choose only the light types provided
- Editing the cart - While editing the cart, we will validate the item number and alo the quantuty provided.

# Unit Tests
Included test cases to validate multiple positive and negative test scenarios for
- Display menu
- Order Selection
- Adding items to the cart
- State Changes
