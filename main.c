#include <stdio.h>
#include <stdbool.h>
#include <time.h>
#include <stdlib.h>
#include <omp.h>
#include <stdint.h>

bool is_prime(uint64_t number)
{
    if (number < 2)
    {
        return false;
    }

    if (number == 2)
    {
        return true;
    }

    for (uint64_t i = 3; i < number; i++)
    {
        if (number % i == 0)
        {
            return false;
        }
    }

    return true;
}

int main(void)
{
    srand(time(NULL));

#pragma omp parallel for
    for (uint64_t i = 0; i < 1000000; i++) // i not used, required for parallel processing
    {
        while (1)
        {
            uint64_t number = rand();

            printf("%ld is prime: %d\n", number, is_prime(number));
        }
    }
}