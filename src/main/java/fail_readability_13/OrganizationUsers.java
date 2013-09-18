package fail_readability_13;

public class OrganizationUsers {


    //    @Test
//    public void find_users_by_org_id() {
//        Person person = persister.saveAndFlush(new Person());
//        Person person2 = persister.saveAndFlush(new Person());
//        Organization organization = persister.saveAndFlush(new Organization());
//        User user = persister.saveAndFlush(new User(person, organization));
//        User user2 = persister.saveAndFlush(new User(person2, organization));
//
//        List<User> users = repository.findByOrganizationId(organization.getId());
//
//        assertThat(users).containsOnly(user, user2);
//    }
//
//
//
//    java.lang.AssertionError: expecting:
//    <[com.mach.msp.model.User@851cd169 [id=2, person=Person [id=2, firstName=null, lastName=null, email=null], validFrom=null, active=true, organization=com.mach.msp.model.organization.Organization@5362271d], com.mach.msp.model.User@54a2e177 [id=3, person=Person [id=3, firstName=null, lastName=null, email=null], validFrom=null, active=true, organization=com.mach.msp.model.organization.Organization@5362271d]]>
//    to contain only:
//    <[com.mach.msp.model.User@d6ee4297 [id=2, person=Person [id=2, firstName=null, lastName=null, email=null], validFrom=null, active=true, organization=com.mach.msp.model.organization.Organization@5362271d], com.mach.msp.model.User@a67452a5 [id=3, person=Person [id=3, firstName=null, lastName=null, email=null], validFrom=null, active=true, organization=com.mach.msp.model.organization.Organization@5362271d]]>
//    elements not found:
//    <[com.mach.msp.model.User@a67452a5 [id=3, person=Person [id=3, firstName=null, lastName=null, email=null], validFrom=null, active=true, organization=com.mach.msp.model.organization.Organization@5362271d], com.mach.msp.model.User@d6ee4297 [id=2, person=Person [id=2, firstName=null, lastName=null, email=null], validFrom=null, active=true, organization=com.mach.msp.model.organization.Organization@5362271d]]>
//    and elements not expected:
//    <[com.mach.msp.model.User@851cd169 [id=2, person=Person [id=2, firstName=null, lastName=null, email=null], validFrom=null, active=true, organization=com.mach.msp.model.organization.Organization@5362271d], com.mach.msp.model.User@54a2e177 [id=3, person=Person [id=3, firstName=null, lastName=null, email=null], validFrom=null, active=true, organization=com.mach.msp.model.organization.Organization@5362271d]]>
//




    /*

        Date startDate = new Date(1000);
    Date endDate = new Date(2000);

    the failure message reports that a payment date is wrong but doesn’t
    describe
    where the wrong value might have come from:

    java.lang. AssertionError: payment date
    Expected: <Thu Jan 01 01: 00:01 GMT 1970>
         got: <Thu Jan 01 01: 00:02 GMT 1970>

    What we really want to know is the meaning of these dates. If we force
    the
    display string:

    Date startDate = namedDate(1000, "startDate");
    Date endDate = namedDate(2000, "endDate") ;

    Date namedDate(long timeValue, final String name) {
        return new Date(timeValue) { public String toString( ) { return
    name; } };
    }

    we get a message that describes the role that each date plays:

    java.lang. AssertionError: payment date
    Expected: <startDate>
         got: <endDate>

     */


}
