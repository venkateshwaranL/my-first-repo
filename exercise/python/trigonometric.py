import math
num1 = 25.76
num2 = 6.34
base = 3
exponent = 4
num_list = [5, 12, 18, 29, 33]
# Using math.floor
floored_value = math.floor(num1)
print(f"math.floor({num1}) = {floored_value}")
# Using math.fmod
remainder = math.fmod(num1, num2)
print(f"math.fmod({num1}, {num2}) = {remainder}")
# Using math.pow
power_value = math.pow(base, exponent)
print(f"math.pow({base}, {exponent}) = {power_value}")
# Using math.sqrt
square_root = math.sqrt(num1)
print(f"math.sqrt({num1}) = {square_root}")
# Using math.cbrt
cube_root = math.cbrt(3)
print(f"Cube root of {num1} = {cube_root}")