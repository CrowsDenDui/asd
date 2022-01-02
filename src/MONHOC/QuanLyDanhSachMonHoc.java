package MONHOC;
 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.naming.ContextNotEmptyException;

import SINHVIEN.SinhVien;


public class QuanLyDanhSachMonHoc implements  NguoiQuanLyDanhSachMonHoc{
     ArrayList<MonHoc> monhoc=new ArrayList<MonHoc>();
    
    public QuanLyDanhSachMonHoc(ArrayList<MonHoc> monhoc) {
		this.monhoc = monhoc;
	}
	public QuanLyDanhSachMonHoc() {
	}
	
	public void xemDanhSachMonHoc() {
	     for (MonHoc monHoc2 : monhoc) {
			System.out.println(monHoc2);
		}
	}
    public  void xemmontheoNganh() {
    	Collections.sort(this.monhoc,new Comparator<MonHoc>() {

			@Override
			public int compare(MonHoc o1, MonHoc o2) {
				
					return o1.getMaNghanh().compareTo(o2.getMaNghanh());
				}
			
			
		});
    	xemDanhSachMonHoc();
    }

    public void timMonHocTheoTen(String tenMH) {
        for (MonHoc mh : monhoc) {
            if (mh.getTenMonHoc().equals(tenMH))
                System.out.println(mh);
        }
    }
 
    public void docFileMH() {
        try {
            FileReader fr = new FileReader("E:\\huy1\\OOP\\docFileMH");
            BufferedReader bf = new BufferedReader(fr);
            String line = "";
            String[] temp;
                while ((line = bf.readLine()) != null) {
                    temp = line.split(",");
                    MonHoc mon = taoMon(temp);
                    monhoc.add(mon);
                }
            
            bf.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Không tìm thấy file");
        }
    }
public MonHoc taoMon(String[] temp) {
	 String maMonHoc = temp[0];
     String tenMonHoc = temp[1];
     String heDaoTao = temp[2];
     String maNganh = temp[3];
     String tenNganh = temp[4];
     return new MonHoc( maMonHoc, tenMonHoc, heDaoTao,maNganh, tenNganh);

}

	public void ghiFileMH() {
        try {
            FileWriter fw = new FileWriter("E:\\huy1\\OOP\\ghiFileMH");
            BufferedWriter bw = new BufferedWriter(fw);
                for (MonHoc mh : monhoc) {
                    if (mh instanceof MonHoc) {
                        System.out.println("Đang ghi File ...");
                        bw.write(  mh.getMaMonHoc()  + "," +
                                mh.getTenMonHoc()+ "," +
                                mh.getHeDaoTao()+ "," +
                                mh.getMaNghanh()+ "," +
                                mh.getTenNganh() 
                                );
                        bw.newLine();
                    }
                }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.printf("Không có file ");
        }
    }

	public void themMonHoc(MonHoc mh) {
	 	this.monhoc.add(mh);
		
	}
	public boolean xoaMonHoc(MonHoc maMonHoc) {
		
		return this.monhoc.remove(maMonHoc);
	}
	public void capNhapMonHoc(MonHoc hhh) {
		xoaMonHoc(hhh);
		
	}




	
	
}




