# Adding words - Part I
[*View on Codewars*](https://www.codewars.com/kata/adding-words-part-i)

<p>This is the first part of this kata series. Second part is <a href="https://www.codewars.com/kata/adding-words-part-ii/">here</a> and third part is <a href="https://www.codewars.com/kata/adding-words-part-iii/">here</a></p>
<p>Add two English words together!</p>
<p>Implement a class <code>Arith</code> (struct <code>struct Arith{value : &'static str,}</code> in Rust) such that</p>

```javscript
  //javascript
  var k = new Arith("three");
  k.add("seven"); //this should return "ten" 
```

```c++
  //c++
  Arith* k = new Arith("three");
  k->add("seven"); //this should return string "ten" 
```

```Rust
  //Rust
  let c = Arith{value: "three"};
  c.add("seven") // this should return &str "ten"
```
<p><b>Input</b> - Will be between zero and ten and will always be in lower case</p>
<p><b>Output</b> - Word representation of the result of the addition. Should be in lower case</p>


## Timeline
- Created: 2017-05-31
- Published: 2017-05-31
- Approved: 2017-06-02
- Completed: 2019-08-09