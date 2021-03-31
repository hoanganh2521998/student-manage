package quanlysinhvien;

public class MonHoc {
	private int ma_mh;
	private String ten_mh;
	private int heso;
	public MonHoc(int ma_mh, String ten_mh, int heso) {
		super();
		this.ma_mh = ma_mh;
		this.ten_mh = ten_mh;
		this.heso = heso;
	}
	public MonHoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMa_mh() {
		return ma_mh;
	}
	public void setMa_mh(int ma_mh) {
		this.ma_mh = ma_mh;
	}
	public String getTen_mh() {
		return ten_mh;
	}
	public void setTen_mh(String ten_mh) {
		this.ten_mh = ten_mh;
	}
	public int getHeso() {
		return heso;
	}
	public void setHeso(int heso) {
		this.heso = heso;
	}
	public void display() {
		System.out.printf("%-6s", ma_mh);
		System.out.printf("%-11s", ten_mh);
		System.out.printf("%-5s", heso);
		System.out.println();
	}
}
