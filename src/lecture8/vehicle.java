package lecture8;

public class vehicle {

    public String color;
    public String type;
    public String year;


    public vehicle(){
        this.color = "black";
        this.type = "motorbike";
        this.year =  "2022";

    }


    public vehicle(String color, String type, String year){
        this.color = color;
        this.type = type;
        this.year = year;
    }


    public void exident(){
        System.out.println("booom");
    }

    public  String toString(){
        String string=(
                "color: "+ this.color+"\n" +
                "type:"+this.type+"\n" +
                "year:"+ this.year);
        return string;


    }


}
