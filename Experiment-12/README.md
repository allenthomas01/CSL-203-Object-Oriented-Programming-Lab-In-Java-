### AIM :

To write a java program that shows thread synchronization.

### ALGORITHM :

1.	Start
2.	Main function is invoked
a.	Object sc is created for SyncThread(“hello”)
b.	Object sd is created for SyncThread(“World”)
c.	Start method is called
3.	Define class display
a.	In the method print
i.	In the try function do
1.	Sleep thread for 100 millisecond
ii.	If any exception occurs catch the exception
1.	Print the message
4.	Define SyncThread class which extends thread
a.	An object d is created for display
b.	SyncThread(String msg)
i.	This.msg = msg
c.	Method run is defined
i.	d.print(msg)
5.	Stop
