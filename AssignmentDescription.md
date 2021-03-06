Coursework One

Problem specification

Given two arrays of integers, you are required to perform some array operations. You have to print the values which occur in both arrays, those which occur only in the first array, and those which occur only in the second.
Suggested approach

Create two empty integer arrays that will hold up to 100 integers. Then, repeatedly read integer values from the keyboard until the user types "0" (zero, without the quotes) and store those values in the first array. Ignore repeated occurrences of a particular value in the data, so check each value to see whether it already occurs in the array before storing it.
Now the array should contain a set (which could be empty) of distinct integer values. Repeat the same procedure to fill the second array.

Then, loop through both arrays and print out:
1.	the values that the user entered for the first array
2.	the values that the user entered for the second array
3.	the values which occur in both arrays (intersection)
4.	the number of values common to both arrays
5.	the values which occur only in the first array, and
6.	the values which occur only in the second array.

Always exclude the terminating zero from your calculations.

Example interaction

Input
Enter data for array 1 (0 to finish): 1
Enter data for array 1 (0 to finish): 4
Enter data for array 1 (0 to finish): 2
Enter data for array 1 (0 to finish): 5 
Enter data for array 1 (0 to finish): 7 
Enter data for array 1 (0 to finish): 4 
Enter data for array 1 (0 to finish): 8 
Enter data for array 1 (0 to finish): 6 
Enter data for array 1 (0 to finish): 0 
Enter data for array 2 (0 to finish): 5 
Enter data for array 2 (0 to finish): 7 
Enter data for array 2 (0 to finish): 3 
Enter data for array 2 (0 to finish): 11 
Enter data for array 2 (0 to finish): 4 
Enter data for array 2 (0 to finish): 7 
Enter data for array 2 (0 to finish): 3 
Enter data for array 2 (0 to finish): 9 
Enter data for array 2 (0 to finish): 0 

and the corresponding output

Values for array 1 is: 1 4 2 5 7 8 6 
Values for array 2 is: 5 7 3 11 4 9 
Common data is: 4 5 7 
Number of common data is: 3	 
Non-common values for array 1 is: 1 2 8 6 
Non-common values for array 2 is: 3 11 9

What to do in the following error cases
Any of the arrays could be empty, and this should not cause your program to behave erratically.
If both arrays are empty, print out Both arrays are empty, do not perform any calculations and exit to the operating system. In this simple exercise, you don't have to consider an error condition in case the number of integers entered are greater than 100 (thus causing your program to crash).

Any integer number that is entered, whether negative or positive, should be taken into account. Remember that 0 should be excluded from your arrays as this value is meant to stop the iteration and proceed to the calculation part (a so-called, sentinel value).

Suggestions
You may break down your algorithm into methods to make your life easier. For example,
o	you could create a displayCommon method that accepts two integer arrays and displays the common values.
o	you could create a displayElements method that accepts an array and prints its contents.
o	you could create a fillArray method that prompts the user for input and stores the integers into an array etc.
Please note: constant values should be declared as final and static .


