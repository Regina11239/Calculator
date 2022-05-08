import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;


public class Calculator
{
	public static void main(String args[])
	{
		AppWindow tester = new AppWindow();
		tester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tester.setSize(1000,800);
		tester.setVisible(true);
	}
}


class AppWindow extends JFrame
{
  private Container contentPane;
  private JLabel outputLabel;
  private JFormattedTextField output, intPrompt;
  private JPanel bottom;
  private JButton MCButton, MRButton, MButton, MPlusButton, MMinusButton, 
                  PIButton, CEButton, CButton, logButton, lnButton,
                  TenToxButton, xTo2Button, rootButton, sinButton, arcsinButton, 
                  TwoToxButton, xTo3Button, root3Button, cosButton, arccosButton, 
                  eToxButton, xToyButton, root4Button, tanButton, arctanButton, 
                  sevenButton, eightButton, nineButton, plusButton, factButton,
                  fourButton, fiveButton, sixButton, minusButton, moduButton,
                  oneButton, twoButton, threeButton, multiplyButton, signButton, 
                  pointButton, zeroButton, equalButton, divideButton, TenOverxButton;
   private String storeString = "";
   private double Num1, Num2;
   private boolean Newbl, blOne;
   private int function; 

  public AppWindow()
	{
		super("Calculator");
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
      outputLabel = new JLabel ("output");
      
      try
		{
			setIconImage(ImageIO.read(new File("Calculator.png")));
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		output = new JFormattedTextField(new Double(0));
      output.setFont(new Font("Arial Narrow",Font.PLAIN,48));		
		contentPane.add(output, BorderLayout.PAGE_START);
      output.setHorizontalAlignment(JFormattedTextField.RIGHT);
      
      bottom = new JPanel();
      bottom.setLayout(new GridLayout(9,5));  
      
        
      MCButton = new JButton("MC");
      MRButton = new JButton("MR");
      MButton = new JButton("MS");
      MPlusButton = new JButton("M+");
      MMinusButton = new JButton("M-");
       
      PIButton = new JButton("\u03C0");
      CEButton = new JButton("CE"); 
      CButton = new JButton("C"); 
      logButton = new JButton("log"); 
      lnButton = new JButton("ln");
      
      TenToxButton = new JButton("10^x"); 
      xTo2Button = new JButton("x^2");
      rootButton = new JButton("\u221A");
      sinButton = new JButton("sin");
      arcsinButton = new JButton("arcsin"); 
      
      TwoToxButton = new JButton("2^x");
      xTo3Button = new JButton("x^3");
      root3Button = new JButton("\u221B");
      cosButton = new JButton("cos");
      arccosButton = new JButton("arccos"); 
      
      eToxButton = new JButton("e^x");
      xToyButton = new JButton("x^y");
      root4Button = new JButton("\u221C");
      tanButton = new JButton("tan");
      arctanButton = new JButton("arctan"); 
      
      sevenButton = new JButton("7");
      eightButton = new JButton("8");
      nineButton = new JButton("9");
      plusButton = new JButton("+");
      factButton = new JButton("n!");
      
      fourButton = new JButton("4");
      fiveButton = new JButton("5");
      sixButton = new JButton("6");
      minusButton = new JButton("-");
      moduButton = new JButton("%");
      
      oneButton = new JButton("1");
      twoButton = new JButton("2");
      threeButton = new JButton("3");
      multiplyButton = new JButton("*");
      signButton = new JButton("+/-"); 
      
      pointButton = new JButton(".");
      zeroButton = new JButton("0");
      equalButton = new JButton("=");
      divideButton = new JButton("/");
      TenOverxButton = new JButton("1/x");
      
      MCButton.setFont(new Font("Courier",Font.BOLD,28));
      MRButton.setFont(new Font("Courier",Font.BOLD,28));
      MButton.setFont(new Font("Courier",Font.BOLD,28)); 
      MPlusButton.setFont(new Font("Courier",Font.BOLD,28)); 
      MMinusButton.setFont(new Font("Courier",Font.BOLD,28)); 
                 
      PIButton.setFont(new Font("Courier",Font.BOLD,28)); 
      CEButton.setFont(new Font("Courier",Font.BOLD,28)); 
      CButton.setFont(new Font("Courier",Font.BOLD,28)); 
      logButton.setFont(new Font("Courier",Font.BOLD,28)); 
      lnButton.setFont(new Font("Courier",Font.BOLD,28));
      
      TenToxButton.setFont(new Font("Courier",Font.BOLD,28)); 
      xTo2Button.setFont(new Font("Courier",Font.BOLD,28));
      rootButton.setFont(new Font("Courier",Font.BOLD,28));
      sinButton.setFont(new Font("Courier",Font.BOLD,28)); 
      arcsinButton.setFont(new Font("Courier",Font.BOLD,28)); 
                  
      TwoToxButton.setFont(new Font("Courier",Font.BOLD,28));
      xTo3Button.setFont(new Font("Courier",Font.BOLD,28));
      root3Button.setFont(new Font("Courier",Font.BOLD,28)); 
      cosButton.setFont(new Font("Courier",Font.BOLD,28));
      arccosButton.setFont(new Font("Courier",Font.BOLD,28)); 
                  
      eToxButton.setFont(new Font("Courier",Font.BOLD,28)); 
      xToyButton.setFont(new Font("Courier",Font.BOLD,28)); 
      root4Button.setFont(new Font("Courier",Font.BOLD,28)); 
      tanButton.setFont(new Font("Courier",Font.BOLD,28));
      arctanButton.setFont(new Font("Courier",Font.BOLD,28)); 
      
      sevenButton.setFont(new Font("Courier",Font.BOLD,28));
      eightButton.setFont(new Font("Courier",Font.BOLD,28)); 
      nineButton.setFont(new Font("Courier",Font.BOLD,28));
      plusButton.setFont(new Font("Courier",Font.BOLD,28)); 
      factButton.setFont(new Font("Courier",Font.BOLD,28));
      
      fourButton.setFont(new Font("Courier",Font.BOLD,28));
      fiveButton.setFont(new Font("Courier",Font.BOLD,28)); 
      sixButton.setFont(new Font("Courier",Font.BOLD,28)); 
      minusButton.setFont(new Font("Courier",Font.BOLD,28)); 
      moduButton.setFont(new Font("Courier",Font.BOLD,28));
                  
      oneButton.setFont(new Font("Courier",Font.BOLD,28));
      twoButton.setFont(new Font("Courier",Font.BOLD,28)); 
      threeButton.setFont(new Font("Courier",Font.BOLD,28)); 
      multiplyButton.setFont(new Font("Courier",Font.BOLD,28)); 
      signButton.setFont(new Font("Courier",Font.BOLD,28)); 
      
      pointButton.setFont(new Font("Courier",Font.BOLD,28));
      zeroButton.setFont(new Font("Courier",Font.BOLD,28)); 
      equalButton.setFont(new Font("Courier",Font.BOLD,28)); 
      divideButton.setFont(new Font("Courier",Font.BOLD,28)); 
      TenOverxButton.setFont(new Font("Courier",Font.BOLD,28));

      bottom.add(MCButton); bottom.add(MRButton); bottom.add(MButton); bottom.add(MPlusButton); bottom.add(MMinusButton);   
      bottom.add(PIButton); bottom.add(CEButton); bottom.add(CButton); bottom.add(logButton); bottom.add(lnButton);  
      bottom.add(TenToxButton); bottom.add(xTo2Button); bottom.add(rootButton); bottom.add(sinButton); bottom.add(arcsinButton); 
      bottom.add(TwoToxButton); bottom.add(xTo3Button); bottom.add(root3Button); bottom.add(cosButton); bottom.add(arccosButton);
      bottom.add(eToxButton); bottom.add(xToyButton); bottom.add(root4Button); bottom.add(tanButton); bottom.add(arctanButton);
      bottom.add(sevenButton); bottom.add(eightButton); bottom.add(nineButton); bottom.add(plusButton); bottom.add(factButton);      
      bottom.add(fourButton); bottom.add(fiveButton); bottom.add(sixButton); bottom.add(minusButton); bottom.add(moduButton);
      bottom.add(oneButton); bottom.add(twoButton); bottom.add(threeButton); bottom.add(multiplyButton); bottom.add(signButton);
      bottom.add(pointButton); bottom.add(zeroButton); bottom.add(equalButton); bottom.add(divideButton); bottom.add(TenOverxButton);    
        
      contentPane.add(bottom); 
      
      oneButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="1";
         setText();
      }});
      
      twoButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="2";
         setText();
      }});
      
      threeButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="3";
         setText();
      }});
      
      fourButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="4";
         setText();
      }});
      
      fiveButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="5";
         setText();
      }});
      
      sixButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="6";
         setText();
      }});
      
      sevenButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="7";
         setText();
      }});
      
      eightButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="8";
         setText();
      }});
      
      nineButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="9";
         setText();
      }});
      
      zeroButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+="0";
         setText();
      }});

      
      pointButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString+=".";
         setText();
      }});

      equalButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if (function == 1)
         {
            Num2 = Math.pow(Num2,Num1);
            function = 0;
         }
         else if (function == 2)
         {
            Num2 = Num2 + Num1;
            function = 0;
         }
         else if (function == 3)
         {
            Num2 = Num2 - Num1;
            function = 0;
         }
         else if (function == 4)
         {
            Num2 = Num2 * Num1;
            function = 0;
         }
         else if (function == 5)
         {
            Num2 = Num2 / Num1;
            function = 0;
         }
        // System.out.println("Num1 " + Num1 + ", Num2 " + Num2);
         output.setText(String.valueOf(Num2));
         Newbl=false;
         storeString="";
         blOne=false;
         
      }});
      
      plusButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        function = 2;
        output.setText(String.valueOf(Num2));
        storeString = "";
        Newbl = true;           
      }});
      
      minusButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        function = 3;
        output.setText(String.valueOf(Num2));
        storeString = "";
        Newbl = true;           
      }});
      
      multiplyButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        function = 4;
        output.setText(String.valueOf(Num2));
        storeString = "";
        Newbl = true;           
      }});

      divideButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        function = 5;
        output.setText(String.valueOf(Num2));
        storeString = "";
        Newbl = true;           
      }});

      
      PIButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString=String.valueOf(Math.PI);
         setText();
      }});    
      
      CEButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         storeString="";
         output.setText(storeString);
      }});
      
      CButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        Num1 = 0;
        Num2 = 0;
        output.setText(String.valueOf(Num1));
        storeString = "0";
        Newbl = false;
      }});
     
      logButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.log10(Num1);
            output.setText(String.valueOf(Num1));
            //storeString = String.valueOf(Num1);
        }
         else
         {
            Num2 = Math.log10(Num2);
            output.setText(String.valueOf(Num2));
            //storeString = String.valueOf(Num2);
         }
         storeString = "";//
      }});
      
      lnButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.log(Num1);
            output.setText(String.valueOf(Num1));
        }
         else
         {
            Num2 = Math.log(Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});
      
      TenToxButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.pow(10,Num1);
            output.setText(String.valueOf(Num1));
        }
         else
         {
            Num2 = Math.pow(10,Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
     }});
     
      xTo2Button.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.pow(Num1,2);
            output.setText(String.valueOf(Num1));
        }
         else
         {
            Num2 = Math.pow(Num2,2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
     }});
      
      rootButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.pow(Num1,0.5);
            output.setText(String.valueOf(Num1));
        }
         else
         {
            Num2 = Math.pow(Num2,0.5);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
     }});
     
      TwoToxButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.pow(2,Num1);
            output.setText(String.valueOf(Num1));
        }
         else
         {
            Num2 = Math.pow(2,Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
     }});
      
      xTo3Button.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.pow(Num1,3);
            output.setText(String.valueOf(Num1));
        }
         else
         {
            Num2 = Math.pow(Num2,3);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
     }});

      root3Button.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.cbrt(Num1);
            output.setText(String.valueOf(Num1));
        }
         else
         {
            Num2 = Math.cbrt(Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
     }});

      eToxButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.pow(Math.E,Num1);
            output.setText(String.valueOf(Num1));
        }
         else
         {
            Num2 = Math.pow(Math.E,Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
     }});

      xToyButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        function = 1;
        output.setText(String.valueOf(Num2));
        storeString = "";
        Newbl = true;        
      }});

      root4Button.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
        if(Newbl)
        {
            Num1 = Math.sqrt(Math.sqrt(Num1));
            output.setText(String.valueOf(Num1));
        }
         else
         {
            Num2 = Math.sqrt(Math.sqrt(Num2));
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
     }});
      
      sinButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if(Newbl)
         {
            Num1 = Math.sin(Num1);
            output.setText(String.valueOf(Num1));
         }
         else
         {
            Num2 = Math.sin(Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});

      arcsinButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if(Newbl)
         {
            Num1 = Math.asin(Num1);
            output.setText(String.valueOf(Num1));
         }
         else
         {
            Num2 = Math.asin(Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});

 
      cosButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if(Newbl)
         {
            Num1 = Math.cos(Num1);
            output.setText(String.valueOf(Num1));
         }
         else
         {
            Num2 = Math.cos(Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});
      
      arccosButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if(Newbl)
         {
            Num1 = Math.acos(Num1);
            output.setText(String.valueOf(Num1));
         }
         else
         {
            Num2 = Math.acos(Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});
      
      tanButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if(Newbl)
         {
            Num1 = Math.tan(Num1);
            output.setText(String.valueOf(Num1));
         }
         else
         {
            Num2 = Math.tan(Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});
      
      arctanButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if(Newbl)
         {
            Num1 = Math.atan(Num1);
            output.setText(String.valueOf(Num1));
         }
         else
         {
            Num2 = Math.atan(Num2);
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});

      factButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if(Newbl)
         {
            //for(int i = (int)Num1 - 1; i > 0; i--)
            //  Num1 = (int)Num1 * i;
            for(int i = (int)Num1 - 1; i > 0; i--)
               Num1 = (int)Num1 * i;
            output.setText(String.valueOf(Num1));
         }
         else
         {
            for(int a = (int)Num2 - 1; a > 0; a--)
               Num2 = (int)Num2 * a;
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});
      
      moduButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if(Newbl)
         {
            Num1 = Num1/100;
            output.setText(String.valueOf(Num1));
         }
         else
         {
            Num2 = Num2/100;
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});

      signButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
         if(Newbl)
         {
            Num1 = Num1 * -1;
            output.setText(String.valueOf(Num1));
         }
         else
         {
            Num2 = Num2 * -1;
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
      }});
 
      TenOverxButton.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e)
      {
          if(Newbl)
         {
            Num1 = 1/ Num1;
            output.setText(String.valueOf(Num1));
         }
         else
         {
            Num2 = 1/ Num2;
            output.setText(String.valueOf(Num2));
         }
         storeString = "";
         
      }});
     
      
	}
  
   public void setText()
   {
      if(storeString.equals("0"))
         output.setText("0");
      else
      {
         output.setText(storeString);
         double stringNum = Double.parseDouble(storeString);
         if(Newbl)
            Num1 = stringNum;
         else
            Num2 = stringNum;
      }
   }

}

