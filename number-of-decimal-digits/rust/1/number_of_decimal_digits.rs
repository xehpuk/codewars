fn digits(n: u64) -> usize {
    if n == 0 {
        1
    } else {
        fn digits(n: u64) -> usize {
            if n == 0 {
                0
            } else {
                rec(n)
            }
        }
        
        fn rec(n: u64) -> usize {
            1 + digits(n / 10)
        }
        
        rec(n)
    }
}