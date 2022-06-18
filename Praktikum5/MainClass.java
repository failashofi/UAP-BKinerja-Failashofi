package PraktikumPBO;

/**
 *
 * @author FAILASHOFI 215150601111020
 */
public class MainClass {
    public static void main(String[] args) {
        CarRider indah = new CarRider("Indah ana", 20, "082100000000");
        CarRider sayu = new CarRider("Sayu rezki", 19, "082111111111");
        CarRider anggun = new CarRider("Puspa anggun", 18, "082133333333");
        CarRider naya = new CarRider("Naya putri", 19, "082122222222");

        CarData data = new CarData();
        data.addCar("CIVIC", "P 3101 GA", "Honda");
        data.addCar("TRITON", "P  1911 BL", "Mitsubishi");
        data.addCar("APV", "P 2401 ML", "Suzuki");
        data.addCar("HIACE", "P 1104 SB", "Toyota");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(indah, data.carList.get(0), 4);
        arsip.Rent(sayu, data.carList.get(1), 3);
        arsip.Rent(anggun, data.carList.get(2), 5);
        arsip.Rent(naya, data.carList.get(0), 5);
        
        System.out.println("");
        arsip.info();
    }
}
