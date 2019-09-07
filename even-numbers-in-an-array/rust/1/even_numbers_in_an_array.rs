fn even_numbers(array: &Vec<i32>, number: usize) -> Vec<i32> {
    array
        .iter()
        .cloned()
        .rev()
        .filter(|n| *n % 2 == 0)
        .take(number)
        .collect::<Vec<i32>>()
        .iter()
        .rev()
        .cloned()
        .collect()
}