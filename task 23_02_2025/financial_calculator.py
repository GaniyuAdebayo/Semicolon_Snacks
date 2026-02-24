loan_amount = float(input("Enter the loan amount: "))
loan_period = int(input("Enter the loan period: "))

months = loan_period*12
rate = 5.0
print(f"{"Monthly Rate": <15}{"Monthly Payment": <18}{"Total Payment": <15}")
while (rate <= 10.0):

	monthly_rate = rate / (100 * 12)

	monthly_payment = loan_amount * monthly_rate * ((1 + monthly_rate) ** months) * (1 / (((1 + monthly_rate) ** months) - 1))
	total_payment = monthly_payment * months

	print(f"{rate: <15}{round(monthly_payment, 2): <18}{round(total_payment, 2): <15}")
	rate += 0.25