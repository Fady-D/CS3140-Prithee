9/9/26
Fady Darwish

This program should print out the sonnet and stop at a random word.
It will then prompt the user asking for the next word. Once the user
answers, it will indicate whether correct or incorrect then restart
the sonnet stopping at a different word. It will repeat until user
gets either 3 correct or 3 incorrect.


To run this program, start the Main class

Core Pseudocode ->

let rightCount be an int
let wrongCount be an int
let randomNum be an int

split the string by words --> array

while rightCount < 3 AND wrong count < 3
    generate a randomNum between 0 to array.length
    print the words in the array until random num
    print an underscore for every character in the last word
    prompt user for the word
    if correct
        rightCount increments
    else
        wrongCount increments
