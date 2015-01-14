package id.go.bkn.template.entities;

// Generated 06 Nov 14 10:38:19 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * KewenanganDetail generated by hbm2java
 */
@Entity
@Table(name = "kewenangan_detail", catalog = "simwasdal")
public class KewenanganDetail implements java.io.Serializable {

	private String id;
	private String nama;
	private String cepatKode;

	public KewenanganDetail() {
	}

	public KewenanganDetail(String id, String nama) {
		this.id = id;
		this.nama = nama;
	}

	public KewenanganDetail(String id, String nama, String cepatKode) {
		this.id = id;
		this.nama = nama;
		this.cepatKode = cepatKode;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "NAMA", nullable = false, length = 150)
	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@Column(name = "CEPAT_KODE", length = 3)
	public String getCepatKode() {
		return this.cepatKode;
	}

	public void setCepatKode(String cepatKode) {
		this.cepatKode = cepatKode;
	}

}