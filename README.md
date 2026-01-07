When using ternary operators such as ?, and there are multiple branches to a condition where the statment is a print, the entire ternary logic should be within a print statement.

Example code would be:

print(condtion == branch ? "statement": condition == branch2 ? "statement": condition == branch3 ? "statement": "default base case print statement if non met")

Essentially: is the branch equal to condition ? yes then "statement" if no then : next condition