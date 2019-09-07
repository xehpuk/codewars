use std::collections::HashMap;

fn freq_seq(s: &str, sep: &str) -> String {
    let mut freq = HashMap::new();

    for c in s.chars() {
        let count = freq.entry(c).or_insert(0);
        *count += 1;
    }

    s.chars()
        .map(|c| freq.get(&c).unwrap().to_string())
        .collect::<Vec<_>>()
        .join(sep)
}