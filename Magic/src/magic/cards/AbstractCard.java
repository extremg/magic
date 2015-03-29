package magic.cards;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxime
 */
public abstract class AbstractCard {
    protected String name;
    protected File image;
    protected File background;
    protected String typeCard;
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
