

counter = 1
sum_even = 0.0;

while (counter <= 10):

	score = float(input("Enter score:"))

	if (score % 2 == 0):
		sum_even += score
	counter += 1


print("The sum of the even scores of the 10 scores is", sum_even)