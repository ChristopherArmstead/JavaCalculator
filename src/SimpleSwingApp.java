import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SimpleSwingApp {
    public static int panelxpos (int pos, JPanel container){ return (container.getWidth() / 4) * pos; }
    public static int panelxpos (int pos, JFrame container){ return (container.getWidth() / 4) * pos; }

    public static int panelypos(int pos, JPanel container){return (container.getHeight() / 4) * pos;}
    public static int panelypos(int pos, JFrame container){return (container.getHeight() / 4) * pos;}
    public static void main(String[] args) {
        // Ensure the GUI creation is done on the Event Dispatch Thread
        SwingUtilities.invokeLater(SimpleSwingApp::createAndShowGUI);



    }

    private static void createAndShowGUI() {
 JFrame frame = new JFrame("Simple Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel label = new JLabel("Hello, Swing!");
        JLabel label2 = new JLabel("this label two");
        frame.getContentPane().add(label);
        frame.getContentPane().add(label2);
        frame.setLayout(null);
        frame.setSize(1000, 700);
        frame.setVisible(true);


        // Create the window (JFrame) and specify the close operation
        JMenuBar menuBar = new JMenuBar();

        JMenuItem item = new JMenuItem("Open");
        JMenuItem item2 = new JMenuItem("Save");
        JMenu menu = new JMenu("File");
        menu.add(item);
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
        bluepanel.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);

        JPanel Gonepanel = new JPanel(new FlowLayout());
        Gonepanel.setBackground(Color.red);

          JPanel Gtwopanel = new JPanel(new FlowLayout());
        Gtwopanel.setBackground(Color.pink);

          JPanel Gthreepanel = new JPanel(new FlowLayout());
        Gthreepanel.setBackground(Color.blue);

          JPanel Gfourpanel = new JPanel(new FlowLayout());
        Gfourpanel.setBackground(Color.orange);

          JPanel Gfivepanel = new JPanel(new FlowLayout());
        Gfivepanel.setBackground(Color.orange);

          JPanel Gsixpanel = new JPanel(new FlowLayout());
        Gsixpanel.setBackground(Color.red);

          JPanel Gsevenpanel = new JPanel(new FlowLayout());
        Gsevenpanel.setBackground(Color.pink);

          JPanel Geightpanel = new JPanel(new FlowLayout());
        Geightpanel.setBackground(Color.blue);

          JPanel Gninepanel = new JPanel(new FlowLayout());
        Gninepanel.setBackground(Color.blue);

          JPanel Gtenpanel = new JPanel(new FlowLayout());
        Gtenpanel.setBackground(Color.orange);

          JPanel Gelevenpanel = new JPanel(new FlowLayout());
        Gelevenpanel.setBackground(Color.red);

          JPanel Gtwelvepanel = new JPanel(new FlowLayout());
        Gtwelvepanel.setBackground(Color.pink);

        JPanel Gthirteenpanel = new JPanel(new FlowLayout());
        Gthirteenpanel.setBackground(Color.pink);

        JPanel Gfourteenpanel = new JPanel(new FlowLayout());
        Gfourteenpanel.setBackground(Color.blue);

        JPanel Gfifteenpanel = new JPanel(new FlowLayout());
        Gfifteenpanel.setBackground(Color.orange);

        JPanel Gsixteenpanel = new JPanel(new FlowLayout());
        Gsixteenpanel.setBackground(Color.red);






        greenpanel.setBorder(BorderFactory.createLineBorder(Color.black));

      //  frame.setSize(400, 400);
        redpanel.setBounds(0,0,250,250);
        bluepanel.setBounds(panelxpos(3,frame),0,frame.getWidth()/4,frame.getHeight()/2);
        greenpanel.setBounds(0,frame.getHeight() /2,frame.getWidth(),frame.getHeight()/2);

        Gonepanel.setBounds(panelxpos(0,greenpanel),panelypos(0,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gtwopanel.setBounds(panelxpos(1,greenpanel),panelypos(0,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gthreepanel.setBounds(panelxpos(2,greenpanel),panelypos(0,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gfourpanel.setBounds(panelxpos(3,greenpanel),panelypos(0,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);

        Gfivepanel.setBounds(panelxpos(0,greenpanel),panelypos(1,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gsixpanel.setBounds(panelxpos(1,greenpanel),panelypos(1,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gsevenpanel.setBounds(panelxpos(2,greenpanel),panelypos(1,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Geightpanel.setBounds(panelxpos(3,greenpanel),panelypos(1,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);

        Gninepanel.setBounds(panelxpos(0,greenpanel),panelypos(2,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gtenpanel.setBounds(panelxpos(1,greenpanel),panelypos(2,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gelevenpanel.setBounds(panelxpos(2,greenpanel),panelypos(2,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gtwelvepanel.setBounds(panelxpos(3,greenpanel),panelypos(2,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);

        Gthirteenpanel.setBounds(panelxpos(0,greenpanel),panelypos(3,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gfourteenpanel.setBounds(panelxpos(1,greenpanel),panelypos(3,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gfifteenpanel.setBounds(panelxpos(2,greenpanel),panelypos(3,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);
        Gsixteenpanel.setBounds(panelxpos(3,greenpanel),panelypos(3,greenpanel),greenpanel.getWidth()/4,greenpanel.getHeight()/4);




        // Add a label to the frame

       // ImageIcon leftButtonIcon = new ImageIcon("C:\\Users\\chris\\untitled\\resources\\integral-mathematical-sign.gif");
        JButton b1  = new JButton("Intergral");
        b1.setBackground(Color.white);
        b1.setHorizontalAlignment(SwingConstants.CENTER);
        b1.setVerticalAlignment(SwingConstants.CENTER);
        // Dimension b1Size = new Dimension(10, 5);
        // b1.setSize(b1Size);

         bluepanel.add(label);
         greenpanel.setLayout(null);
         greenpanel.add(Gonepanel);
         greenpanel.add(Gtwopanel);
         greenpanel.add(Gthreepanel);
         greenpanel.add(Gfourpanel);
         greenpanel.add(Gfivepanel);
         greenpanel.add(Gsixpanel);
         greenpanel.add(Gsevenpanel);
         greenpanel.add(Geightpanel);
         greenpanel.add(Gninepanel);
         greenpanel.add(Gtenpanel);
         greenpanel.add(Gelevenpanel);
         greenpanel.add(Gtwelvepanel);
         greenpanel.add(Gthirteenpanel);
         greenpanel.add(Gthirteenpanel);
         greenpanel.add(Gfourteenpanel);
         greenpanel.add(Gfifteenpanel);
         greenpanel.add(Gsixteenpanel);

         Gonepanel.add(b1);
        // frame.add(redpanel);
         frame.add(bluepanel);
         frame.add(greenpanel);
         frame.setJMenuBar(menuBar);

         //greenpanel.add(Gfirstpanel);
        // Set the frame size and make it visible

    }
}