/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.cards;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author maxime
 */
@Entity
@Table(name="Land")
@AttributeOverrides({
    @AttributeOverride(name="name", column=@Column(name="name")),
    @AttributeOverride(name="image", column=@Column(name="image")),
    @AttributeOverride(name="background", column=@Column(name="background")),
    @AttributeOverride(name="typeCard", column=@Column(name="type")),
    @AttributeOverride(name="ssTypeCard", column=@Column(name="sstype"))
    })
public class Land extends AbstractCard {
    @Id
    private Short id;
    
    public Land(String name) {
        super.name = name;
        super.typeCard = "Terrain de base";
        super.ssTypeCard = new ArrayList<>();
        ssTypeCard.add(name);
    }
    
    public Land(List<String> types) {
        super.name = types.get(0);
        super.typeCard = "Terrain de base";
        super.ssTypeCard = new ArrayList<>(types.subList(1, types.size()-1));
    }
    
    @Override
    public String toString() {
       return "Instanciation de la carte [ "+this.name+", type : "+typeCard+" "+ssTypeCard.get(0)+" ]"; 
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }
}
