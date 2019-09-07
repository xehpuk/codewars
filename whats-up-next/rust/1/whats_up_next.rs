fn next_item<T: PartialEq<T> + Clone>(slice: &[T], find: T) -> Option<T> {
    match slice.iter().position(|t| t.clone() == find) {
        Some(i) => {
            let j = i + 1;
            if j < slice.len() {
                Some(slice[j].clone())
            } else {
                None
            }
        }
        None => None,
    }
}