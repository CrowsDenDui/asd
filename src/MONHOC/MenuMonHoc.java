package MONHOC;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import SINHVIEN.SinhVien;

public class MenuMonHoc {
public void MonHoc() {
	

	        Scanner nhap = new Scanner(System.in);
	              
	                String luaChon;
	                NguoiQuanLyDanhSachMonHoc quanlymonhoc=new QuanLyDanhSachMonHoc();
	                do  {
	                	
	                	 System.out.println("-----------------MENU MÔN HỌC---------------");
	 	                System.out.println("1: Thêm môn học ");
	 	                System.out.println("2: Cập nhập môn học");
	 	                System.out.println("3: Xóa môn học");
	 	                System.out.println("4: In danh sách môn học");
	 	                System.out.println("5: In danh sách môn học theo từng mã ngành");
	 	                System.out.println("6: Đọc File môn học");
	 	                System.out.println("7: Ghi File môn học");
	 	                System.out.println("8: Tìm môn học theo tên môn học");
	 	                System.out.println("0: Chọn 0 để trở lại");
	 	              luaChon=nhap.nextLine();
	                      switch (luaChon) {
	                            case "1":
	                            	 System.out.print("Nhập mã môn học: ");
		                                String maMonHoc = nhap.nextLine();
		                                System.out.print("Nhập tên môn học : ");
		                                String tenMonHoc = nhap.nextLine();
		                                System.out.print("Hệ đào tạo: ");
		                                String hedaotao = nhap.nextLine();
	                                System.out.print("Nhập mã ngành của môn: ");
	                                String maNganh = nhap.nextLine();
	                                System.out.print("Nhập tên ngành của môn: ");
	                                String tenNganh = nhap.nextLine();
	                               
	                                MonHoc mh = new MonHoc(maMonHoc, tenMonHoc, hedaotao, maNganh,tenNganh);
	                                quanlymonhoc.themMonHoc(mh);
	                                break;                         
	                            case "2": 
	                            	System.out.println("Nhập vào mã môn học");
	                				String maMH=nhap.nextLine();
	                				   System.out.print("Nhập tên môn học : ");
		                                String tenMonHoc1 = nhap.nextLine();
		                                System.out.print("Hệ đào tạo: ");
		                                String hedaotao1 = nhap.nextLine();
	                				MonHoc sv2=new MonHoc(maMH);
	                				System.out.print("Nhập mã ngành của môn: ");
	                                String maNganh1 =nhap.nextLine();

	                                System.out.print("Nhập tên ngành của môn: ");
	                                String tenNganh1 = nhap.nextLine();

	                                      
	                                quanlymonhoc.capNhapMonHoc(sv2);
	                                MonHoc mh1 = new MonHoc(maMH, tenMonHoc1, hedaotao1, maNganh1,tenNganh1);
	                quanlymonhoc.themMonHoc(mh1);
	                            
	                        break;
	                      case "3":
	                    	  System.out.println("Nhập vào mã môn học");
              				String maMH1=nhap.nextLine();
              				MonHoc mhh=new MonHoc(maMH1);
	                    	  quanlymonhoc.xoaMonHoc(mhh);
	                    	  
	                    	  
	                    	  break;
	                      case "4":
	                    	  SinhVien.temp();
	          				System.out.println("Môn Học :");
	                    	  quanlymonhoc.xemDanhSachMonHoc();
	                    	  break;
	                      case "5":
	                    	  
	                    	  quanlymonhoc.xemmontheoNganh();
	                     break;
	                      case "6":
	                    	  quanlymonhoc.docFileMH();
	                     break;
	                      case "7":
	                    	  quanlymonhoc.ghiFileMH();
	                     break;
	                      case "8":
	                    	
	                    	  System.out.print("Nhập tên môn học : ");
                              String tenMonHoc2 = nhap.nextLine();
                              quanlymonhoc.timMonHocTheoTen(tenMonHoc2);
	                     break;
	                     
	                    	  default:
	                    		  if(luaChon.equals("0")==false)
	           		        	   System.out.println("Mời nhập lại: ");
	           				
	           				break;
	           			}
	           		}while(luaChon.equals("0")==false);
	                
	    
}
}
	
	
	
	
	
	
	


