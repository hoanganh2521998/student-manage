package quanlysinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QuanLySinhVien {
	public static ArrayList<SinhVien> list = new ArrayList<SinhVien>();
	static Scanner sc = new Scanner(System.in);
	
	public static void capNhatThongTin() {
		do {
			System.out.println("------CAP NHAT THONG TIN SINH VIEN------");
			System.out.println("\t 1. Them sinh vien");
			System.out.println("\t 2. Sua thong tin sinh vien");
			System.out.println("\t 3. Xoa sinh vien");
			System.out.println("\t 4. Hien thi danh sach sinh vien");
			System.out.println("\t 0. Back");
			System.out.print("Moi chon thao tac: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: themSinhVien(); break;
			case 2: suaSinhVien(); break;
			case 3: xoaSinhVien(); break;
			case 4: hienThiDanhSach(); break;
			case 0: return;
				default: System.out.println("Chon khong hop le");
			}
		}while(true);
	}

	public static void themSinhVien() {
		// TODO Auto-generated method stub
		System.out.println("----------Them sinh vien---------");
		System.out.print("- nhap ma sinh vien: ");
		int ID = Integer.parseInt(sc.nextLine());
		if(help.indexOfSinhVien(list, ID) != -1) {
			System.out.println("sinh vien da co trong danh sach");
			return;
		}
		System.out.print("- nhap ho sinh vien: ");
		String ho = sc.nextLine();
		if(ho.length() == 0) {
			System.out.println("ho khong duoc de trong"); return;
		}
		System.out.print("- nhap ten sinh vien: ");
		String ten = sc.nextLine();
		if(ten.length() == 0) {
			System.out.println("ten khong duoc de trong"); return;
		}
		System.out.print("- nhap ngay sinh(dd/mm/yyyy): ");
		String ns = sc.nextLine();
		System.out.print("- nhap gioi tinh: ");
		String gt = sc.nextLine();
		list.add(new SinhVien(ID,ho,ten,ns,gt));
		System.out.println("them thanh cong");
		System.out.println("---------------");
	}

	public static void suaSinhVien() {
		// TODO Auto-generated method stub
		System.out.println("---------Sua thong tin sv------------");
		System.out.print("- nhap ma sinh vien: ");
		int ID = Integer.parseInt(sc.nextLine());
		int index = help.indexOfSinhVien(list, ID);
		if(index == -1) {
			System.out.println("sinh vien khong co trong danh sach"); return;
		}
		do {
			System.out.println("-----chon thong tin can sua-------");
			System.out.println("\t 1. Ho");
			System.out.println("\t 2. Ten");
			System.out.println("\t 3. Ngay sinh");
			System.out.println("\t 4. Gioi tinh");
			System.out.println("\t 0. Back");
			System.out.println();
			int chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: System.out.print("- nhap ho: ");
					String ho = sc.nextLine();
					if(ho.length() == 0) {
						System.out.println("khong duoc de trong"); return;
					}
					list.get(index).setHo(ho);
					System.out.println("sua thanh cong");
					break;
			case 2: System.out.print("- nhap ten: ");
					String ten = sc.nextLine();
					if(ten.length() == 0) {
						System.out.println("khong duoc de trong"); return;
					}
					list.get(index).setTen(ten);
					System.out.println("sua thanh cong");
					break;
			case 3: System.out.print("- nhap ngay sinh(dd/mm/yyyy: ");
					String ns = sc.nextLine();
					list.get(index).setNs(ns);
					System.out.println("sua thanh cong");
					break;
			case 4: System.out.println("- nhap gioi tinh: ");
					String gt = sc.nextLine();
					list.get(index).setGt(gt);
					System.out.println("sua thanh cong");
					break;
			case 0: return;
			default: System.out.println("chon khong hop le");
			}
		}while(true);
		
	}

	public static void xoaSinhVien() {
		// TODO Auto-generated method stub
		System.out.println("--------xoa sinh vien--------");
		System.out.print("- nhap ma sinh vien: ");
		int maSV = Integer.parseInt(sc.nextLine());
		int index = help.indexOfSinhVien(list, maSV);
		if(index == -1) {
			System.out.println("khong co trong danh sach"); return;
		}
		if(help.indexOfSinhVienDiem(QuanLyDiem.list, maSV) != -1) {
			System.out.println("sinh vien da co diem"); return;
		}
		list.remove(index);
		System.out.println("da xoa thanh cong");
		System.out.println("------------------------------");
	}

	public static void hienThiDanhSach() {
		// TODO Auto-generated method stub
		System.out.println("---------danh sach sinh vien---------");
		System.out.printf("%-5s %-10s %-10s %-10s %-6s","Ma SV","Ho","Ten","Ngay sinh","G/Tinh");
		System.out.println();
		Collections.sort(list, new Comparator<SinhVien>(){
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				return(sv1.getTen().compareTo(sv2.getTen()));
			}
			
		});
		for(SinhVien sv : list) {
			sv.display();
		}
		System.out.println("-------------------------------------");
	}
}
	
	