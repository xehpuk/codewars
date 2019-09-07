fn generate_shape(n: usize) -> String {
    let mut square = "+".repeat(n);
    square.push('\n');
    let mut square = square.repeat(n);
    square.pop();
    square
}