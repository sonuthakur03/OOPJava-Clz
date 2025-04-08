import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first jframe");

        JLabel label = new JLabel("Bca third semester group");

        frame.add(label);

        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
