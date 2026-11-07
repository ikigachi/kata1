# Kata 1

## Objective

The objective of this kata is to become familiar with IntelliJ IDEA and with the basic development workflow using Java, Maven, Git, and GitHub.

The project was repeated several times using small domain classes in order to practice creating, running, navigating, refactoring, debugging, committing, and pushing code.

## Compilation and execution

```
mvn clean compile
mvn exec:java
```

## Technologies

- Java 21
- Maven
- IntelliJ IDEA
- Git
- GitHub

## Project Structure

The Java source is in `src/main/java/software/ulpgc/katas`. Each branch contains a `Main.java` that runs a small example using that branch's domain class.

## Branches

| Branch | Domain class | Example |
| --- | --- | --- |
| [`develop`](https://github.com/ikigachi/kata1/tree/develop) | `Person` | Calculates a person's age from their date of birth. |
| [`book-version`](https://github.com/ikigachi/kata1/tree/book-version) | `Book` | Prints a book's title and page count and checks whether it has more than 300 pages. |
| [`student-version`](https://github.com/ikigachi/kata1/tree/student-version) | `Student` | Calculates a student's average grade and checks whether they passed. |
| [`task-version`](https://github.com/ikigachi/kata1/tree/task-version) | `Task` | Prints a task's status and checks whether it is complete. |

## Git Workflow

`develop` contains the `Person` version. The other branches contain independent variations of the same exercise.

The usual workflow was:

```
git add .
git commit -m "Commit message"
git push
```

## Clone Verification

To verify that the project works outside the original folder, the repository can be cloned with:

```
git clone --branch develop https://github.com/ikigachi/kata1.git
```

Then:

```
cd kata1
mvn clean compile
mvn exec:java
```

## Video

[![Kata 1 - Video Explanation](https://img.youtube.com/vi/pdYwJjdA4Qg/maxresdefault.jpg?v=2)](https://youtu.be/pdYwJjdA4Qg)

## Shortcuts

- `Ctrl + N`: Quickly search for and open a class in the project by typing its name.
- `Ctrl + Alt + L`: Automatically format code by adjusting indentation, spaces, and line breaks according to code style rules.
- `Shift + F6`: Rename classes, methods, or variables using refactoring, automatically updating all references.
- `Alt + Enter`: Show quick fixes and suggested actions to correct errors, import classes, simplify expressions, or improve code.
- `Alt + Insert`: Generate code such as constructors, getters, setters, and other class members.
- `Alt + 9`: Open the Git tool window to view changes, commits, and history.
- `Alt + F12`: Open the integrated terminal to execute commands.
- `Alt + 4`: Open the Run tool window to view program output and execution results.
