# UriBuilder
[*View on Codewars*](https://www.codewars.com/kata/uribuilder)

Create a basic UriBuilder object that will be used specifically to build query params on an existing URI. It should support a params property and a build method. It will handle the URL having pre-existing params that need to be managed. The URL must be properly encoded (i.e. "a b" should be encoded as "a%20b")

Examples of how the builder will be used:

```javascript

var builder = new UriBuilder('http://www.codewars.com')
builder.params.page = 1
builder.params.language = 'javascript'

// new builder instance to demonstrate pre-existing params.
builder = new UriBuilder('http://www.codewars.com?page=1')

builder.params.page = 2
// should return 'http://www.codewars.com?page=2'
builder.build()

// if you delete params then they will disappear from the url string
delete builder.params.page

// should return 'http://www.codewars.com'
builder.build()

```

```coffeescript

builder = new UriBuilder('http://www.codewars.com')
builder.params.page = 1
builder.params.language = 'javascript'

# should return 'http://www.codewars.com?page=1&language=javascript'
builder.build() 

# new builder instance to demonstrate pre-existing params.
builder = new UriBuilder('http://www.codewars.com?page=1')
builder.params.page = 2

# should return 'http://www.codewars.com?page=2'
builder.build()

# if you delete params then they will disappear from the url string
delete builder.params.page

# should return 'http://www.codewars.com'
builder.build()

```

**Note:** For extra style points you can have your solution handle array values as query parameters, however there are no tests that explicitly test for them. 

## Timeline
- Created: 2013-07-23
- Published: 2013-07-23
- Approved: null
- Completed: 2016-02-26