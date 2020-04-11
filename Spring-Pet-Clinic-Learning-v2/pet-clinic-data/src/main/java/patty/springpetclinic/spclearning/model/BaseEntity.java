package patty.springpetclinic.spclearning.model;

import java.io.Serializable;

/**
 * Created by patrickskelley on Apr, 2020
 */
public class BaseEntity implements Serializable {

    // recommendation of Hybernate to use box types vs. primitives (long)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
