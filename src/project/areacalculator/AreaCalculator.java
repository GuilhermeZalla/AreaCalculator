package project.areacalculator;
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.swing.JRadioButton;
 import javax.swing.ButtonGroup;
 import javax.swing.JButton;
 import javax.swing.JLabel;
 import javax.swing.JTextField;
 import javax.swing.JMenu;
 import javax.swing.JMenuItem;
 import javax.swing.JMenuBar;
 import javax.swing.JOptionPane;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.awt.Container;
 import java.awt.BorderLayout;
 import java.awt.FlowLayout;
  public class AreaCalculator extends JFrame{
      
     private final JPanel panel, panel1, panel2, panel3, panel4, panel5;
     private final JLabel label1, labelValue1, labelValue2, labelValue3, labelResult;
     private final JRadioButton rbTriangle, rbCircle, rbTrapeze, rbSquare, rbRetangle;
     private final ButtonGroup buttonGroup;
     private final JTextField txtfValue1, txtfValue2, txtfValue3, txtfResult;
     private final JButton btCalculate, btReset;
     private final JMenuBar menuBar;
     private final JMenu menuOption, menuHelp;
     private final JMenuItem menuItemNew, menuItemAbout, menuItemExit, menuItemCircle,
                             menuItemTriangle, menuItemRetangle, menuItemSquare,
                             menuItemTrapeze;
     Container container;
     
     public AreaCalculator(){
         setTitle("Area Calculator");
         setLayout(new FlowLayout());
         setSize(700, 150);
         setVisible(true);
         setResizable(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         menuBar = new JMenuBar();
         menuOption = new JMenu("Option");
         menuHelp = new JMenu("Help");
         menuItemNew = new JMenuItem("New");
         menuItemAbout = new JMenuItem("About");
         menuItemExit = new JMenuItem("Exit");
         menuItemCircle = new JMenuItem("Circle");
         menuItemTriangle = new JMenuItem("Triangle");
         menuItemRetangle = new JMenuItem("Retangle");
         menuItemSquare = new JMenuItem("Square");
         menuItemTrapeze = new JMenuItem("Trapeze");
         menuBar.add(menuOption);
         menuBar.add(menuHelp);
         menuHelp.add(menuItemCircle);
         menuItemCircle.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null, "When you calculate a circle the programm\n"
                                                    +"will take only the first value.");
             }
         });
         menuHelp.add(menuItemTriangle);
         menuItemTriangle.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null, "When you calculate a triangle the programm\n"
                                                    +"will take only the first two values.");
             }
         });
         menuHelp.add(menuItemRetangle);
         menuItemRetangle.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null, "When you calculate a retangle the programm will\n"
                                                     +"take only the first two values.");
             }
         });
         menuHelp.add(menuItemSquare);
         menuItemSquare.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null,"When you calculate a square the programm will\n"
                                                   +"take only the first value.");
             }
         });
         menuHelp.add(menuItemTrapeze);
         menuItemTrapeze.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null, "When you calculate a trapeze the programm will take all values.");
             }
         });
         menuOption.add(menuItemNew);
         menuItemNew.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 txtfValue1.setText(" ");
                 txtfValue2.setText(" ");
                 txtfValue3.setText(" ");
                 txtfResult.setText(" ");
             }
         });
         menuOption.add(menuItemAbout);
         menuItemAbout.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 JOptionPane.showMessageDialog(null, "Area Calculator made by Guilherme Zalla");
             }
         });
         menuOption.add(menuItemExit);
         menuItemExit.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 System.exit(0);
             }
         });
         
         setJMenuBar(menuBar);
         
         panel = new JPanel();
         label1 = new JLabel("Enter your values");
         panel.add(label1);
         
         panel1 = new JPanel();
         labelValue1 = new JLabel("3º Value:");
         txtfValue1 = new JTextField(5);
         labelResult = new JLabel("Result");
         txtfResult = new JTextField(10);
         txtfResult.setEditable(false);
         panel1.add(labelValue1);
         panel1.add(txtfValue1);
         panel1.add(labelResult);
         panel1.add(txtfResult);
         
         panel2 = new JPanel();
         labelValue2 = new JLabel("2º Value:");
         txtfValue2 = new JTextField(5);
         panel2.add(labelValue2);
         panel2.add(txtfValue2);
         
         panel3 = new JPanel();
         labelValue3 = new JLabel("1º Value:");
         txtfValue3 = new JTextField(5);
         panel3.add(labelValue3);
         panel3.add(txtfValue3);
        
         panel4 = new JPanel();
         buttonGroup = new ButtonGroup();
         rbTriangle = new JRadioButton("Triangle");
         rbCircle = new JRadioButton("Circle");
         rbTrapeze = new JRadioButton("Trapeze");
         rbSquare = new JRadioButton("Square");
         rbRetangle = new JRadioButton("Retangle");
         buttonGroup.add(rbTriangle);
         buttonGroup.add(rbCircle);
         buttonGroup.add(rbTrapeze);
         buttonGroup.add(rbSquare);
         buttonGroup.add(rbRetangle);
         panel4.add(rbTriangle);
         panel4.add(rbCircle);
         panel4.add(rbTrapeze);
         panel4.add(rbSquare);
         panel4.add(rbRetangle);
         panel5 = new JPanel();
         btCalculate = new JButton("Calculate");
         btReset = new JButton("Reset");
         panel5.add(btCalculate);
         btCalculate.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 float value1 = Float.parseFloat(txtfValue1.getText());
                 float value2 = Float.parseFloat(txtfValue2.getText());
                 float value3 = Float.parseFloat(txtfValue3.getText());
                 float result;  
                  if(buttonGroup.getSelection() == rbCircle)
                     result = 0;
                     result = (float) (Math.PI * (value1 * value1));
                     String finalValue = Float.toString(result);
                     txtfResult.setText(finalValue);   
                 if(buttonGroup.getSelection() == rbTriangle)
                     result = 0;
                     result = (value1 * value2)/2;
                   //String finalValue = Float.toString(result);
                     txtfResult.setText(finalValue);
                 if(buttonGroup.getSelection() == rbTrapeze)
                     result = 0;
                     result = ((value1 + value2)/2) * value3;
                    // String finalValue = Float.toString(result);
                     txtfResult.setText(finalValue);    
                 if(buttonGroup.getSelection() == rbSquare)
                     result = value1 * value1;
                    // String finalValue = Float.toString(result);
                     txtfResult.setText(finalValue);   
                 if(buttonGroup.getSelection() == rbRetangle)
                     result = value1 * value2;
                    // String finalValue = Float.toString(result);
                     txtfResult.setText(finalValue);   
             }
         });
         panel5.add(btReset);
         btReset.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                txtfValue1.setText(" ");
                txtfValue2.setText(" ");
                txtfValue3.setText(" ");
                txtfResult.setText(" ");
             }
         });
  
         container = this.getContentPane();
         
         container.add(panel, BorderLayout.NORTH);
         container.add(panel1, BorderLayout.CENTER);
         container.add(panel2, FlowLayout.CENTER);
         container.add(panel3, FlowLayout.CENTER);
         container.add(panel4, BorderLayout.CENTER);
         container.add(panel5, BorderLayout.SOUTH);
     }
 }
