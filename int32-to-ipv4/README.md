# int32 to IPv4
[*View on Codewars*](https://www.codewars.com/kata/int32-to-ipv4)

Take the following IPv4 address:  128.32.10.1

This address has 4 octets where each octet is a single byte (or 8 bits).

* 1st octet 128 has the binary representation: 10000000
* 2nd octet 32 has the binary representation: 00100000
* 3rd octet 10 has the binary representation: 00001010
* 4th octet 1 has the binary representation: 00000001

So 128.32.10.1 == 10000000.00100000.00001010.00000001

Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361

Write a function `int32_to_ip(int32)` (**JS**: `int32ToIp(int32)`, **Haskell**: `int32ToIP`, **C#**: `UInt32ToIP`) that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.

```ruby
  int32_to_ip(2149583361) => "128.32.10.1"
```
```javascript
  int32ToIp(2149583361) => "128.32.10.1"
```
```haskell
  int32ToIP 2149583361 => "128.32.10.1"
```
```csharp
  Kata.UInt32ToIP(2149583361) => "128.32.10.1"
```


## Timeline
- Created: 2014-01-29
- Published: 2014-01-30
- Approved: 2014-04-30
- Completed: 2015-05-24