package quanlysinhvien;

import java.util.ArrayList;


public class help {
	// kiem tra sinh vien co trong ds hay ko neu co tra ve chi so, nguoc lai tra ve -1
	public static int indexOfSinhVien(ArrayList<SinhVien> list, int ID) {
		for (int i=0; i<list.size(); i++)
			if (list.get(i).getMasv() == ID)
				return i;
		return -1;
	}
	// kiem tra mon hoc co trong ds hay ko neu co tra ve chi so, nguoc lai tra ve -1
	public static int indexOfMonHoc(ArrayList<MonHoc> list, int ID) {
		for (int i=0; i<list.size(); i++)
			if (list.get(i).getMa_mh() == ID)
				return i;
		return -1;
	}
	// kiem tra sinh vien co trong ds diem hay ko neu co tra ve chi so, nguoc lai tra ve -1
	public static int indexOfSinhVienDiem(ArrayList<Diem> list, int ID) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getMaSV() == ID) {
				return i;
			}
		}
		return -1;
	}
	// kiem tra mon hoc co trong ds diem hay ko neu co tra ve chi so, nguoc lai tra ve -1
	public static int indexOfMonHocDiem(ArrayList<Diem> list, int ID) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getMaMH() == ID) {
				return i;
			}
		}
		return -1;
	}
	public static String getHoSv(ArrayList<SinhVien> list, int maSV) {
		for (SinhVien sv : list) {
			if (sv.getMasv() == maSV) {
				return sv.getHo();
			}
		}
		return null;
	}
	public static String getTenSv(ArrayList<SinhVien> list, int maSV) {
		for (SinhVien sv : list) {
			if (sv.getMasv() == maSV) {
				return sv.getTen();
			}
		}
		return null;
	}
	public static String getTenMh(ArrayList<MonHoc> list, int maMH) {
		for (MonHoc mh : list) {
			if (mh.getMa_mh() == maMH) {
				return mh.getTen_mh();
			}
		}
		return null;
	}
	public static float getDiemSo(ArrayList<Diem> list, int maSV, int maMH) {
		for (Diem diem : list) {
			if ((diem.getMaSV() == maSV) && (diem.getMaMH() == maMH)) {
				return diem.getDiem();
			}
		}
		return -1;
	}
	public static int getHeSo(ArrayList<MonHoc> list, int maMH) {
		for (MonHoc mh : list) {
			if (mh.getMa_mh() == maMH) {
				return mh.getHeso();
			}
		}
		return -1;
	}
	public static double diemTB(ArrayList<Diem> list, int maMH) {
		double tongDiem = 0;
		int count = 0;
		for (Diem d : list) {
			if (d.getMaMH() == maMH) {
				tongDiem += d.getDiem();
				count++;
			}
		}
		return tongDiem / count;
	}
	public static void hienThiDSTenMhAndDiemOfSinhVien(ArrayList<Diem> list, int maSV) {
		System.out.printf("\t%-5s%-15s%s%n", "Stt", "Mon Hoc", "Diem");
		int i = 1;
		double diemTong = 0;
		int tongHeSo = 0;
		for (Diem d : list) {
			if (maSV == d.getMaSV()) {
				System.out.printf("\t%2d   %-16s%.2f%n", i, help.getTenMh(QuanLyMonHoc.list, d.getMaMH()),
						getDiemSo(list, maSV, d.getMaMH()));
				i++;
				diemTong += (help.getDiemSo(list, maSV, d.getMaMH()) * getHeSo(QuanLyMonHoc.list, d.getMaMH()));
				tongHeSo += getHeSo(QuanLyMonHoc.list, d.getMaMH());
			}
		}
		System.out.printf("\t Tong diem: %.2f%n", diemTong / tongHeSo);
		System.out.println("\t-----------------------------");
	}
	public static void hienThiDsSinhVienVaDiem(ArrayList<Diem> list, int maMH) {
		System.out.printf("\t%-5s%-11s%-6s%s%n", "Stt", "Ho ", "Ten", "Diem");
		int i = 1;
		for (Diem d : list) {
			if (maMH == d.getMaMH()) {
				System.out.printf("\t%2d   %-11s%-6s%.2f%n", i, help.getHoSv(QuanLySinhVien.list, d.getMaSV()),
						help.getTenSv(QuanLySinhVien.list, d.getMaSV()),
						help.getDiemSo(list, d.getMaSV(), d.getMaMH()));
				i++;
			}
		}
		System.out.println("\t---------------------------------------");
	}
	
}
