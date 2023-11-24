package jaxb.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "organisation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Organisation {
    private String orgNo;
    private String orgName;
    private String location;

    @XmlElementWrapper(name = "departments")
    @XmlElement(name = "department")
    private List<Department> departments;

    /**
     * This default constructor is required if there are other constructors.
     */
    public Organisation() {

    }

    public Organisation(String orgNo, String orgName, String location) {
        this.orgNo = orgNo;
        this.orgName = orgName;
        this.location = location;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Department> getDepartment() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

}
