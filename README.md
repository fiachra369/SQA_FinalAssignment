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


   
   
   