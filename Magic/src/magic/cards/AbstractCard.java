package magic.cards;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author maxime
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractCard implements Serializable{
    @Column(name="name")
    protected String name;
    @Column(name="image")
    protected File image;
    @Column(name="background")
    protected File background;
    @Column(name="type")
    protected String typeCard;
    @Column(name="ssType")
    protected List<String> ssTypeCard = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public File getBackground() {
        return background;
    }

    public void setBackground(File background) {
        this.background = background;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    public List<String> getSsTypeCard() {
        return ssTypeCard;
    }

    public void setSsTypeCard(List<String> ssTypeCard) {
        this.ssTypeCard = ssTypeCard;
    }
    
    protected String getSSTypeCardToString() {
        StringBuilder res = new StringBuilder();
        ssTypeCard.stream().forEach((ssType) -> {
            res.append(ssType).append(", ");
        });
        return res.toString();
    }
}
