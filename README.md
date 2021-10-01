# cp4

when writing javadoc, follow good practices laid out in linked page in javadocs discord channel

java's workaround: the interface
- an interface only defines a set of abstract methods, not any implementation
- it's cloneable to be able to clone objects
-   "implements Cloneable"

challenges to building robust software
- we need to address issues before they arise:
-   user might enter incorrect data
-   user programmer may manipulate or creat objects in incorrect ways
-   programmatic operations might fail
-   system errors might occur

techniques for highlighting errors (but none of these allows a program to take corrective action)
-   S.O.p() - creates a log file that keeps track of every event/operation inside ur code
-   return a value that indicates an error
-   System.exit() - halt execution of your prgoram

try {
//some code that could throw an exception
}
catch (ExceptionName e) {
//fix the problem here
}
finally {
//clean things up if u cant do anything abt the exception and need to exit after
}

if you're not going to fix the problem, there is no reason to catch the Exception

sometimes u should try to do exception handling higher than the local method - might be a bit more graceful


9/29
exam 1
50% mult choice - if something is valid
50% short programming - using zylabs maybe - fill in the rest of the code
topics: abstract classes and interfaces

can write multiple catch blocks
can put a finally block (referred to earlier) that will finish even if the exception is thrown
can rethrow exceptions - rethrow original exception object or try it all again (??)

if there's an exception in your try block, your try block will not finish lmao

exception handling allows u to not foolproof your program? not so many if statements?
https://www.javatpoint.com/exception-handling-in-java
ok it's so that the program keeps running instead of entirely crapping out at a single exception

10/1
can use compareTo for StringBuffers - can choose different ways to compare (length, letters, etc)
- gives you feedback for how many chars are different with ASCII, can use a different method to ignore capitalization

use cloneable to copy! should usually work
- use try catch for when it doesnt!!!

interfaces arent really related to your specific program/class. completely different abstractions. logical thought process is only about function, guaranteeing some properties
