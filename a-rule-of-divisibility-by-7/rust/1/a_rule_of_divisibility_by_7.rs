fn seven(n: i64) -> (i64, i32) {
    let mut steps = 0;
    let mut n = n;
    
    while (n >= 100) {
        steps += 1;
        n = n / 10 - n % 10 * 2;
    }
    
    (n, steps)
}