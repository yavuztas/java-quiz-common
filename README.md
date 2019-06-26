# Solutions for common java algorithm questions
I have packed my java codes mainly used for online quizes before, to form a collection of solutions for common java algorithm and data structure questions. Note that Java 8 is required to build this project. Hope it helps to fellow developers!
### Questions
#### 1. Path: [Path.java](src/org/java/quiz/Path.java)
Write a function that provides change directory (cd) function for an abstract file system.<br>
Specifications:
* Root path is '/'.
* Path separator is '/'.
* Parent directory is addressable as "..".
* Directory names consist only of English alphabet letters (A-Z and a-z).
* The function should support both relative and absolute paths.
* The function will not be passed any invalid paths.
* Do not use built-in path-related functions.
For example:
```java
Path path = new Path("/a/b/c/d");
path.cd('../x');
System.out.println(path.getPath());
```
should display '/a/b/c/x'.
#### 2. Folders: [Folders.java](src/org/java/quiz/Folders.java)
Implement a function folderNames, which accepts a string containing an XML file that specifies folder structure and returns all folder names that start with startingLetter. The XML format is given in the example below.<br>
For example, for the letter 'u' and an XML file:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<folder name="c">
    <folder name="program files">
        <folder name="uninstall information" />
    </folder>
    <folder name="users" />
</folder>
```
the function should return a collection with items "uninstall information" and "users" which can be any order.
#### 3. Sorted Search: [SortedSearch.java](src/org/java/quiz/SortedSearch.java)
Implement function countNumbers that accepts a sorted array of unique integers and, efficiently with respect to time used, counts the number of array elements that are less than the parameter lessThan.<br>
For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2 because there are two array elements less than 4.
#### 4. Palindrome: [Palindrome.java](src/org/java/quiz/Palindrome.java)
A palindrome is a word that reads the same backward or forward.<br>
Write a function that checks if a given word is a palindrome. Character case should be ignored.<br>
For example, isPalindrome("Geleveleg") should return true as character case should be ignored, resulting in "geleveleg", which is a palindrome since it reads the same backward and forward.
#### 5. Train Composition: [TrainComposition.java](src/org/java/quiz/TrainComposition.java)
A TrainComposition is built by attaching and detaching wagons from the left and the right sides, efficiently with respect to time used.<br>
For example, if we start by attaching wagon 7 from the left followed by attaching wagon 13, again from the left, we get a composition of two wagons (13 and 7 from left to right). Now the first wagon that can be detached from the right is 7 and the first that can be detached from the left is 13.<br>
Implement a TrainComposition that models this problem.
#### 6. Circular Primes: [CircularPrimes.java](src/org/java/quiz/CircularPrimes.java)
Implement a function that checks a prime number is circular.<br>
For example: 197, lets circle 971, 719 are all both primes. So 197 is a circular prime.
#### 7. Truncatable Primes: [TruncatablePrimes.java](src/org/java/quiz/TruncatablePrimes.java)
Implement a function that checks a prime number is truncatable.<br>
For example: 3797, left to right 797, 97, 7 and right to left 397, 37, 3 are all both primes. So 3797 is a truncatable prime
