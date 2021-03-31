package quanlysinhvien;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachDiem {
	public static void hienThiDiemTheoSinhVien() {
		Collections.sort(QuanLyDiem.list, new Comparator<Diem>() {
			@Override
			public int compare(Diem d1, Diem d2) {
				if(d1.getMaSV() > d2.getMaSV()) {
					return 1;
				}
				else {
					return -1;
				}
			}
				
		});
		System.out.println("\t danh sach diem theo tung sinh vien");
		System.out.println("\t------------------------------------");
		int maSvOld=0;
		for (Diem diem : QuanLyDiem.list) {
			int maSV = diem.getMaSV();
			if (maSV != maSvOld) {
				System.out.printf("%-7s %-5s %-1s %-5s %-10s %-5s %-10s","ma sv:", maSV, "|","Ho:", help.getHoSv(QuanLySinhVien.list, maSV),
						"Ten:",help.getTenSv(QuanLySinhVien.list, maSV));
				System.out.println();
				help.hienThiDSTenMhAndDiemOfSinhVien(QuanLyDiem.list, maSV);
				maSvOld = maSV;
			}
		}
		System.out.println("---------------------------------------");
	}
	public static void hienThiDiemTheoMonHoc() {
		System.out.println("\t danh sach diem theo tung mon hoc");
		System.out.println("\t---------------------------------");
		int maMHOld =0;
		for (Diem diem : QuanLyDiem.list) {
			int maMH = diem.getMaMH();
			if (maMH != maMHOld) {
				System.out.printf("%-8s %-6s %-8s %-10s|%s%.2f%n","ma mon:", maMH,"ten mon:", help.getTenMh(QuanLyMonHoc.list, maMH),
						"Diem trung binh mon: ", help.diemTB(QuanLyDiem.list, maMH));
				help.hienThiDsSinhVienVaDiem(QuanLyDiem.list, maMH);
				maMHOld = maMH;

			}

		}
		System.out.println("------------------------------------");
	}
	public static void timKiemTheoMaSV() {
		System.out.print("- nhap ma sinh vien: ");
		int maSV = Integer.parseInt(sc.nextLine());
		System.out.printf("%-8s%s%n", help.getHoSv(QuanLySinhVien.list, maSV),
				help.getTenSv(QuanLySinhVien.list, maSV));
		help.hienThiDSTenMhAndDiemOfSinhVien(QuanLyDiem.list, maSV);
		System.out.println("-------------------------------------");

	}
	public static void timKiemTheoMaMH() {
		System.out.print("- nhap ma mon hoc: ");
		int maMH = Integer.parseInt(sc.nextLine());
		System.out.printf("%-10s|%s%.2f%n", help.getTenMh(QuanLyMonHoc.list, maMH), "Diem trung binh mon: ",
				help.diemTB(QuanLyDiem.list, maMH));
		help.hienThiDsSinhVienVaDiem(QuanLyDiem.list, maMH);
		System.out.println("--------------------------------------");

	}
	static Scanner sc = new Scanner(System.in);
}
