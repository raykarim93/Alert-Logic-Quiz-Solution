# Alert Logic Quiz Solution

The code below was hidden inside the html JavaScript `<script>` tag. So I assumed this is what they used to generate the cipher.

```
function scramble(ascii, a, b, c) {
    for(i=0; i<ascii.length; i++) {
        if (i % 3 == 0) { ascii[i] = (ascii[i] + a) % 256; }
        if (i % 3 == 1) { ascii[i] = (ascii[i] + b) % 256; }
        if (i % 3 == 2) { ascii[i] = (ascii[i] + c) % 256; }
    }
    return ascii;
}
```
The way I solved this puzzle is:

* First, by looking at the code I recognised that it’s a substitution cypher that shifts by 3. Thus, I went through the first 3 letters of each greeting to work out `‘a, b, c’`.

* Then, by assuming that the first line must contain a greeting such as Dear, Hi, Good day, and finally Hello. I also assumed that the first character is going to be a capital letter as its done when starting a sentence.

* And finally I created a deciphering algorithm in Java then Erlang to automate the task to find the solution to the problem.

The output from my solution is below:

```
Hello, Congratulations for solving the Alert Logic challenge.
Please send your solution and CV to ***********@alertlogic.com
quoting reference: *********************************
```
