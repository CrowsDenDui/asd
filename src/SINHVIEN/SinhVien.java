package SINHVIEN;

import java.util.Comparator;
import java.util.Objects;

public class SinhVien extends ConNguoi implements Comparable<SinhVien> {
private String maSinhVien;
private String heDaoTao;
private String nganh;
private String lop;
private String chucVu;
public SinhVien(String hoVaTen, String diaChi, int namSinh, String soDienThoai, String gioiTinh, String maSinhVien,
		String heDaoTao, String nganh, String lop, String chucVu) {
	super(hoVaTen, diaChi, namSinh, soDienThoai, gioiTinh);
	this.maSinhVien = maSinhVien;
	this.heDaoTao = heDaoTao;
	this.nganh = nganh;
	this.lop = lop;
	this.chucVu = chucVu;
	
}
public SinhVien(String maSinhVien) {
	
	this.maSinhVien = maSinhVien;
}

public SinhVien() {

}

public String getMaSinhVien() {
	return maSinhVien;
}
public void setMaSinhVien(String maSinhVien) {
	this.maSinhVien = maSinhVien;
}
public String getHeDaoTao() {
	return heDaoTao;
}
public void setHeDaoTao(String heDaoTao) {
	this.heDaoTao = heDaoTao;
}
public String getNganh() {
	return nganh;
}
public void setNganh(String nganh) {
	this.nganh = nganh;
}
public String getLop() {
	return lop;
}
public void setLop(String lop) {
	this.lop = lop;
}
public String getChucVu() {
	return chucVu;
}
public void setChucVu(String chucVu) {
	this.chucVu = chucVu;
}
public static void temp() {
	System.out.print("Danh Sách ");
}


@Override
public String toString() {
	return "SinhVien [maSinhVien=" + maSinhVien + ", getHoVaTen()=" + getHoVaTen()+ ", heDaoTao=" + heDaoTao + ", nganh=" + nganh + ", lop=" + lop
			+ ", chucVu=" + chucVu +  ", getDiaChi()="
			+ getDiaChi() + ", getNamSinh()=" + getNamSinh() + ", getSoDienThoai()=" + getSoDienThoai()
			+ ", getGioiTinh()=" + getGioiTinh() + "]";
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SinhVien other = (SinhVien) obj;
	return Objects.equals(maSinhVien, other.maSinhVien);
}

@Override
public int compareTo(SinhVien masv) {
	
	return masv.getMaSinhVien().compareTo(masv.getMaSinhVien());
}






}
