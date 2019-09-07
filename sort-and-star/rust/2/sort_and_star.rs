fn two_sort(arr: &[&str]) -> String {
    let mut res = arr.iter().min().expect("Array is empty.").to_string();
    for i in (1..res.len()).rev() {
        res.insert_str(i, "***");
    }
    res
}