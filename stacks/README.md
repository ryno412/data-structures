Stacks: 
A stack is a data structure that restricts access to all internal data except that last data item inserted.
A stack is therefore “a Last-In-First-Out (LIFO) storage mechanism because the last item inserted is the first one to be removed”
 (LaFore, Robert. Data Structures and Algorithms in Java. Pg. 118).
 A LIFO storage mechanism can be extremely useful and often simplify complexity in a variety of use cases and problems.
 For example, if you had been given the task of creating an application that could parse code and verify that all the syntax
 was correct and that every opening bracket was properly closed and matched you might initially
 think that such an application would require hundreds of lines of code itself as well as complex regular expressions, etc.
 In reality a program that can verify code syntax can be achieved by simply using a stack.

A Code Syntax Verification Application works by simply parsing text and placing any opening delimiter on a stack.
When it finds a closing delimiter it pops the last item inserted from the stack and attempts to match it.
If the delimiters do not match an error is thrown. (LaFore, pg. 127)

<a href="http://2-battlecrowd.carlsbad.corp.yahoo.com/stacks/SyntaxCheckingWithStacks.html">View an example of this application</a>

Another example use case where a data structure such as a stack is extremely useful is when grouping matters.
 For example when evaluating an arithmetic expression parenthesis are used to create groups and determine which operation should be applied to which group. Once again, if you were required to write an application that was able to compute fully parenthetical arithmetic equations it may seem at first glance to be quite complex, yet a “remarkably simple algorithm that was developed by E.W Dijkstra in the 1960’s uses two stacks (one for the operands and one for the operators) to do this job. (Sedgewick, Robert & Wayne, Kevin Alogrithms. Pg.128)

<a href="http://2-battlecrowd.carlsbad.corp.yahoo.com/stacks/expressionEvalutationWithStacks.html">
View an example of an Arithmetic evaluator</a>

