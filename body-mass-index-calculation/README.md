# Body mass index calculation
[*View on Codewars*](https://www.codewars.com/kata/body-mass-index-calculation)

For long period JavaScript warriors trained a lot in coding kata. But to find way warrior also need physical kata. Some of warriors forgot about this fact and enemies can use this weakness, your clan is under threat. You are chosen to fix this situation. Write a function to calculate *Body mass index* for each warrior.

```bmi = weght(kg)/(height(m)*height(m))```

Warriors know only their height in centimetres and weight (in kilogrames). Your task is to return an object with fields

-  *value* - calculated Body mass index, rounded with one number after decimal point.

- *category* - from https://en.wikipedia.org/wiki/Body_mass_index

Ex :

```
calculateBmi(65,175)
```

Returns :

```
{value: "21.2", category: "Normal (healthy weight)"}
```

<a href="https://imgbb.com/"><img src="https://i.ibb.co/8svGBpn/Capture.png" alt="Capture" border="0"></a>

Note : as per standard conventions how you read the table is for example :

- Normal is BMI < 25 and not Underweight

Hurry up, save your clan

## Timeline
- Created: 2015-09-15
- Published: 2015-09-15
- Approved: 2019-01-21
- Completed: 2019-01-26