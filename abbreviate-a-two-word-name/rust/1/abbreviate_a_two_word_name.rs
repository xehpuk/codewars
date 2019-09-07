fn abbrev_name(name: &str) -> String {
    use std::char::ToUppercase;

    fn first_char(word: &str) -> ToUppercase {
        word.chars().next().unwrap().to_uppercase()
    }

    let (first_name, last_name) = {
        let mut words = name.split_ascii_whitespace();
        (words.next().unwrap(), words.next().unwrap())
    };

    format!("{}.{}", first_char(first_name), first_char(last_name))
}