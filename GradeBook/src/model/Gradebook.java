package model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;



/**
 * The persistent class for the GRADEBOOK database table.
 * 
 */
@Entity
@Table(name="GRADEBOOK",schema="ORA1")
@NamedQuery(name="Gradebook.findAll", query="SELECT g FROM Gradebook g")
public class Gradebook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GRADEBOOK_GRADEBOOKID_GENERATOR", sequenceName="GRADEBOOK_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GRADEBOOK_GRADEBOOKID_GENERATOR")
	private String gradebookid;

	private String assignmentname;

	//@Temporal(TemporalType.DATE)
	@Column(name="DATE_HW")
	private String dateHw;

	private String grade;

	private String studentid;

	//bi-directional many-to-one association to Assignmenttype
	@ManyToOne
	@JoinColumn(name="TYPEID")
	private Assignmenttype assignmenttype;

	public Gradebook() {
	}

	public String getGradebookid() {
		return this.gradebookid;
	}

	public void setGradebookid(String gradebookid) {
		this.gradebookid = gradebookid;
	}

	public String getAssignmentname() {
		return this.assignmentname;
	}

	public void setAssignmentname(String string) {
		this.assignmentname = string;
	}

	public String getDateHw() {
		return this.dateHw;
	}

	public void setDateHw(String string) {
		this.dateHw = string;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String string) {
		this.grade = string;
	}

	public String getStudentid() {
		return this.studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public Assignmenttype getAssignmenttype() {
		return this.assignmenttype;
	}

	public void setAssignmenttype(Assignmenttype user) {
		this.assignmenttype = user;
	}

	public void setPosttext(String posttext) {
		// TODO Auto-generated method stub
		
	}

	public void setPostdate(Date postdate) {
		// TODO Auto-generated method stub
		
	}

	public void setTypeID(String parameter) {
		// TODO Auto-generated method stub
		
	}

}