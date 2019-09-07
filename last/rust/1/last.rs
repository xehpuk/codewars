fn last<T: Clone>(slice: &[T]) -> T {
    slice.last().expect("Array is empty.").clone()
}