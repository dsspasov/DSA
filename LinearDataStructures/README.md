# DSA
Data Structures And Algorithms
LinearDataStructures

Tasks from Telerik Academy

1. Write a program that reads from the console a
sequence of positive integer numbers. The sequence
ends when empty line is entered. Calculate and print
the sum and average of the elements of the
sequence. Keep the sequence in List<int>. ->FindSumAndAverage.java

2. Write a program that reads N integers from the
console and reverses them using a stack. Use the
Stack<int> class.->ReverseSequenceOfNumbers.java

3. Write a method that finds the longest subsequence
of equal numbers in given List<int> and returns
the result as new List<int>. Write a program to
test whether the method works correctly. -> FindLongestSequence.java

4. Write a program that removes from given sequence 
all negative numbers.->RemoveNegativeNumbers.java

5. Write a program that removes from given sequence 
all numbers that occur odd number of times. ->RemoveOddOccur.java

6. Write a program that finds in given array 
of integers (all belonging to the range [0..1000])
how many times each of them occurs. ->NumberOfOccurrences.java

7. *The majorant of an array of size N is a value
that occurs in it at least N/2 + 1 times. Write a 
program to find the majorant of given array (if exists) ->MajorantOfArray.java

8. We are given the following sequence:
S1 = N;
S2 = S1 + 1;
S3 = 2*S1 + 1;
S4 = S1 + 2;
S5 = S2 + 1;
S6 = 2*S2 + 1;
S7 = S2 + 2;
...
Using the Queue<T> class write a program to print
its first 50 members for given N. -> MemebersOfSequence.java

9. *We are given numbers N and M and the following
operations:
a) N = N+1
b) N = N+2
c) N = N*2
Write a program that finds the shortest sequence of
operations from the list above that starts from N
and finishes in M. Hint: use a queue. ->ShortestSequence.java

10. Implement the data structure linked list. Define a
class ListItem<T> that has two fields: value (of
type T) and NextItem (of type ListItem<T>).
Define additionally a class LinkedList<T> with a
single field FirstElement (of type ListItem<T>).
->LinkedList.java

11. Implement the ADT stack as auto-resizable array.
Resize the capacity on demand (when no space is
available to add / insert a new element). -> Stack.java

12. Implement the ADT queue as dynamic linked list.
Use generics (LinkedQueue<T>) to allow storing
different data types in the queue. -> Queue.java

13. *We are given a labyrinth of size N x N. Some of its
cells are empty (0) and some are full (x). We can
move from an empty cell to another empty cell if
they share common wall. Given a starting position
(*) calculate and fill in the array the minimal
distance from this position to any other cell in the
array. Use "u" for all unreachable cells. Example:
0 0 0 x 0 x					3 4 5 x u x
0 x 0 x 0 x					2 x 6 x u x
0 * x 0 x 0		------>		1 * x 8 x 10
0 x 0 0 0 0					2 x 6 7 8 9
0 0 0 x x 0					3 4 5 x x 10
0 0 0 x 0 x					4 5 6 x u x

Labyrinth.java


