package PraktikumPBO;

/**
 *
 * @author LENOVO
 */
public class Car {
    public String carType;
    public String polNum;
    public String merk;
    public boolean status;

    public Car(String carType, String polNum, String merk, boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = true;
    }
    public String getCarType(){
        return carType;
    }
    public String getPolNum(){
        return polNum;
    }
    public String getMerk(){
        return merk;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status     = status;
        }
    }

