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
import static org.assertj.core.util.Dates.*;

import java.util.Date;

import org.junit.Test;

/**
 * Date assertions examples.<br>
 *
 * @author Joel Costigliola
 */
public class DateAssertionsExamples extends AbstractAssertionsExamples {

    //    TODO mlip begginign

  @Test
  public void basic_date_assertions_examples() {
    // isEqualTo, isAfter, isBefore assertions
    assertThat(theTwoTowers.getReleaseDate()).isEqualTo(parse("2002-12-18")).isEqualTo("2002-12-18")
      .isAfter(theFellowshipOfTheRing.getReleaseDate()).isBefore(theReturnOfTheKing.getReleaseDate())
      .isNotEqualTo(parse("2002-12-19")).isNotEqualTo("2002-12-19");

    assertThat(theTwoTowers.getReleaseDate()).isEqualTo(parse("2002-12-18")).isAfter("2002-12-17")
      .isBefore("2002-12-19");

    assertThat(theReturnOfTheKing.getReleaseDate()).isBeforeYear(2004).isAfterYear(2001);

    // isIn isNotIn works with String based date parameter
    assertThat(theTwoTowers.getReleaseDate()).isIn("2002-12-17", "2002-12-18", "2002-12-19");
    assertThat(theTwoTowers.getReleaseDate()).isNotIn("2002-12-17", "2002-12-19");

    assertThat(new Date(42)).hasTime(42);
    assertThat(new Date(new Date().getTime() -1)).isInThePast();
  }
    //    TODO mlip end


}
