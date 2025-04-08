import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameEx {
    public static void main(String[] args) {
//        new jframe created
        JFrame frame = new JFrame("My first jframe");

//        new jlabel created
        JLabel label = new JLabel("Bca third semester group");

//        adding label to frame
        frame.add(label);

//        setting size of frame
        frame.setSize(500, 500);

//        closing opr
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        visibility
        frame.setVisible(true);
    }
}
