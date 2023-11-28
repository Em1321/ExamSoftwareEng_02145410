public class MRI {
    private String link;
    private String date;
    private String MagneticField;
    public MRI(String link, String date, String MagneticField){
        this.date=date;
        this.link=link;
        this.MagneticField=MagneticField;
    }
    public String getDisplayText(){
        return "MRI: "+MagneticField+","+date;
    }
    public String getLink(){return link;}
}
