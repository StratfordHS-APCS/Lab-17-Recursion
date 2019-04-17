[![Build Status](https://travis-ci.com/StratfordHS-APCS/lab-17-recursion-username.svg)](https://travis-ci.com/StratfordHS-APCS/lab-17-recursion-username)

# Lab 17 - Recursion

## Lab Goal
You will practice using recursion by coding 3 common recursive algorithms.

## Instructions
* Complete each method using a recursive algorithm.
* If you get a timeout error when running the tests then you should check your base case.  If your method runs for more than 2 seconds (an eternity to the computer), then it will timeout because it will probably run forever at that point.
* Complete all javadoc comments with the proper tags.

## Algorithm Definitions
Whenever you are defining a recursive algorithm you ***must*** include a base case.  If you do not then your algorithm will recurse forever (actually, just until you run out of memory).

* Factorial
	- factorial(n) = 1 when n = 0 or 1 (**Base Case**)
	- factorial(n) = n * factorial(n-1) when n > 1
* Greatest Common Divisor
	- gcd(x,y) = x when y = 0 (**Base Case**)
	- gcd(x,y) = gcd(y, remainder of x/y) when y > 0
* Fibonacci
	- fib(n) = 0 when n = 0 (**Base Case**)
	- fib(n) = 1 when n = 1 (**Base Case**)
	- fib(n) = fib(n-1) + fib(n-2) when n > 1

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 30 - Factorial
* 30 - GCD
* 30 - Fibonacci
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
