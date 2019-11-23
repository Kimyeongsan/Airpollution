import javax.swing.JFrame;

public class Test {

    JFrame testFrame;
    public Test() {
        testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Graph graph = new Graph();
        testFrame.add(graph);
        testFrame.setBounds(100, 100, 764, 470);
        testFrame.setVisible(true);
       }
    
   
}      