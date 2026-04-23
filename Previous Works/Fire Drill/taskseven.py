

counter = 1
sum_even = 0.0
even_counter = 0

while (counter <= 10):

	score = float(input("Enter score:"))

	if (score % 2 == 0):
		sum_even += score
		even_counter += 1
	counter += 1

average = sum_even/even_counter
print("The sum and average of the even scores of the 10 scores are", sum_even, average)