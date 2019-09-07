fn count_red_beads(n: u32) -> u32 {
    2 * (std::cmp::max(1, n) - 1)
}