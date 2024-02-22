package XindusTrade.Assignment.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "items")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private double price;
    private int numberOfUnits;
    private boolean isAvailable; // This attributes indicates that whether the item is in stock or out of stock.
                                 // Note:- This attribute has no use. We can think a scenario with this

    public Item(int id, String name, String description, double price, int numberOfUnits, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.numberOfUnits = numberOfUnits;
        this.isAvailable = isAvailable;
    }
     @ManyToMany(mappedBy = "wishlist")
     private Set<User> users = new HashSet<>();

}
