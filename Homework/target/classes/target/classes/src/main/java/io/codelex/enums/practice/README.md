# Enums

# Exercise #1

Create an enum representing cardinal points - North, South, East and West

Write a program which prints out the following:

| Direction | Text |
| --- | --- |
| North | up |
| South | down |
| East | right |
| West | left |

There are multiple ways on how to do it:

 - with an if statement
 - using switch
 - having a field inside enum
 - having abstract method
 - mapping the values in EnumMap

Print out all of the enum values and their ordinals in the following way:

```
North:up:0
South:down:1
East:right:2
West:left:3
```

# Exercise #2

Create Scissor-Paper-Stone game using an enumeration.

You are playing against the computer.

There must be following output:

```
Let us begin...
Scissor-Paper-Stone
   Your turn (Enter s for scissor, p for paper, t for stone, q to quit): s
   My turn: SCISSOR
   Tie!

Scissor-Paper-Stone
   Your turn (Enter s for scissor, p for paper, t for stone, q to quit): s
   My turn: STONE
   Stone breaks scissor, I won!

Scissor-Paper-Stone
   Your turn (Enter s for scissor, p for paper, t for stone, q to quit): p
   My turn: STONE
   You won!

Scissor-Paper-Stone
   Your turn (Enter s for scissor, p for paper, t for stone, q to quit): t
   My turn: SCISSOR
   Scissor cuts paper, I won!

Scissor-Paper-Stone
   Your turn (Enter s for scissor, p for paper, t for stone, q to quit): a
   Invalid input, try again...
   Your turn (Enter s for scissor, p for paper, t for stone, q to quit): p
   My turn: STONE
   You won!

Scissor-Paper-Stone
   Your turn (Enter s for scissor, p for paper, t for stone, q to quit): q

Number of trials: 5
I won 2(40.00%). You won 2(40.00%).
Bye!
```