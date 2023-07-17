package xmlFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProminentTrainee {

    int traineeId;
    String name;
    String address;
    Date DOB;
    Date joiningDate;
    int age;

    public ProminentTrainee(int id,String name,String address,String DOB,String joiningDate,int age){

        this.traineeId = id;
        this.name = name;
        this.address = address;
        this.DOB = new Date(DOB);
        this.joiningDate = new Date(joiningDate);
        this.age = age;

    }

    public ProminentTrainee(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setDOB(String dob) throws ParseException {
        String[] st = dob.split(" ");
        String date = st[0] + ", " + st[1] + " " + st[2] + " " + st[5];
        Date date1 = new SimpleDateFormat("E, MMM dd yyyy").parse(date);
        this.DOB = date1;
    }

    public void setJoiningDate(String joiningDate) throws ParseException {
        String[] st = joiningDate.split(" ");
        String date = st[0] + ", " + st[1] + " " + st[2] + " " + st[5];
        Date date1 = new SimpleDateFormat("E, MMM dd yyyy").parse(date);
        this.joiningDate = date1;
    }

    public void setAge(String age){
        int age1 = Integer.parseInt(age);
        this.age = age1;
    }

}
