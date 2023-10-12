package be.vdab.jpfhfdst13;

public class Kopieermachine implements Kost{
    private final String merk;
    private final double kostPerblz;
    private final int aantalBlz;

    public Kopieermachine(String merk, double kostPerblz, int aantalBlz) {
        this.merk = merk;
        this.kostPerblz = kostPerblz;
        this.aantalBlz = aantalBlz;
    }

    @Override
    public double bedragKost() {
        return kostPerblz * aantalBlz;
    }

    @Override
    public boolean personeelsKost() {
        return false;
    }

    public String getMerk() {
        return merk;
    }

    public int getAantalBlz() {
        return aantalBlz;
    }
}
