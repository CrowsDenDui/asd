package DIEM;


import java.util.Scanner;

import MONHOC.MonHoc;
import SINHVIEN.QuanLySinhVien;
import SINHVIEN.SinhVien;	

public class MenuDiem {
   public void Diem() {
	

	   Scanner sc = new Scanner(System.in);
	    String luaChon;
	    NguoiQuanLyDiem qld = new QuanLyDiem();
	    MonHoc mhh=new MonHoc();
	    
	 
	do {
	    System.out.println("_____________MENU ĐIỂM___________");
	    System.out.println("1. Thêm điểm ");
	    System.out.println("2. Xóa điểm ");
	    System.out.println("3. Cập nhập điểm ");
	    System.out.println("4. In ra danh sách điểm");
	    System.out.println("5. In ra thang điểm theo mã số sinh viên ");
	    System.out.println("6. In ra điểm trung bình từng môn");
	    System.out.println("7. In ra điểm trung bình môn cao nhất ");
	    System.out.println("8. Đọc File");
	    System.out.println("9. Ghi File");
	    System.out.println("0. Chọn 0 để trở lại");
	    luaChon=sc.nextLine();
	   
	    switch (luaChon) {
	        case "1": 
	           
	        	 System.out.println("Nhập vào mã sinh viên");
	             String sv1=sc.nextLine();
	             System.out.println("Nhập vào mã môn học");
	             String mh1=sc.nextLine();
	            System.out.println("Nhập vào điểm quá trình ");
	            double diemqt = sc.nextDouble();
	            System.out.println("Nhập vào điểm cuối kì");
	            double diemck = sc.nextDouble();
	           
	           sc.nextLine();
	           SinhVien sv=new SinhVien(sv1);
	           MonHoc mh=new MonHoc(mh1);
	            	Diem d=new Diem(sv, mh, diemqt, diemck);	
	            qld.themDiem(d);
	            break;
	        
	        case "2": 
	            System.out.println("Nhập vào mã Sinh Viên");
	            String masv=sc.nextLine();
	            SinhVien x=new SinhVien(masv);
	          Diem cc=new Diem(x);
	            System.out.println(qld.xoaDiem(cc));
	            break;
	        
	        case "3": 
	            System.out.println("Nhập mã sinh viên");
	            String masv1=sc.nextLine();
	            
	            System.out.println("Nhập vào mã môn học");
	            String mh2=sc.nextLine();
	            
	            SinhVien s = new SinhVien(masv1);
	            MonHoc mh3=new MonHoc(mh2);
	            
	            System.out.println("Nhập vào điểm quá trình ");
	            double diemqt1 = sc.nextDouble();
	            System.out.println("Nhập vào điểm cuối kì");
	            double diemck1 = sc.nextDouble();
	            sc.nextLine();
	          
	            	 Diem d1=new Diem(s, mh3, diemqt1, diemck1);
	                 qld.capnhapdiem(d1);
	                  qld.themDiem(d1);
	            
	            break;
	        
	        case "4": 
	        	SinhVien.temp();
				System.out.println("Diểm :");
	            
	            qld.inDanhSachDiem();
	           
	            break;
	        
	        case "5":
	        	System.out.println("Nhập vào mã Sinh Viên");
	            String masv2=sc.nextLine();
	            SinhVien k= new SinhVien(masv2);
	            qld.inRaThangDiem(k);
	            break;
	        
	        case "6": 
	            
	            qld.inRaDiemTrungBinhTungMon();
	            break;
	        
	        case "7": 
	          
	            qld.InraDiemTBCaoNhat();
	            break;
	        case "8": 
	            
	            qld.docFileD();
	            break;
	        case "9": 
	            
	            qld.ghiFileD();
	            break;
	        default:
	        	if(luaChon.equals("0")==false)
		        	   System.out.println("Mời nhập lại: ");
				
				break;
			}
		}while(luaChon.equals("0")==false);
}
}