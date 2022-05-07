### AIM :

To write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green. When a radio button is selected, the light is turned on, and only one light can be on at a time. No light is on when the program starts.

### ALGORITHM :

1.	Start
2.	Import files java.awt and javax.swing
3.	Main class trafficlight is created
a.	Object f is created for JFrame
b.	f.setVisible(true)
c.	Set size as 640 , 480
d.	f.setLayout(null)
e.	Object t is created for class light
f.	f.add(t)
4.	Class light is created which extends JPanel and implements ActionListener
a.	Three radio buttons r1, r2 and r3 are created
b.	Three colors red_c, yellow_c and green_care created
c.	A constructor is created
i. setBounds(0,0,648,480)
ii.	Give names to the radio buttons
iii.	Make red color selected as default
iv.	Group the buttons to select one button at a time
v.	Add r1, r2 and r3
vi.	r1.addActionListener(this)
vii.	r2.addActionListener(this)
viii.	r3.addActionListener(this)
ix.	Create a method actionPerfomed
1.	If r1 is selected
a.	red_c = Color.red
b.	yellow_c = getBackground()
c.	green_c = getBackground()
2.	If r2 is selected
a.	red_c = getBackground()
b.	yellow_c = Color.yellow
c.	green_c = getBackground()
3.	If r3 is selected
                                                  a. red_c = getBackground()
                                                  b. yellow_c = getBackground()
                                                  c. green_c = Color.green
                                        4. repaint function is called
i. Create a method paintComponent(Graphics g)
                                                       1. Super.paintComponent(g)
                                                       2. Draw three ovals with dimensions(50,50,50,50) ,  
                                                               (50,110,50,50) and (50,170,50,50)
                                                       3. Set colors for each ovals
                                                Stop

