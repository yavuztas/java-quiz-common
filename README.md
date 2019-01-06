# Solutions for common java algorithm questions
I have rearranged my java codes mainly used for online quizes before, to form a collection of solutions for common java algorithm and data structure questions. Note that Java 8 is required to build this project. Hope it helps to fellow developers!
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


