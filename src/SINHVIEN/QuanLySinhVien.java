package SINHVIEN;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class QuanLySinhVien implements NguoiQuanLyDanhSachSV {
private ArrayList<SinhVien> sv=new ArrayList<SinhVien>();

public QuanLySinhVien(ArrayList<SinhVien> sv) {
	this.sv = sv; 
}

public QuanLySinhVien() {
}

public void themSinhVien(SinhVien sinhVien) {
	this.sv.add(sinhVien);
}
public void suaThongTin(SinhVien sv) {
	xoaSinhVien(sv);
}
public void inDanhSachSinhVien() {	
				for (SinhVien svv : this.sv) {
					System.out.println(svv);
			}
}
public void docFileSV() {
    try {
        FileReader fr = new FileReader("E:\\huy1\\OOP\\docFileSV");
        BufferedReader bf = new BufferedReader(fr);
        String line="";
        String[] temp;
            while ((line = bf.readLine()) != null) {
                temp = line.split(",");
                SinhVien sinhVien = taoSinhVien(temp);
                this.sv.add(sinhVien);
            }

		bf.close();
        fr.close();
    } catch (IOException e) {
        System.out.println("Không timg thấy file");
    }

}
private SinhVien taoSinhVien(String[] temp) {
	 String hoVaTen = temp[0];
	 String diaChi = temp[1];
	 int namSinh = Integer.parseInt(temp[2]);
	 String soDienThoai = temp[3];
	 String gioiTinh = temp[4];
	 String maSinhVien = temp[5];
	 String heDaoTao = temp[6];
    String nganh = temp[7];
    String lop = temp[8];
    String chucVu = temp[9];
   
  SinhVien sv=new SinhVien(hoVaTen, diaChi, namSinh, soDienThoai, gioiTinh, maSinhVien, heDaoTao, nganh, lop, chucVu);
    return sv;
}
public void ghiFileSV() {
    try {
        FileWriter fw = new FileWriter("E:\\huy1\\OOP\\ghiFileSV");
        BufferedWriter  bw = new BufferedWriter(fw);
            for (SinhVien sinhVien: sv) {
                if (sinhVien instanceof SinhVien) {
                    bw.write(sinhVien.getHoVaTen()+","+
                sinhVien.getDiaChi()+","+
                    		sinhVien.getNamSinh()+","+
                sinhVien.getSoDienThoai()+","+
                    		sinhVien.getSoDienThoai()+","+
                sinhVien.getGioiTinh()+","+
                    		sinhVien.getMaSinhVien()+","+
                sinhVien.getHeDaoTao()+","+
                    		sinhVien.getNganh()+","+
                sinhVien.getLop()+","+
                    		sinhVien.getChucVu()
                )  ;
                          
                    bw.newLine();
                }
            }
        bw.close();
        fw.close();
    } catch (IOException e) {
        System.out.println("Không ghi được");
    }
}
public boolean kiemTraDanhSachCRongHayKhong() {
	return this.sv.isEmpty();
	}
	public int laySoLuongSinhVien() {
	return this.sv.size();
	}
	public void lamRongDanhSach() {
	this.sv.removeAll(sv);
	}
	public boolean kiemTraTonTai(SinhVien sv) {
	return this.sv.contains(sv);
	}
	public boolean xoaSinhVien(SinhVien sv) {
		return this.sv.remove(sv);
		}
	public void timSinhVien(String ten) { 
		for (SinhVien sinhVien : sv) {
			if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
				System.out.println(sinhVien);
			}
		}
	}

	public void sapXepDanhSachTheoNamSinhTangDan() {
		Collections.sort(this.sv,new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if(o1.getNamSinh()<o2.getNamSinh()) {
					return 1;
				}else if(o1.getNamSinh()>o2.getNamSinh()) {
					return -1;
				}else {
					return 0;
				}
			}	
			
		});
		inDanhSachSinhVien();
}
}