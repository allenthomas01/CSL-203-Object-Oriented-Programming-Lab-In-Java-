
### AIM :

To write a java program that works as a simple calculator. Arrange Buttons for digits and the + - * % operations properly. Add a text field to display the result. Handle any possible exceptions like divide by zero.

### ALGORITHM :

1.	Start
2.	Import packages
3.	Class Calculator is created that implements interface ActionListener
4.	Create an object of Calculator class and call its constructor
5.	Create a new frame by creating object of JFrame
6.	Declare necessary Jbutton and JtextField's and arrange them by setting bounds to them
7.	Add the buttons to the frame
8.	Add ActionListener to all the buttons
9.	Method actionPerfomed is defined
a.	For every button pressed display its value in the textfield
b.	if (e.getSource()==button)
i.	tf.setText(tf.getText().concat("buttonName"))
c.	f the button pressed is an operator the store the current value of the textfield to an integer a
d.	if (e.getSource()==operatorButton)
i.	a=Double.parseDouble(tf.getText())
ii.	op = 2
iii.	tf.setText("")
e.	if equalto button is pressed then store the current value in textfield to integer variable b
f.	if (e.getSource()==EqualButton)
i.	b=Double.parseDouble(tf.getText())
g.	then perform operation using operator value stored in variable operator,on values a and b
10.	switch(op)
a.	case 1:
i.	result=a+b
b.	case 2:
i.	result = a-b
c.	case 3:
i.	result = a*b
d.	case 4:
i.	result = a/b 11.Display the result
12.If an exception is occurs catch the expression 13.Stop
