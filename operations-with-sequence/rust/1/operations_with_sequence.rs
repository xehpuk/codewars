fn calc(array: Vec<i32>) -> i32 {
    array
        .into_iter()
        .map(|n| if n > 0 { n * n } else { n })
        .zip(1..)
        .map(|(n, i)| (if i % 3 == 0 { 3 * n } else { n }, i))
        .map(|(n, i)| if i % 5 == 0 { -n } else { n })
        .sum()
}