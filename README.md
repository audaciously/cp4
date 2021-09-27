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
