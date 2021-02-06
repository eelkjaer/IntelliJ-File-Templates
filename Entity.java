package ${PACKAGE_NAME};

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "${NAME}.deleteAllRows", query = "DELETE from ${NAME}")
public class ${NAME} implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /* Variables here */

  public ${NAME}() {}

  /* Constructor here */

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
    
    /* Default variable that */
    // @Column(name="put_lowercase_name_here", length=75, nullable=false, unique=false)
    // private String putNameHere;
}