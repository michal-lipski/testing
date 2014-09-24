/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.examples;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.util.Arrays.*;
import static org.assertj.examples.data.Ring.*;

import java.util.Arrays;

import org.assertj.examples.data.Ring;
import org.assertj.examples.data.TolkienCharacter;
import org.junit.Test;

/**
 * Array assertions examples.
 *
 * @author Joel Costigliola
 */
public class ArrayAssertionsExamples extends AbstractAssertionsExamples {
    //    TODO mlip begginign
    @Test
    public void rings_are_not_empty() throws Exception {
        Ring[] elvesRings = array(vilya, nenya, narya);

    }

    @Test
    public void rings_have_size() throws Exception {
        Ring[] elvesRings = array(vilya, nenya, narya);

    }

    @Test
    public void rings_contains_nenya() throws Exception {
        Ring[] elvesRings = array(vilya, nenya, narya);

    }

    @Test
    public void rings_not_contains_oneRing() throws Exception {
        Ring[] elvesRings = array(vilya, nenya, narya);

    }

    @Test
    public void all_rigs_are_present() throws Exception {
        Ring[] elvesRings = array(vilya, nenya, narya);

    }

    // putting a different order would make the assertion fail :
    @Test
    public void all_rigs_are_present_in_given_order() throws Exception {
        Ring[] elvesRings = array(vilya, nenya, narya);
    }

    @Test
    public void all_rigs_are_present_and_no_other() throws Exception {
        Ring[] elvesRings = array(vilya, nenya, narya);

    }

    @Test
    public void first_element_is_vilya() throws Exception {
        Ring[] elvesRings = array(vilya, nenya, narya);

    }

    @Test
    public void all_elements_are_sorted() throws Exception {
        TolkienCharacter[] fellowshipOfTheRingArray = fellowshipOfTheRing.toArray(new TolkienCharacter[0]);
        Arrays.sort(fellowshipOfTheRingArray, ageComparator);

    }

    @Test
    public void fellowship_contains_heroes_by_names() {
        TolkienCharacter[] fellowshipOfTheRingArray = fellowshipOfTheRing.toArray(new TolkienCharacter[0]);

        //conatins "Boromir", "Gandalf", "Frodo","Legolas"

    }
 @Test
    public void fellowship_does_not_contain_orcs() {
        TolkienCharacter[] fellowshipOfTheRingArray = fellowshipOfTheRing.toArray(new TolkienCharacter[0]);


     //"Hobbit", "Elf", "Orc"

    }

    @Test
    public void charSequence_subclasses_assertions_examples() {
        // StringBuilder have same assertions as String
        StringBuilder stringBuilder = new StringBuilder("Frodo");
        assertThat(stringBuilder).startsWith("Fro").endsWith("do").hasSize(5);
        assertThat(stringBuilder).contains("rod").doesNotContain("fro");
        assertThat(stringBuilder).containsOnlyOnce("do");
    }

    @Test
    public void number_assertions_examples() throws Exception {

        // equals / no equals assertions
        assertThat(sam.age).isEqualTo(38);
        assertThat(frodo.age).isEqualTo(33).isNotEqualTo(sam.age);

        // <= < > >= assertions
        assertThat(sam.age).isGreaterThan(frodo.age).isGreaterThanOrEqualTo(38);
        assertThat(frodo.age).isLessThan(sam.age).isLessThanOrEqualTo(33);
        assertThat(sam.age).isBetween(frodo.age, gimli.age);

        // shortcuts for assertions : > 0, < 0 and == 0
        assertThat(frodo.age - frodo.age).isZero();
        assertThat(frodo.age - sauron.age).isNegative();
        assertThat(gandalf.age - frodo.age).isPositive();

        assertThat(frodo.age - frodo.age).isNotNegative();
        assertThat(frodo.age - frodo.age).isNotPositive();
        assertThat(gandalf.age - frodo.age).isNotNegative();
        assertThat(frodo.age - sauron.age).isNotPositive();
    }

//    TODO mlip end



}
