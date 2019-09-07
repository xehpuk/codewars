fn order(sentence: &str) -> String {
    let mut words = sentence.split_whitespace().collect::<Vec<_>>();
    words.sort_unstable_by_key(|w| digit(w));
    words.join(" ")
}

fn digit(word: &str) -> u32 {
    for c in word.chars() {
        if c.is_ascii_digit() {
            return c.to_digit(10).unwrap();
        }
    }
    panic!(format!("No digit found in: {:?}", word))
}