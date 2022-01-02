package DIEM;

import java.util.Comparator;
import java.util.Objects;

import MONHOC.MonHoc;
import SINHVIEN.SinhVien;

public class Temp {
private SinhVien maSinhVien;
private MonHoc maMonHoc;
public Temp(SinhVien maSinhVien, MonHoc maMonHoc) {
	this.maSinhVien = maSinhVien;
	this.maMonHoc = maMonHoc;
}

public Temp(SinhVien maSinhVien) {
	this.maSinhVien = maSinhVien;
}

public SinhVien getMaSinhVien() {
	return maSinhVien;
}
public void setMaSinhVien(SinhVien maSinhVien) {
	this.maSinhVien = maSinhVien;
}
public MonHoc getMaMonHoc() {
	return maMonHoc;
}
public void setMaMonHoc(MonHoc maMonHoc) {
	this.maMonHoc = maMonHoc;
}
@Override
public String toString() {
	return "CacMa [maSinhVien=" + maSinhVien + ", maMonHoc=" + maMonHoc + "]";
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Temp other = (Temp) obj;
	return Objects.equals(maSinhVien, other.maSinhVien);
}


}
