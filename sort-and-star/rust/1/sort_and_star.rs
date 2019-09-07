fn two_sort(arr: &[&str]) -> String {
    let mut min = arr.first().expect("Array was empty.");
    for e in arr.iter().skip(1) {
        min = std::cmp::min(min, e);
    }
    let mut res = min.to_string();
    for i in (1..res.len()).rev() {
        res.insert_str(i, "***");
    }
    res
}