package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Authorities implements Serializable {




    @Id
    @Column(name = "id")
    Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }







    private String authority;





    @Basic
    @Column(name = "authority")
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authorities that = (Authorities) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(authority, that.authority);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, authority);
    }
}
