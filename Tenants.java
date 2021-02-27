package com.example.propmgmt;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Tenants")
public class Tenants implements Serializable 

{
    public Tenants(Long id, String fullName, String issue, Long buildingNumber,Long unitNumber ) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.issue = issue;
		this.buildingNumber = buildingNumber;
		this.unitNumber = unitNumber;
		
	} 

	private static final long serialVersionUID = 1L;
 
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    @Column (name="User_id")
    private Long id;
    
 
    @Column (name= "fullName")
    private String fullName;
 
    @Column  (name= "issue")
    private String issue;
 
    @Column  (name= "buildingNumber")
    private Long buildingNumber;
 
    @Column  (name= "unitNumber")
    private Long unitNumber;
 
 
 
 
    
    
    public Tenants() {
    }
 
    //Getters and setters
 
    @Override
    public String toString() {
        return "UserInfo [id=" + id + ", fullName=" + fullName + 
               "issue= "  + issue +  "buildingNumber=" + buildingNumber + "unitNumber=" + unitNumber 
                      "];"
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public Long getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(Long buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public Long getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(Long unitNumber) {
		this.unitNumber = unitNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

