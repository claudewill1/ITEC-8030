Write an exception class named InvalidTestScore. Modify the TestScores class
you wrote in Exercise 1 so that it throws an InvalidTestScore exception if
any of the test scores in the array are invalid.

Test your exception in a program (in a Driver class located in the same file).
Your program should prompt the user to enter the number of test scores, and then
ask for each test score individually. Then, it should print the average of
the test scores.

If the average method throws an InvalidTestScore exception, the main method should catch it and print “Invalid test score.”