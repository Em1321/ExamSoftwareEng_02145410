import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class ExaminationOutput {
    public static void main(String[] args) throws MalformedURLException {
        Patient patient1 = new Patient("Daphne Von Oram", 62);
        patient1.addMRI(new MRI("link", "14/9/23", "2 Tesla"));
        patient1.addBPMeasurement(new BloodPressure(130, 70,"15/9/23", "ST"));
        Patient patient2 = new Patient("Sebastian Compton", 31);
        patient2.addMRI(new MRI("link", "19/11/23", "4 Tesla"));
        patient2.addBPMeasurement(new BloodPressure(150, 80,"20/11/23", "VST"));
        JFrame frame = new JFrame("Administrator Examination Console");
        frame.setSize(450,400);
        JPanel displayPanel = new JPanel();//Create a label for each patient's text
        JLabel displayLabel1 = new JLabel(patient1.getAdministatorOutput());
        JLabel displayLabel2 = new JLabel(patient2.getAdministatorOutput());

        displayPanel.add(displayLabel1);
        displayPanel.add(displayLabel2);

        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
           }
        });

        JFrame f= new JFrame("Doctor Examination");
        JLabel l1;
        l1=new JLabel();
        l1.setBounds(50,50, 200,300);


        f.add(l1);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);


    }
}
