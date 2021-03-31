package quanlysinhvien;

public class SinhVien {
	private int masv;
	private String ho;
	private String ten;
	private String ns;
	private String gt;
	public SinhVien(int masv, String ho, String ten, String ns, String gt) {
		super();
		this.masv = masv;
		this.ho = ho;
		this.ten = ten;
		this.ns = ns;
		this.gt = gt;
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNs() {
		return ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}
	public String getGt() {
		return gt;
	}
	public void setGt(String gt) {
		this.gt = gt;
	}
	public void display() {
		System.out.printf("%-6s",masv);
		System.out.printf("%-11s",ho);
		System.out.printf("%-11s",ten);
		System.out.printf("%-11s",ns);
		System.out.printf("%-6s",gt);
		System.out.println();
	}

}
