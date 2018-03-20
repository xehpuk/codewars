# L3375p34k
[*View on Codewars*](https://www.codewars.com/kata/l3375p34k)

General Objective
================

The objective of this Kata is to provide some way to encode a string into its leetspeak version.<br />

Specific Instructions
--------------------

1) The code must contain a Leetspeak class inherited from an Encoder abstract class and containing an encode(String) method returning itself the encoded String.<br /><br />
2) The encode method should return an empty String if a null parameter is passed.<br /><br />
3) If any uppercase character is given, it should be compared also with the dictionary, 'a' gives '4' but 'A' gives also '4'.<br /><br />
4) If any character outside the dictionary is given, it should be output as is.<br />

Dictionary to reproduce
----------------------

The following dictionary has to be used :<br />
```
a -> 4
e -> 3
l -> 1
m -> /^^\
o -> 0
u -> (_)
```

## Timeline
- Created: 2014-10-13
- Published: 2014-10-13
- Approved: 2017-03-07
- Completed: 2015-05-05