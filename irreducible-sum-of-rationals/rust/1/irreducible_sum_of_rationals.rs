fn gcd(a: i64, b: i64) -> i64 {
    if b == 0 {
        a
    } else {
        gcd(b, a % b)
    }
}

fn fract(a: i64, b: i64) -> (i64, i64) {
    let d = gcd(a, b);
    (a / d, b / d)
}

fn add(a: (i64, i64), b: &(i64, i64)) -> (i64, i64) {
    fract(a.0 * b.1 + b.0 * a.1, a.1 * b.1)
}

fn sum_fracts(l: Vec<(i64, i64)>) -> Option<(i64, i64)> {
    if l.is_empty() {
        None
    } else {
        Some(l.iter().fold((0, 1), add))
    }
}