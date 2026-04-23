sentence = input("Enter a sentence: ").lower()

vowelCounter = 0
consonantCounter = 0
for letters in sentence:

	letter = ord(letters)

	if ((ord('A') <= letter >= ord('Z')) or (ord('a') <= letter >= ord('z'))):

		if letters in "aeiou":

			vowelCounter += 1

		else:
			consonantCounter += 1

print(f"Number of vowels: {vowelCounter}\nNumber of consonants: {consonantCounter}")

		