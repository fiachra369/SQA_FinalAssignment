# **Software Quality Assurance Assignment**

## **Introduction**

This Software Quality Management plan will include a sample software component using java. The component itself is
used to store information about student's grades. A Rubric is made up of multiple Criteria (up to a maximum of 10). When a student is graded they are awarded a score
for each Criterion in the Rubric, which is an integer value between 1 and 5.


This assignment is a reference guide for the best practices for software. These topics are:

* Scrum sprint backlog and task estimation
* Unit testing and Test-Driven development
* Test coverage metric
* Team version-control
* Code-review checklist

## **Sprint Backlog and Task Estimation**

### **Task Estimation**

To figure out how much effort is required for the example assessment I am using the [Fibonacci Sequence](https://en.wikipedia.org/wiki/Fibonacci_number).
In this technique, each team member gives each item of work a number on the Fibonacci Sequence and this then
followed by everyone's estimates being compared. If each of the estimates are deemed to be the same, that that is the estimate.
If the estimates vary, there needs to be a discussion within the team to come up with an agreed estimate. The only downside of the fibonacci sequence
that it is subjective. One member of the team may find one task to be very simple due to their experience whereas an intern may deem it very
difficult.

**Fibonacci Sequence:**

* 0 - Very quick to deliver and no complexity
* 1 - Quick to deliver and minimal complexity
* 2 - Quick to deliver and some complexity
* 3 - Moderate time To deliver, moderate complexity
* 5 - Longer time to deliver, high complexity
* 8 - Long time to deliver, high complexity
* 13 - Long time to deliver, high complexity, many critical unknowns
* 21 - Task is too complex and needs to be broken down

**Task estimates for the sample program using the Fibonacci Sequence:**

* Create new rubric - 0
* Add criterion to a rubric - 2
* Get all rubrics - 2
* Get rubric by name - 2
* Get all student grade for a specific rubric - 3
* Get the average (mean) for a rubric - 5
* Get the standard deviation for a rubric - 5
* Get the MIN and MAX for a rubric - 8
* Get the average (mean) for a specific criterion of a rubric - 5
* Get the standard deviation for a specific criterion of a rubric - 5
* Get the MIN and MAX for a specific criterion of a rubric - 8

### **Comparing Tasks**

To show how I made the above estimates I will compare 2 of the tasks from above.
The tasks I will compare are:

* Add criterion to a rubric (easy)
* Get the MIN and MAX score of a rubric (complex)

**Add criterion to a rubric**

For this task I gave an estimation of 2 as I believe it is a simple task. All that I must do is add a number between 1-5. Errors will occur if numbers are below or above.

**Get the MIN and MAX score of a rubric**

For this task I have given an estimate of 8 as I believe it is a complex task. This task will require if
statements and loops and will require some arithmetic which will take some time to figure out.

**Velocity Metric:**

The fibonacci sequence is used when calculating the velocity metric at the end of each sprint. Velocity is calculated at the end of
the Sprint by totaling the Points for all fully completed User Stories. For example, if Create Student and Grade Student are completed, the total
story points will be 2. The velocity metric is very useful to estimate how much backlog effort your team can handle in future sprints if your team composition and sprint duration stay constant.

### **Calculating the Velocity Metric**

Velocity is the amount of work a team completes in a certain amount of time.
It can be measured in , number of tasks, story points and person-hours or a team desired way of measuring output.

For example...

I have 9 tasks which the team must complete. For the first sprint I plan to do the first 4 tasks. The total story points for these tasks is 6.
For the first sprint I only get 4-story points completed, therefore my velocity for this sprint is 4. The remaining 2-story
points are passed on over to the next sprint.

In order to get an accurate velocity calculation I need to do more than one sprint. For the purpose of this example, I am going to do the first
3 sprints. Below I have illustrated the sprints and how many story points I completed per sprint...

* Sprint 1 - 4
* Sprint 2 - 7
* Sprint 3 - 10

In order to get the velocity after the 3 sprints I must get the mean average.

5 + 8 + 6 = 19
19/3 = 6.33

According to my calculation, the velocity for these 3 sprints is 6.3.

To help visualize this, I have attached an image below which depicts a typical 3 sprint with a velocity metric.

![alt text](https://www.visual-paradigm.com/servlet/editor-content/scrum/what-is-scrum-velocity/sites/7/2018/11/scrum-verlocity-chart.png "`Velocity Example`")

## Test Driven Development

Test-driven development (TDD) is a programming technique that requires you to write a test that fails before writing 
new functional code. Five basic steps make up the test-driven development 
cycle, which are replicated during the software development life cycle. These measures are designed 
to ensure that the code is clear and functional while also meeting all the specifications.  

**There are 5 different stages to TDD:**

1. Add a test
2. Run all tests and see if any new test fails
3. Write some code
4. Run tests and Refactor code
5. Repeat

**Here are some of the benefits of TDD:**

*TDD helps you create trust in your system by ensuring that it meets the specifications that have been specified for it. 
*You pass the coverage test with a score of 100 percent.

**Common Errors in Test Driver Development:**

* Frequently forgetting to run tests.
* Trying to write so many tests at once.
* Creating checks for simple code
* There are only a few developers on the team who use TDD; everyone else should.
* The test suite isn't kept up to date.

![Getting Started](https://i.postimg.cc/NFxhN48t/test-driven-development-TDD.png)

## Test Coverage Metric

Test coverage is a Black-box testing technique that measures the number of tests that have been run. Test cases are written to ensure that all requirements are covered to the fullest extent possible.
The test coverage report gives details on which sections of the program are covered by test coverage.
It essentially offers details about the tests that have been run inside an application.

**How to perform Test coverage:**

Different forms of testing may also be used to assess research coverage. The type of testing you do is determined by the application.
I used unit tests in the sample software. I developed this software using the IntelliJ IDE, 
which includes a test coverage method that I used.

**How to use IntelliJ's Test Coverage Tool:**

**Step 1:** Go to the class which you would like to test

![Getting Started](https://i.postimg.cc/pybzyVNq/Screenshot-2021-05-18-at-13-08-58.png)


**Step 2:** Go to the side and click the play button beside the main method and "Run with coverage"

![Getting Started](https://i.postimg.cc/w1hS8jdZ/Screenshot-2021-05-18-at-13-09-23.png)


**Step 3:** The Test Coverage Tool will then be shown to you. You can see all the project's classes here.
The tool tells you if you've covered the class, how many approaches you've covered, and how many lines you've covered.

![Getting Started](https://i.postimg.cc/JGHfxQY1/Screenshot-2021-05-18-at-13-12-16.png)

## **Team Version Control**

Version control is a method of tracking modifications to a file or collection of files over time so that you can 
go back in time and remember specific versions.

**Team Version Control Advantages**

* Recognize who made a transition and when it occurred.
* All team members use the same file names and directory structures.
* Different versions of the code can be easily deployed to staging or production servers.
* You can confidently make changes and undo them if you make a mistake.

**Guidelines to follow**

* Pay attention to commit messages, as they can explain why a change was made.
* Make minor adjustments
* Commit early and regularly to prevent merge conflicts.
* Make sure your code compiles, and your checks pass.
* Update often and right before pushing.
* Stick to agreed-upon conventions and workflows. 

### **Branches In Use**

**Master Branch**

The master division is the project's main branch. This is where you'll find all the production-ready code.

**Develop branch**

This branch contains the full history of the project's work. Since the build branch is the most recent version of the code, 
it is used to construct all function branches in this project.
All improvements should be merged back into master until the code in the develop 
branch has reached a stable state and is ready to be published.

**Feature Branches**

Each new functionality should be assigned to its own branch, which can then be moved to the central repository for backup and collaboration.
Feature branches should never branch off of master; instead, they should parent off of the parent branch.
When a function is finished, it is integrated back into the build branch.

## Code Reviews

**What is a Code Review?**

A code review is a procedure in which someone other than the code's author reviews it. 
Code reviews are an important part of the software development process because they help to 
minimize technical debt and ensure continuity in the codebase. Everyone makes mistakes when writing code, 
but it's critical to catch them before they hit production and cause harm.

**In the future**

Your code review checklist, like your team's code style, can evolve over time. It's important to keep 
updating your checklist as your code progresses, and you gain more experience to ensure 
that it covers every aspect of your code.

**Benefits of Code Reviews:**

1. You notice bugs early on
2. Stability of the team
3. You teach and share your experience 
4. Your design and execution are consistent.

**What to do when reviewing a pull request**

* **Naming**
  Did the developer choose clear names for variables, classes, methods, etc.?
    
* **Tests**
  Does the code have correct and well-designed tests?
    
* **Complexity**
  Is the code more complex than it needs to be?
    
* **Design**
  Is the code is well-designed?
    
* **Relevancy**
  Is the developer implementing things they might need in the future but don’t know they need now?

**Example**

















   