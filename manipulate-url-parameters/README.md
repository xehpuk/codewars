# Manipulate URL Parameters
[*View on Codewars*](https://www.codewars.com/kata/manipulate-url-parameters)

You need to write a function ( `addOrChangeUrlParameter(url, keyValueParameter)` )  that can manipulate URL parameters.

It should be able to 
* **add** a parameter to an existing URL, 

but also to 
* **change** a parameter if it already exists.

### Example:
```javascript

addOrChangeUrlParameter("www.example.com", "key=value") 
// -> 'www.example.com?key=value' (adds a parameter).

addOrChangeUrlParameter("www.example.com?key=value", "key2=value2" ) 
// -> 'www.example.com?key=value&key2=value2' (adds another parameter).

addOrChangeUrlParameter("www.example.com?key=oldValue`", "key=newValue" ) 
// ->'www.example.com?key=newValue' (changes the parameter).
```

## Timeline
- Created: 2013-09-25
- Published: 2013-09-26
- Approved: 2017-08-10
- Completed: 2015-05-23