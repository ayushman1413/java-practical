import java.awt.*;
import java.awt.event.*;

public class AwtControlDemo extends Frame implements ActionListener {
    Label lblName, lblOutput;
    TextField txtName;
    Button btnSubmit;

    public AwtControlDemo() {
        setLayout(new FlowLayout());

        lblName = new Label("Name:");
        txtName = new TextField(20);
        btnSubmit = new Button("Submit");
        lblOutput = new Label("Result will appear here");

        add(lblName);
        add(txtName);
        add(btnSubmit);
        add(lblOutput);

        btnSubmit.addActionListener(this);

        setTitle("AWT Demo");
        setSize(300, 150);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = txtName.getText();
        lblOutput.setText("Output: " + input);
    }

    public static void main(String[] args) {
        new AwtControlDemo();
    }
}