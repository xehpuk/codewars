fn row_weights(array: Vec<u32>) -> (u32, u32) {
    let mut weights = (0, 0);
    for (i, weight) in array.iter().enumerate() {
        if i % 2 == 0 {
            weights.0 += weight;
        } else {
            weights.1 += weight;
        }
    }
    weights
}