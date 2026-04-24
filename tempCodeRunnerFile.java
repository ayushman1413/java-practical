import java.awt.*;
import java.awt.event.*;

class Main extends Frame implements ActionListener {

    Label l;
    TextField tf;
    Button b;

    Main() {
        l = new Label("Enter Name:");
        l.setBounds(50, 50, 100, 30);

        tf = new TextField();
        tf.setBounds(150, 50, 150, 30);

        b = new Button("Submit");
        b.setBounds(150, 100, 80, 30);

        b.addActionListener(this);

        add(l);
        add(tf);
        add(b);

        setSize(400, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Hello " + tf.getText());
    }

    public static void main(String[] args) {
        new Main();
    }
}