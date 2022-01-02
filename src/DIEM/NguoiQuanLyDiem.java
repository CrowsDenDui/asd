package DIEM;

import SINHVIEN.SinhVien;

public interface NguoiQuanLyDiem {
	 public void themDiem(Diem d);
	    public boolean xoaDiem(Diem maSinhVien);
	    public void capnhapdiem(Diem maSinhVien);
	    public void inDanhSachDiem();
	    public void inRaThangDiem(SinhVien masv);
	    public void inRaDiemTrungBinhTungMon();
	    public void InraDiemTBCaoNhat();
	    public void docFileD();
	    public void ghiFileD();
}
