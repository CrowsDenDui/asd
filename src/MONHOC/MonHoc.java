package MONHOC;

import java.util.Comparator;
import java.util.Objects;

public class MonHoc extends MonThuocNganh implements Comparator<MonHoc> {
	 private String maMonHoc;
	    private String tenMonHoc;
	    private String heDaoTao;
		public MonHoc( String maMonHoc, String tenMonHoc, String heDaoTao,String maNganh, String tenNganh) {
			super(maNganh, tenNganh);
			this.maMonHoc = maMonHoc;
			this.tenMonHoc = tenMonHoc;
			this.heDaoTao = heDaoTao;
		}
		
		public MonHoc(String mh) {
			this.maMonHoc = mh;
		}
		

		public MonHoc() {
			
		}

		public String getMaMonHoc() {
			return maMonHoc;
		}
		public void setMaMonHoc(String maMonHoc) {
			this.maMonHoc = maMonHoc;
		}
		public String getTenMonHoc() {
			return tenMonHoc;
		}
		public void setTenMonHoc(String tenMonHoc) {
			this.tenMonHoc = tenMonHoc;
		}
		public String getHeDaoTao() {
			return heDaoTao;
		}
		public void setHeDaoTao(String heDaoTao) {
			this.heDaoTao = heDaoTao;
		}
	
	
	

		@Override
		public String toString() {
			return "MonHoc [maMonHoc=" + maMonHoc + ", tenMonHoc=" + tenMonHoc + ", heDaoTao=" + heDaoTao
					+ ", getMaNghanh()=" + getMaNghanh() + ", getTenNganh()=" + getTenNganh() + "]";
		}

		

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MonHoc other = (MonHoc) obj;
			return Objects.equals(maMonHoc, other.maMonHoc);
		}

		@Override
		public int compare(MonHoc o1, MonHoc o2) {
			
			return o1.getMaNghanh().compareTo(o2.getMaNghanh());
		}
				

		
	    
}