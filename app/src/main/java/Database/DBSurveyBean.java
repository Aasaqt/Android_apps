package Database;

/**
 * Created by aasaqt on 29/5/15.
 */


public class DBSurveyBean {
    String name,name_refree,address,email,phone,other_sixth,sixth,rent,other_seven,seven,other_eighth,eighth,
            other_ninth,ninth,other_tenth,tenth,other_eleventh,eleventh,other_twelvth,twelvth,other_thirteenth,thirteenth,rooms,other_fifteenth,
            fifteenth,other_sixteenth,sixteenth,comments;

    public DBSurveyBean()
    {

    }

    public DBSurveyBean(String name_refree,String name,String address,String email,String phone,String other_sixth,String sixth,
                        String rent,String other_seven,String seven,String other_eighth,String eighth,String other_ninth,
                        String ninth,String tenth,String eleventh,String twelvth,String thirteenth,String rooms,
                        String fifteenth,String sixteenth,String comments)
    {
        this.name= name;
        this.name_refree= name_refree;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.other_sixth = other_sixth;
        this.sixth = sixth;
        this.rent = rent;
        this.other_seven= other_seven;
        this.seven = seven;
        this.other_eighth = other_eighth;
        this.eighth = eighth;
        this.other_ninth = other_ninth;
        this.ninth = ninth;
        //this.other_tenth = other_tenth;
        this.tenth = tenth;
        //this.other_eleventh = other_eleventh;
        this.eleventh = eleventh;
        //this.other_twelvth = other_twelvth;
        this.twelvth = twelvth;
        //this.other_thirteenth = other_thirteenth;
        this.thirteenth = thirteenth;
        this.rooms = rooms;
        //this.other_fifteenth = other_fifteenth;
        this.fifteenth = fifteenth;
        //this.other_sixteenth=other_sixteenth;
        this.sixteenth = sixteenth;
        this.comments = comments;

    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName_refree() {
        return name_refree;
    }
    public void setName_refree(String name_refree) {
        this.name_refree = name_refree;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSixth() {
        return sixth;
    }
    public void setSixth(String sixth) {
        this.sixth = sixth;
    }

    public String getOther_sixth() {
        return other_sixth;
    }
    public void setOther_sixth(String other_sixth) {
        this.other_sixth = other_sixth;
    }

    public String getRent() {
        return rent;
    }
    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getSeven() {
        return seven;
    }
    public void setSeven(String seven) {
        this.seven = seven;
    }

    public String getOther_seven() {
        return other_seven;
    }
    public void setOther_seven(String other_seven) {
        this.other_seven = other_seven;
    }

    public String getEighth() {
        return eighth;
    }
    public void setEighth(String eighth) {
        this.eighth = eighth;
    }

    public String getOther_eighth() {
        return other_eighth;
    }
    public void setOther_eighth(String other_eighth) {
        this.other_eighth = other_eighth;
    }

    public String getNinth() {
        return ninth;
    }
    public void setNinth(String ninth) {
        this.ninth = ninth;
    }

    public String getOther_ninth() {
        return other_ninth;
    }
    public void setOther_ninth(String other_ninth) {
        this.other_ninth = other_ninth;
    }

    public String getTenth() {
        return tenth;
    }
    public void setTenth(String tenth) {
        this.tenth = tenth;
    }

    /*public String getOther_tenth() {
        return other_tenth;
    }
    public void setOther_tenth(String other_tenth) {
        this.other_tenth = other_tenth;
    }*/

    public String getEleventh() {
        return eleventh;
    }
    public void setEleventh(String eleventh) {
        this.eleventh = eleventh;
    }

    /*public String getOther_eleventh() {
        return other_eleventh;
    }
    public void setOther_eleventh(String other_eleventh) {
        this.other_eleventh = other_eleventh;
    }*/

    public String getTwelvth() {
        return twelvth;
    }
    public void setTwelvth(String twelvth) {
        this.twelvth = twelvth;
    }

    /*public String getOther_twelvth() {
        return other_twelvth;
    }
    public void setOther_twelvth(String other_twelvth) {
        this.other_twelvth = other_twelvth;
    }*/

    public String getThirteenth() {
        return thirteenth;
    }
    public void setThirteenth(String thirteenth) {
        this.thirteenth = thirteenth;
    }

    /*public String getOther_thirteenth() {
        return other_thirteenth;
    }
    public void setOther_thirteenth(String other_thirteenth) {
        this.other_thirteenth = other_thirteenth;
    }*/

    public String getRooms() {
        return rooms;
    }
    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getFifteenth() {
        return fifteenth;
    }
    public void setFifteenth(String fifteenth) {
        this.fifteenth = fifteenth;
    }

    /*public String getOther_fifteenth() {
        return other_fifteenth;
    }
    public void setOther_fifteenth(String other_fifteenth) {
        this.other_fifteenth = other_fifteenth;
    }*/

    public String getSixteenth() {
        return sixteenth;
    }
    public void setSixteenth(String sixteenth) {
        this.sixteenth = sixteenth;
    }

    /*public String getOther_sixteenth() {
        return other_sixteenth;
    }
    public void setOther_sixteenth(String other_sixteenth) {
        this.other_sixteenth = other_sixteenth;
    }*/

    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }






}
