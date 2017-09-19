# Threads---Day-1

Excercise 1:

a)
b)
c)

What was needed here was a global boolean variable that can be used to terminate thread 3.
But in order for the thread to recognize any changes made to said boolean, the boolean has to be volatile.


Excercise 2:

a) Sadly i wasnt, at least not without the given code snippet.
b) ....
c) Done i think ?
d) I made the Next() method synchronized so that the 2 threads wouldnt overlap their running of said method.

Excercise 3:

I simply made the ball class extend Thread, so that i could start it as a new thread via the GUI. Thus making the GUI run on the main thread and the balls run on their own thread, therefore the GUI was still responsive even after adding many balls.

Excercise 5:

a) No, i lost around 5000 counts to race conditions each time i tested... Expected result was 40000, and i kept getting +-35000

b) The problem is the increment method that increments the sharedCounter, its not protected against race conditions, and thus when all 40 turnstiles try to get, update and set the same variable at the same time, they will get it wrong.

c) Synchronizing the increment method was all it took.


Excercise 6:

I solved the problem using both traditional synchronization and the lock system..

The lock solution can be find in the code as it is..
The traditional solution can be find as comments in the code.
