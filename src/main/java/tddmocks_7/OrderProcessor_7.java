package tddmocks_7;

public class OrderProcessor_7 {

    public void doStuff(Order order) {
        //validate order
        //calculate price
        //calculate discount
        //sendToDispatcher
    }

//Build Dumb, Refactor Smart:
//    * test-first programming (my personal definition), in which the programmer attempts to design the system up front in detail, then uses tests to "type it in correctly", used mostly as a defect-avoidance technique, but not allowing for the design to evolve, as TDD does

    private class Order {
    }
}
