package SINHVIEN;

public interface NguoiQuanLyDanhSachSV {
	public void themSinhVien(SinhVien sinhVien);
    public void suaThongTin(SinhVien sv);
   public void inDanhSachSinhVien() ;
    public void docFileSV();
    public void ghiFileSV();
    public boolean kiemTraDanhSachCRongHayKhong();
    public int laySoLuongSinhVien();
    public void lamRongDanhSach();
    public boolean kiemTraTonTai(SinhVien sv);
    public boolean xoaSinhVien(SinhVien sv);
    public void timSinhVien(String ten);
    public void sapXepDanhSachTheoNamSinhTangDan();
}
