// <auto-generated>
// This code was generated by the UnitCodeGenerator tool
//
// Changes to this file will be lost if the code is regenerated
// </auto-generated>

package com.putridparrot.units;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedTests {
	@Nested
	public class FeetPerSecondTests {
		@ParameterizedTest
		@CsvSource({ "14.5,9.886364","100.0,68.1818","1.6,1.09091" })
		public void testConvertKnownFeetPerSecondToMilesPerHour(double input, double expectation) {
			final double result = Speed.FeetPerSecond.toMilesPerHour(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1.5,1.64592","67.9,74.50531","109.0,119.604" })
		public void testConvertKnownFeetPerSecondToKilometresPerHour(double input, double expectation) {
			final double result = Speed.FeetPerSecond.toKilometresPerHour(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "10.8,3.29184","66.0,20.1168","2.3,0.70104" })
		public void testConvertKnownFeetPerSecondToMetresPerSecond(double input, double expectation) {
			final double result = Speed.FeetPerSecond.toMetresPerSecond(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "2.3,1.36271","666.0,394.594","17.1,10.13147" })
		public void testConvertKnownFeetPerSecondToKnots(double input, double expectation) {
			final double result = Speed.FeetPerSecond.toKnots(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class KilometresPerHourTests {
		@ParameterizedTest
		@CsvSource({ "67.0,41.6319","12.0,7.45645","6.3,3.91464" })
		public void testConvertKnownKilometresPerHourToMilesPerHour(double input, double expectation) {
			final double result = Speed.KilometresPerHour.toMilesPerHour(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "5.0,4.55672","1.5,1.36702","89.8,81.83873" })
		public void testConvertKnownKilometresPerHourToFeetPerSecond(double input, double expectation) {
			final double result = Speed.KilometresPerHour.toFeetPerSecond(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "67.0,18.6111","5.9,1.63889","900.0,250.0" })
		public void testConvertKnownKilometresPerHourToMetresPerSecond(double input, double expectation) {
			final double result = Speed.KilometresPerHour.toMetresPerSecond(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "900.0,485.961","3.9,2.10583","12.0,6.47948" })
		public void testConvertKnownKilometresPerHourToKnots(double input, double expectation) {
			final double result = Speed.KilometresPerHour.toKnots(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class KnotsTests {
		@ParameterizedTest
		@CsvSource({ "8.0,9.20624","1.2,1.38094","670.0,771.022" })
		public void testConvertKnownKnotsToMilesPerHour(double input, double expectation) {
			final double result = Speed.Knots.toMilesPerHour(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "678.0,1255.66","1.8,3.3336","56.0,103.712" })
		public void testConvertKnownKnotsToKilometresPerHour(double input, double expectation) {
			final double result = Speed.Knots.toKilometresPerHour(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "56.0,94.5174","4.7,7.93271","3.0,5.06343" })
		public void testConvertKnownKnotsToFeetPerSecond(double input, double expectation) {
			final double result = Speed.Knots.toFeetPerSecond(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "5.0,2.57222","9.1,4.68144","190.0,97.7444" })
		public void testConvertKnownKnotsToMetresPerSecond(double input, double expectation) {
			final double result = Speed.Knots.toMetresPerSecond(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class MetresPerSecondTests {
		@ParameterizedTest
		@CsvSource({ "13.0,29.0802","6.7,14.9875","140.0,313.171" })
		public void testConvertKnownMetresPerSecondToMilesPerHour(double input, double expectation) {
			final double result = Speed.MetresPerSecond.toMilesPerHour(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "800.0,2880.0","7.8,28.08","9000.0,32400.0" })
		public void testConvertKnownMetresPerSecondToKilometresPerHour(double input, double expectation) {
			final double result = Speed.MetresPerSecond.toKilometresPerHour(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "9000.0,29527.56","3.4,11.1549","12.0,39.3701" })
		public void testConvertKnownMetresPerSecondToFeetPerSecond(double input, double expectation) {
			final double result = Speed.MetresPerSecond.toFeetPerSecond(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "12.0,23.3261","6.3,12.2462","9.0,17.4946" })
		public void testConvertKnownMetresPerSecondToKnots(double input, double expectation) {
			final double result = Speed.MetresPerSecond.toKnots(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class MilesPerHourTests {
		@ParameterizedTest
		@CsvSource({ "345.0,555.224","1.6,2.57495","0.5,0.804672" })
		public void testConvertKnownMilesPerHourToKilometresPerHour(double input, double expectation) {
			final double result = Speed.MilesPerHour.toKilometresPerHour(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.5,0.733333","123.0,180.4","4.5,6.6" })
		public void testConvertKnownMilesPerHourToFeetPerSecond(double input, double expectation) {
			final double result = Speed.MilesPerHour.toFeetPerSecond(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "4.5,2.01168","100.0,44.704","40.0,17.8816" })
		public void testConvertKnownMilesPerHourToMetresPerSecond(double input, double expectation) {
			final double result = Speed.MilesPerHour.toMetresPerSecond(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "30.0,26.0693","4.5,3.91039","55.0,47.7937" })
		public void testConvertKnownMilesPerHourToKnots(double input, double expectation) {
			final double result = Speed.MilesPerHour.toKnots(input);
			assertEquals(expectation, result, 0.01);
		}

	}
}