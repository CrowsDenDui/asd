package SINHVIEN;

public class ConNguoi {
private String hoVaTen;
private String diaChi;
private int namSinh;
private String soDienThoai;
private String gioiTinh;
public ConNguoi(String hoVaTen, String diaChi, int namSinh, String soDienThoai, String gioiTinh) {
	this.hoVaTen = hoVaTen;
	this.diaChi = diaChi;
	this.namSinh = namSinh;
	this.soDienThoai = soDienThoai;
	this.gioiTinh = gioiTinh;
}

public ConNguoi() {
}

public String getHoVaTen() {
	return hoVaTen;
}
public void setHoVaTen(String hoVaTen) {
	this.hoVaTen = hoVaTen;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public int getNamSinh() {
	return namSinh;
}
public void setNamSinh(int namSinh) {
	this.namSinh = namSinh;
}
public String getSoDienThoai() {
	return soDienThoai;
}
public void setSoDienThoai(String soDienThoai) {
	this.soDienThoai = soDienThoai;
}
public String getGioiTinh() {
	return gioiTinh;
}
public void setGioiTinh(String gioiTinh) {
	this.gioiTinh = gioiTinh;
}
@Override
public String toString() {
	return "ConNguoi [hoVaTen=" + hoVaTen + ", diaChi=" + diaChi + ", namSinh=" + namSinh + ", soDienThoai="
			+ soDienThoai + ", gioiTinh=" + gioiTinh + "]";
}



}
