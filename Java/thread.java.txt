

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
    

/**
 *  A thread that is used to solve Reve's problem - It is animated.
 * 
 * @author H. Paul Haiduk, @author Terence WIlbert
 * @version 3.0
 */

    
public class RevesActionThread extends ActionThread {
    
    /**
     * Constructor for objects of class RevesActionThread
     */
    public RevesActionThread() {
        super();

    }

    public String getApplicationTitle() {
        return "Reve's Puzzle (Skeleton)";
    }
    
    

    // **************************************************************************
    // This is application specific code
    // **************************************************************************    

    // These are the variables that are parameters of the application and can be
    // set via the application specific GUI
    // Make sure they are initialized
    private int disksToUse = 10;
   
    
    
    private int disks;
    
    // Displayed objects
    private Pole a, b, c, d;
    private int movesMade;
    private String moveString;
    private int k = 0;
    
    public void init() {
        disks = disksToUse;
        movesMade = 0;
        moveString = "";
        Disk toAdd;

        a = new Pole("a",disks);
        b = new Pole("b",disks);
        c = new Pole("c",disks);
        d = new Pole("d",disks);
        
        // ADD INITIALIZATION CODE HERE
        for (int i=0; i<disks; i++) {
            toAdd = new Disk(disks - i);
            a.addDisk(toAdd);
        }
    }
        

    public void executeApplication() {
        // ADD CODE THAT WILL DO A SINGLE EXECUTION
        //towersOfHanoi(disks, a, d, b);
        reves(disks, a, d, b, c);
    }

    /**
     * Move a disk from one pole to another pole
     *
     * @param from      the source pole
     * @param to        the destination pole
     */
    public void moveDisk(Pole from, Pole to) {
        Disk toMove = null;
        
        // ADD CODE HERE TO MOVE A DISK FROM ONE POLE TO THE OTHER

        toMove = from.removeDisk();
        to.addDisk(toMove);

        movesMade++;
        moveString = "Move #" + movesMade 
                        + ": Moved disk " + toMove.getSize() 
                        + " from " + from.getName() 
                        + " to " + to.getName() ;
                        
        animationPause();            
    }

    
    // ADD METHODS HERE

    private void towersOfHanoi(int n, Pole from, Pole to, Pole extra) {
        if (n == 0) return;
        towersOfHanoi(n - 1, from, extra, to);
        moveDisk(from, to);
        towersOfHanoi(n - 1, extra, to, from);
    }
    
    private int findK(int n) {
        int testValue = 1;
        int cmpValue = 1;
        int result = 0;

        while (!(cmpValue > n)) {
            testValue++;
            cmpValue = testValue * (testValue + 1) / 2;
        }

        result = testValue - 1;
        return result;
    }
    
    private void reves(int n, Pole from, Pole to, Pole extra1, Pole extra2) {
        if (n == 0) return;
        k = findK(n);
        towersOfHanoi(n - k, from, extra1, extra2);
        towersOfHanoi(k, from, to, extra2);
        towersOfHanoi(n - k, extra1, to, extra2);
    }
    /*
    private int getDiskSize(Pole from) {
        Disk topDisk = from.removeDisk();
        int result = topDisk.getSize();
        from.addDisk(topDisk);
        return result;
    }
    
    private void moveBetween(Pole first, Pole second) {
        if (first.getCount() == 0) {
            moveDisk(second,first);
            return;
        }
        if (second.getCount() == 0) {
            moveDisk(first,second);
            return;
        }
        
        int firstTop = getDiskSize(first);
        int secondTop = getDiskSize(second);
        if (firstTop > secondTop) {
            moveDisk(second, first);
        } else {
            moveDisk(first,second);
        }
    }
    
    private void towersOfHanoi() {
        int nextMove = 1;
        
        while (d.getCount() < disks) {
            if (disks % 2 == 0) {
                switch(nextMove) {
                case 1:
                    moveBetween(a,b);
                    nextMove++;
                    break;
                case 2:
                    moveBetween(a,d);
                    nextMove++;
                    break;
                case 3:
                    moveBetween(b,d);
                    nextMove = 1;
                    break;
                }
            } else {
                switch(nextMove) {
                case 1:
                    moveBetween(a,d);
                    nextMove++;
                    break;
                case 2:
                    moveBetween(a,b);
                    nextMove++;
                    break;
                case 3:
                    moveBetween(d,b);
                    nextMove = 1;
                    break;
                }
            }
        }
    }
    */

    /***************************************************************************
     * *************************************************************************
     * ALL THE CODE PAST THIS POINT SHOULD NOT BE CHANGED
     * *************************************************************************
     * *************************************************************************
     */
    
    
    
    private static int DISPLAY_HEIGHT = 300;
    private static int DISPLAY_WIDTH = 500;
    
    public JPanel createAnimationPanel() {
        return new AnimationPanel();
    }
    
    private static int NORTH_PANEL_HEIGHT = 50;
    private static int INDENT = 50;
    private static int SCALE = 2;
    private static int TEXT_HEIGHT = 30;
    private static int MAX_DISKS = 15;
    

    // This privately defined class does the drawing the application needs
    public class AnimationPanel extends JPanel {
        public AnimationPanel() {
            super();
            setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
        }
        
        public void paintComponent(Graphics g) {
            int sw;
            super.paintComponent(g);
            int delta = Disk.BASEWIDTH*SCALE*MAX_DISKS;
            
            // draw the move string if it has a value
            if(moveString != null) {
                g.drawString(moveString, INDENT, NORTH_PANEL_HEIGHT + TEXT_HEIGHT);
            }
            
            
                       // draw the four poles if they have been created
            FontMetrics fm = g.getFontMetrics();            
            if(d!= null) {
                a.drawOn(g, delta/2, DISPLAY_HEIGHT-2*TEXT_HEIGHT, SCALE);
                sw = fm.stringWidth(a.getName());
                g.drawString(a.getName(), delta/2 - sw/2, DISPLAY_HEIGHT-TEXT_HEIGHT);
                
                b.drawOn(g, 3*delta/2, DISPLAY_HEIGHT-2*TEXT_HEIGHT, SCALE);
                sw = fm.stringWidth(b.getName());
                g.drawString(b.getName(), 3*delta/2 - sw/2, DISPLAY_HEIGHT-TEXT_HEIGHT);
                
                c.drawOn(g, 5*delta/2, DISPLAY_HEIGHT-2*TEXT_HEIGHT, SCALE);
                sw = fm.stringWidth(c.getName());
                g.drawString(c.getName(), 5*delta/2 - sw/2, DISPLAY_HEIGHT-TEXT_HEIGHT);
                
                d.drawOn(g, 7*delta/2, DISPLAY_HEIGHT-2*TEXT_HEIGHT, SCALE);
                sw = fm.stringWidth(d.getName());
                g.drawString(d.getName(), 7*delta/2 - sw/2, DISPLAY_HEIGHT-TEXT_HEIGHT);
            }

        }
    }
    
    // **************************************************************************
    // This is the application specific GUI code
    // **************************************************************************    

    private JTextField disksTextField;
    private JLabel setupStatusLabel;
    private JPanel setupPanel;
    
    public void setUpApplicationSpecificControls() {
        getAnimationPanel().setLayout(new BorderLayout());
        
        
        disksTextField = new JTextField("");
        disksTextField.addActionListener(
            new ActionListener()  {
                public void actionPerformed(ActionEvent event) {
                    disksTextFieldHandler();
                    getAnimationPanel().repaint();
                }
            }
        );


        
        setupStatusLabel = new JLabel("");
        
        setupPanel = new JPanel();
        setupPanel.setLayout(new GridLayout(2,2));
        
        setupPanel.add(new JLabel("Number of disks (1-15):"));
        setupPanel.add(disksTextField);
        setupPanel.add(setupStatusLabel);
        
        getAnimationPanel().add(setupPanel,BorderLayout.NORTH);
               
    }

   
   
    private void disksTextFieldHandler() {
    try  {
            if(applicationControlsAreActive())   // Only change if we are in the setup phase
            {
                String input = disksTextField.getText().trim();
                int value = Integer.parseInt(input);
                if( value>=1 &&value <= MAX_DISKS) {
                    disksToUse = value;
                    setupStatusLabel.setText("Set number of disks to " + disksToUse);
                }
                else {
                    setupStatusLabel.setText("Bad value for number of disks");
                }
                init();
                getAnimationPanel().repaint();
                
            }
        }
        catch(Exception e) {
            // don't change the delta if we had an exception
            setupStatusLabel.setText("Need integer value for number of disks");
        }
    
    }  
            
} // end class RevesActionThread
