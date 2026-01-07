When using ternary operators such as ?, and there are multiple branches to a condition where the statment is a print, the entire ternary logic should be within a print statement.

Example code would be:

print(condtion == branch ? "statement": condition == branch2 ? "statement": condition == branch3 ? "statement": "default base case print statement if non met")

Essentially: is the branch equal to condition ? yes then "statement" if no then : next condition




W3T6---
The inner loop has a end range of what the current x value is because it ensures that the line is only as long as the current row that the outer loop is on which creates the triangle pattern.
the inner loop is essentially constrained by outer loop where the end range is y<x 
This would essentially mean the end range is while 1<2 for the first loop.