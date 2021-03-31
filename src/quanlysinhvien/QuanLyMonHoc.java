package quanlysinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyMonHoc {
	public static ArrayList<MonHoc> list = new ArrayList<MonHoc>();
	static Scanner sc = new Scanner(System.in);
	
	public static void capNhatMonHoc() {
		do {
			System.out.println("------CAP NHAT THONG TIN MON HOC------");
			System.out.println("\t 1. Them mon hoc");
			System.out.println("\t 2. Sua thong tin mon hoc");
			System.out.println("\t 3. Xoa mon hoc");
			System.out.println("\t 4. Hien thi danh sach mon hoc");
			System.out.println("\t 0. Back");
			System.out.print("Moi chon thao tac: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: themMonHoc(); break;
			case 2: suaMonHoc(); break;
			case 3: xoaMonHoc(); break;
			case 4: hienThiDanhSach(); break;
			case 0: return;
				default: System.out.println("Chon khong hop le");
			}
		}while(true);
	}

	public static void themMonHoc() {
		// TODO Auto-generated method stub
		System.out.println("-------Them mon hoc-------");
		System.out.print("- nhap ma mon hoc: ");
		int ID = Integer.parseInt(sc.nextLine());
		if(help.indexOfMonHoc(list, ID) != -1) {
			System.out.println("mon hoc da co trong danh sach"); return;
		}
		System.out.print("- nhap ten mon: ");
		String ten_mh = sc.nextLine();
		if(ten_mh.length() == 0) {
			System.out.println("khong duoc de trong"); return;
		}
		System.out.print("- nhap he so: ");
		int heso = Integer.parseInt(sc.nextLine());
		list.add(new MonHoc(ID,ten_mh,heso));
		System.out.println("them thanh cong");
		System.out.println("---------------");
	}

	public static void suaMonHoc() {
		// TODO Auto-generated method stub
		System.out.println("--------sua mon hoc---------");
		System.out.println("- nhap ma mon: ");
		int ID = Integer.parseInt(sc.nextLine());
		int index = help.indexOfMonHoc(list, ID);
		if(index == -1) {
			System.out.println("mon hoc khong co trong danh sach"); return;
		}
		do {
			System.out.println("-----chon thong tin can sua-------");
			System.out.println("\t 1. Ten mon hoc");
			System.out.println("\t 2. He so");
			System.out.println("\t 0. Back");
			System.out.println();
			int chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: System.out.print("- nhap ten mon: ");
					String ten_mh = sc.nextLine();
					if(ten_mh.length()==0) {
						System.out.println("ten khong duoc de trong"); return;
					}
					list.get(index).setTen_mh(ten_mh);
					System.out.println("sua thanh cong");
					break;
			case 2: System.out.print("- nhap he so: ");
					int heso = Integer.parseInt(sc.nextLine());
					list.get(index).setHeso(heso);
					System.out.println("sua thanh cong");
					break;
			case 0: return;
			default: System.out.println("chon khong hop le");
			}
		}while(true);
	}

	public static void xoaMonHoc() {
		// TODO Auto-generated method stub
		System.out.println("------xoa mon hoc--------");
		System.out.print("- nhap ma mon hoc: ");
		int maMH = Integer.parseInt(sc.nextLine());
		int index = help.indexOfMonHoc(list, maMH);
		if(index == -1) {
			System.out.println("khong co trong danh sach"); return;
		}
		if(help.indexOfMonHocDiem(QuanLyDiem.list, maMH)!=-1) {
			System.out.println("mon hoc nay da co diem"); return;
		}
		list.remove(index);
		System.out.println("da xoa thanh cong");
		System.out.println("-------------------------");
	}

	public static void hienThiDanhSach() {
		// TODO Auto-generated method stub
		System.out.println("-------danh sach mon hoc---------");
		System.out.printf("%-5s %-10s %-5s","Ma MH","Ten MH","He so");
		System.out.println();
		Collections.sort(list, new Comparator<MonHoc>() {
			@Override
			public int compare(MonHoc mh1, MonHoc mh2) {
				return(mh1.getTen_mh().compareTo(mh2.getTen_mh()));
			}
		});
		for(MonHoc mh : list) {
			mh.display();
		}
		System.out.println("---------------------------------");
	}
}
