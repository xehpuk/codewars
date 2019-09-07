fn add(args: &[i64]) -> i64 {
    args.iter()
        .enumerate()
        .fold(0, |acc, (i, n)| acc + (i + 1) as i64 * n)
}