package pga.com.api.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
  @Id
  @PrimaryKeyJoinColumn
  private String id;

  @Column(unique=true,nullable=false,length=30)
  private String email;

  @Column
  private String firstName;

  @Column
  private String lastName;
  @Column
  private Date birthDay;
  @Column
  private String phoneNumber;

}
