import java.util.ArrayList;
import java.util.List;


public class Patient {
    private String name;
    private int age;
    private String URL;
    private ArrayList<MRI> MRIs= new ArrayList<MRI>();
    private ArrayList<BloodPressure>BPs= new ArrayList<BloodPressure>();
    public void addMRI(MRI mri){MRIs.add(mri);}
    public void addBPMeasurement(BloodPressure BP){BPs.add(BP);}
    public Patient(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getAdministatorOutput(){
        String display=new String("<html>");
        display+="Patient: "+name+": ";
        for(MRI mri:MRIs) {
            for (BloodPressure BP : BPs) {
                display += mri.getDisplayText() + " " + BP.getDisplayText();
            }
        }
        return display+"<br></html>";
    }
    public String getDoctorOuputInfo(){
        String display=new String("<html>");
        display+="Name:"+name+"<br>"+"Age: "+Integer.toString(age);
        return display+"<br></html>";
    }
    public String getDoctorOutputExam(){
        String display=new String("<html>");
        for (BloodPressure BP : BPs) {
            display+="Blood pressure"+"<br>"+BP.getSystolicP()+" over "+BP.getDiastolicP();
        }
        return display+"<br></html>";
    }
    public String getPictureURL(){return URL;}
}
