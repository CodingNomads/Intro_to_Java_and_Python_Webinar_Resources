
for num in range(1, 100):
	for x in range(2, num):
		if num % x == 0:
			break
	else:
		print(num)
