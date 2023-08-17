package edu.miu.cs.cs425.sweprojectmycopy.model;

import edu.miu.cs.cs425.sweprojectmycopy.consant.RoleType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    private RoleType roleType;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

}
