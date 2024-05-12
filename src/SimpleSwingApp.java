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


        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.white);
        redpanel.setBorder(BorderFactory.createLoweredBevelBorder());

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
          bluepanel.setPreferredSize(new Dimension(frame.getContentPane().getWidth() / 3 , frame.getContentPane().getHeight()));

        JPanel greenpanel = new JPanel();
        greenpanel.setPreferredSize(new Dimension(frame.getContentPane().getWidth() - 200, frame.getContentPane().getHeight() /2));
        greenpanel.setBackground(Color.green);


        greenpanel.setBorder(BorderFactory.createLineBorder(Color.black));


        int height = menuBar.getHeight();
        System.out.println(height);








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


         greenpanel.setLayout(new GridLayout(4,4,10,10));

        greenpanel.add(seven);
        greenpanel.add(eight);
        greenpanel.add(nine);
        greenpanel.add(six);
        greenpanel.add(five);
        greenpanel.add(four);
        greenpanel.add(three);
        greenpanel.add(two);
        greenpanel.add(one);
        greenpanel.add(zero);
        greenpanel.add(decimal);
        greenpanel.add(derivative);
        greenpanel.add(intergral);
        greenpanel.add(parenthesis);
        greenpanel.add(Bracket);
        greenpanel.add(equal);


   


        frame.getContentPane().add(bluepanel,BorderLayout.EAST);
        frame.getContentPane().add(greenpanel,BorderLayout.SOUTH);
        frame.setJMenuBar(menuBar);

        // Set the frame size and make it visible

    }
}