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

The project uses the following base package: software.ulpgc.katas

The main version contains:
- Person.java: domain class that stores a person's name and birthday and calculates their age.
- Main.java: creates a Person object and prints the calculated result.

The kata was also repeated using:

- Student.java
- Task.java

These repetitions are stored in separate branches.

## Branches

The repository contains the following branches:

- `master`: contains the final evaluable version of the kata using the Person class. It represents the main version of the project.
- `develop`: development branch used as the base for the different repetitions of the kata and for integrating changes before the final version.
- `student-version`: repetition of the kata using a Student class. It calculates the student's average grade and checks whether the student is approved.
- `task-version`: repetition of the kata using a Task class. It shows the task status and checks whether the task is completed.

## Git Workflow

The project uses `master` as the main branch and `develop` as the development branch.

The usual workflow was:

```
git add .
git commit -m "Commit message"
git push
```

## Clone Verification

To verify that the project works outside the original folder, the repository can be cloned with:

```
git clone git@github.com:ikigachi/kata1.git
```

Then:

```
cd kata1
mvn clean compile
mvn exec:java
```

## Video



## Shortcuts

- `Alt + Enter`: Show quick fixes and intention actions.
- `Alt + Insert`: Generate code such as constructors, getters, setters, and other class members.
- `Shift + F6`: Rename a class, method, variable, or package using refactoring.
- `Ctrl + F8`: Add or remove a breakpoint.
- `Alt + 9`: Open the Git tool window.
- `Alt + F12`: Open the embedded terminal.