package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ASSIGNMENTTYPE database table.
 * 
 */
@Entity
@NamedQuery(name="Assignmenttype.findAll", query="SELECT a FROM Assignmenttype a")
public class Assignmenttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ASSIGNMENTTYPE_TYPEID_GENERATOR", sequenceName="ASSIGNMENTTYPE_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ASSIGNMENTTYPE_TYPEID_GENERATOR")
	private String typeid;

	private String description;

	//bi-directional many-to-one association to Gradebook
	@OneToMany(mappedBy="assignmenttype")
	private List<Gradebook> gradebooks;

	public Assignmenttype() {
	}

	public String getTypeid() {
		return this.typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Gradebook> getGradebooks() {
		return this.gradebooks;
	}

	public void setGradebooks(List<Gradebook> gradebooks) {
		this.gradebooks = gradebooks;
	}

	public Gradebook addGradebook(Gradebook gradebook) {
		getGradebooks().add(gradebook);
		gradebook.setAssignmenttype(this);

		return gradebook;
	}

	public Gradebook removeGradebook(Gradebook gradebook) {
		getGradebooks().remove(gradebook);
		gradebook.setAssignmenttype(null);

		return gradebook;
	}

}