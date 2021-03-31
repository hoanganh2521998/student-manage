package quanlysinhvien;

public class Diem {
	private int maSV;
	private int maMH;
	private float diem;
	public Diem(int maSV, int maMH, float diem) {
		super();
		this.maSV = maSV;
		this.maMH = maMH;
		this.diem = diem;
	}
	public Diem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	

}
