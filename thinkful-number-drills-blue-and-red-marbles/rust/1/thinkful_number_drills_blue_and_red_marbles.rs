fn guess_blue(blue_start: u32, red_start: u32, blue_pulled: u32, red_pulled: u32) -> f32 {
    let blue_end = blue_start - blue_pulled;
    let red_end = red_start - red_pulled;
    
    blue_end as f32 / (blue_end + red_end) as f32
}