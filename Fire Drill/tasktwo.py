

counter = 1
sum = 0.0

while (counter <= 10):

	score = float(input("Enter score:"))
	sum += score
	counter += 1

average = sum/10

print("The average of the 10 scores is", average)