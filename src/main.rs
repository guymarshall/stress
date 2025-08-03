use rayon::prelude::*;
use rug::Integer;

fn main() {
    loop {
        (0..num_cpus::get()).into_par_iter().for_each(|_| {
            let mut number: Integer =
                Integer::from_str_radix("999999999999999999999999999999", 10).unwrap();

            for _ in 0..1000 {
                number = number.next_prime();
            }
        });
    }
}
