### AIM :
	
To write a java program to multiply two matrices.

### ALGORITHM :

1.	Start
2.	Declare variables i, j, k and array c[10][10]
3.	Accept the number of rows and columns for the first matrix from the user as m1 and m2
4.	An array a with size as m1 and m2 are declared
5.	Accept the number of rows and columns for the second matrix from the user as n1 and n2
6.	An array b with size as n1 and n2 are declared
7.	If m1 and n2 are equal do
a.	Read the elements of first matrix from the user
b.	Read the elements of second matrix from the user
c.	For the value of i<m1 do
1.	For the value of j<n2 do a. c[i][j] = 0
b. For the value of k<n1 do
i. c[i][j] = c[i][j] + a[i][j] * b[i][j]
d.	Print the OUPUT matrix c[i][j]
8.	If m1 not equal to n2
a.	Print multiplication not possible
9.	Stop

