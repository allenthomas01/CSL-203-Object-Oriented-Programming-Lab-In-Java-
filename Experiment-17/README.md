### AIM :

To write a java that implements Quick sort ALGORITHM for sorting a list of names in ascending order.

### ALGORITHM :

1.	Start
2.	Create class quick sort
3.	Quick sort function is invoked
a.	If p < r
i.	Set q = partition (A, p, r)
ii.	Quick sort (A, p, q, -1)
iii.	Quick sort (A, q, +1, r)
4.	Partition function is invoked
a.	Assign string x = A[r] and int i = p - 1
b.	From j = p to j <= r – 1 do
i.	If A[j]. compareToIgnoreCase(x) <= 0 1. i = I + 1
2. temp = A[i] 3. A[i] = A[j]
4.	A[j] = temp
c.	Temp = A[i + 1]
d. A[i + 1] = A[r]
e.	A[r] = temp
f.	Return i + 1
5.	Main function is invoked
a.	Accept the limit value from the user as n
b.	For i = 0 to i< n do
i.	A[i] = sc.nextLine()
c.	Quick sort (A, 0, n, -1)
d.	Print the elements after quick sort
6.	Stop
