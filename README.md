# Solutions for common java algorithm questions
I have rearranged my java codes mainly used for online quizes before, to form a collection of solutions for common java algorithm and data structure questions. Note that Java 8 is required to build this project. Hope it helps to fellow developers!
## Questions
### Path:
Write a function that provides change directory (cd) function for an abstract file system.<br>
<br>Specification:<br>
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


