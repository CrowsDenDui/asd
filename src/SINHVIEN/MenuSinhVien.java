package SINHVIEN;

import java.util.Scanner;


public class MenuSinhVien {
	public void SinhVien() {
		
	
		Scanner sc = new Scanner(System.in);
		String luaChon;
		NguoiQuanLyDanhSachSV qlsv = new QuanLySinhVien();
do {
		System.out.println("_____________MENU SINH VIÊN___________");
		System.out.println("1. Thêm sinh viên");
		System.out.println("2. Xóa sinh viên bằng mã sinh viên");
		System.out.println("3. Sửa thông tin sinh viên");
		System.out.println("4. In danh sách sinh viên");
		System.out.println("5. Đọc File");
		System.out.println("6. Ghi File");
		System.out.println("7. Kiểm tra danh sách có rỗng hay không");
		System.out.println("8. In số lượng sinh viên");
		System.out.println("9. Kiểm tra sinh viên có tồn tại hay không bằng mã sinh viên");
		System.out.println("10. Làm rỗng danh sách");
		System.out.println("11. Tìm sinh viên bằng tên của sinh viên");
		System.out.println("12. In danh sách sinh viên theo năm sinh tăng dần");
		System.out.println("0. Chọn 0 để trở lại");
		luaChon=sc.nextLine();
		switch (luaChon) {
			case "1":
				System.out.println("Nhập vào họ và tên");
				String hoVaTen=sc.nextLine();
				System.out.println("Nhập vào địa chỉ");
				String diaChi=sc.nextLine();
				System.out.println("Nhập vào năm sinh");
				int namSinh=sc.nextInt();
				System.out.println("Nhập và số điện thoại");
				sc.nextLine();
				String soDienThoai=sc.nextLine();
				System.out.println("Nhập vào giới tính");
				String gioiTinh=sc.nextLine();
				System.out.println("Nhập vào mã sinh viên");
				String maSinhVien=sc.nextLine();
				System.out.println("Nhập vào hệ đào tạo");
				String heDaoTao=sc.nextLine();
				System.out.println("Nhập vào ngành");
				String nganh=sc.nextLine();
				System.out.println("Nhập vào lớp");
				String lop=sc.nextLine();
				System.out.println("Nhập vào chức vụ");
				String chucVu=sc.nextLine();
				SinhVien sv =new SinhVien(hoVaTen, diaChi, namSinh, soDienThoai, gioiTinh, maSinhVien, heDaoTao, nganh, lop, chucVu);
				qlsv.themSinhVien(sv);
				
				break;
			case "2":
				System.out.println("Nhập vào mã sinh viên");
				String maSinhVien1=sc.nextLine();
				SinhVien sv1=new SinhVien(maSinhVien1);
				System.out.println(qlsv.xoaSinhVien(sv1));

				break;
			case "3":
				System.out.println("Nhập vào mã sinh viên");
				String maSinhVien2=sc.nextLine();
				SinhVien sv2=new SinhVien(maSinhVien2);

				System.out.println("Nhập vào họ và tên");
				String hoVaTen1=sc.nextLine();
				System.out.println("Nhập vào địa chỉ");
				String diaChi1=sc.nextLine();
				System.out.println("Nhập vào năm sinh");
				int namSinh1=sc.nextInt();
				System.out.println("Nhập và số điện thoại");
				sc.nextLine();
				String soDienThoai1=sc.nextLine();
				System.out.println("Nhập vào giới tính");
				String gioiTinh1=sc.nextLine();
				System.out.println("Nhập vào hệ đào tạo");
				String heDaoTao1=sc.nextLine();
				System.out.println("Nhập vào ngành");
				String nganh1=sc.nextLine();
				System.out.println("Nhập vào lớp");
				String lop1=sc.nextLine();
				System.out.println("Nhập vào chức vụ");
				String chucVu1=sc.nextLine();
				qlsv.suaThongTin(sv2);
				SinhVien svv=new SinhVien(hoVaTen1, diaChi1, namSinh1, soDienThoai1, gioiTinh1, maSinhVien2, heDaoTao1, nganh1, lop1, chucVu1);
				qlsv.themSinhVien(svv);
				
				break;
			case "4":
				SinhVien.temp();
				System.out.println("Sinh Viên :");
				qlsv.inDanhSachSinhVien();
				break;
			case "5":
				qlsv.docFileSV();
				break;
			case "6":
				qlsv.ghiFileSV();
				break;
			case "7":
				System.out.println(qlsv.kiemTraDanhSachCRongHayKhong());
				break;
			case "8":
				System.out.println(qlsv.laySoLuongSinhVien());
				break;
			case "9":
				System.out.println("Nhập vào mã sinh viên");
				String maSinhVien3=sc.nextLine();
				SinhVien sv3=new SinhVien(maSinhVien3);
				System.out.println(qlsv.kiemTraTonTai(sv3));
				break;
			case "10":
				qlsv.lamRongDanhSach();
				break;
			case "11":
				System.out.println("Nhập vào họ và tên");
				String hoVaTen2=sc.nextLine();
				qlsv.timSinhVien(hoVaTen2);
				break;
			case "12":
				qlsv.sapXepDanhSachTheoNamSinhTangDan();
				break;
			default:
				if(luaChon.equals("0")==false)
		        	   System.out.println("Mời nhập lại: ");
				
				break;
			}
		}while(luaChon.equals("0")==false);
	}
}

