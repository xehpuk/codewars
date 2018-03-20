const firstNames = [ "The Evil", "The Vile", "The Cruel", "The Trashy", "The Despicable", "The Embarrassing",
  "The Disreputable", "The Atrocious", "The Twirling", "The Orange", "The Terrifying", "The Awkward" ];

const lastNames = [ "Mustache", "Pickle", "Hood Ornament", "Raisin", "Recycling Bin",
  "Potato", "Tomato", "House Cat", "Teaspoon", "Laundry Basket" ];
  
function getVillainName(birthday) {
  return firstNames[birthday.getMonth()] + ' ' + lastNames[birthday.getDate() % 10];
}