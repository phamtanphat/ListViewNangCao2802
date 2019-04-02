package khoapham.ptp.phamtanphat.listviewnangcao;

public class Moan {
    private String ten;
    private int giatien;
    private Integer hinhanh;

    public Moan(String ten, int giatien, Integer hinhanh) {
        this.ten = ten;
        this.giatien = giatien;
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public Integer getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(Integer hinhanh) {
        this.hinhanh = hinhanh;
    }
}
