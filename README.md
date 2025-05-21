# Word Counter Java

A simple Java console application that counts the frequency of each word in a given text.

## Overview

This project processes input text by normalizing case, removing punctuation, and counting the occurrences of each word using a `HashMap`. It also demonstrates sorting the results by word frequency using Java Streams.

The main features include:

- Text normalization (lowercase, punctuation removal)
- Word frequency counting
- Sorting word counts by frequency
- Simple console output of results

## How to Run

1. Compile the project in your IDE (e.g., IntelliJ, Eclipse) or via command line.
2. Run the main class (e.g., `WordCounterMain`).
3. Input the text you want to analyze.
4. Observe the console output displaying the word counts sorted by frequency.

## Sample Output
> Enter your text: <br>
>The quick brown fox jumps over the lazy dog. The dog barked back!
>
>Word Frequencies: <br>
>the: 3 <br>
>dog: 2 <br>
>over: 1 <br>
>barked: 1 <br>
>quick: 1 <br>
>lazy: 1 <br>
>jumps: 1<br>
>back: 1 <br>
>brown: 1 <br>
>fox: 1

## Concepts Demonstrated

- HashMap usage for counting frequencies
- String manipulation and regular expressions
- Java Streams and lambda expressions
- Sorting collections by value
- Console input/output

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to expand this project by adding new features such as stop word filtering, GUI, or file input/output!