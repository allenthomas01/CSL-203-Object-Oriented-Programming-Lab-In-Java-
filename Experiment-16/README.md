### AIM :

To write a java program for the following :
1.	Create a doubly linked list of elements.
2.	Delete a given element from the above list.
3.	Display the contents of the list after deletion.


### ALGORITHM :

1.	Start
2.	A class doubly linked list is defined
a.	Declare Node head, newnode, temp and ptr
b.	Node class is defined
i.	Declare data and pointers prev and link
ii.	Using this keyword prev and link is assigned to null
c.	Insert function is created
i.	New node is created
ii.	If head is null
1.	Head = new node
2.	Temp = new node
iii.	Else
1.	Temp.link = new node
2.	Temp = new node
iv.	Print insertion succesfull
d.	Delete function is created
i.	If head = null
1.	Print list is empty
ii.	Else
1.	If head.link = null
a.	Head = head.link
2.	Else
a.	Ptr = head;
b.	Head = head.link
c.	Head.prev = null
e.	Display function is created
i.	Ptr = head
ii.	While ptr != null
1.	Print ptr.data
2.	Prt = ptr.link
3.	Main class is invoked
a.	An object dll is created for the class doubly linked list
b.	Initialize choice variable as zero
c.	While choice != 4
i.	Switch choice
1.	If input value is 1
a.	A data is received from the user
b.	Insert function is called
2.	If input value is 2
a.	Delete function is called
3.	If input value is 3
a.	Display function is called
4.	If input value is 4
a.	Exit from the program
4.	Stop

