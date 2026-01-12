When using ternary operators such as ?, and there are multiple branches to a condition where the statment is a print, the entire ternary logic should be within a print statement.

Example code would be:

print(condtion == branch ? "statement": condition == branch2 ? "statement": condition == branch3 ? "statement": "default base case print statement if non met")

Essentially: is the branch equal to condition ? yes then "statement" if no then : next condition




W3T6---
The inner loop has a end range of what the current x value is because it ensures that the line is only as long as the current row that the outer loop is on which creates the triangle pattern.
the inner loop is essentially constrained by outer loop where the end range is y<x 
This would essentially mean the end range is while 1<2 for the first loop.


W4T4----
To reverse a string, create an empty string, loop through the original string and every single loop, change the string to be the part of the string up to the character which the loop is on. 

W4T5----
the reason that there is recursion is that it has to find the number that came before the parameter and the number before that because it is the sum of the fibonacci value at the given parameter. It drops all the way to the base case because this gives n an actual value as opposed to just being a parameter. and then it adds up the values.

W7Learn----
An exception is an object describing a problem with some being checked and unchecked with IOException being checked. It has to be thrown or handled at compile time.