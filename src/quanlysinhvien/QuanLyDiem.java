package quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDiem {
	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Diem> list = new ArrayList<Diem>();
	public static void capNhatDiem() {
		
		do {
			System.out.println("-------cap nhat diem------");
			System.out.println("\t 1. nhap diem");
			System.out.println("\t 2. sua diem");
			System.out.println("\t 3. xoa diem");
			System.out.println("\t 0. Quit");
			System.out.println("chon thao tac: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: nhapDiem(); break;
			case 2: suaDiem(); break;
			case 3: xoaDiem(); break;
			case 0: return;
			default: System.out.println("chon khong hop le");
			}
		}while(true);
	}
	public static void nhapDiem() {
		// TODO Auto-generated method stub
		System.out.println("-------nhap diem-------");
		System.out.print("- nhap ma sinh vien: ");
		int maSV = Integer.parseInt(sc.nextLine());
		if(help.indexOfSinhVien(QuanLySinhVien.list, maSV) == -1) {
			System.out.println("khong co sinh vien trong danh sach"); return;
		}
		System.out.print("- nhap ma mon hoc: ");
		int maMH = Integer.parseInt(sc.nextLine());
		if(help.indexOfMonHoc(QuanLyMonHoc.list, maMH) == -1) {
			System.out.println("khong co mon hoc trong danh sach"); return;
		}
		if((help.indexOfSinhVienDiem(QuanLyDiem.list, maSV) != -1) &&
				(help.indexOfMonHocDiem(QuanLyDiem.list, maMH)!=-1) ) {
			System.out.println("sinh vien nay da co diem trong mon hoc"); return;
		}
		System.out.print("- nhap diem: ");
		float diem = Float.parseFloat(sc.nextLine());
		if((diem<0) || (diem>10)) {
			System.out.println("diem trong thang diem 10"); return;
		}
		list.add(new Diem(maSV,maMH,diem));
		System.out.println("nhap thanh cong");
		System.out.println("---------------");
		
	}
	public static void suaDiem() {
		// TODO Auto-generated method stub
		System.out.println("-------sua diem----------");
		System.out.print("- nhap ma sinh vien: ");
		int maSV = Integer.parseInt(sc.nextLine());
		int index = help.indexOfSinhVien(QuanLySinhVien.list, maSV);
		if(index == -1) {
			System.out.println("khong co sinh vien nay trong danh sach"); return;
		}
		System.out.print("- nhap ma mon hoc: ");
		int maMH = Integer.parseInt(sc.nextLine());
		int index1 = help.indexOfMonHoc(QuanLyMonHoc.list, maMH);
		if(index1 == -1) {
			System.out.println("khong co mon hoc nay trong danh sach"); return;
		}
		System.out.print("- nhap diem: ");
		int diem = Integer.parseInt(sc.nextLine());
		list.get(index).setDiem(diem);
		System.out.println("da sua thanh cong");
		System.out.println("--------------------------");
		
	}
	public static void xoaDiem() {
		// TODO Auto-generated method stub
		System.out.println("---------xoa diem-------------");
		System.out.print("- nhap ma sinh vien: ");
		int maSV = Integer.parseInt(sc.nextLine());
		int index = help.indexOfSinhVien(QuanLySinhVien.list, maSV);
		if(index == -1) {
			System.out.println("khong co sinh vien nay trong danh sach"); return;
		}
		System.out.print("- nhap ma mon hoc: ");
		int maMH = Integer.parseInt(sc.nextLine());
		int index1 = help.indexOfMonHoc(QuanLyMonHoc.list, maMH);
		if(index1 == -1) {
			System.out.println("khong co mon hoc nay trong danh sach"); return;
		}
		if((help.indexOfSinhVienDiem(QuanLyDiem.list, maSV) == -1) &&
				(help.indexOfMonHocDiem(QuanLyDiem.list, maMH)== -1) ) {
			System.out.println("sinh vien nay khong co diem trong mon hoc"); return;
		}
		list.remove(index);
		System.out.println("da xoa thanh cong");
		System.out.println("------------------------------------");
	}

}
