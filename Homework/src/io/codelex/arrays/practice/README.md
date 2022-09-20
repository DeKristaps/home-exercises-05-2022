# Practice

## Exercise #1

See [Exercise1.java](./Exercise1.java)

## Exercise #2

See [Exercise2.java](./Exercise2.java)

## Exercise #3

See [Exercise3.java](./Exercise3.java)

## Exercise #4

See [Exercise4.java](./Exercise4.java)

## Exercise #5

See [Exercise5.java](./Exercise5.java)

## Exercise #6

Write a program that creates an array of ten integers. It should put ten random numbers from 1 to 100 in the array. It should copy all the elements of that array into another array of the same size. Then display the contents of both arrays. To get the output to look like mine, you'll need a several for loops.

  - Create an array of ten integers
  - Fill the array with ten random numbers (1-100)
  - Copy the array into another array of the same capacity
  - Change the last value in the first array to a -7
  - Display the contents of both arrays
  
```
Array 1: 45 87 39 32 93 86 12 44 75 -7
Array 2: 45 87 39 32 93 86 12 44 75 50
```

## Exercise #7

Code an interactive, two-player game of Tic-Tac-Toe. You'll use a two-dimensional array of chars.

```
(...a game already in progress)

	X   O
	O X X
	  X O
 
'O', choose your location (row, column): 0 1

	X O O
	O X X
	  X O
 
'X', choose your location (row, column): 2 0

	X O O
	O X X
	X X O

The game is a tie.
```

## Exercise #8

Write a program to play a word-guessing game like Hangman.

  - It must randomly choose a word from a list of words.
  - It must stop when all the letters are guessed.
  - It must give them limited tries and stop after they run out.
  - It must display letters they have already guessed (either only the incorrect guesses or all guesses).
  
```
-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	_ _ _ _ _ _ _ _ _ 

Misses:	

Guess:	e

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	_ e _ _ _ _ _ _ _ 

Misses:	

Guess:	i

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	_ e _ i _ _ _ _ _ 

Misses:	

Guess:	a

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	_ e _ i a _ _ a _ 

Misses:	

Guess:	r

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	_ e _ i a _ _ a _ 

Misses:	r

Guess:	s

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	_ e _ i a _ _ a _ 

Misses:	rs

Guess:	t

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	_ e _ i a t _ a _ 

Misses:	rs

Guess:	n

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	_ e _ i a t _ a n 

Misses:	rs

Guess:	o

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	_ e _ i a t _ a n 

Misses:	rso

Guess:	l

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	l e _ i a t _ a n 

Misses:	rso

Guess:	v

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	l e v i a t _ a n 

Misses:	rso

Guess:	h

-=-=-=-=-=-=-=-=-=-=-=-=-=-

Word:	l e v i a t h a n 

Misses:	rso

YOU GOT IT!

Play "again" or "quit"? quit
```