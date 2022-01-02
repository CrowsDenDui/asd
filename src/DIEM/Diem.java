package DIEM;

import java.util.Objects;

import MONHOC.MonHoc;
import SINHVIEN.SinhVien;

public class Diem extends Temp{
	private double diemQuaTrinh;
    private double diemCuoiKy;
	public Diem(SinhVien maSinhVien, MonHoc maMonHoc, double diemQuaTrinh, double diemCuoiKy) {
		super(maSinhVien, maMonHoc);
		this.diemQuaTrinh = diemQuaTrinh;
		this.diemCuoiKy = diemCuoiKy;
	}
	
	public Diem(SinhVien maSinhVien) {
		super(maSinhVien);
	}


	public double getDiemQuaTrinh() {
		return diemQuaTrinh;
	}
	public void setDiemQuaTrinh(double diemQuaTrinh) {
		this.diemQuaTrinh = diemQuaTrinh;
	}
	public double getDiemCuoiKy() {
		return diemCuoiKy;
	}
	public void setDiemCuoiKy(double diemCuoiKy) {
		this.diemCuoiKy = diemCuoiKy;
	}

	@Override
	public String toString() {
		return "diem1 [diemQuaTrinh=" + diemQuaTrinh + ", diemCuoiKy=" + diemCuoiKy + ", getMaSinhVien()="
				+ getMaSinhVien() + ", getMaMonHoc()=" + getMaMonHoc() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diem other = (Diem) obj;
		return Double.doubleToLongBits(diemCuoiKy) == Double.doubleToLongBits(other.diemCuoiKy)
				&& Double.doubleToLongBits(diemQuaTrinh) == Double.doubleToLongBits(other.diemQuaTrinh);
	}

}
