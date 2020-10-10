package Bai5;

public class Guns {
    private String WeaponName;
    private int AmmoNumber;

    public Guns() {
    }

    public Guns(String weaponName, int ammoNumber) {
        WeaponName = weaponName;
        AmmoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }

    public int getAmmoNumber() {
        return AmmoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        AmmoNumber = ammoNumber;
    }
    public void Load(int x) {
        this.setAmmoNumber() += x;
    }
    public void Shoot(int x) {
        if(x>0) {
            this.setAmmoNumber() -=x;

        }else if(x==0) {
            System.out.println("Het dan roi em oi");
        }
    }
}
