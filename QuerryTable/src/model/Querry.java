package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the QUERRY database table.
 * 
 */
@Entity
@NamedQuery(name="Querry.findAll", query="SELECT q FROM Querry q")
public class Querry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="QUERRY_QUERRYID_GENERATOR", sequenceName="QUERRY_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="QUERRY_QUERRYID_GENERATOR")
	private long querryid;

	private String querry;

	public Querry() {
	}

	public long getQuerryid() {
		return this.querryid;
	}

	public void setQuerryid(long querryid) {
		this.querryid = querryid;
	}

	public String getQuerry() {
		return this.querry;
	}

	public void setQuerry(String querry) {
		this.querry = querry;
	}

}