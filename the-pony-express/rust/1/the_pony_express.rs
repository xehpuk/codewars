fn riders(stations: &Vec<u32>) -> u32 {
    let mut riders = 1;
    let mut miles = 0;
    
    for station in stations.iter().cloned() {
        miles += station;
        if miles > 100 {
            riders += 1;
            miles = station;
        }
    }
    
    riders
}