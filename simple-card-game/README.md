# Simple card game
[*View on Codewars*](https://www.codewars.com/kata/simple-card-game)

Steve and Josh are bored and want to play something. They don't want to think too much, so they come up with a really simple game. Write a function called winner and figure out who is going to win.

They are dealt the same number of cards. They both flip the card on the top of their deck. Whoever has a card with higher value wins the round and gets one point (if the cards are of the same value, neither of them gets a point). After this, the two cards are discarded and they flip another card from the top of their deck. They do this until they have no cards left.

`deckSteve` and `deckJosh` are arrays representing their decks. They are filled with *cards*, represented by a single character. The card rank is as follows (from lowest to highest):
```javascript
'2','3','4','5','6','7','8','9','T','J','Q','K','A'
```

Every card may appear in the deck more than once. Figure out who is going to win and return who wins and with what score:
```javascript
"Steve wins x to y"
```
if Steve wins, where `x` is Steve's score, `y` is Josh's score;
```javascript
"Josh wins x to y"
```
if Josh wins, where `x` is Josh's score, `y` is Steve's score;
```javascript
"Tie"
```
if the score is tied at the end of the game.

</br>
### Example:
Steve is dealt:
```javascript
['A','7','8']
```

Josh is dealt:
```javascript
['K','5','9']
```

1. In first round, ace beats king and Steve gets one point.
2. In second round, 7 beats 5 and Steve gets his second point.
3. In third round, 9 beats 8 and Josh gets one point.

</br>
You should return:
```javascript
"Steve wins 2 to 1"
```


## Timeline
- Created: 2014-04-06
- Published: 2014-04-06
- Approved: 2014-04-18
- Completed: 2015-04-29