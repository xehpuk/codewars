fn html_special_chars(html: &str) -> String {
    let mut encoded = String::new();

    for c in html.chars() {
        encoded.push_str(&match c {
            '<' => "&lt;".to_string(),
            '>' => "&gt;".to_string(),
            '"' => "&quot;".to_string(),
            '&' => "&amp;".to_string(),
            _ => c.to_string(),
        })
    }

    encoded
}