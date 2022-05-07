### AIM :

To write a java program implements the binary search ALGORITHM.

### ALGORITHM :

1.	Start
2.	Enter the number of elements
3.	Read the array elements
4.	Accept the search element
5.	Method binary is called
6.	Declare variables flag = 0 and index = 0
7.	While low <= up
a.	mid=(low+up)/2
b.	if ar[mid] = key
i.	flag = 1
ii.	index = mid + 1
c.	if ar[mid]<key
i.	low = mid +1
d.	if ar[mid] > key
i.	up = mid – 1
8.	if flag == 1
a.	Print element found
9.	Else
a.	Print element not found 10.Stop
