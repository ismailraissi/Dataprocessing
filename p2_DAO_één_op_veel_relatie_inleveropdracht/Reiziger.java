package p2_DAO_��n_op_veel_relatie_inleveropdracht;

import java.sql.Date;

public class Reiziger {
	private String naam;
	private Date gbdatum;

	public Reiziger(String naam, Date gbdatum) {
		this.naam = naam;
		this.gbdatum = gbdatum;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String nm) {
		this.naam = nm;
	}

	public Date getGBdatum() {
		return gbdatum;
	}

	public void setGBdatum(Date dt) {
		this.gbdatum = dt;
	}
}
