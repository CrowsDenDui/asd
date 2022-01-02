package MONHOC;

public class MonThuocNganh {
private String maNganh;
private String tenNganh;
public MonThuocNganh(String maNganh, String tenNganh) {
	this.maNganh = maNganh;
	this.tenNganh = tenNganh;
}

public MonThuocNganh() {
}

public String getMaNghanh() {
	return maNganh;
}
public void setMaNghanh(String maNganh) {
	this.maNganh = maNganh;
}
public String getTenNganh() {
	return tenNganh;
}
public void setTenNganh(String tenNganh) {
	this.tenNganh = tenNganh;
}
@Override
public String toString() {
	return "MonThuocNganh [maNganh=" + maNganh + ", tenNganh=" + tenNganh + "]";
}

}
