import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class EmployeeForm extends JFrame implements ActionListener 
{ 
 JLabel l1,l2,l3,l4,l5,l6; 
 JTextField tfld,tfname,tfage; 
cJRadioButton rbmale,rbfemale; 
JComboBox<String>cbdept; 
JCheckBox cbjava,cbpython,cbcpp,cbSQL; 
JButton btnsubmit,btnreset; 
ButtonGroup bg; 
EmployeeForm() 
{ 
setTitle("Employee Registration Form"); 
setSize(500,500); 
setLayout(new GridLayout(9,2,5,5)); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
}