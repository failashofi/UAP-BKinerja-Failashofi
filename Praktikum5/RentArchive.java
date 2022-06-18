package PraktikumPBO;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class RentArchive {
    public static ArrayList<CarRent> rentData= new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDur){
        if (car.getStatus() == true){
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        }else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info(){
        System.out.println("-------------------------------");
        System.out.println("    INFORMASI PELANGGAN");
        System.out.println("-------------------------------");
        for (CarRent sc : RentArchive.rentData) {
            System.out.println("NAMA PEMINJAM   : " + sc.getCarRider().getName());
            System.out.println("TIPE MOBIL      : " + sc.getCar().getCarType());
            System.out.println("NO. POLISI      : " + sc.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + sc.getRentDur());
            System.out.println("-------------------------------");
        }
    }

}
