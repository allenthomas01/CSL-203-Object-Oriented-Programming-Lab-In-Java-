### AIM :

To write a java program that read from a file and write to file by handling all file related exceptions.

### ALGORITHM :

1.	Start
2.	Main function is invoked
3.	In the try function do the following
a.	Accept file name from the user
b.	Create a new file with the file name
c.	If successfully created
i.	Print file created with file name
d.	Else
i.	Print file already exists
4.	If an exception occurred catch the exception
5.	In another try function do the following
a.	Accept the text from the user as str
b.	Create an object file for filewiter
c.	Write the string to the file
d.	Close the file
6.	If an exception occurred catch the exception
7.	In another try function do the following
a.	Declare a character array ch
b.	An object rd is created for filereader
c.	Print the contents in the file
d.	Close the file
8.	If an exception occurred catch the exception
9.	Stop
