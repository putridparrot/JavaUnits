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

public class MassTests {
	@Nested
	public class GramsTests {
		@ParameterizedTest
		@CsvSource({ "1.2,1200.0","0.9,900.0","2.0,2000.0" })
		public void testConvertKnownGramsToMilligrams(double input, double expectation) {
			final double result = Mass.Grams.toMilligrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "900.0,0.9","12345.0,12.345","670.0,0.67" })
		public void testConvertKnownGramsToKilograms(double input, double expectation) {
			final double result = Mass.Grams.toKilograms(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "6700000.0,6.7","123456.0,0.123456","9809789.0,9.809789" })
		public void testConvertKnownGramsToTonnes(double input, double expectation) {
			final double result = Mass.Grams.toTonnes(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "4.3,0.151678","170.0,5.99657","9.0,0.317466" })
		public void testConvertKnownGramsToOunces(double input, double expectation) {
			final double result = Mass.Grams.toOunces(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "80.0,0.17637","190.0,0.418878","4500.0,9.920802" })
		public void testConvertKnownGramsToPounds(double input, double expectation) {
			final double result = Mass.Grams.toPounds(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "8000.0,1.259784","12345.0,1.9440047","900.0,0.141726" })
		public void testConvertKnownGramsToStones(double input, double expectation) {
			final double result = Mass.Grams.toStones(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class KilogramsTests {
		@ParameterizedTest
		@CsvSource({ "0.9,900000.0","0.56,560000.0","0.007,7000.0" })
		public void testConvertKnownKilogramsToMilligrams(double input, double expectation) {
			final double result = Mass.Kilograms.toMilligrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.8,800.0","12.0,12000.0","0.2,200.0" })
		public void testConvertKnownKilogramsToGrams(double input, double expectation) {
			final double result = Mass.Kilograms.toGrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "123.0,0.123","9000.0,9.0","2300.0,2.3" })
		public void testConvertKnownKilogramsToTonnes(double input, double expectation) {
			final double result = Mass.Kilograms.toTonnes(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "2300.0,81130.19","12.0,423.288","3.4,119.931" })
		public void testConvertKnownKilogramsToOunces(double input, double expectation) {
			final double result = Mass.Kilograms.toOunces(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "3.4,7.49572","0.9,1.98416","3.0,6.61387" })
		public void testConvertKnownKilogramsToPounds(double input, double expectation) {
			final double result = Mass.Kilograms.toPounds(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "3.0,0.472419","98.0,15.4324","1.2,0.188968" })
		public void testConvertKnownKilogramsToStones(double input, double expectation) {
			final double result = Mass.Kilograms.toStones(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class MilligramsTests {
		@ParameterizedTest
		@CsvSource({ "190.0,0.19","2300.0,2.3","19000.0,19.0" })
		public void testConvertKnownMilligramsToGrams(double input, double expectation) {
			final double result = Mass.Milligrams.toGrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1234567.0,1.234567","900800.0,0.9008","7800000.0,7.8" })
		public void testConvertKnownMilligramsToKilograms(double input, double expectation) {
			final double result = Mass.Milligrams.toKilograms(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "900000000.0,0.9","60000000.0,0.06","123456789.0,0.123456789" })
		public void testConvertKnownMilligramsToTonnes(double input, double expectation) {
			final double result = Mass.Milligrams.toTonnes(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "6000.0,0.2116438","123456.0,4.35478225","8001.0,0.282227" })
		public void testConvertKnownMilligramsToOunces(double input, double expectation) {
			final double result = Mass.Milligrams.toOunces(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "123456.0,0.27217389","800900.0,1.76568226","666666.0,1.46974694" })
		public void testConvertKnownMilligramsToPounds(double input, double expectation) {
			final double result = Mass.Milligrams.toPounds(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "900000.0,0.14172574","12345678.0,1.9441115001","800100.0,0.125994183" })
		public void testConvertKnownMilligramsToStones(double input, double expectation) {
			final double result = Mass.Milligrams.toStones(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class OuncesTests {
		@ParameterizedTest
		@CsvSource({ "0.2,5669.9","12.0,340194.2772","1.8,51029.141579" })
		public void testConvertKnownOuncesToMilligrams(double input, double expectation) {
			final double result = Mass.Ounces.toMilligrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "2.0,56.699","0.3,8.50486","7.0,198.447" })
		public void testConvertKnownOuncesToGrams(double input, double expectation) {
			final double result = Mass.Ounces.toGrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "56.0,1.58757","123.0,3.48699","100.9,2.8604669" })
		public void testConvertKnownOuncesToKilograms(double input, double expectation) {
			final double result = Mass.Ounces.toKilograms(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "8000.0,0.2267962","1234567.0,34.99938572","900800.0,25.5372504" })
		public void testConvertKnownOuncesToTonnes(double input, double expectation) {
			final double result = Mass.Ounces.toTonnes(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "90.0,5.625","5.2,0.325","12.0,0.75" })
		public void testConvertKnownOuncesToPounds(double input, double expectation) {
			final double result = Mass.Ounces.toPounds(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "167.0,0.745536","800.7,3.5745536","1234.5,5.51116071" })
		public void testConvertKnownOuncesToStones(double input, double expectation) {
			final double result = Mass.Ounces.toStones(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class PoundsTests {
		@ParameterizedTest
		@CsvSource({ "2.2,997903.214","0.7,317514.6589","0.32,145149.5584" })
		public void testConvertKnownPoundsToMilligrams(double input, double expectation) {
			final double result = Mass.Pounds.toMilligrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.3,136.078","1.2,544.311","9.0,4082.33" })
		public void testConvertKnownPoundsToGrams(double input, double expectation) {
			final double result = Mass.Pounds.toGrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "5.0,2.26796","1.1,0.498952","0.7,0.317515" })
		public void testConvertKnownPoundsToKilograms(double input, double expectation) {
			final double result = Mass.Pounds.toKilograms(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1233.0,0.5592794","656565.0,297.812874","900.0,0.408233" })
		public void testConvertKnownPoundsToTonnes(double input, double expectation) {
			final double result = Mass.Pounds.toTonnes(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "45.0,720.0","6.7,107.2","89.1,1425.6" })
		public void testConvertKnownPoundsToOunces(double input, double expectation) {
			final double result = Mass.Pounds.toOunces(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "89.1,6.364286","1.2,0.0857143","789.0,56.3571" })
		public void testConvertKnownPoundsToStones(double input, double expectation) {
			final double result = Mass.Pounds.toStones(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class StonesTests {
		@ParameterizedTest
		@CsvSource({ "0.009,57152.63861","0.002,12700.586","0.0006,3810.17591" })
		public void testConvertKnownStonesToMilligrams(double input, double expectation) {
			final double result = Mass.Stones.toMilligrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1.2,7620.35","8.0,50802.34543","90.0,571526.38619" })
		public void testConvertKnownStonesToGrams(double input, double expectation) {
			final double result = Mass.Stones.toGrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "90.0,571.526","3.4,21.591","66.0,419.119" })
		public void testConvertKnownStonesToKilograms(double input, double expectation) {
			final double result = Mass.Stones.toKilograms(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "100.0,0.635029","12345.0,78.394369","10099.0,64.131611" })
		public void testConvertKnownStonesToTonnes(double input, double expectation) {
			final double result = Mass.Stones.toTonnes(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "34.0,7616.0","1.2,268.8","800.0,179200.0" })
		public void testConvertKnownStonesToOunces(double input, double expectation) {
			final double result = Mass.Stones.toOunces(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "800.0,11200.0","0.5,7.0","52.1,729.4" })
		public void testConvertKnownStonesToPounds(double input, double expectation) {
			final double result = Mass.Stones.toPounds(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class TonnesTests {
		@ParameterizedTest
		@CsvSource({ "0.009,9000000.0","0.00081,810000.0","0.00123,1230000.0" })
		public void testConvertKnownTonnesToMilligrams(double input, double expectation) {
			final double result = Mass.Tonnes.toMilligrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.00123,1230.0","0.8,800000.0","0.03,30000.0" })
		public void testConvertKnownTonnesToGrams(double input, double expectation) {
			final double result = Mass.Tonnes.toGrams(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.03,30.0","4.0,4000.0","1.2,1200.0" })
		public void testConvertKnownTonnesToKilograms(double input, double expectation) {
			final double result = Mass.Tonnes.toKilograms(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1.2,42328.754376824065","0.8,28219.169584549378","0.001,35.273962" })
		public void testConvertKnownTonnesToOunces(double input, double expectation) {
			final double result = Mass.Tonnes.toOunces(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1.2,2645.55","0.9,1984.16","34.0,74957.08" })
		public void testConvertKnownTonnesToPounds(double input, double expectation) {
			final double result = Mass.Tonnes.toPounds(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "12.0,1889.68","8.4,1322.77","0.3,47.2419" })
		public void testConvertKnownTonnesToStones(double input, double expectation) {
			final double result = Mass.Tonnes.toStones(input);
			assertEquals(expectation, result, 0.01);
		}

	}
}