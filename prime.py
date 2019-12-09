
# loop between 1 and 100
for num in range(1, 100):
	# loop over every number between 2 and "num" 
	for x in range(2, num):
		# num modulo x is 0 = the number is not prime
		if num % x == 0:
			# break the loop
			break
	# if the loop is never broken
	else:
		# print the prime number
		print(num)
