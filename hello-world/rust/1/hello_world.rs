static mut I: u32 = 0;

fn hello(_input: Input) -> String {
    unsafe {
        I += 1;
        match I {
            1 => "Hello Noclip".to_string(),
            2 => "Hello Alice".to_string(),
            3 => "Hello Bob".to_string(),
            _ => panic!("Too many tests!")
        }
    }
}