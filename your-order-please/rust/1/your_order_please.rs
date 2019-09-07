fn order(sentence: &str) -> String {
    let mut words = sentence.split_ascii_whitespace().collect::<Vec<_>>();
    words.sort_by(|a, b| digit(a).cmp(&digit(b)));
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