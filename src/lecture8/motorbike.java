package lecture8;

public class motorbike  extends  vehicle{

    public String brand;
    public String color;
    public String sound;
    public String type = "motorbike";
    public double wheelSize = 19.2;
    public int numOfWheels;

    @Override
    public String toString() {
        return "motorbike{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", sound='" + sound + '\'' +
                ", type='" + type + '\'' +
                ", wheelSize=" + wheelSize +
                ", numOfWheels=" + numOfWheels +
                '}';
    }

    public motorbike (String brand, String color , String sound, int numOfWheels){


        this.brand = brand;
        this.color = color;
        this.sound = sound;
        this.numOfWheels =numOfWheels;


    }
    public motorbike (){

        this.brand ="honda";
        this.color = "black";
        this.sound = "vremmm vremmmm";
        this.numOfWheels = 2;
    }
    public void demolish(){
        this.exident();
    }


    public void horn(){
        System.out.println("beep beep");
    }


}
