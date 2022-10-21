package week3.day1;

public class MyVehicle {
      public static void main(String[] args){
    	  @SuppressWarnings("unused")
		Vehicle vehicle = new Vehicle();
    	  vehicle.applyBrake();
    	  vehicle.soundHorn();
    	  
    	  Car car= new Car();
    	  car.sunRoof();
    	  car.applyBrake();
    	  car.soundHorn();
    	  car.turnOnAC();
    	 
    	  BMWcar bmw = new BMWcar();
    	  bmw.autoPark();
    	  bmw.sunRoof();
    	  bmw.applyBrake();
    	  bmw.soundHorn();
    	  bmw.turnOnAC();
    	 
    	  Auto auto = new Auto();
    	  auto.bajaj();
    	  auto.handStarter();
    	  auto.soundHorn();
      }
}
