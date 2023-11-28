public class BloodPressure {
    private int Systolic;
    private int Diastolic;
    private String date;
    private String Duration;
    public BloodPressure(int Systolic, int Diastolic, String date, String Duration){
        this.Systolic=Systolic;
        this.Diastolic=Diastolic;
        this.date=date;
        this.Duration=Duration;
    }
    public String getDisplayText(){
        return "BP: "+Duration+", "+date;
    }
    public String getSystolicP(){return Integer.toString(Systolic);}
    public String getDiastolicP(){return Integer.toString(Diastolic);}
}
