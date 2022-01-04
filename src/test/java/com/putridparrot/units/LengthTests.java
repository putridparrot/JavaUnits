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

public class LengthTests {
	@Nested
	public class CentimetresTests {
		@ParameterizedTest
		@CsvSource({ "900.0,9000.0","34.9,349.0","2.0,20.0" })
		public void testConvertKnownCentimetresToMillimetres(double input, double expectation) {
			final double result = Length.Centimetres.toMillimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "13.0,0.13","3900.0,39.0","1.0,0.01" })
		public void testConvertKnownCentimetresToMetres(double input, double expectation) {
			final double result = Length.Centimetres.toMetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "123456.0,1.23456","8900.0,0.089","6009000.0,60.09" })
		public void testConvertKnownCentimetresToKilometres(double input, double expectation) {
			final double result = Length.Centimetres.toKilometres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "600.0,236.22","12.0,4.72441","7.8,3.07087" })
		public void testConvertKnownCentimetresToInches(double input, double expectation) {
			final double result = Length.Centimetres.toInches(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "12.3,0.4035433","89.0,2.91995","0.7,0.0229659" })
		public void testConvertKnownCentimetresToFeet(double input, double expectation) {
			final double result = Length.Centimetres.toFeet(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "700.0,7.65529","56.3,0.6157043","8.0,0.0874891" })
		public void testConvertKnownCentimetresToYards(double input, double expectation) {
			final double result = Length.Centimetres.toYards(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "80000.0,0.49709695","123456.0,0.767120019","90909090.0,564.88289639" })
		public void testConvertKnownCentimetresToMiles(double input, double expectation) {
			final double result = Length.Centimetres.toMiles(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "30000.0,0.16198704","987654.0,5.33290497","100200.0,0.541036717" })
		public void testConvertKnownCentimetresToNauticalMiles(double input, double expectation) {
			final double result = Length.Centimetres.toNauticalMiles(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class FeetTests {
		@ParameterizedTest
		@CsvSource({ "0.3,91.44","2.0,609.6","0.06,18.288" })
		public void testConvertKnownFeetToMillimetres(double input, double expectation) {
			final double result = Length.Feet.toMillimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.07,2.1336","3.5,106.68","89.0,2712.72" })
		public void testConvertKnownFeetToCentimetres(double input, double expectation) {
			final double result = Length.Feet.toCentimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "900.0,274.32","1.2,0.36576","0.8,0.24384" })
		public void testConvertKnownFeetToMetres(double input, double expectation) {
			final double result = Length.Feet.toMetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1999.0,0.6092952","123456.0,37.6293888","800.0,0.24384" })
		public void testConvertKnownFeetToKilometres(double input, double expectation) {
			final double result = Length.Feet.toKilometres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "8.0,96.0","1.2,14.4","0.4,4.8" })
		public void testConvertKnownFeetToInches(double input, double expectation) {
			final double result = Length.Feet.toInches(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "78.0,26.0","0.1,0.0333333","7162.0,2387.333" })
		public void testConvertKnownFeetToYards(double input, double expectation) {
			final double result = Length.Feet.toYards(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "9000.0,1.704545","1999.0,0.3785985","5020.0,0.9507576" })
		public void testConvertKnownFeetToMiles(double input, double expectation) {
			final double result = Length.Feet.toMiles(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "8765.0,1.442533","19000.0,3.1269978","1000.0,0.164579" })
		public void testConvertKnownFeetToNauticalMiles(double input, double expectation) {
			final double result = Length.Feet.toNauticalMiles(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class InchesTests {
		@ParameterizedTest
		@CsvSource({ "1.0,25.4","0.6,15.24","456.0,11582.4" })
		public void testConvertKnownInchesToMillimetres(double input, double expectation) {
			final double result = Length.Inches.toMillimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "123.0,312.42","0.9,2.286","3.4,8.636" })
		public void testConvertKnownInchesToCentimetres(double input, double expectation) {
			final double result = Length.Inches.toCentimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "3.4,0.08636","1002.0,25.4508","56.0,1.4224" })
		public void testConvertKnownInchesToMetres(double input, double expectation) {
			final double result = Length.Inches.toMetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "17890.0,0.454406","999000.0,25.3746","100200.0,2.54508" })
		public void testConvertKnownInchesToKilometres(double input, double expectation) {
			final double result = Length.Inches.toKilometres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "23.0,1.91667","0.9,0.075","479.0,39.9167" })
		public void testConvertKnownInchesToFeet(double input, double expectation) {
			final double result = Length.Inches.toFeet(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "123.0,3.41667","6.7,0.186111","9.0,0.25" })
		public void testConvertKnownInchesToYards(double input, double expectation) {
			final double result = Length.Inches.toYards(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "9000.0,0.1420455","123456.0,1.94848485","8800.0,0.1388889" })
		public void testConvertKnownInchesToMiles(double input, double expectation) {
			final double result = Length.Inches.toMiles(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "9000.0,0.1234341","123456.0,1.69318704","100200.0,1.37423326" })
		public void testConvertKnownInchesToNauticalMiles(double input, double expectation) {
			final double result = Length.Inches.toNauticalMiles(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class KilometresTests {
		@ParameterizedTest
		@CsvSource({ "0.09,90000.0","0.12,120000.0","2.3,2.3e+6" })
		public void testConvertKnownKilometresToMillimetres(double input, double expectation) {
			final double result = Length.Kilometres.toMillimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "7.9,790000.0","0.2,20000.0","0.09,9000.0" })
		public void testConvertKnownKilometresToCentimetres(double input, double expectation) {
			final double result = Length.Kilometres.toCentimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.8,800.0","45.0,45000.0","1.2,1200" })
		public void testConvertKnownKilometresToMetres(double input, double expectation) {
			final double result = Length.Kilometres.toMetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1.2,47244.1","0.65,25590.55","5.0,196850.3937" })
		public void testConvertKnownKilometresToInches(double input, double expectation) {
			final double result = Length.Kilometres.toInches(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "3.8,12467.2","1.2,3937.01","0.65,2132.546" })
		public void testConvertKnownKilometresToFeet(double input, double expectation) {
			final double result = Length.Kilometres.toFeet(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.08,87.48906","1.2,1312.34","34.0,37182.852143" })
		public void testConvertKnownKilometresToYards(double input, double expectation) {
			final double result = Length.Kilometres.toYards(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "12.0,7.45645","0.9,0.559234","3.9,2.42335" })
		public void testConvertKnownKilometresToMiles(double input, double expectation) {
			final double result = Length.Kilometres.toMiles(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1.2,0.647948","0.2,0.107991","99.9,53.94168" })
		public void testConvertKnownKilometresToNauticalMiles(double input, double expectation) {
			final double result = Length.Kilometres.toNauticalMiles(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class MetresTests {
		@ParameterizedTest
		@CsvSource({ "123.0,123000.0","0.9,900.0","0.0023,2.3" })
		public void testConvertKnownMetresToMillimetres(double input, double expectation) {
			final double result = Length.Metres.toMillimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "2.3,230.0","34.0,3400.0","0.9,90.0" })
		public void testConvertKnownMetresToCentimetres(double input, double expectation) {
			final double result = Length.Metres.toCentimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "100.0,0.1","123456.0,123.456","91.1,0.0911" })
		public void testConvertKnownMetresToKilometres(double input, double expectation) {
			final double result = Length.Metres.toKilometres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "12.0,472.441","9.3,366.142","0.1,3.93701" })
		public void testConvertKnownMetresToInches(double input, double expectation) {
			final double result = Length.Metres.toInches(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "67.0,219.816","1.2,3.93701","0.7,2.29659" })
		public void testConvertKnownMetresToFeet(double input, double expectation) {
			final double result = Length.Metres.toFeet(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.8,0.874891","34.5,37.72966","1.23,1.345144" })
		public void testConvertKnownMetresToYards(double input, double expectation) {
			final double result = Length.Metres.toYards(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "7900.0,4.908832","123456.0,76.7120019","1000.0,0.621371" })
		public void testConvertKnownMetresToMiles(double input, double expectation) {
			final double result = Length.Metres.toMiles(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "900.0,0.485961","71819.0,38.779158","123456.0,66.6609071" })
		public void testConvertKnownMetresToNauticalMiles(double input, double expectation) {
			final double result = Length.Metres.toNauticalMiles(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class MilesTests {
		@ParameterizedTest
		@CsvSource({ "0.09,144840.95999","0.001,1609.344","0.5,804672.0" })
		public void testConvertKnownMilesToMillimetres(double input, double expectation) {
			final double result = Length.Miles.toMillimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.23,37014.91","0.01,1609.344","0.8,128747.52" })
		public void testConvertKnownMilesToCentimetres(double input, double expectation) {
			final double result = Length.Miles.toCentimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.1,160.934","0.08,128.7475","0.002,3.218688" })
		public void testConvertKnownMilesToMetres(double input, double expectation) {
			final double result = Length.Miles.toMetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "2.0,3.21869","0.8,1.28748","23.0,37.0149" })
		public void testConvertKnownMilesToKilometres(double input, double expectation) {
			final double result = Length.Miles.toKilometres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.7,44352.0","0.09,5702.4","2.0,126720.0" })
		public void testConvertKnownMilesToInches(double input, double expectation) {
			final double result = Length.Miles.toInches(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "2.0,10560.0","0.6,3168.0","0.07,369.6" })
		public void testConvertKnownMilesToFeet(double input, double expectation) {
			final double result = Length.Miles.toFeet(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.07,123.2","2.0,3520.0","8.1,14256.0" })
		public void testConvertKnownMilesToYards(double input, double expectation) {
			final double result = Length.Miles.toYards(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "8.1,7.03871","0.8,0.695181","1.2,1.04277" })
		public void testConvertKnownMilesToNauticalMiles(double input, double expectation) {
			final double result = Length.Miles.toNauticalMiles(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class MillimetresTests {
		@ParameterizedTest
		@CsvSource({ "900.0,90.0","190.0,19.0","5000.0,500.0" })
		public void testConvertKnownMillimetresToCentimetres(double input, double expectation) {
			final double result = Length.Millimetres.toCentimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1090.0,1.09","9000.0,9.0","12345.0,12.345" })
		public void testConvertKnownMillimetresToMetres(double input, double expectation) {
			final double result = Length.Millimetres.toMetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "109000.0,0.109","9876543.0,9.876543","900800.0,0.9008" })
		public void testConvertKnownMillimetresToKilometres(double input, double expectation) {
			final double result = Length.Millimetres.toKilometres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "900.0,35.4331","123.0,4.84252","80.0,3.14961" })
		public void testConvertKnownMillimetresToInches(double input, double expectation) {
			final double result = Length.Millimetres.toInches(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "800.0,2.62467","1234.0,4.048556","600.8,1.9711286" })
		public void testConvertKnownMillimetresToFeet(double input, double expectation) {
			final double result = Length.Millimetres.toFeet(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "800.0,0.874891","1200.0,1.312336","909.0,0.994094" })
		public void testConvertKnownMillimetresToYards(double input, double expectation) {
			final double result = Length.Millimetres.toYards(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "900000.0,0.559234073","12345678.9,7.671249217072","100200300.0,62.2615798735" })
		public void testConvertKnownMillimetresToMiles(double input, double expectation) {
			final double result = Length.Millimetres.toMiles(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "9000000.0,4.859611231","12345678.0,6.6661328294","926000.0,0.5" })
		public void testConvertKnownMillimetresToNauticalMiles(double input, double expectation) {
			final double result = Length.Millimetres.toNauticalMiles(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class NauticalMilesTests {
		@ParameterizedTest
		@CsvSource({ "0.08,148160.0","0.001,1852.0","0.02,37040.0" })
		public void testConvertKnownNauticalMilesToMillimetres(double input, double expectation) {
			final double result = Length.NauticalMiles.toMillimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.9,166680.0","1.2,222240.0","0.1,18520.0" })
		public void testConvertKnownNauticalMilesToCentimetres(double input, double expectation) {
			final double result = Length.NauticalMiles.toCentimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.1,185.2","1.2,2222.4","89.0,164828.0" })
		public void testConvertKnownNauticalMilesToMetres(double input, double expectation) {
			final double result = Length.NauticalMiles.toMetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "23.0,42.596","1.7,3.1484","56.0,103.712" })
		public void testConvertKnownNauticalMilesToKilometres(double input, double expectation) {
			final double result = Length.NauticalMiles.toKilometres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.1,7291.34","2.0,145826.7999","3.5,255196.899" })
		public void testConvertKnownNauticalMilesToInches(double input, double expectation) {
			final double result = Length.NauticalMiles.toInches(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1.4,8506.56","0.1,607.612","8.9,54077.4680" })
		public void testConvertKnownNauticalMilesToFeet(double input, double expectation) {
			final double result = Length.NauticalMiles.toFeet(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "9.0,18228.329","1.5,3038.06","0.8,1620.3" })
		public void testConvertKnownNauticalMilesToYards(double input, double expectation) {
			final double result = Length.NauticalMiles.toYards(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "0.5,0.57539","23.0,26.4679","8.2,9.43639" })
		public void testConvertKnownNauticalMilesToMiles(double input, double expectation) {
			final double result = Length.NauticalMiles.toMiles(input);
			assertEquals(expectation, result, 0.01);
		}

	}
	@Nested
	public class YardsTests {
		@ParameterizedTest
		@CsvSource({ "34.0,31089.6","0.9,822.96","2.0,1828.8" })
		public void testConvertKnownYardsToMillimetres(double input, double expectation) {
			final double result = Length.Yards.toMillimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "9.8,896.112","0.8,73.152","12.0,1097.28" })
		public void testConvertKnownYardsToCentimetres(double input, double expectation) {
			final double result = Length.Yards.toCentimetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "12.0,10.9728","0.7,0.64008","3.0,2.7432" })
		public void testConvertKnownYardsToMetres(double input, double expectation) {
			final double result = Length.Yards.toMetres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "400.0,0.36576","1900.0,1.73736","12345.0,11.288268" })
		public void testConvertKnownYardsToKilometres(double input, double expectation) {
			final double result = Length.Yards.toKilometres(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "23.0,828.0","0.9,32.4","12.0,432.0" })
		public void testConvertKnownYardsToInches(double input, double expectation) {
			final double result = Length.Yards.toInches(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "12.0,36.0","1.8,5.4","67.0,201.0" })
		public void testConvertKnownYardsToFeet(double input, double expectation) {
			final double result = Length.Yards.toFeet(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "8900.0,5.056818","5000.0,2.840909","123456.0,70.1454545" })
		public void testConvertKnownYardsToMiles(double input, double expectation) {
			final double result = Length.Yards.toMiles(input);
			assertEquals(expectation, result, 0.01);
		}

		@ParameterizedTest
		@CsvSource({ "1000.0,0.493737","202020.0,99.7446479","71928.0,35.513479" })
		public void testConvertKnownYardsToNauticalMiles(double input, double expectation) {
			final double result = Length.Yards.toNauticalMiles(input);
			assertEquals(expectation, result, 0.01);
		}

	}
}
