import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SimpleSwingApp {


    public static void main(String[] args) {
        // Ensure the GUI creation is done on the Event Dispatch Thread
        SwingUtilities.invokeLater(SimpleSwingApp::createAndShowGUI);



    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Simple Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);


        frame.setVisible(true);


        // Create the window (JFrame) and specify the close operation
        JMenuBar menuBar = new JMenuBar();

        JMenuItem OpenFile = new JMenuItem("Open");
        JMenuItem SaveFile = new JMenuItem("Save");
        JMenu menu = new JMenu("File");
        menu.add(OpenFile);
        menu.add(SaveFile);
        menuBar.add(menu);

        JMenu menu2 = new JMenu("Edit");
        JMenuItem Undoitem = new JMenuItem("Undo");
        JMenuItem Redoitem = new JMenuItem("Redo");
        menu2.add(Undoitem);
        menu2.add(Redoitem);

        menuBar.add(menu2);

        menuBar.add(new JMenu("Help"));


        menuBar.add(new JMenu("Exit"));




        JPanel bluepanel = new JPanel();
        bluepanel.setLayout(new GridLayout(5, 1));
        bluepanel.setBackground(Color.blue);
          bluepanel.setPreferredSize(new Dimension(frame.getContentPane().getWidth() / 3 , frame.getContentPane().getHeight()));

        JPanel greenpanel = new JPanel();
        greenpanel.setLayout(new BorderLayout());
       // greenpanel.setPreferredSize(new Dimension(frame.getContentPane().getWidth() - 200, frame.getContentPane().getHeight() /2));
        greenpanel.setBackground(Color.green);

        JPanel orangepanel = new JPanel();
        orangepanel.setLayout(new GridLayout(6,3));
        orangepanel.setPreferredSize(new Dimension(greenpanel.getWidth() , frame.getContentPane().getHeight() /2 ));
        orangepanel.setBackground(Color.orange);


       // greenpanel.setBorder(BorderFactory.createLineBorder(Color.black));









        // Add a label to the frame

       // ImageIcon leftButtonIcon = new ImageIcon("C:\\Users\\chris\\untitled\\resources\\integral-mathematical-sign.gif");
        JButton b1  = new JButton("Intergral");
        b1.setBackground(Color.white);

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton decimal = new JButton(".");
        JButton derivative = new JButton("dy/dx");
        JButton intergral = new JButton("intergral");
        JButton parenthesis = new JButton("( )");
        JButton Bracket = new JButton("[ ]");
        JButton equal = new JButton("=");

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JButton remainder = new JButton("%");


       //  greenpanel.setLayout(new GridLayout(4,4,10,10));
        bluepanel.add(plus);
        bluepanel.add(minus);
        bluepanel.add(multiply);
        bluepanel.add(divide);
        bluepanel.add(remainder);

        orangepanel.add(seven);
        orangepanel.add(eight);
        orangepanel.add(nine);
        orangepanel.add(six);
        orangepanel.add(five);
        orangepanel.add(four);
        orangepanel.add(three);
        orangepanel.add(two);
        orangepanel.add(one);
        orangepanel.add(zero);
        orangepanel.add(decimal);
        orangepanel.add(derivative);
        orangepanel.add(intergral);
        orangepanel.add(parenthesis);
        orangepanel.add(Bracket);
        orangepanel.add(equal);




        greenpanel.add(orangepanel,BorderLayout.SOUTH);
        frame.getContentPane().add(bluepanel,BorderLayout.EAST);
        frame.getContentPane().add(greenpanel,BorderLayout.CENTER);

        frame.setJMenuBar(menuBar);

        // Set the frame size and make it visible

    }
}