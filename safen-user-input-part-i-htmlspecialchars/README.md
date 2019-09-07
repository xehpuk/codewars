# Safen User Input Part I - htmlspecialchars
[*View on Codewars*](https://www.codewars.com/kata/safen-user-input-part-i-htmlspecialchars)

# Safen User Input Part I - htmlspecialchars

You are a(n) novice/average/experienced/professional/world-famous Web Developer (choose one) who owns a(n) simple/clean/slick/beautiful/complicated/professional/business website (choose one or more) which contains form fields so visitors can send emails or leave a comment on your website with ease.  However, **with ease comes danger**.  Every now and then, a hacker visits your website and attempts to compromise it through the use of **XSS (Cross Site Scripting)**.  This is done by injecting ```script``` tags into the website through form fields which may contain malicious code (e.g. a redirection to a malicious website that steals personal information).

## Mission

Your mission is to implement a function ```htmlspecialchars()``` that converts the following potentially harmful characters:

1. ```<``` --> ```&lt;```
2. ```>``` --> ```&gt;```
3. ```"``` --> ```&quot;```
4. ```&``` --> ```&amp;```

Good luck :D

## Extension

If you are an experienced Javascript programmer, try shortening your code as much as possible and optimise it to minimise run time.  Experienced programmers should be able to complete this exercise in one line of code.

## Timeline
- Created: 2016-02-11
- Published: 2016-02-11
- Approved: 2016-05-21
- Completed: 2019-08-06