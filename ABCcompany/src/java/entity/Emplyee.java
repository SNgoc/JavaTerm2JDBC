/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "emplyee", catalog = "Company", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emplyee.findAll", query = "SELECT e FROM Emplyee e"),
    @NamedQuery(name = "Emplyee.findByEmpCode", query = "SELECT e FROM Emplyee e WHERE e.empCode = :empCode"),
    @NamedQuery(name = "Emplyee.findByEmpName", query = "SELECT e FROM Emplyee e WHERE e.empName = :empName"),
    @NamedQuery(name = "Emplyee.findBySalary", query = "SELECT e FROM Emplyee e WHERE e.salary = :salary"),
    @NamedQuery(name = "Emplyee.findByAge", query = "SELECT e FROM Emplyee e WHERE e.age = :age"),
    @NamedQuery(name = "Emplyee.findByEmail", query = "SELECT e FROM Emplyee e WHERE e.email = :email")})
public class Emplyee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "empCode", nullable = false, length = 10)
    private String empCode;
    @Size(max = 40)
    @Column(name = "empName", length = 40)
    private String empName;
    @Column(name = "Salary")
    private Integer salary;
    @Column(name = "Age")
    private Integer age;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "Email", length = 50)
    private String email;

    public Emplyee() {
    }

    public Emplyee(String empCode, String empName, Integer salary, Integer age, String email) {
        this.empCode = empCode;
        this.empName = empName;
        this.salary = salary;
        this.age = age;
        this.email = email;
    }

    public Emplyee(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empCode != null ? empCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emplyee)) {
            return false;
        }
        Emplyee other = (Emplyee) object;
        if ((this.empCode == null && other.empCode != null) || (this.empCode != null && !this.empCode.equals(other.empCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Emplyee[ empCode=" + empCode + " ]";
    }
    
}
