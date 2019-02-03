function cakes(recipe, available) {
  return Object.entries(recipe).reduce((cakes, [ingredient, amount]) => Math.min(cakes, available[ingredient] / amount | 0), Infinity)
}