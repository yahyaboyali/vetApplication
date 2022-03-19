/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareforAnimal.vet.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import softwareforAnimal.vet.core.utilities.entities.Person;

/**
 *
 * @author yahya
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="animal")
public class Animal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="animal_id")
    private int animal_id;
    
    @Column(name="species")
    private String species;
    
    @Column(name="genus")
    private String genus;
    
    @Column(name="animal_age")
    private int animal_age;
    
    @Column(name="explanation")
    private String explanation;
    
    @ManyToOne()
    @JoinColumn(name="person")
    private Person person;
}
