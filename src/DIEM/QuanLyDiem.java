package DIEM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import MONHOC.MonHoc;
import SINHVIEN.MenuSinhVien;
import SINHVIEN.QuanLySinhVien;
import SINHVIEN.SinhVien;

public class QuanLyDiem implements NguoiQuanLyDiem{
private ArrayList<Diem> d=new ArrayList<Diem>();

public QuanLyDiem(ArrayList<Diem> d) {
	this.d = d;
}

public QuanLyDiem() {
}
public void themDiem(Diem d) {
    this.d.add(d);
}

public boolean xoaDiem(Diem maSinhVien) {
   
          return   this.d.remove(maSinhVien);
            
     
}
public void capnhapdiem(Diem maSinhVien) {
    xoaDiem(maSinhVien);
 
        
    
}
public void inDanhSachDiem() {
	for (Diem diem2 : d) {
		System.out.println(diem2);
	}
}

public void inRaThangDiem(SinhVien masv) {
    for (Diem d : d) {
        if (d.getMaSinhVien().equals(masv)) {
         if ((d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7 <= 10 && (d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7 >=8.5 ) {
                System.out.println("Điểm A");
            } else if ((d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7 <8.5 &&(d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7 >= 7) {
                System.out.println("Điểm B");
            } else if ((d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7 < 7 && (d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7 >= 5.5) {
                System.out.println("Điểm C");
            } else if ((d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7 < 5.5&&(d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7 >=4) {
                System.out.println("Điểm D");
            }else {
            	 System.out.println("Điểm F ");
            }
        }
        else {
            System.out.println(" Không có mã sinh viên này ");
        }
    }
}
public void inRaDiemTrungBinhTungMon() {
	for (Diem diem2 : d) {
		System.out.println("Mã môn: "+diem2.getMaMonHoc()+" Điểm trung bình :"+(diem2.getDiemCuoiKy()*4 +diem2.getDiemQuaTrinh()*3)/7);
	}
}

public void InraDiemTBCaoNhat() {
    double Max = 0;
    for (Diem d : d) {
       
            if ((d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7 > Max) {
                Max = (d.getDiemCuoiKy()*4 +d.getDiemQuaTrinh()*3)/7;
            }
        
    }
    System.out.println("Điểm trung bình cao nhất là : " + Max);
}
public void docFileD() {
    try {
        FileReader fr = new FileReader("E:\\huy1\\OOP\\docFileD");
        BufferedReader bf = new BufferedReader(fr);
        String line="";
        String[] temp;
        while ((line = bf.readLine()) != null) {
            temp = line.split(",");
            Diem d = taoDiem(temp);
            this.d.add(d);
        }

        bf.close();
        fr.close();
    } catch (IOException e) {
        System.out.println("Không timg thấy file");
    }
}

private Diem taoDiem(String[] temp) {
    
    Double diemquatrinh = Double.parseDouble(temp[2]);
    Double diemcuoiky = Double.parseDouble(temp[3]);
    String mamh = temp[1];
    String maSinhVien=temp[0];
    SinhVien sv=new SinhVien(maSinhVien);
    MonHoc mh=new MonHoc(mamh);
    Diem d = new Diem(sv, mh, diemquatrinh, diemcuoiky);
    return d;
}

public void ghiFileD() {
    try {
        FileWriter fw = new FileWriter("E:\\huy1\\OOP\\ghiFileD");
        BufferedWriter bw = new BufferedWriter(fw);
        for (Diem d : d) {
            if (d instanceof Diem) {
                bw.write(d.getMaSinhVien()+","+
                		d.getMaMonHoc()+","+
                        d.getDiemQuaTrinh()+","+
                        d.getDiemCuoiKy()
                        )  ;

                bw.newLine();
            }
        }
        bw.close();
        fw.close();
    } catch (IOException e) {
        System.out.println("Không ghi được file ");
    }
}

}

