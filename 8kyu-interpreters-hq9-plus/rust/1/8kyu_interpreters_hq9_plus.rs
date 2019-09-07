use std::fmt::Write;

fn hq9(code: &str) -> Option<String> {
    fn ordinal(n: u8) -> String {
        match n {
            1 => "1 bottle".to_string(),
            0 => "no more bottles".to_string(),
            i => format!("{} bottles", i),
        }
    }

    match code {
        "H" => Some("Hello World!".to_string()),
        "Q" => Some("Q".to_string()),
        "9" => {
            let mut bottles = String::new();
            for i in (1..100).rev() {
                write!(
                    &mut bottles,
                    "\
{0} of beer on the wall, {0} of beer.
Take one down and pass it around, {1} of beer on the wall.
",
                    ordinal(i),
                    ordinal(i - 1)
                )
                .unwrap();
            }
            bottles.push_str(
                "\
No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall.",
            );
            Some(bottles)
        }
        _ => None,
    }
}