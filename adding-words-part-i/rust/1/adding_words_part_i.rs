const WORDS: [&str; 21] = [
    "zero",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen",
    "twenty",
];

struct Arith {
    value: &'static str,
}

fn to_number(value: &'static str) -> usize {
    WORDS
        .iter()
        .position(|&w| w == value)
        .unwrap_or_else(|| panic!("Invalid word: {}", value))
}

impl Arith {
    fn add(&self, value: &'static str) -> &'static str {
        WORDS[to_number(self.value) + to_number(value)]
    }
}