function discoverOriginalPrice(discountedPrice, salePercentage){
  return Math.round(discountedPrice / (1 - salePercentage / 100) * 100) / 100;
}