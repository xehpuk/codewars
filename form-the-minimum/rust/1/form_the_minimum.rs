fn min_value(mut digits: Vec<i32>) -> i32 {
    digits.sort_unstable_by(|a, b| b.cmp(a));
    digits.dedup();
    digits
        .iter()
        .enumerate()
        .map(|(i, d)| 10i32.pow(i as u32) * d)
        .sum()
}