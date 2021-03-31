package quanlysinhvien;

import java.util.Scanner;

public class QLSV_MAIN {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {
			System.out.println("========QUAN LY SINH VIEN========");
			System.out.println("\t 1. Cap nhat thong tin");
			System.out.println("\t 2. Tim kiem thong tin");
			System.out.println("\t 0. Quit");
			System.out.println("chon thao tac: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: capNhatThongTin(); break;
			case 2: timKiemThongTin(); break;
			case 0: System.out.println("da dong ct");System.exit(0);
			default: System.out.println("chon khong hop le");
			}
		}while(true);
	}

	private static void capNhatThongTin() {
		// TODO Auto-generated method stub
		do {
			System.out.println("--------cap nhat thong tin---------");
			System.out.println("\t 1. cap nhat thong tin sinh vien");
			System.out.println("\t 2. cap nhat thong tin mon hoc");
			System.out.println("\t 3. quan ly diem");
			System.out.println("\t 4. hien thi diem");
			System.out.println("\t 5. tim kiem");
			System.out.println("\t 0. Quit");
			System.out.println("moi chon thao tac: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: QuanLySinhVien.capNhatThongTin(); break;
			case 2: QuanLyMonHoc.capNhatMonHoc(); break;
			case 3: QuanLyDiem.capNhatDiem();break;
			case 4: HienThiThongTin(); break;
			case 5: timKiemThongTin(); break;
			case 0: return;
			default: System.out.println("chon khong hop le");
			}
		}while(true);
	}

	private static void HienThiThongTin() {
		// TODO Auto-generated method stub
		do {
			System.out.println("---------hien thi bang diem----------");
			System.out.println("\t 1. hien thi theo tung sinh vien");
			System.out.println("\t 2. hien thi theo tung mon hoc");
			System.out.println("\t 0. Quit");
			System.out.println("moi chon thao tac: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: DanhSachDiem.hienThiDiemTheoSinhVien();break;
			case 2: DanhSachDiem.hienThiDiemTheoMonHoc();break;
			case 0: return;
			default: System.out.println("chon khong hop le");
			}
		}while(true);
	}

	private static void timKiemThongTin() {
		// TODO Auto-generated method stub
		do {
			System.out.println("---------tim kiem----------");
			System.out.println("\t 1. tim kiem theo ma sinh vien");
			System.out.println("\t 2. tim kiem theo ma mon hoc");
			System.out.println("\t 0. Quit");
			System.out.println("moi chon thao tac: ");
			int chon = Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1: DanhSachDiem.timKiemTheoMaSV();break;
			case 2: DanhSachDiem.timKiemTheoMaMH();break;
			case 0: return;
			default: System.out.println("chon khong hop le");
			}
		}while(true);
	}

}
