package lecture8;

public class car extends vehicle {

    public String color;
    public String brand;
    public double wheelSize;
    public String sound ;
    public int numOfWheels;


//    @Override
//    public String toString() {
//        return "car{" +
//                "color='" + color + '\'' +
//                ", brand='" + brand + '\'' +
//                ", wheelSize=" + wheelSize +
//                ", sound='" + sound + '\'' +
//                ", numOfWheels=" + numOfWheels +
//                '}';
//    }

    public car (String color , String brand, double wheelSize, int numOfWheels, String sound){
        this.color = color;
        this.brand = brand;
        this.wheelSize= wheelSize;
        this.numOfWheels = numOfWheels;
        this.sound = sound;

    }
    public car ( ){
        this.color = "black";
        this.brand = "toyota";
        this.wheelSize= 24.5;
        this.numOfWheels  =4;
        this.sound = "voooooommmmmm";
    }

    public void horn (){
        System.out.println("tooooooooo toooooooooo");
    }
    public void demolish(){
        this.exident();

    }



}
