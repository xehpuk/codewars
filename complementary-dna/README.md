# Complementary DNA
[*View on Codewars*](https://www.codewars.com/kata/complementary-dna)

Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". 
You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here http://rosalind.info/problems/list-view/ (source)

```python
DNA_strand ("ATTGC") # return "TAACG"

DNA_strand ("GTAT") # return "CATA"
```

```javascript
DNAStrand ("ATTGC") # return "TAACG"

DNAStrand ("GTAT") # return "CATA" 
```

```typescript
dnaStrand("ATTGC") # return "TAACG"

dnaStrand("GTAT") # return "CATA" 
```

```csharp
MakeComplement("ATTGC") => "TAACG"

MakeComplement("GTAT") => "CATA"
```

```php
DNA_strand("ATTGC") // returns "TAACG"
DNA_strand("GTAT") // returns "CATA"
```

```ruby
DNA_strand ("ATTGC") # return "TAACG"

DNA_strand ("GTAT") # return "CATA"
```

```crystal
dna_strand("ATTGC") # return "TAACG"

dna_strand("GTAT") # return "CATA"
```

```java
DnaStrand.makeComplement("ATTGC") // return "TAACG"

DnaStrand.makeComplement("GTAT") // return "CATA"
```

```haskell
dnaStrand []        `shouldBe` []
dnaStrand [A,T,G,C] `shouldBe` [T,A,C,G]
dnaStrand [G,T,A,T] `shouldBe` [C,A,T,A]
dnaStrand [A,A,A,A] `shouldBe` [T,T,T,T]
```

```clojure
(is (= (dna-strand "ATTGC") "TAACG"))

(is (= (dna-strand "GTAT") "CATA"))
```

```c
dna_strand("ATTGC") /* return "TAACG" */
dna_strand("GTAT")  /* return "CATA"  */
```

```golang
DNAStrand("ATTGC") // returns "TAACG"

DNAStrand("GTAT") // returns "CATA"
```

## Timeline
- Created: 2015-05-09
- Published: 2015-05-09
- Approved: 2015-05-13
- Completed: 2015-05-20