package test;

import java.util.Scanner;

import DIEM.MenuDiem;
import MONHOC.MenuMonHoc;
import SINHVIEN.MenuSinhVien;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String luaChon;
		MenuSinhVien mnsv=new MenuSinhVien();
		MenuMonHoc mnmh=new MenuMonHoc();
		MenuDiem mnd=new MenuDiem();
		do {
			System.out.println("1. Chọn 1 để quản lý sinh viên");
			System.out.println("2. Chọn 2 để quản lý môn học");
			System.out.println("3. Chọn 3 để quản lý điểm");
			System.out.println("0. Chọn 0 để thoát");
			luaChon=sc.nextLine();
			switch (luaChon) {
			case "1":
				mnsv.SinhVien();
				break;
            case "2":
				mnmh.MonHoc();
				break;
            case "3":
	            mnd.Diem();
	break;
           

			default:
				if(luaChon.equals("0")==false)
		        	   System.out.println("Mời nhập lại: ");
					break;
		}
			
		}while(luaChon.equals("0")==false);
	}
}