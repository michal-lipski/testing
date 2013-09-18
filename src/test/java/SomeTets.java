import static com.google.common.collect.Lists.*;
import static org.fest.assertions.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.fest.assertions.api.Assertions;
import org.joda.time.LocalDate;
import org.junit.Test;


public class SomeTets {

//!!!!!!!!!!!!!!!!!!
    //REFACTORING IMPLEMENTATIONS WITHOUT BREAKING TESTS, AND THAT IS WHAT WE ARE LOOKING FOR IN TDD.


    //how to write bad unit test - przyklady


//    sniperMakesAHigherBidButLoses
//    sniperWinsAnAuctionByBiddingHigher
//    bidsHigherAndReportsBiddingWhenNewPriceArrives
//    reportsIsWinningWhenCurrentPriceComesFromSniper
//
//
//    sniper_makes_a_higher_bid_but_loses
//    sniper_wins_an_auction_by_bidding_higher
//    bids_higher_and_reports_bidding_when_new_price_arrives
//    reports_is_winning_when_current_price_comes_from_sniper


    @org.junit.Test
    public void should_() throws Exception {
        User youngUser = new User().age(20);
        User oldUser = new User().age(33);
        ArrayList<User> users = newArrayList(youngUser, oldUser);
        ActiveUsersService activeUsersService = new ActiveUsersService();

        activeUsersService.getOldUsers(users);

        Assertions.assertThat(users).containsExactly(youngUser);
    }

    class TestedUser extends User {
        @Override
        public String toString() {
            return "User with age" + getAge();
        }
    }

//    not needed details in setup - builder
    @org.junit.Test
    public void extensive_fixture() throws Exception {
        User youngUser = new User("John","Doe","Warsaw",23,LocalDate.now());
        User oldUser = new User("Bob","Doe","Warsaw",39,LocalDate.now());
        ArrayList<User> users = newArrayList(youngUser, oldUser);
        ActiveUsersService activeUsersService = new ActiveUsersService();

        activeUsersService.getOldUsers(users);

        Assertions.assertThat(users).containsExactly(youngUser);
    }


    //many assertions
    @org.junit.Test
    public void assertions() throws Exception {
        User youngUser = new User("John","Doe","Warsaw",23,LocalDate.now());
        User oldUser = new User("Bob","Doe","Warsaw",39,LocalDate.now());
        ArrayList<User> users = newArrayList(youngUser, oldUser);
        ActiveUsersService activeUsersService = new ActiveUsersService();

        activeUsersService.getOldUsers(users);

        Assertions.assertThat(users).containsExactly(youngUser);
    }

//-------------------------------------------------------------------------------------------------------
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

//    ------------------------------------------------------------------------------------------------------------------------



    //Success Against All Odds [2]
    //A test that was written pass first rather than fail first. As an unfortunate side effect, the test case happens to always pass even
    //though the test should fail.


    public void TurnOnLowTemperatureAlarmAtThreshold()
    {
//        environment.Temperature = WAY_TOO_COLD;
//        controller.Tick();
//        Assert.True(environmentalSystem.IsHeaterOn);
//        Assert.True(environmentalSystem.IsBlowerOn);
//        Assert.False(environmentalSystem.IsCoolerOn);
//        Assert.False(environmentalSystem.IsHighTemperatureAlarmOn);
//        Assert.True(environmentalSystem.IsLowTemperatureAlarmOn);
    }


    //Tests that verify the implementation rather than the behavior

    //gui testing page object pattern

    //Guideline #1: Know what you're testing
    //Calculator example and any assertions



    //Tests should be deterministic
    //test ze sleepem - z falshek ta biblioteka


    //assercje na rzucanie wyjatkow


    //trudna assercja stworzenie wlasnej assercji

    //powtorzenie testu kilka razy - jumit params



    //classical TDD instead of mockist approach - za duzo mockow i false negative prezyt refactoring testy procesora

    //1) people write tests against operations and classes rather than against behaviours
    //2) people couple implementation details to tests because they don't understand the refactoring process cycle correctly


    //http://codebetter.com/iancooper/2011/10/06/avoid-testing-implementation-details-test-behaviours/

    //TDD, where did it all go wrong?
    //o problemie z testowaniem utrzymaniem, powinny pomagac w refactoring refactoring a failuja
    //zastanawiasz sie duct tape, refctoring spraeia CI klopoty


   // “In TDD we use refactoring in an interesting way. Usually, a refactoring cannot change the semantics of the program under any
  //  circumstances. In TDD, the circumstances we care about are the tests that are already passing.”

   // When we refactor we don’t want to break tests. If our tests know too much about our implementation, that will be difficult,
   // because changes to our implementation will necessarily result in us re-writing tests – at which point we are not refactoring.

    //do we really need to write all these tests? Couldn't we write less tests? Couldn't we go faster?)

    //TDD rebooted

    //A lot of the bad advice about TDD has come from believing that it means testing a module in isolation from other modules,
    //so that you essentially can only have one class  under test and you have to have everything else mocked out.
    //That's bad, wrong type of advice, please don't follow that.

    //are things that prevent your test from being isolated, not your class under test from being isolated."

    //code smells, feature envy, inappropriate intimacy, shotgun surgery


//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! - Przyklad zly test z mockami i proba refactoringu przeniesienie klasy
//    Let's say for example I have several lines of code, and there are definite violations of the SRP and I think, you know what, I need to break out a class with a couple of methods from this basically large transaction script, 30 line of code, to hold that responsibility separately from this class. That is actually a safe refactoring: you can do a couple of extract methods...very straightforward stuff, I NEED NO NEW TESTS. I haven't added any code that isn't covered by an existing test. The test that is basically currently green against my public API is actually protecting this code and covering it, if I run a code coverage tool...I ought to find that I am still covered across my codebase. IF I ADD NEW TESTS AT THIS POINT I AM COUPLING MY TESTS AND MY IMPLEMENTATION DETAILS, AND WHEN I CHANGE MY IMPLEMENTATION DETAILS IN FUTURE THOSE TESTS WILL BREAK. THESE SHOULD BE USUALLY INTERNALS OR PRIVATES BECAUSE THEY ARE EXPRESSING HOW WE IMPLEMENT THE API, THEY ARE NOT THE API THAT IS ORIGINALLY UNDER TEST.
//
//    SO THIS IS WHY YOU ARE WRITING LESS TESTS. Because what happens at this point is people say oh, you know what, I need a new class here, to basically deal with these 30 lines  of code, I'll go and write some test for that class. DON'T DO THAT. BECAUSE THAT'S WHAT WRITES TESTS AGAINST IMPLEMENTATION DETAILS. THE API IS YOUR CONTRACT, THE UNCHANGING THING, AND THAT IS WHAT IS COVERED IN YOUR TEST. THESE ARE IMPLEMENTATION DETAILS AND SUBJECT TO CHANGE. You might refactor it and say this is a perfect example of how to use the composite pattern. Someone may come along later and say you know hat, composite was really a bad choice, let' change the way we do that. It's an implementation detail, that is the whole point of refactoring. You can change that implementation, make it clearer, make it better, but the API remains the same. As soon as you write tests at this point, against those refactoring opportunities, you bind your implementation details to your tests. COUPLING IS THE BIGGEST PROBLEM IN S/W DEV. IT IS YOUR ENEMY. PEOPLE TALK ABOUT DRY. FORGET DRY. COUPLING WILL KILL YOU. DRY IS REALLY A SPECIAL CASE OF COUPLING IN A WAY. COUPLING IS WHAT KILLS YOU AND DO NOT COUPLE YOUR TESTS TO YOUR IMPLEMENTATION DETAILS.




    //"Generally, in this kind of model, what you are mocking is not these internals. Don't mock internals. Do not mock your implementation details, because then you couple your tests to your implementation details through your mocks.

//


    //TDD rebooted

//    Wydaje Ci się że testy CIę spowalniają? Failują przy każdej próbie refactoring i są ciężkie w utrzymaniu
//    Ile testów naprawdę potrzebujemy? Może jak napiszemy ich mniej będziemy mogli programowac szybciej?
    //Jak zmienic na napisać utrzymywalne testy tak zebys nie bal sie refactorowac swojego kodu



 //   -- CO TEN TEST MI MÓWI czy mam zmienic test czy implementacje


    //--naming method tak zeby bylo WHEN

//POWODY
    //1. writing test not against behaviour but against operation on classes and methods
        // - new piece of behaviour is need for test not a new class
        // - testing outside - in
        // -





    //2. coupling implementation details with tests

//------------------------------------------------------------------------------------------------------------------

// Make it run, make it right

    //Refactoring no new tests here


    //Cwiczenie na to ze trzeba implementowac jak najprostsza droga a potem refactorowac.
    // Wtedy bedziemy miec tyle testow ile trzeba@@@@@@@@@@@@

    //implementujemy klase - piszemy test ze wola kolejna klase
    //implementujemy nowa klase - piszemy ja i robimy test
    //piszemy test ze wola klase ...

    //wszystko dziala - probujemy zrobi refactoring - wywala sie !!!


    //implementujemy nowy kawalek kodu wszystko w jednej klasie bez nowych klas i wyekstrachowanych metod
    //piszemy na to test i jak dziala to nie zmieniamy

    //potem robimy refactoring i sprawzamy czy sie dalej nie wywalilo


  //  ========== Pytanie jak robic z metodami ktore sa typu commnad



    //--This topic has always interested me because its a fundamental choice. You either do what you describe here and use refactoring as a key design tool, or start using unit testing to drive deeper and deeper into your design. Both approaches have their advantages.


    //classical TDD instead of mockist approach

    //Refactor. This is the only time you should add design. This is when you might extract a method, add elements of a design pattern, create additional classes or whatever needs to be done to pay penance to the sinful way you achieved green.

    //When you do this right, you end up with several classes that are all tested by a single test-class. This is how things should be.
    //The tests document the requirements of the system with minimal knowledge of the implementation. The implementation could be One
    //Massive Function®or it could be a bunch of classes










    //====================
    //Show me a test with a lot of mocked method calls, and I’ll show you a class under test which violates the law of Demeter. And which
    //is, consequently, a liability to future code changes.
}
