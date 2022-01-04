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

public class PressureTests {
	@Nested
	public class AtmospheresTests {
		@ParameterizedTest
		@CsvSource({ "6.0,6.0795","1.2,1.2159","0.8,0.8106" })
		public void testConvertKnownAtmospheresToBars(double input, double expectation) {
			final double result = Pressure.Atmospheres.toBars(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.8,81060.0","1.2,121590.0","0.45,45596.25" })
		public void testConvertKnownAtmospheresToPascals(double input, double expectation) {
			final double result = Pressure.Atmospheres.toPascals(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.45,342.0","1.2,912.0","6.0,4560.0" })
		public void testConvertKnownAtmospheresToTorrs(double input, double expectation) {
			final double result = Pressure.Atmospheres.toTorrs(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "6.0,88.1757","0.4,5.87838","1.2,17.6351" })
		public void testConvertKnownAtmospheresToPsi(double input, double expectation) {
			final double result = Pressure.Atmospheres.toPsi(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class BarsTests {
		@ParameterizedTest
		@CsvSource({ "800.0,789.539","123.0,121.392","89.0,87.8362" })
		public void testConvertKnownBarsToAtmospheres(double input, double expectation) {
			final double result = Pressure.Bars.toAtmospheres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.89,89000.0","0.01,1000.0","0.123,12300.0" })
		public void testConvertKnownBarsToPascals(double input, double expectation) {
			final double result = Pressure.Bars.toPascals(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.123,92.257587","2.0,1500.12","8.9,6675.55" })
		public void testConvertKnownBarsToTorrs(double input, double expectation) {
			final double result = Pressure.Bars.toTorrs(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "8.1,117.481","1001.0,14518.29290","6.0,87.0226" })
		public void testConvertKnownBarsToPsi(double input, double expectation) {
			final double result = Pressure.Bars.toPsi(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class PascalsTests {
		@ParameterizedTest
		@CsvSource({ "90000.0,0.88823094","1234567.0,12.18422897","204060.0,2.01391562" })
		public void testConvertKnownPascalsToAtmospheres(double input, double expectation) {
			final double result = Pressure.Pascals.toAtmospheres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "10000.0,0.1","12345.0,0.12345","80000.0,0.8" })
		public void testConvertKnownPascalsToBars(double input, double expectation) {
			final double result = Pressure.Pascals.toBars(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "80000.0,600.04935","1234.0,9.255761","80.0,0.600049" })
		public void testConvertKnownPascalsToTorrs(double input, double expectation) {
			final double result = Pressure.Pascals.toTorrs(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "800.0,0.11603","8670.0,1.257477","1000.0,0.145038" })
		public void testConvertKnownPascalsToPsi(double input, double expectation) {
			final double result = Pressure.Pascals.toPsi(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class PsiTests {
		@ParameterizedTest
		@CsvSource({ "900.0,62.0528","134.0,9.23897","111.2,7.6669701" })
		public void testConvertKnownPsiToBars(double input, double expectation) {
			final double result = Pressure.Psi.toBars(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.9,6205.28","0.03,206.8427","2.0,13789.5" })
		public void testConvertKnownPsiToPascals(double input, double expectation) {
			final double result = Pressure.Psi.toPascals(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "2.0,0.136092","109.0,7.41701","8.0,0.544368" })
		public void testConvertKnownPsiToAtmospheres(double input, double expectation) {
			final double result = Pressure.Psi.toAtmospheres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "6.0,310.29","3.4,175.831","0.5,25.8575" })
		public void testConvertKnownPsiToTorrs(double input, double expectation) {
			final double result = Pressure.Psi.toTorrs(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class TorrsTests {
		@ParameterizedTest
		@CsvSource({ "100.0,0.133322","9000.1,11.9991465","1234.0,1.645198" })
		public void testConvertKnownTorrsToBars(double input, double expectation) {
			final double result = Pressure.Torrs.toBars(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "190.0,25331.2499","6.5,866.595","3.4,453.296" })
		public void testConvertKnownTorrsToPascals(double input, double expectation) {
			final double result = Pressure.Torrs.toPascals(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "5678.0,7.471053","100.0,0.131579","4509.0,5.932895" })
		public void testConvertKnownTorrsToAtmospheres(double input, double expectation) {
			final double result = Pressure.Torrs.toAtmospheres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "4500.0,87.01549","1234.0,23.86158","900.0,17.4031" })
		public void testConvertKnownTorrsToPsi(double input, double expectation) {
			final double result = Pressure.Torrs.toPsi(input);
			assertEquals(expectation, result, 0.01);
		}

	}
}