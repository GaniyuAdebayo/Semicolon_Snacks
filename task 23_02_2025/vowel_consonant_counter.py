sentence = input("Enter a sentence: ")

vowelCounter = 0
consonantCounter = 0
for letter in sentence:

	if ((chr('A') <= letter >= chr('Z')) or (chr('a') <= letter >= chr('z'))):

		if letter in "aeiou":

			vowelCounter += 1

		else:
			consonantCounter += 1

print(f"Number of vowels: {vowelCounter}\nNumber of consonants: {consonantCounter}")

		