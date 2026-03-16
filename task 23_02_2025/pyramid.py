
def pyramid(levels):

	present_level = []

	if (levels == 1):

		return [1]

	else:
		previous_level = pyramid(levels - 1)

		for index in range((2*levels)-1):

			if (index == 0 or index == ((2*levels)-2)):

				present_level[index] = 1

			else:
				present_level[index] = previous_level[index - 1] * 3

		return present_level

pyramid_levels = int(input("Enter number of levels in the pyramid: "))

counter = pyramid_levels * 7

for value in range (1, pyramid_levels +1):

	print(f"{" ":>{counter}}", end = "")
	counter -= 7

	pyramidNumber = pyramid(value)

	for number in pyramidNumber:

		print(f"{number:<7}, end = """)

	print()