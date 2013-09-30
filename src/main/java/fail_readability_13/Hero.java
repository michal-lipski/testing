package fail_readability_13;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.joda.time.DateTime;

public class Hero {

    String id;
    Person person;
    Organization organization;
    DateTime validFrom;
    Boolean active;
    String name;

    public Hero( String name) {
        this.name = name;
        organization = new Organization();
    }

    public Organization getOrganization() {
        return organization;
    }

    @Override
    public String toString() {
        return super.toString() + " [id=" + id + ", person=" + person + ", validFrom=" + validFrom + ", active=" + active
                + ", organization=" + organization + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
