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
        frame.setUndecorated(false);



        frame.setLayout(new BorderLayout());
        frame.setSize(500, 500);


        frame.setVisible(true);


        // Create the window (JFrame) and specify the close operation

        JMenuBar menuBar = new JMenuBar();

        JMenuItem OpenFile = new JMenuItem("Open");
        JMenuItem SaveFile = new JMenuItem("Save");
        JMenu menu = new JMenu("File");
        menu.setForeground(Color.white);
        menu.add(OpenFile);
        menu.add(SaveFile);
        menuBar.add(menu);

        JMenu menu2 = new JMenu("Edit");
        menu2.setForeground(Color.white);
        JMenuItem Undoitem = new JMenuItem("Undo");

        JMenuItem Redoitem = new JMenuItem("Redo");
        menu2.add(Undoitem);
        menu2.add(Redoitem);

        menuBar.add(menu2);

        JMenu menu3 = new JMenu("Help");
        menu3.setForeground(Color.white);
        menuBar.add(menu3);

        JMenu menu4 = new JMenu("About");
        menu4.setForeground(Color.white);
        menuBar.add(menu4);
     //   Font menuBarfont = new Font("default", Font.PLAIN, 12);

        menuBar.setFont(new Font("Monospaced", Font.TRUETYPE_FONT, 12));
        menuBar.setForeground(Color.WHITE);
        Color violet = Color.decode("#1a0f4d");

        menuBar.setBackground(violet);

        JTextArea textArea = new JTextArea(4, 10);
        JScrollPane scrollPane = new JScrollPane(textArea);

        //textArea.setPreferredSize(new Dimension(50,50));

        textArea.setEditable(true);


        JPanel bluepanel = new JPanel();
        bluepanel.setLayout(new GridLayout(6, 1));
        bluepanel.setBackground(Color.white);
        bluepanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1, false));
          bluepanel.setPreferredSize(new Dimension(frame.getContentPane().getWidth() / 3 , frame.getContentPane().getHeight()));

        JPanel greenpanel = new JPanel();
        greenpanel.setLayout(new BorderLayout());

        greenpanel.setBackground(Color.green);

        JPanel orangepanel = new JPanel();
        orangepanel.setLayout(new GridLayout(5,3));
        orangepanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,1, false));
        orangepanel.setPreferredSize(new Dimension(greenpanel.getWidth() , frame.getContentPane().getHeight() /2 ));
        orangepanel.setBackground(Color.white);


       // greenpanel.setBorder(BorderFactory.createLineBorder(Color.black));









        // Add a label to the frame

       // ImageIcon leftButtonIcon = new ImageIcon("C:\\Users\\chris\\untitled\\resources\\integral-mathematical-sign.gif");
        JButton b1  = new JButton("Intergral");
        b1.setBackground(Color.white);
        Color Black_Rock = Color.decode("#0c042f");
        JButton one = new JButton("1");
        one.setBorder( BorderFactory.createLineBorder(Color.BLACK,1, true));
        Font font = new Font("Serif", Font.BOLD, 18);
        one.setFont(font);
        one.setBackground(Black_Rock );
        //one.setContentAreaFilled(false);
        //one.setOpaque(true);
       // one.setBackground(Color.WHITE);
        JButton two = new JButton("2");
        two.setFont(font);
        two.setBackground(Color.WHITE);
        JButton three = new JButton("3");
        three.setFont(font);
        three.setBackground(Color.WHITE);
        JButton four = new JButton("4");
        four.setFont(font);
        four.setBackground(Color.WHITE);
        JButton five = new JButton("5");
        five.setFont(font);
        five.setBackground(Color.WHITE);
        JButton six = new JButton("6");
        six.setFont(font);
        six.setBackground(Color.WHITE);
        JButton seven = new JButton("7");
        seven.setFont(font);
        seven.setBackground(Color.WHITE);
        JButton eight = new JButton("8");
        eight.setFont(font);
        eight.setBackground(Color.WHITE);
        JButton nine = new JButton("9");
        nine.setFont(font);
        nine.setBackground(Color.WHITE);
        JButton zero = new JButton("0");
        zero.setFont(font);
        zero.setBackground(Color.WHITE);
        JButton decimal = new JButton(".");
        decimal.setFont(font);
        decimal.setBackground(Color.WHITE);
        JButton derivative = new JButton("dy/dx");
        derivative.setFont(font);
        derivative.setBackground(Color.WHITE);
        JButton intergral = new JButton("Intergral");
        intergral.setFont(font);
        intergral.setBackground(Color.WHITE);
        JButton parenthesis = new JButton("( )");
        parenthesis.setFont(font);
        parenthesis.setBackground(Color.WHITE);
        JButton Bracket = new JButton("[ ]");
        Bracket.setFont(font);
        Bracket.setBackground(Color.WHITE);
        JButton equal = new JButton("=");
        equal.setFont(font);
        equal.setBackground(Color.WHITE);

        JButton plus = new JButton("+");
        plus.setFont(font);
        plus.setBackground(Color.WHITE);

        JButton minus = new JButton("-");
        minus.setFont(font);
        minus.setBackground(Color.WHITE);
        JButton multiply = new JButton("*");
        multiply.setFont(font);
        multiply.setBackground(Color.WHITE);
        JButton divide = new JButton("/");
        divide.setFont(font);
        divide.setBackground(Color.WHITE);
        JButton remainder = new JButton("%");
        remainder.setFont(font);
        remainder.setBackground(Color.WHITE);



       //  greenpanel.setLayout(new GridLayout(4,4,10,10));
        bluepanel.add(plus);
        bluepanel.add(minus);
        bluepanel.add(multiply);
        bluepanel.add(divide);
        bluepanel.add(remainder);
        bluepanel.add(equal);

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





        greenpanel.add(orangepanel,BorderLayout.SOUTH);
        greenpanel.add(textArea,BorderLayout.CENTER);
        frame.getContentPane().add(bluepanel,BorderLayout.EAST);
        frame.getContentPane().add(greenpanel,BorderLayout.CENTER);


        frame.setJMenuBar(menuBar);

        // Set the frame size and make it visible

    }
}