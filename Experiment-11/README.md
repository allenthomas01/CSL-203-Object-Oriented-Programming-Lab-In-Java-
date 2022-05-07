### AIM :

To write a java program that implements a multi-threaded program which has three threads. First thread generates a random integer every 1 second. If the value is even, second thread computes the square of the number and prints. If the value is odd the third thread will print the value of cube of the number.

### ALGORITHM :

1.	Start
2.	Main function is invoked
a.	Randomizer rz = new Randomizer
b.	Start method is called
3.	Define thread class randomizer
a.	Run method is defined
i.	In this run method a random number id generated
ii.	For i = 0 to i<10 do
1.	N = r.nextInt(100) 2. If n % 2 == 0
a.	An object for even class is created and start method is called
3.	Else
a.	An object of odd class is created and start method is called
4.	Define thread class even
a.	Run method is defined
i.	Display the square of the number
5.	Define thread class odd
a.	Run method is defined
i.	Display the cube of the number
6.	Stop
