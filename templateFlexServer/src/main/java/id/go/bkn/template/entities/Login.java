package id.go.bkn.template.entities;

// Generated 06 Nov 14 10:38:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Login generated by hbm2java
 */
@Entity
@Table(name = "login", catalog = "simwasdal")
public class Login implements java.io.Serializable {

	private String id;
	private Instansi instansi;
	private String user;
	private String password;
	private String nipBaru;
	private String nama;
	private String profil;
	private Set<PnsElemenAudit> pnsElemenAudits = new HashSet<PnsElemenAudit>(0);
	private Set<PnsKriteriaAudit> pnsKriteriaAudits = new HashSet<PnsKriteriaAudit>(
			0);

	public Login() {
	}

	public Login(String id, Instansi instansi, String user, String password,
			String nipBaru, String nama) {
		this.id = id;
		this.instansi = instansi;
		this.user = user;
		this.password = password;
		this.nipBaru = nipBaru;
		this.nama = nama;
	}

	public Login(String id, Instansi instansi, String user, String password,
			String nipBaru, String nama, String profil,
			Set<PnsElemenAudit> pnsElemenAudits,
			Set<PnsKriteriaAudit> pnsKriteriaAudits) {
		this.id = id;
		this.instansi = instansi;
		this.user = user;
		this.password = password;
		this.nipBaru = nipBaru;
		this.nama = nama;
		this.profil = profil;
		this.pnsElemenAudits = pnsElemenAudits;
		this.pnsKriteriaAudits = pnsKriteriaAudits;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INSTANSI_ID", nullable = false)
	public Instansi getInstansi() {
		return this.instansi;
	}

	public void setInstansi(Instansi instansi) {
		this.instansi = instansi;
	}

	@Column(name = "USER", nullable = false, length = 100)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "PASSWORD", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "NIP_BARU", nullable = false, length = 18)
	public String getNipBaru() {
		return this.nipBaru;
	}

	public void setNipBaru(String nipBaru) {
		this.nipBaru = nipBaru;
	}

	@Column(name = "NAMA", nullable = false, length = 150)
	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	@Column(name = "PROFIL", length = 1)
	public String getProfil() {
		return this.profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<PnsElemenAudit> getPnsElemenAudits() {
		return this.pnsElemenAudits;
	}

	public void setPnsElemenAudits(Set<PnsElemenAudit> pnsElemenAudits) {
		this.pnsElemenAudits = pnsElemenAudits;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<PnsKriteriaAudit> getPnsKriteriaAudits() {
		return this.pnsKriteriaAudits;
	}

	public void setPnsKriteriaAudits(Set<PnsKriteriaAudit> pnsKriteriaAudits) {
		this.pnsKriteriaAudits = pnsKriteriaAudits;
	}

}