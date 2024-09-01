import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class bmical
 {
    bmical()
    {
        JFrame f= new JFrame();
        JLabel name = new JLabel("Name: ");
        JLabel title = new JLabel("BMI CALCULATOR");
        JLabel weight = new JLabel("Weight in kgs");
        JLabel height = new JLabel("Height in meters");
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        JTextField tf4 = new JTextField();
        JButton cal = new JButton("CALCULATE");
        title.setBounds(200,10,200,40);
        name.setBounds(10,50,100,20);
        weight.setBounds(10,80,100,20);
        height.setBounds(10,110,100,20);
        tf1.setBounds(150,50,100,20);
        tf2.setBounds(150,80,100,20);
        tf3.setBounds(150,110,100,20);
        cal.setBounds(200,150,150,20);
        
        f.add(cal);
        f.add(title);
        f.add(name);
        f.add(weight);
        f.add(height);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(600,600);
        cal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                if(!tf1.getText().isEmpty() && !tf2.getText().isEmpty() && !tf3.getText().isEmpty())
                {
                    try
                    {
                        double w = Double.parseDouble(tf2.getText());
                        double h = Double.parseDouble(tf3.getText());

                        double bmi = w/(h*h);

                        if(bmi<18.5)
                        {
                            JOptionPane.showMessageDialog(null,"Name:"+tf1.getText()+"\n"+"Weight:"+tf2.getText()+"\n"+"Height:"+tf3.getText()+"\n"+"Weight Status: Under weight\n"+"BMI:"+bmi);
                        }
                         else if(bmi>=18.5 && bmi<=24.9)
                         {
                            JOptionPane.showMessageDialog(null,"Name:"+tf1.getText()+"\n"+"Weight:"+tf2.getText()+"\n"+"Height:"+tf3.getText()+"\n"+"Weight Status: Healthy weight\n"+"BMI:"+bmi);
                         }

                         else if(bmi>=25 && bmi<=29.9)
                         {
                            JOptionPane.showMessageDialog(null,"Name:"+tf1.getText()+"\n"+"Weight:"+tf2.getText()+"\n"+"Height:"+tf3.getText()+"\n"+"Weight Status: Over weight\n"+"BMI:"+bmi);
                         }
                         else
                         {
                            JOptionPane.showMessageDialog(null,"Name:"+tf1.getText()+"\n"+"Weight:"+tf2.getText()+"\n"+"Height:"+tf3.getText()+"\n"+"Weight Status: Obesity\n"+"BMI:"+bmi);
                         }
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(null, "Please enter valid nummbers");
                    }
                }
                else if(tf1.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please enter Name");
                }
                else if(tf2.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please enter Weight");
                }
                else if(tf3.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please enter height");
                }
            }
        });
    }
    public static void main(String args[])
    {
        new bmical();
    }
}
