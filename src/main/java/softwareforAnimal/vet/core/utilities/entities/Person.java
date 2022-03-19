/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareforAnimal.vet.core.utilities.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import softwareforAnimal.vet.entities.concretes.Animal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="person")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int person_id;

    @Column(name = "person_name")
    private String person_name;

    @Column(name = "person_lastname")
    private String person_lastname;

    @Column(name = "phone_number")
    private String phone_number;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "authority")
    private String authority;
    
    @OneToMany(mappedBy = "person")
    private List<Animal> dailyRoutines;

}
