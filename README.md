**CPEN 221 / Fall 2020 / PPT #1**

# The Prime Directive

How about shedding our fear of prime numbers? Let us solve some computational problems to that effect. You are already given a method that generates all primes up to an upperbound (`Primes.getPrimes(int upperbound)`).

**Background**: What is prime factorization? Given a number **n**, we would like to find its factors **f1**, **f2**, ..., **fk**, such that each of these factors is a prime number and **n = f1 * f2 * ... * fk**. 

**Example of Prime Factorization**: 

* n = 1: Has no prime factor.
* n = 7: The prime factor is only 7.
* n = 8: The prime factors are 2, 2 and 2.
* n = 15: The prime factors and 3 and 5.
* n = 44: The prime factors and 2, 2 and 11.

## Task 1: Prime Factor Sequence

Let us define the prime factor sequence, PFS, as follows:

PFS(i) = the number of prime factors, including repeated factors, that i has, and is defined for i >= 0.

* PFS(0) = 0
* PFS(1) = 0
* PFS(2) = 1
* PFS(3) = 1
* PFS(4) = 2 (because 4 = 2 x 2)
* PFS(5) = 1
* PFS(6) = 2 (6 = 2 x 3)
* PFS(7) = 1
* PFS(8) = 3 (8 = 2 x 2 x 2)

Given an upper bound **n**, compute the PFS(0) ... PFS(n).

**TODO**: Implement `public List<Integer> primeFactorSequence()` in the class `PrimeFactorSequence`.

## Task 2: Sequence of Numbers with M Prime Factors

Given an integer **m**, return an increasing sequence of integers (upto an upper bound) that have exactly **m** prime factors. Let us call this sequence MPFS.

(Hint: Task 1 and Task 2 are related.)

For **m = 2**: 

* MPFS(0) = 4
* MPFS(1) = 6
* MPFS(2) = 9
* MPFS(3) = 10
* MPFS(4) = 14
* MPFS(5) = 15
* MPFS(6) = 21
* MPFS(7) = 22

**TODO**: Implement `public List<Integer> numbersWithMPrimeFactors(int m)` in the class `PrimeFactorSequence`.

## Task 3: Adjacent Pairs with Limited Gaps

Consider the sequence of numbers with **m** prime factors, MPFS, upto some upper bound. Return a list of pairs (MPFS(i), MPFS(i+1)) such that **MPFS(i+1) - MPFS(i) <= gap**. You are given an implementation of the `IntPair` datatype that you can use.

For **m = 2** and **gap = 2**, the sequence of pairs is:  (4, 6), (9, 10), (14, 15), (21, 22), (25, 26), (33, 34), ...

**TODO**: Implement `public List<IntPair> numbersWithMPrimeFactorsAndSmallGap(int m, int gap)` in `PrimeFactorSequence`.

## Task 4: A 0-1 Prime Transformation

In this task, we want to start with an `int` `n` and transform it to a prime number as follows:

* if `n` is already prime then there is nothing to do;
* otherwise we can change `n` using one of two steps:
   * the **0-step**: `n_new = 2 * n + 1`, or
   * the **1-step**: `n_new = n + 1`.

We keep applying such steps until we obtain a prime number.

For example, let us start with `n = 14`:

* we can apply a 0-step and obtain 29, which is prime;
* or, we can apply three 1-steps and obtain 17, which is also prime.

We can describe the first transformation to 29 using the string "0", and the second transformation using the string "111" because of the steps involved. We will always pick the transformation described by the shorter string. And in the case that multiple transformations are of the same length, then we will pick the transformation that maps to a smaller integer value (because each string represents a binary number).

Here is another example. Suppose we start with `n = 28`. A 1-step will give us 29, which is prime, and this transformation is represented by "1". Alternatively, we have some of these transformations:

* A 0-step to 57, and two 1-steps to 59 ("011");
* Four 0-steps: 28 -> 57 -> 115 -> 231 -> 463 ("0000");
* Three 0-steps and two 1-steps: 28 -> 57 -> 115 -> 231 -> 232 -> 233 ("00011").

The best transformation is represented by the string "1".

So, given a starting number `n`, we need to determine if there is a transformation from `n` to a larger prime with the smallest such path and return the corresponding string representation. When `n` starts as a prime number then we return the empty string "". Finally, if there is no prime number that is less than or equal to upperbound that we can transform `n` to, the returned string should be "-".

**TODO**: Implement the method `public String changeToPrime(int n)`in the class `PrimeFactorSequence`.

## Logistics

### Duration and Scoring

**Within 75 minutes**:

* Task 1: 1 point
* Task 1 + Task 2: 2 points
* Task 1 + Task 2 + Task 3: 3 points
* All four tasks: 4 points

**Within 150 minutes**:

* Task 1 + Task 2 + Task 3: 1 point

* All four tasks: 2 points

   There is no further credit if someone completes Tasks 1, 2 and 3 in 75 minutes and does not get to Task 4 or completes Task 4 in 150 minutes. This is a deliberate choice. Don't spend all  night on Task 4, etc.

**Within 24 hours**:

* Task 1 + Task 2 + Task 3: 1 point
* All four tasks: 1 point

The message is this: Task 4 may be  more work than the other three tasks. If you are taking more time to  complete Tasks 1, 2 and 3, then it may not be a good time investment today to work on Task 4 as well.

There is no partial credit for a  task. You get credit for a task if your implementation passes all tests  we subject your submission to. And there will be more tests than what  you will be provided with. The PPT has been broken up into different  tasks so that you can get partial credit. There will be no further  subdivisions for assigning credit.

### Submission Instructions

+ Submit your work to the Github classroom repository that was created for you.
+ **Do not alter the directory/folder structure. You should retain the structure as in this repository.**
+ Do not wait until the last minute to push your work to Github. It is a good idea to push your work at intermediate points as well. _We would recommend that you get your Git and Github workflow set up at the start._

### What Should You Implement / Guidelines

+ You should implement all the methods that are indicated with `TODO`.
+ Passing the provided tests is the minimum requirement. Use the tests to identify cases that need to be handled. Passing the provided tests is *not sufficient* to infer that your implementation is complete and that you will get full credit. Additional tests will be used to evaluate your work. The provided tests are to guide you.
+ You can implement additional helper methods if you need to but you should keep these methods `private` to the appropriate classes.
+ You do not need to implement new classes.
+ You can use additional **standard** Java libraries by importing them.
+ Do not throw new exceptions unless the specification for the method permits exceptions.


## Honour Code

By submitting your work to Github you agree to the following:

+ You did not consult with any other person for the purpose of completing this activity.
+ You did not aid any other person in the class in completing their activity.
+ If you consulted any external sources, such as resources available on the World Wide Web, in completing the examination then you have cited the source. (You do not need to cite class notes or Sun/Oracle Java documentation.)
+ You are not aware of any infractions of the honour code for this examination.

## Answers to FAQs

* **Can I consult Java documentation and other Internet-based sources?**

    Yes, you can. The point of this test is not to demonstrate mastery over syntax but that you can solve a problem in a    reasonable amount of time with reasonable resources.

    *If you find useful information online outside the official Java documentation and the course material, you must cite the source. You should do so by adding comments in your source code.*

    Naturally you are expected to adhere to all of the course and UBC policies on academic integrity.

* **Isn't 75 minutes insufficient time to produce a working implementation?**

    The questions are straightforward, and these are not very different from what one might sometimes encounter on a job interview (for example). The difference is that you get less time during an interview (10-15 minutes) with no access to additional resources. So the time allotted is reasonable in that regard and I am expecting that everyone will be able to clear this bar. The goal is that it is possible to say, at a minimal level, what everyone who completes this course can achieve.

* **Why am I not guaranteed full credit if my implementation passes all the provided tests?**

    It is easy to develop an implementation that passes the provided tests and not much else. A good-faith implementation that passes all the provided tests is very likely to pass other tests too.